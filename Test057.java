/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// 반복문(do ~ while 문) 실습

/*
○ 개요
	『do ~ while』문은 『while』문과 마찬가지로
	특정한 영역을 반복 수행하는 반복문이다.
	다만 『while』문과 다른 점은
	조건식에 대한 검사를 반복문을 수행한 이후에 한다는 것이다.
	이와 같은 성격으로 인해 반드시 한 번은 수행하게 되는 특징을 갖는다.

○ 형식 및 구조
  
	do 
	{
		실행문;
	}
	while(조건식);

// do ~ while 문의 활용 모델
// 예를 들어... 사용자로부터 특정 범위의 정수가 입력될 때 까지
// 입력받은 행위 자체를 반복해서 수행해야 하는 상황이라 가정한다.

//즉, 최소 한 번은 사용자의 입력값을 받아오는 처리를 수행해야
//반복을 추가로 수행할지 말지의 여부를 결정할 수 있는 상황이다.

*/
import java.util.Scanner;
import java.io.IOException;

public class Test057
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int num;
		do
		{
			System.out.print("100 이상의 정수를 입력하세요 : ");		//while문에서는 조건식에 몇번 받는지 몰라.
			num = sc.nextInt();
		}
		while (num < 100);

		System.out.println(num + "사용자가 입력한 값은 100이상이다.");
		
	}
}

/*

*/



/*public class Test057
{
	public static void main(String[] args)
	{
		//※ while 반복문을 통해 구현했던 내용들을
		//   do ~ while 문을 통해서도 구현할 수 있다.

		int n = 0;
		
		do
		{
			n++; //n =1 ,n=3, n=5 , n=7, n= 9 n =11
			System.out.println("n=" + ++n);
									// n = 2, n=4,n=6 , n= 8,n=10,n=12
		}
		while (n<=10); //n =12 → false


	}
}
*/

/*
n=2
n=4
n=6
n=8
n=10
n=12
계속하려면 아무 키나 누르십시오 . . .
*/
/*public class Test057
{
	public static void main(String[] args)
	{
		//※ while 반복문을 통해 구현했던 내용들을
		//   do ~ while 문을 통해서도 구현할 수 있다.

		int n = 0;
		
		do
		{
			n++;
			System.out.println("n=" + n);
			
		}
		while (n<10);


	}
}
*/

/*
n=1
n=2
n=3
n=4
n=5
n=6
n=7
n=8
n=9
n=10
계속하려면 아무 키나 누르십시오 . . .
*/

/*public class Test057
{
	public static void main(String[] args)
	{
		//※ while 반복문을 통해 구현했던 내용들을
		//   do ~ while 문을 통해서도 구현할 수 있다.

		int n = 1;
		
		do
		{
			n++;
			System.out.println("n=" + n);
			
		}
		while (n<=10);


	}
}
*/

/*
n=2
n=3
n=4
n=5
n=6
n=7
n=8
n=9
n=10
n=11
계속하려면 아무 키나 누르십시오 . . .
*/

/*public class Test057
{
	public static void main(String[] args)
	{
		//※ while 반복문을 통해 구현했던 내용들을
		//   do ~ while 문을 통해서도 구현할 수 있다.

		int n = 1;
		
		do
		{
			System.out.println("n=" + n);
			n++;
		}
		while (n<=10);


	}
}
*/
/*
n=1		//일단 출력하고
n=2		// while 조건비교해서 출력
n=3		// while 조건비교해서 출력
n=4		// while 조건비교해서 출력
n=5		// while 조건비교해서 출력
n=6		// while 조건비교해서 출력
n=7		// while 조건비교해서 출력
n=8		// while 조건비교해서 출력
n=9		// while 조건비교해서 출력
n=10	// while 조건비교해서 출력


n은 10까지 들어감. 10은 출력하고 n++ 해서 11은 조건 ㄴㄴ 못들어가.
계속하려면 아무 키나 누르십시오 . . .
*/