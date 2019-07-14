package 순차문;

import java.util.Date;

public class 조건문2 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours(); //현재시각
		
		if(hour<11) {System.out.println("Good morning~!");
		}else if(hour<15) {System.out.println("Good afternoon~!");
		}else if (hour<20) {System.out.println("Good evening~!");
		}else {System.out.println("Good night~!");
	    }
        }
	    }
