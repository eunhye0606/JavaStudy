/*=====================================
■■■ 클래스와 인스턴스 ■■■
======================================*/

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산을 수행하는 프로그램을 구현한다.
// 단, 클래스와 인스턴스의 개념을 활용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력 (공백 구분) : 10 5
// 임의의 연산자 입력 ( + - * /) : +
// >> 10 + 5 = 15
// 계속하려면 ....
import java.util.Scanner;
import java.io.IOException;


class Calculate
{
	//주요변수 선언 및 초기화
	int nUser1, nUser2; //-- 사용자 입력 정수 두개
	int nCh; //-- 사용자 입력 연산자 아스키코드값.
	char ch;

	//입력받기
	void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("임의의 두 정수 입력 (공백 구분) : ");
		nUser1 = sc.nextInt();
		nUser2 = sc.nextInt();
		System.out.print("임의의 연산자 입력 ( + - * /) :");
		nCh = System.in.read();
		ch = (char)nCh;
	}

	//연산하기
	int cal()
	{
		int result = 0;
		// 이거 초기화 안하면 자바가 예외일 때 
		// 우쨰..
		
		// + 43
		// - 45
		// * 42
		// / 47

		switch (nCh)
		{
		case 43: result = nUser1 + nUser2; break;
		case 45: result = nUser1 - nUser2; break;
		case 42: result = nUser1 * nUser2; break;
		case 47: result = nUser1 / nUser2; break;
		// -- default를 써야하는가?
		//default : System.out.print("연산자 잘못 입력");
		//default : result = -99999999; 
		//이게 옳은 방법.
		}
		return result;
	}


	//출력하기
	void print(int r)
	{
		System.out.printf("%d %c %d = %d\n",nUser1,ch,nUser2,r);
	}
}

public class Test075
{
	public static void main(String[] args) throws IOException
	{
		// Calculate 인스턴스 생성.
		Calculate c = new Calculate();

		c.input(); //--입력받기
		int r = c.cal(); //--연산하기
		c.print(r); //--출력하기.
	}
}

/*
임의의 두 정수 입력 (공백 구분) : 10 5
임의의 연산자 입력 ( + - * /) :+
10 + 5 = 15
계속하려면 아무 키나 누르십시오 . . .
*/
