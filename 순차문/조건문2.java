package ������;

import java.util.Date;

public class ���ǹ�2 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours(); //����ð�
		
		if(hour<11) {System.out.println("Good morning~!");
		}else if(hour<15) {System.out.println("Good afternoon~!");
		}else if (hour<20) {System.out.println("Good evening~!");
		}else {System.out.println("Good night~!");
	    }
        }
	    }
