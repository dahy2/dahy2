package ������;

import java.util.Scanner;

public class ��Ʈ���� {

	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
		    System.out.print("���ڿ� 2�� �Է� >> ");
		    String s1 = sc.next();
            String s2 = sc.next();
            
            //��Ʈ����  equals�� ��
            if(s1.equals(s2)) {
            	System.out.println("����");
            }else {System.out.println("����X");
        	}
            System.out.print("�λ� �¿�� �Է� : ");
            sc.nextLine();// ***enter�� �ǹ�*** �̰� �����ϱ� �Ʒ� �¿�� �Է� �ȵ�(������ next ����� ���)
            String life =sc.nextLine();
            System.out.println("�Է��� �¿�� : " + life);


} }
