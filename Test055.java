/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// 반복문(while 문) 실습

//◎ 과제
//   사용자로부터 임의의 정수를 입력받아
//   1부터 입력받은 그 정수까지의
//   전체 합과, 짝수의 합과 , 홀수의 합을 
//   각각 결과값으로 출력하는 프로그램을 구현한다.


// 실행 예 )
// 임의의 정수 입력 : 280
// 1 ~ 280 까지 정수의 합 :
// 1 ~ 280 까지 짝수의 합 :
// 1 ~ 280 까지 홀수의 합 :
// 계속하려면 .........................
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test055
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("임의의 정수 입력 : ");
		
		int nUser;
		nUser = Integer.parseInt(br.readLine());

		// 정수의 합
		int n=1; //--정수의 합 루프변수 
		int nSum=0; //--정수의 누적합 담을 변수
		int evenSum =0; //--짝수의 누적합 담을 변수
		int oddSum = 0; //--홀수의 누적합 담을 변수

		while (n<= nUser) //--> ② 정수합, 짝수합 ,홀수합 한번에!
		{
			nSum += n; // 여기서 정수 누적합 하고.
			
			if (n % 2 == 0) // 근데 n이 짝수라면?
			{
				evenSum += n; // 짝수누적합해라.
			}
			else // 짝수가 아니라면 ? 즉, 홀수라면?
				oddSum += n; // 홀수 누적합해라.

			n++; // ★여기가 포인트! 왜냐하면 n이 증가하지 않은 상태에서
			     // 짝수, 홀수를 분기해서 합해야지
				 // 안하면 짝홀수 누적합 0됨.



		}
/* ① 정수합, (짝수합, 홀수합) 따로따로
		while (n<=nUser)
		{
			nSum += n;
			n++;
		}
		n = 1; //-- 위에 while때문에 n이 nUser까지 증가한 상태. 
			   // 따라서 다시 초기화 실행.
		while (n<=nUser)
		{
			if (n % 2 == 0)
			{
				evenSum += n;
				n++;
				System.out.println("짝수합 테스트");
			}
			else 
			{
				oddSum += n;
				n++;
			}

		}
	*/
	
	//홀수 합 검산 테스트.
	/*	int summ = 0;
		for (int i = 1;i<=10 ;i+=2 )
		{
			
			summ += i;
			
		}
		System.out.println(summ);
	*/
	
		System.out.printf("1 ~ %d 까지의 정수의 합 : %d\n", nUser,nSum);
		System.out.printf("1 ~ %d 까지의 짝수의 합 : %d\n", nUser,evenSum);
		System.out.printf("1 ~ %d 까지의 홀수의 합 : %d\n", nUser,oddSum);


		// 짝수의 합
		// 홀수의 합
		
	}
}

/*
임의의 정수 입력 : 10
1 ~ 10 까지의 정수의 합 : 55
1 ~ 10 까지의 짝수의 합 : 30
1 ~ 10 까지의 홀수의 합 : 25
계속하려면 아무 키나 누르십시오 . . .
*/