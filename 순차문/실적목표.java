package ������;

import java.util.Scanner;

public class ������ǥ {

	public static void main(String[] args) {
		System.out.println("������ǥ : 1000");
        System.out.print("�����Է� : ");
        Scanner mm = new Scanner(System.in);
        int ���� = mm.nextInt(); // nextdouble �� ����
        
        if (���� >= 1000) {System.out.println("����!!! �����޼�");
                          double bonus = ���� * 0.2;
                          System.out.println("����� ���ʽ��� " + (int)bonus + "���� �Դϴ�.");
			
		} else {System.out.println("��Ÿ���׿�!!! �����̴޼�");

		}
	}

}
