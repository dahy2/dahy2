package 연산자;

public class 산술연산자 {

	public static void main(String[] args) {
		int n1 = 200;
		int n2 = 100;
        
		//비교 연산자의 결과는 boolean(논리형 타입)
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println(n1 > n2);
		//ctrl+alt+화살표 아래 = 복사
		//alt+화살표=이동

		System.out.println("더하기 : " + (n1 + n2));
		System.out.println("빼 기 : " + (n1 - n2));
		System.out.println("곱하기 : " + (n1 * n2));
		System.out.println("나누기 : " + (n1 / n2));
		System.out.println("나머지 : " +(n1 % n2));
	}

}
