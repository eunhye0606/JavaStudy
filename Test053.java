/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

//반복문(while 문) 실습

//사용자로부터 임의의 정수를 입력받아
//입력받은 정수가 소수인지 아닌지를 판별하여
//결과를 출력하는 프로그램을 구현한다.

// ※ 소수 : 1 또는 자기 자신의 값 이외에 어떤 수로도 나누어 떨어지지 않는 수.
//		     단, 1 은 소수 아님.

//실행 예)
//임의의 정수 입력 : 10
//10 → 소수 아님
//계속하려면.........

//임의의 정수 입력 : 11
// 11 → 소수
//계속하려면 ....

//hint!
//임의의 정수 입력 : 967
//1~ 입력한 정수까지 나눠보고
//없으면 → 1인지 판별
//있으면 → 소수아님.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test053
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


		int num; //사용자
		int n = 1; // 초기값.
		int mul = 1; //누적곱
		
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());


		while (n < num-1)
		{
			n++;
			if (num % n == 0) //n이 2부터 들어오겠지.
			{
				System.out.println("소수아님.");
				return;
			}
			else 
				mul *= 1;
				//System.out.println("#@");
		}
		if (num < 0)
		{
			System.out.println("음수임");
		}
		else if (num == 0)
		{
			System.out.println("영임");
		}
		else if (num == 1)
		{
			System.out.println("1임.");
		}
		else if (mul != 0)
		{
			System.out.println("소수임");
		}
		else 
			System.out.println("따란 ^^");
	}
}


/*		if (mul == 0)
		{
			System.out.println("소수아님");
		}
		else 
			System.out.println("소수임");
*/
				
				//mul == 0 → 소수아님.
			
		//System.out.println("소수아님 왜냐면 1이니까");
	






// ② return하기
/*
		System.out.print("임의의 정수 입력 : ");
		

		int n = 2;
		int num;
		num = Integer.parseInt(br.readLine());

		while (n < num)
		{
			if (num % n == 0 )
			{
				System.out.println("소수아님");
				return;			//크으으으으,...
			}
			else if (num % n != 0)
			{
				n++;
			}
			else
				System.out.println("꺄아아아아앙");

		}
		if (num < 0)
		{
			System.out.println("음수임");
		}
		else if (num == 0)
		{
			System.out.println("영임");
		}
		else if (num == 1)
		{
			System.out.println("1임.");
		}
		else if (num % 1 ==0 || num % num ==0)
		{
			System.out.println("소수임");
		}
		else 
			System.out.println("따란 ^^");
	}
}
		
*/

//① 방법 1. 인수갯수 늘리기
/*

		int num; //사용자 입력 정수
		int n =1; // 나누는 수 계속 증가할거임.

		int sum = 0; //누적합 . 
		
		System.out.print("임의의 정수 입력 : ");
		num = Integer.parseInt(br.readLine());

		//소수와 소수아님 구분
		// 나머지가 있냐 없냐.

		

		while (n <= num ) //1~(num)
		{
			if(num % n != 0)
			{
				sum += 0;
				//System.out.println(" 합은 ??????? : " + sum);
				
			}
			else if (num % n == 0) //9의 3같은 존재.
			{
				sum +=1;
				//System.out.println(" 합은 ??????? : " + sum);		//1의 인수 개수 : 1의 sum → 1
																//3, 5, 7 ... 같은 소소는 sum 2`
			}
			else 
				System.out.println("해당 없음.");
		 n++;
		}
		


		if (sum == 2) //인수의 개수(소수의 정의 :인수의 개수가 2: 자기자신과 1) → 인수의 개수가 2인거 == sum → 2인거
		{
			System.out.println("소수임.");
		}
		else if (num <0)
		{
			System.out.println("음수임.");
		}
		else if (num == 0)
		{
			System.out.println("영임");
		}
		else if (sum != 2) //num을 나눌 수 있는 num보다 작은 인수 >=2의 갯수가 0이 아니면. 소수 아님. 왜냐? 밑에 보셈
		{
			System.out.println("소수아님.");
		}
		//System.out.println("");
				
	}
}
*/
/*
// num → 7
																	// 7 % 2 → 1	9 % 2 → 1 
																	// 7 % 3 → 1   9 % 3 → 0
																	// 7 % 4 → 3   9 % 4 → 1
																	// 7 % 5 → 2   9 % 5 → 4
																	// 7 % 6 → 1   9 % 6 → 3
																	// 7 % 7 → 0   9 % 7 → 2
																			      //9 % 8 → 1
																	              //9 % 9 → 0
*/