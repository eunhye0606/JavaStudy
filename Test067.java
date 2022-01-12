/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

//break 실습
// 다음과 같은 처리가 이루어지는 프로그램을 구현한다.
// 단, 입력받는 정수는 1 ~100 범위 안에서만
// 가능하도록 작성한다.

// 실행 예)
// 임의의 정수 입력 : -10

// 임의의 정수 입력 : 0

// 임의의 정수 입력 : 2022

// 임의의 정수 입력 : 10
// >> 1 ~ 10 까지의 합 : 55
// 계속하시겠습니까?(Y/N)? : y

// 임의의 정수 입력 : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하시겠습니까?(Y/N) : N
// 계속하려면 아무 키나 누르세요 ... → 프로그램 종료.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test067
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, s =0, i;
		// -- n: 사용자 입력값을 담을 변수
		// -- s: 누적합 연산 결과를 담아낼 변수
		// -- i: 1 부터 1씩 사용자의 입력값까지 증가할 변수

		char ch;
		// -- ch: 프로세스를 계속 진행할지 말지의 여부를 담아둘 변수
		
		while (true)
		{
			
			do	//범위 내에 입력할 때까지 집착하기.
			{
				System.out.print("임의의 정수 입력 : ");
				n = Integer.parseInt(br.readLine()); //입력 대기열에 남아있는 엔터를 얘가 가져옴.NumberFormatException:
			}
			while (n<1 || n>100);

			s=0;	//--누적합 구하기 전에 초기화해야됨. 안하면 계속 누적됨. check~~~~!

			for (i=1;i<=n ;i++ ) //입력값까지 누적합하기.
				s += i;	

			System.out.printf("\n>>1 ~ %d 까지의 합 : %d\n",n,s);

			System.out.print("계속하시겠습니까?(Y/N) : ");
			ch = (char)System.in.read();	//--readLine()은 문자열이라서 read();
											//  y + 엔터(\r+\n)

			//그만할래 의사표현
			if (ch != 'Y' && ch !='y')			//ch =='N' || ch == 'n' 보다는 y가 아니다.
			{								//논리수식 잘보기!!!

					break;
			}
					//반복문 멈추고 빠져나갈 수 있는처리.
				// 위와같은 의사 표현을 했다면
				//가장가까운반복문.
				//check~!! 멈춰서 빠져나간다.

			System.in.skip(2); //대기열 엔터 스킵하기!!!
				
		}//while 종료
		
	
	}//main종료

} //class 종료

/*
.NumberFormatException:

Integer.parseInt("kkk") → char으로 못바꿔
*/

/*
임의의 정수 입력 : 10

>>1 ~ 10 까지의 합 : 55
계속하시겠습니까?(Y/N) : y
임의의 정수 입력 : 100

>>1 ~ 100 까지의 합 : 5050
계속하시겠습니까?(Y/N) : n
계속하려면 아무 키나 누르십시오 . . .
*/





/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int nUser; //--사용자 입력 값.
		int n; //--루프변수
		int sum = 0; //--누적합.

		char ch;// 계속에 대한 사용자 응답.
		
		do
		{
			System.out.print("임의의 정수 입력 : ");
			nUser = Integer.parseInt(br.readLine());

		}
		while (nUser < 1 || nUser > 100);

		//System.out.println(nUser);
		do
		{
			for (n = 1;n<=nUser ;n++ )
		{
			sum += n;
		}
		System.out.printf("1 ~ %d 까지의 합 : %d\n",nUser,sum);

		}
		while(nUser >=1 && nUser <=100);
		//while (ch == 'Y' || ch == 'y');

		
	}

}

/*
임의의 정수 입력 : 100
1 ~ 100 까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .


임의의 정수 입력 : -1
임의의 정수 입력 : 10000
임의의 정수 입력 : 0
임의의 정수 입력 : 101010101
임의의 정수 입력 : -31311
임의의 정수 입력 : 10
1 ~ 10 까지의 합 : 55
계속하려면 아무 키나 누르십시오 . . .
*/