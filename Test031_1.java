//사용자로부터 임의의 문자를 하나 입력받아
//대문자이면 소문자로 소문자이면 대문자로
//알파벳이 아닌 기타문자이면 그 문자 그대로 출력하는
//프로그램을 구현한다.

// 실행 예)
// 한 문자 입력 : A
// A → a
//계속하려면 아무 키나 누르세요....





// 한 문자 입력 : b
// b → B
//계속하려면 아무 키나 누르세요....




// 한 문자 입력 : 7
// 7 → 7
//계속하려면 아무 키나 누르세요....
//=============================================*/

//										1주차 마지막 퀴즈 복습하기 

//1. 사용자 입력 값 어떻게 읽을 것인가?
//										→ (1).BufferedReader활용
												// readLine();을 사용하게 되면 안에 문자열값으로 읽음. 
												// 즉, readLine() → 안에 String값 
												// String은 다른 자료형타입으로 변환 불가.
												// 그래서 불가.
												//cf) Scanner이 있는데 당분간 사용ㄴㄴ

//										→ (2).System.in.read();활용
												// read(); → 아스키코드가 들어감 즉, int값.
												// int값을 char로 명시적형변환을 해야 아스키코드에 대응하는 문자 출력
												// ex) 65 → A

//2. 알파벳과 알파벳이 아닌 문자 구분.
//3. 대문자와 소문자 구분.


//대문자 + 32 → 소문자
//소문자 - 32 → 대문자

import java.io.IOException;

public class Test031_1
{
	public static void main(String[] args) throws IOException
	{
		//사용자에게 입력 받기	
		System.out.print("한 문자 입력 : ");


		
		//주요 변수 선언
		int nWord; //사용자입력값 받기 read()는 int값 
		char cWord; //아스키코드 → 문자

		boolean bigW, smallW; //대소문자 구분
		char result; //삼항연산자 결과값



		//연산 및 처리
		nWord = System.in.read(); //사용자 값 읽어서 int변수에 저장
		cWord = (char)nWord; //사용자 값에 대응하는 문자를 변수에 저장

		//___조건____? ___True_____: ___False_____;

		//nWord가 대문자(65~90)
		//nWord가 소문자(97~122)
		bigW = (nWord >= 65) && (nWord <= 90);
		//이 범위에 속하면 True
		// True이면 nWord += 32
		// == 소문자 아스키코드



		smallW = (nWord >=97) && (nWord <=122);
		//nWord -=32

		result =(char)(bigW? nWord += 32 : (smallW ? nWord -=32 : nWord));


		System.out.printf("%c → %c\n", cWord,result);
	}
}



