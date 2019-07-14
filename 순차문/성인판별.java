package 순차문;

import java.util.Date;
import java.util.Scanner;

public class 성인판별 {

	public static void main(String[] args) {
          System.out.print("태어난 해 입력 >> ");

          Scanner sc = new Scanner(System.in);
          int year = sc.nextInt(); // nextdouble 등 있음
          
          Date date = new Date(); //untill로 선택
          int thisYear = date.getYear() + 1900;
          
          int age = thisYear - year +1; //+1 해주어야 우리나라 나이
          System.out.println("당신의 나이는? " + age + "살");
          
          if (age >= 18) {System.out.println(" 성인"); // true 일때
			
		} else {System.out.println("미성인"); // false 일때

		}
	}

}
