package ������;

import java.util.Scanner;

public class ����Ǯ��3 {

	public static void main(String[] args) {
		System.out.print("������ : ");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt(); 
        
		System.out.print("��ǰ�� �Ѿ� : ");
        int all = sc.nextInt(); 
        
        double vat = all*0.1;
        System.out.println("�ΰ��� : " + (int)vat);

        int change = money - all;
        System.out.println("�ܵ� : " + change);
        
	}

}
