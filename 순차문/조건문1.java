package 순차문;

import java.util.Date;

public class 조건문1 {

	public static void main(String[] args) {
		
		
		//ctrl + shift + 영문 o >자동 import (선택)
		Date date = new Date();
		int hour = date.getHours(); //현재시각
		if (hour >= 12) {System.out.println("오후");
			
		} else {System.out.println("오전");

		}
		
	}

}
