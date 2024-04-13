package level10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class level7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line; 
		
		while((line = sc.nextLine()) != null && !line.equals("0 0 0"))  {
			String[] numArr = line.split(" ");

			int same = 1;
			
			int big = 0;
			int sum = 0;
			
			//몇개 가 같은지 체크하는 맵과 반복문
			Map<Integer,Integer> sameMap = new HashMap<>();
			for(int i = 0; i < 3; i++) {
				int num = Integer.parseInt(numArr[i]);
				
				sum+= num;
				
				if(big < num)big = num;
				
				if(sameMap.get(num) != null) {
					same++;
				}else {
					sameMap.put(num, 1);
				}
			}
			//가장 긴 변의 길이보다 나머지 두 변의 길이의 합이 길지 않으면 삼각형의 조건을 만족하지 못한다.
			if(big >= (sum - big))System.out.println("Invalid");
			else if(same == 3)System.out.println("Equilateral");
			else if(same == 2)System.out.println("Isosceles");
			else System.out.println("Scalene");
			
			
		}
		sc.close();
		
		
		
	}
}
