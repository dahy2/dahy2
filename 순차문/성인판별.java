package ������;

import java.util.Date;
import java.util.Scanner;

public class �����Ǻ� {

	public static void main(String[] args) {
          System.out.print("�¾ �� �Է� >> ");

          Scanner sc = new Scanner(System.in);
          int year = sc.nextInt(); // nextdouble �� ����
          
          Date date = new Date(); //untill�� ����
          int thisYear = date.getYear() + 1900;
          
          int age = thisYear - year +1; //+1 ���־�� �츮���� ����
          System.out.println("����� ���̴�? " + age + "��");
          
          if (age >= 18) {System.out.println(" ����"); // true �϶�
			
		} else {System.out.println("�̼���"); // false �϶�

		}
	}

}
