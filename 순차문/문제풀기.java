package 순차문;

import java.util.Scanner;

public class 문제풀기 {

	public static void main(String[] args) {
          System.out.println("----------------");
          System.out.print("오늘의 기온은? ");
          Scanner test = new Scanner(System.in);
          int temp = test.nextInt();
          
          System.out.print("오늘 나의 평가는? ");
          String me = test.next();
          
          System.out.print("오늘 나의 신발 사이즈는? ");
          double shoes = test.nextDouble();
          
         System.out.println("----------------");
         System.out.print("오늘은" + temp + "도,");
         System.out.print("나의 평가는 " + me + ",");
         System.out.print("신발은 ");

          
	}

}
