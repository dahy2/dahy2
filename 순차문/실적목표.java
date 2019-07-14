package 순차문;

import java.util.Scanner;

public class 실적목표 {

	public static void main(String[] args) {
		System.out.println("실적목표 : 1000");
        System.out.print("실적입력 : ");
        Scanner mm = new Scanner(System.in);
        int 실적 = mm.nextInt(); // nextdouble 등 있음
        
        if (실적 >= 1000) {System.out.println("축하!!! 실적달성");
                          double bonus = 실적 * 0.2;
                          System.out.println("당신의 보너스는 " + (int)bonus + "만원 입니다.");
			
		} else {System.out.println("안타깝네요!!! 실적미달성");

		}
	}

}
