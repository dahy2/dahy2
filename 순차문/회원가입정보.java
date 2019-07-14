package 순차문;

import java.util.Scanner;

public class 회원가입정보 {

	public static void main(String[] args) {
         System.out.println("================");
         System.out.println("회원가입 정보");
         System.out.println("----------------");
         Scanner text1 = new Scanner(System.in); 
         System.out.print("이름 : ");
         String name = text1.next();
         
         Scanner text2 = new Scanner(System.in); 
         System.out.print("아이디 : ");
         String id = text2.next();
         
         System.out.println("---------------");
         
         System.out.println(name + id);
          
         
	}

}
