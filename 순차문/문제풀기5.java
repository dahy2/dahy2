package ������;

import java.util.Scanner;

public class ����Ǯ��5 {

	public static void main(String[] args) {
		        
			    System.out.println("�԰���� ���� ������ �Է��ϼ���.");
			    System.out.print("1)�н� 2)�ѽ� 3)�Ͻ� 4)��Ÿ->>");
			    Scanner sc = new Scanner(System.in); //import �ȵǾ������� ctrl+shift+o
			    String food = sc.next();
			    
			    switch(food) {
			    case "�н�":
			    	System.out.println("�н������� ����~");
			    	break;
			    case "�ѽ�":
			    	System.out.println("�ѽ������� ����~");	
			    	break;
			    case "�Ͻ�":
			    	System.out.println("�Ͻ������� ����~");
			    	break;
			    default:
			    	System.out.println("������ �Ծ��~");
			    	break;
				}
			}
}
