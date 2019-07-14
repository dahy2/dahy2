package 순차문;

import java.util.Scanner;

public class 주민번호 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력 : ");
		String sn = sc.next();
		//charAt(dnlclrkqt): String에서 char1글자를 추출할때 사용
		char gender = sn.charAt(6); 
		//위치값은 프로그래밍에서 0부터 시작해서 계산
		//원하는 숫자 -1
	    System.out.println(gender);
	    
	    switch (gender) {
		case '1':
		case '3':	
			System.out.println("남");
			break;
		case '2':
		case '4':
			System.out.println("여");
			
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

}
