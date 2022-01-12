/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// 반복문(while 문) 실습

//사용자로부터 원하는 단(구구단)을 입력받아
//해당하는 구구단을 출력하는 프로그램을 구현한다.
// 단, 1단 ~ 9단 사이의 수를 입력받은 상황이 아니라면
// 이에 대한 안내를 한 후 프로그램을 종료할 수 있도록 처리한다.



//실행 예 )
//원하는 단(구구단) 입력 : 7
//7 * 1 = 7
//7 * 2 = 14
//7 * 3 = 21
//    :
//7 * 9 = 63
//계속하려면 아무 키나 .......

//원하는 단(구구단) 입력 : 11
//1부터 9까지의 정수만 입력이 가능합니다.
//계속하려면 아무 키나 .......

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Test056

{
	public static void main(String[] args) throws IOException
	{
		//주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int dan;	//--사용자의 입력값을 정수 형태로 담아낼 변수

		//연산 및 처리
		System.out.print("원하는 단(구구단) 입력 : ");
		dan = Integer.parseInt(br.readLine());

		//입력받는 내용이 1 ~ 9인가 확인이 먼저!
		// 조건에 안맞으면 while 돌아갈 필요가 없어서.

		if (dan <1 || dan >9)
		{
			System.out.println("1부터 9까지의 정수만 입력이 가능합니다.");
			return;	//-- 프로그램 종료.
		}
		
		int n = 0;

		while (n<9)
		{
			n++;	//- n에 8들어오면 이걸로 9가 됨! 그래서 while 조건식이 <9까지임.
			System.out.printf("%d * %d = %d\n", dan,n, n * dan);
		}
	}
}

/*
원하는 단(구구단) 입력 : 5
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
계속하려면 아무 키나 누르십시오 . . .

원하는 단(구구단) 입력 : 16
1부터 9까지의 정수만 입력이 가능합니다.
계속하려면 아무 키나 누르십시오 . . .
*/





/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = 0; //--사용자 입력값.

		int n = 1; // -- 루프변수
		boolean flag;
		
		System.out.print("원하는 단(구구단) 입력 : ");
		num = Integer.parseInt(br.readLine());


		flag = num <= 9;
		while (n<=9 && flag)
		{
			System.out.printf("%d * %d = %d\n", num,n, n * num);
			n++;
		}
		System.out.println("1부터 9까지의 정수만 입력이 가능합니다.");

	}
}
*/

/*

원하는 단(구구단) 입력 : 7
7 * 1 = 7
7 * 2 = 14
7 * 3 = 21
7 * 4 = 28
7 * 5 = 35
7 * 6 = 42
7 * 7 = 49
7 * 8 = 56
7 * 9 = 63
1부터 9까지의 정수만 입력이 가능합니다.
계속하려면 아무 키나 누르십시오 . . .

원하는 단(구구단) 입력 : 13
1부터 9까지의 정수만 입력이 가능합니다.
계속하려면 아무 키나 누르십시오 . . .

*/