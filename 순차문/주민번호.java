package ������;

import java.util.Scanner;

public class �ֹι�ȣ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ �Է� : ");
		String sn = sc.next();
		//charAt(dnlclrkqt): String���� char1���ڸ� �����Ҷ� ���
		char gender = sn.charAt(6); 
		//��ġ���� ���α׷��ֿ��� 0���� �����ؼ� ���
		//���ϴ� ���� -1
	    System.out.println(gender);
	    
	    switch (gender) {
		case '1':
		case '3':	
			System.out.println("��");
			break;
		case '2':
		case '4':
			System.out.println("��");
			
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}
	}

}
