/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

//continue 실습

//continue 를 활용하여
// 다음과 같이 출력될 수 있도록 프로그램을 구현한다.
// 실행 예)

/*
1 : 1
3 : 4
5 : 9
7 : 16
  :
  :
  :
99: 2500
계속하려면 아무 키나 누르세요....
*/

public class Test068
{
	public static void main(String[] args)
	{
		int n = 0, s= 0;

		while (n<100)
		{
			n++;	
			
			if (n%2 == 0)
			{
				continue;		//뒷부분은 무시하고..
			}
			

			s += n; //뒷부분
			System.out.printf("%d : %d\n\n ",n,s); //뒷부분 → 부분을 무시하면 누적합 안구하고 반복. 
		}
	}
}
/*
		int n =1;
		int sum = 0;

		for (n=1;n<100 ;n++ )
		{
			if (n % 2 != 0)	//컨티뉴 잘못씀. 저기엔 저거 없어도 홀수일때만 누적합.
			{	
				sum += n;
				System.out.printf("%d : %d", n, sum);
				System.out.println("\n");
				//continue; → 둘다 ㅇㅋ
			}
			continue; //→ 둘다 ㅇㅋ
		}
	}
}
		//1 ~ 100까지 중 홀수만 누적합.
/*
		int n=1; //홀수
		int sum=0; //홀수 합.

		for (n=1;n<=100 ;n+=2)
		{	
			sum += n;
			System.out.printf("%d : %d", n, sum);
			System.out.println("\n");

		}
		
	}
}
*/

/*

*/
