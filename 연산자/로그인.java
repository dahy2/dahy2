package 연산자;

public class 로그인 {

	public static void main(String[] args) {
        int id = 1000; // 회원가입 id
        
        int pw = 1111; // 회원가입 비번
        
        int input = 1000; // 입력한 id
        
        int input2 = 1111; // 입력한 비번
        
        //&& 둘다 같아야 할때
        
        if (id == input && pw == input2) {System.out.println("로그인OK");
			
		} else {System.out.println("아이디를 확인하세요");

		}

	}

}
