package 연산자;

import java.util.Date;

public class 날짜부품 {

	public static void main(String[] args) {
		Date date = new Date();
		
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		
        System.out.println("현재 시간은? " + hour + "시");
        System.out.println("현재 시간은? " + min + "분");
        System.out.println("현재 시간은? " + sec + "초");
        
        int year = date.getYear() + 1900;
        int month = date.getMonth() + 1;
        int day = date.getDay(); //요일
        
        System.out.println(year + "년");
        System.out.println(month + "월");
        System.out.println(day); //월요일 1~
	}

}
