/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// 반복문(while 문) 실습

// 사용자로부터 임의의 두 정수를 입력받아
// 작은 수부터 큰 수 까지의 합을 구하여
// 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 20 
// >> 10 ~ 20 까지의 합은 : xxxx
// 계속하려면 ........

// 첫 번째 정수 입력 : 10
// 두 번째 정수 입력 : 2 
// >> 2 ~ 10 까지의 합은 : xxxx
// 계속하려면 ........
//======================================

/*
1. 입력 값 두개 비교 하기 n1, n2
2. n1 > n2
3. n2 ~ n1 까지 누적합
4. n2 < n1 
5. n1 ~ n2 까지 누적합
6. n1 == n2
7. n1 값



*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test054
{
	public static void main(String[] args) throws IOException
	{


		//주요 변수 선언 및 초기화
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
/*

		int n; // --루프 변수로 활용할 변수
		int su1, su2; //-- 첫 번째, 두 번째 사용자 입력값을 담아낼 변수
		int result = 0; //-- 누적합 담아낼 변수

		//연산 및 처리 
		System.out.print("첫 번째 정수 입력 : ");
		su1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		su2 = Integer.parseInt(br.readLine());

		//입력받은 두 수의 크기 비교 및 자리 바꿈
		//즉, su1이 su2 보다 큰 경우
		//두 수의 자리를 바꿀 수 있도록 처리

		if (su1 > su2)		//--처음 입력 받은 수가 클 때만 
		{
			//자리 바꿈
			su1 = su1 ^ su2;
			su2 = su2 ^ su1;
			su1 = su1 ^ su2;

		}
		//반복 연산 수행
		//반복 연산을 수행하기 전에
		//작은 수를 따로 저장하여 루프 변수로 활용한다.
		//(결과 출력 과정에서 입력받은 작은 수가 필요한데)
		// 그 수를 반복과정에서 사용하게 되면...
		//원래의 값을 확인할 수 없기 때문에...

		n = su1;


		while (n<=su2)
		{
			result += n;
			n++;
		}

		//결과 출력
		System.out.printf("%d ~ %d 까지의 합은 : %d " ,su1, su2, result);
	}
}

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 20
10 ~ 20 까지의 합은 : 165 계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
2 ~ 10 까지의 합은 : 54 계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 5
두 번째 정수 입력 : 5
5 ~ 5 까지의 합은 : 5 계속하려면 아무 키나 누르십시오 . . .


*/
		













		int n1,n2; // --사용자 입력 값
		int num = 1; // 범위내에서 1씩 증가할 변수
		int sum = 0; // 누적합 계산.


		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());

		if (n1 >= n2)
		{
			num = n2; // 초기값을 n2로 설정. 

			       //↓ 반복진행
			while (num <= n1)// n2 ~ n1 까지 누적합
			{
				sum += num; // n 만큼 증가해서 더해라.
				num++;
			}
		}

		else if(n1 < n2)// n1 ~ n2 까지 누적합
		{
			num = n1; 
			while (num <= n2)
			{
				sum+= num;
				num++;
			}
			
		}
		System.out.printf("%d ~ %d 까지의 합은 : %d " ,n1, n2, sum);

	}
}

// 잘 나옴!

