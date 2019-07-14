package 순차문;

import java.util.Scanner;

public class 기본입력 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("프로그램이름 입력 "); 
        //입력된 값을 출력을 옆으로 하게끔 하려면 ln 빼기
        // System.in(키보드에서 친 것 / 첫글자 대문자)
        String data = sc.next();
        System.out.println("입력값 : " + data);
	}

}
