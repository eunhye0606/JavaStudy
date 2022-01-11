/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

//if ~else 

//◎과제
//  사용자로부터 임의의 알파벳 한 문자를 입력받아
//  이를 판별하여 입력받은 알파벳이 모음일 경우만
//  결과를 출력하는 프로그램을 구현한다.
//  단, 대소문자를 모두 적용할 수 있도록 처리한다.
//  또한, 알파벳 이외의 문자가 입력되었을 경우
// 입력 오류에 대한 내용을 사용자에게 안내해 줄 수 있도록 한다.

// 실행 예 )
// 임의의 알파벳 한 문자 입력 : A
// >> 모음 OK ~!!!
// 계속하려면 아무 키나...

// 임의의 알파벳 한 문자 입력 : e
// >> 모음 OK ~!!!
// 계속하려면 아무 키나...

// 임의의 알파벳 한 문자 입력 : B
// 계속하려면 아무 키나...

// 임의의 알파벳 한 문자 입력 : 1
// >> 입력 오류 ~!!!
// 계속하려면 아무 키나...


//① 모음빼기 → 모음 OK~!!! → 이렇게 꼭 처리해야하나 ㅠㅠㅠ●●●
//	 모음 대소문자 범위 없음
//   모음: A,E,I,O,U
	// 65,69,73,79,85
	// 소문자 +32 
	
	//아스키코드가 65,69,73,79,85
	//아스키코드가 +32 
	//총 10 개는 모음.

//② 자음빼기 → 그냥 개행
//	  
//③ 알파벳아닌문자 빼기 → 입력 오류~!!

import java.io.IOException;


public class Test041
{
	public static void main(String[] args) throws IOException
	{

	System.out.print("임의의 알파벳 한 문자 입력 : ");

	char cUser; //사용자 입력 값
	int nUser;

	boolean bigMo,smallMo; //대소모음 변수

	nUser = System.in.read(); //아스키코드 int형 저장
	cUser = (char)nUser; //아스키코드 문자 저장
	



	//대소문자 모음 조건.
	bigMo = cUser == 65 || cUser == 69 || cUser == 73 || cUser == 79 || cUser == 85;
	smallMo = cUser == 65 + 32 || cUser == 69 +32 || cUser == 73 + 32 || cUser == 79 + 32 || cUser == 85 + 32;


	//알파벳 경우 65~90,97~122

	//알파벳 ( 자음 + 모음 )
	//저 범위가 아니면 알파벳 아님. --> 입력 오류~!!

	if ((nUser >= 65 && nUser <= 90) || (nUser >= 97 && nUser <=122))
	// _____________________________     ____________________________
	//			알파벳 대문자					알파벳 소문자
	{
		//System.out.println("알파벳입니다!");
		//자음 , 모음 나누기. 
		//모음은 총 10 개 .
		if (bigMo || smallMo)
		//____________________
		// 대문자 소문자 모음 조건이 참이라면...
		{
			System.out.println("모음 OK ~!!!");
		}
		else //★★★★
			System.out.println(); //자음일 때는 개행.
	}
	else if (nUser < 65 ||(nUser >90 && nUser <97) || nUser > 122)
	{
		System.out.println("입력 오류 ~!!"); // 알파벳이 아닌경우.
	} 
	else 
		System.out.println("판정 불가."); //그 외에는 이렇게 하렴 java야 ~~~.
	}
}

/*
① 소문자 모음
임의의 알파벳 한 문자 입력 : a
모음 OK ~!!!
계속하려면 아무 키나 누르십시오 . . .

② 대문자 모음
임의의 알파벳 한 문자 입력 : A
모음 OK ~!!!
계속하려면 아무 키나 누르십시오 . . .

③ 자음
임의의 알파벳 한 문자 입력 : B

계속하려면 아무 키나 누르십시오 . . .

④ 알파벳이 아닌경우
임의의 알파벳 한 문자 입력 : @
입력 오류 ~!!
계속하려면 아무 키나 누르십시오 . . .

임의의 알파벳 한 문자 입력 : 1
입력 오류 ~!!
계속하려면 아무 키나 누르십시오 . . .


*/

	






/*	if (bigMo || smallMo)
	{
		System.out.println("모음 OK~ !!!");
	}
	else if (bigMo != true && smallMo != true) //자음만
	{
		System.out.println();
	}




	if ((nUser>=65 && nUser <=90) == false)
	{
		System.out.print("입력 오류~!!!\n"); //알파벳아님
										     
	}
	else if ((nUser>=97 && nUser <=122) == false)
	{
		System.out.print("입력 오류~!!!\n"); 
	}

	else
	System.out.println("알 수 없음");
*/

/*	if (bigMo || smallMo)
	{
		System.out.println("모음 OK~ !!!");
	}	
	else if (bigMo && smallMo)
	{
		System.out.println("입력 오류~!!!");
	}
	else 
		System.out.println("알 수 없음");
*/

