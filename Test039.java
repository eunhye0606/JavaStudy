/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/
// if 문
//if ~ else 문 실습

// 사용자로부터 임의의 정수 세개를 입력받아
// 작은 수에서 큰 수 순으로 출력하는 프로그램을 구현한다.

// 실행 예)
// 첫 번째 정수 입력 : 7
// 두 번째 정수 입력 : 70
// 세 번째 정수 입력 : 42

// >> 정렬 결과 : 7 42 70
// 계속하려면 아무 키나 누르세요 .....

// (1) 첫 번째 vs 두 번째
//		→ 첫 번째 정수 > 두 번째 정수보다 클 경우 자리 바꿈.
// (2) 첫 번째 vs 세 번째
//		→ 첫 번째 정수 > 세 번째 정수보다 클 경우 자리 바꿈
// (3) 두 번째 vs 세 번째
//		→ 두 번째 정수 > 세 번째 정수보다 클 경우 자리 바꿈.

// 7 vs 70 --> 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test039
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n1,n2,n3; //사용자 입력 정수 차례대로

		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력 : ");
		n3 = Integer.parseInt(br.readLine());
		//==============================★★★★★★★★★===============================

		// 첫 if 구문 한 뒤, 다른 거 수행하지 말까? → if ~ else if 문으로 묶기
		//				     뒤에도 확인해야 하지   → 독립적인 if 구문
		if (n1>n2)	// (1) 첫 번째 vs 두 번째
		{
			n1 = n1 ^ n2;
			n2 = n2 ^ n1;
			n1 = n1 ^ n2;
			//n1 > n2 크다면 자리를 바꿔라..
		}
		if (n1>n3)  // (2) 첫 번째 vs 세 번째
		{
			n1 = n1 ^ n3;
			n3 = n3 ^ n1;
			n1 = n1 ^ n3;//n1 > n3 크다면 자리를 바꿔라...
		}
		if (n2>n3) // (3) 두 번째 vs 세 번째
		{
			n2 = n2 ^ n3;
			n3 = n3 ^ n2;
			n2 = n2 ^ n3;//n2 > n3 크다면 자리를 바꿔라 ....
		}
		



		
		
		


		//최종 결과 출력
		System.out.printf("\n>> 정렬 결과 : %d %d %d" , n1, n2, n3);



/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n1,n2,n3; //사용자 입력 정수 차례대로

		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());
		System.out.print("세 번째 정수 입력 : ");
		n3 = Integer.parseInt(br.readLine());

		int bN,mN,sN; //큰거 중간 작은거
		
		bN = 0; 
		mN = 0; 
		sN = 0; 

		if (n1 >= n2)
		{
			bN = n1;
			mN = n2;
			sN = n3;
			if (mN >= sN)
			{
				sN = n3;
			}
			else 
			{
				mN = n1;
				sN = n2;
			}
		}
		else if (n2 >= n3)
		{
			bN = n2;
			mN = n3;
			sN = n1;
			if (mN >= sN)
			{
				sN = n1;
			}
			else
			{
				mN = n1;
				sN = n3;
			}
		}
		else if (n3 >= n1)
		{
			bN = n3;
			mN = n1;
			sN = n2;
			if (mN >= sN)
			{
				sN = n2;
			}
			else
			{
				mN = n2;
				sN = n1;
			}
		}
		
		else
			System.out.println("알 수 없음.");
	
	System.out.printf("%d %d %d\n",sN,mN,bN);
*/

/*		if (n1 >= n2 && n1 >= n3)
		{
			bN = n1;
			
			if (n2 >= n3)
			{
				mN = n2;
				sN = n3;
				
			}
			else 
			
				mN = n3;
				sN = n2;
			
		}
		else if (n2 >= n3 && n2 >= n1)
		{
			bN = n2;

			if (n3 >= n1)
			{
				mN = n3;
				sN = n1;
			}
			else
				mN = n1;
				sN = n3;

		}
		else if (n3 >= n1 && n3 >= n2)
		{
			bN = n3;

			if (n1 >= n2)
			{
				mN = n1;
				sN = n2;
			}
			else 
				mN = n2;
				sN = n1;

		}
		else 
			System.out.println("알 수 없음.");

		System.out.printf("%d %d %d\n",sN,mN,bN);

*/


/*		boolean b1, b2, b3;

		b1 = n1 >= n2;
		b2 = n2 >= n3;
		b3 = n3 >= n1;

		if (b1) //n2 n1
		{
			if (b3) //n2 n1 n3
			{
				System.out.printf("\n >> 정렬 결과 : %d %d %d" , n2,n1,n3);
			}
			else
			{
				System.out.printf("\n >> 정렬 결과 : %d %d %d" , n2,n3,n1);
			}
		}
		else if (b2) //n3 n2
		{
			if (b1) // n3 n2 n1
			{
				System.out.printf("\n >> 정렬 결과 : %d %d %d" , n3,n2,n1);
			}
			else 
				System.out.printf("\n >> 정렬 결과 : %d %d %d" , n3,n1,n2);
		}
		else if (b3) //n1 n3
		{
			if (b2) //n1 n3 n2
			{
				System.out.printf("\n >> 정렬 결과 : %d %d %d" , n1,n3,n2);
			}
			else 
				System.out.printf("\n >> 정렬 결과 : %d %d %d" , n1,n2,n2);
		}
		else 
			System.out.println("알 수 없음.");
*/

	/*	if (n1 > n2 && n1 > n3)
		{
			if (n2 > n3)
			{
				System.out.printf("\n >> 정렬 결과 : %d %d %d",n3,n2,n1);
			}
			else if (n2 < n3)
			{
				System.out.printf("\n >> 정렬 결과 : %d %d %d",n2, n3,n1);
			}
		}
*/
	}
}
/*
첫 번째 정수 입력 : 7
두 번째 정수 입력 : 70
세 번째 정수 입력 : 42
7 42 70
계속하려면 아무 키나 누르십시오 . . .
*/