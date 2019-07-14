package 순차문;

import java.util.Scanner;

public class 문제풀기3 {

	public static void main(String[] args) {
		System.out.print("받은돈 : ");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt(); 
        
		System.out.print("상품의 총액 : ");
        int all = sc.nextInt(); 
        
        double vat = all*0.1;
        System.out.println("부가세 : " + (int)vat);

        int change = money - all;
        System.out.println("잔돈 : " + change);
        
	}

}
