package ������;

import java.util.Scanner;

public class ����Ǯ��4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    System.out.println("�԰� ���� ���� ��ȣ �Է�");
	    System.out.print("1)«�� 2)¥�� 3)�쵿 4) ��Ÿ ->>");
	    int food = sc.nextInt();
	    switch(food) {
	    case 1:
	    	System.out.println("«���� ������ ����~");
	    	break;
	    case 2:
	    	System.out.println("¥���� ������ ����~");	
	    	break;
	    case 3:
	    	System.out.println("�쵿�� ������ ����~");
	    	break;
	    default:
	    	System.out.println("�� �Ծ��~");
	    	break;
		}
	}

}
