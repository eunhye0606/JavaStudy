/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

//◎과제
//사용자로부터 임의의 문자를 하나 입력받아
//대문자이면 소문자로 소문자이면 대문자로
//알파벳이 아닌 기타문자이면 입력오류 처리하는 프로그램을 구현한다.


// 실행 예)
// 한 문자 입력 : A
// A → a
//계속하려면 아무 키나 누르세요....


// 한 문자 입력 : b
// b → B
//계속하려면 아무 키나 누르세요....

// 한 문자 입력 : 7
// >> 입력 오류 ~!!!
//계속하려면 아무 키나 누르세요....
//=============================================*/

/*
① 대문자라면 소문자로
② 소문자라면 대문자로
③ 알파벳이 아니라면 입력 오류 출력.
*/

import java.io.IOException;

public class Test042
{
	public static void main(String[] args) throws IOException
	{
		int nUser;	//사용자 입력 값 아스키코드
		char cUser;	//사용자 입력 값 아스키코드 대응 문자.

		boolean bigW, smallW;

		System.out.print("한 문자 입력 : ");
		nUser = System.in.read();	//아스키코드 int 저장
		cUser = (char)nUser;		// 문자로 저장.

		char result ; //대소문자 변경 후 결과 담는 변수

		

		//대문자 → 65~90
		//소문자 → 97~122

		bigW = nUser >= 65 && nUser <= 90;
		smallW = nUser >=97 && nUser <= 122;

		//① 알파벳이라면
		//     (1). 대문자 → 소문자
		//	   (2). 소문자 → 대문자

		//② 알파벳이 아니라면
		//      입력 오류~!!

		if (bigW || smallW)
		{
			if (bigW)
			{
				result = (char)(nUser + 32);
				System.out.printf("%c → %c\n",cUser, result);		// 대문자 int + 32 해서 문자 변수에 담아라.
																	// 자동형변환 위배 → 명시적형변환! int → char
			}
			else if (smallW)
			{
				result = (char)(nUser -32);
				System.out.printf("%c → %c\n",cUser, result);
			}
			//else 
			//	System.out.println("알파벳 중에서 알 수 없음."); 
		}
		else if ((bigW || smallW) != true)
		{
			System.out.println("입력 오류~!!!");
		}
		//else
		//	System.out.println("알파벳도 아니고 뭔지 알 수 없음.");
		// else 구문에서 출력이 없기 때문에 java야 ~ 이렇게 안알려줘도 됨!.


	}
}