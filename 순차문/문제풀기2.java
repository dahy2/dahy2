package 순차문;

import java.util.Scanner;

public class 문제풀기2 {

	public static void main(String[] args) {
           System.out.print("첫번째 수 입력 ");
           Scanner test = new Scanner(System.in);
           int first = test.nextInt();

           System.out.print("두번째 수 입력 ");
           int second = test.nextInt();
           
           if (first==second) {System.out.println("두 수가 같습니다.");
			
		} else {System.out.println("두 수가 다릅니다.");

		}
	}

}
