package 순차문;

import java.util.Random;

public class 로또번호발생기 {

	public static void main(String[] args) {
         Random r = new Random();
         System.out.println(r.nextInt(3)); //괄호 : 제한 괄호안의 수보다 작은것
         System.out.println(r.nextInt(3));
         System.out.println(r.nextInt(3));
         
	}

}
