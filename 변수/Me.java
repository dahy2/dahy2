package 변수;

/*
 * 작성자 : 이다혜
 * 날   짜 : 2019.07.13.
 * 수정내용 : ㅇㅇㅇㅇ
 */
public class Me {

	public static void main(String[] args) {
		byte age; //선언(메모리 공간 확보 : 이렇게 할거야! 나 이만큼 공간 만들어줘)
		age = 29; // = -> 할당연산자, 대입연산자 
		
		int money = 10;
		
		double weight = 100;
		float eye = 0.6f;
		
		char gender = '여';
		
		String name = "이다혜";
		
		boolean lunch = true; //false
		
		//+ 결합연산자
		System.out.println("내 나이 :"+ age + "세");
		System.out.println("내 자산 : " + money + "원");
		System.out.println("내 몸무게 : " + weight + "kg");
        System.out.println("내 시력 : " + eye);
        System.out.println("내 성별은 : " + gender);
        System.out.println("내 이름은 : " + name);
        System.out.println("점심은 맛있게 드셨나요? : " + lunch);
	}


}
