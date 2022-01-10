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
// (2) 두 번째 vs 세 번째
// (3) 세 번째 vs 두 번째
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