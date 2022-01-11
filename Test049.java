/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

//반복문(while 문) 실습

//실행 예 )
// 1 부터 100 까지 정수의 합은 : 5050
// 1 부터 100 까지 짝수의 합은 : 2550
// 1 부터 100 까지 홀수의 합은 : 2500
//계속 ............


public class Test049
{
	public static void main(String[] args)
	{
		int n =1 ,sum, even, odd;
		sum = even = odd = 0;
		// odd = 0 부터 실행.
		// even = 0 실행
		// sum = 0 실행

		while (n<=100)
		{
			sum+=n;

			if (n%2 ==0)
			{
				even += n;
			}
			else if (n%2 != 0)
			{
				odd += n;
			}
			else
			{
				System.out.println("판별 불가.");
				return;
			}
			n++;

		}
		System.out.println("1 부터 100 까지 정수의 합은 : " + sum);
		System.out.println("1 부터 100 까지 짝수의 합은 : " + even);
		System.out.println("1 부터 100 까지 홀수의 합은 : " + odd);
	}
}
/*
1 부터 100 까지 정수의 합은 : 5050
1 부터 100 까지 짝수의 합은 : 2550
1 부터 100 까지 홀수의 합은 : 2500
계속하려면 아무 키나 누르십시오 . . .
●●●●●●●●●●●●●●●●●●●●●●●●●●확인필요→while 조건문에
등호 안넣음 키...
*/

	
		
/*
		int n = 1;

		int even = 0;
		int odd = 0;
		int result = 0;


		while (n<=100)
		{
			if (n%2 == 0)
			{
				even += n;
			}
			else if (n% 2 != 0)
			{
				odd += n;
			}
			n++;
		}
		
		result = even + odd;

		System.out.println("1 부터 100 까지 정수의 합은 : " + result);
		System.out.println("1 부터 100 까지 짝수의 합은 : " + even);
		System.out.println("1 부터 100 까지 홀수의 합은 : " + odd);
		

	}
}
*/

/*
1 부터 100 까지 정수의 합은 : 5050
1 부터 100 까지 짝수의 합은 : 2550
1 부터 100 까지 홀수의 합은 : 2500
계속하려면 아무 키나 누르십시오 . . .
*/