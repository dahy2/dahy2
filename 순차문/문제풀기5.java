package 순차문;

import java.util.Scanner;

public class 문제풀기5 {

	public static void main(String[] args) {
		        
			    System.out.println("먹고싶은 음식 종류를 입력하세요.");
			    System.out.print("1)분식 2)한식 3)일식 4)기타->>");
			    Scanner sc = new Scanner(System.in); //import 안되어있으면 ctrl+shift+o
			    String food = sc.next();
			    
			    switch(food) {
			    case "분식":
			    	System.out.println("분식집으로 가요~");
			    	break;
			    case "한식":
			    	System.out.println("한식집으로 가요~");	
			    	break;
			    case "일식":
			    	System.out.println("일식집으로 가요~");
			    	break;
			    default:
			    	System.out.println("집에서 먹어요~");
			    	break;
				}
			}
}
