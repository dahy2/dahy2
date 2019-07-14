package 순차문;

import java.util.Scanner;

public class 등급 {

	public static void main(String[] args) {
		
		System.out.println("등급을 입력해주세요.");
         Scanner sc = new Scanner(System.in);
         String point = sc.next();
         
       switch (point) {
		case "A":
			System.out.println("최우수입니다.");
			
			break;
		case "B":
			System.out.println("우수입니다.");
			
			break;		
        case "C":
				System.out.println("보통입니다.");
				
				break;
		default:
			  System.out.println("통과하지 못했습니다.");
			break;
		}
         
       
         
         
	}

}
