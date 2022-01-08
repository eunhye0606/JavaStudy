/*==============================================
■■■연산자(Operator)■■■

// 산술 연산자
//BufferedReader
//printf()

//사용자로부터 임의의 정수를 두 번 입력받아 (한자리아니여도됨)
//사칙연산 및 나머지 연산을 수행하여
//그 결과를 출력하는 프로그램을 구현한다.
//단, 입력받는 과정은 BufferedReader 를 활용할 수 있도록 하고
//출력하는 과정은 printf()메소드를 활용할 수 있도록 한다.
//또한, 나눗셈 연산은 편의상 정수 기반으로 처리한다.

// 실행 예)
// 첫 번째 정수 입력 : 10 
// 두 번째 정수 입력 : 2

// ====[결과]====
// 10 + 2 = 12
// 10 - 2 = 8
// 10 * 2 = 20
// 10 / 2 = 5
// 10 % 2 = 0
// ==============
//계속하려면 아무 키나 누르세요....
=============================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;


public class Test023
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//                  ------------------
		//                  이런 장치가 없으니 
		//                   new!
		Scanner sc = new Scanner(System.in);

		int n1,n2;		//입력받는 정수 2개 들어가는 변수 선언
		int a, b, c, d, e;		//사칙연산 값 들어가는 변수 선언
		
		System.out.print("첫 번째 정수 입력 : ");		//사용자한테 입력 받기1
		n1 = Integer.parseInt(br.readLine());			//br.readLine(); → 문자열반환
														//Integer.parseInt();로 int형으로 변환 후 대입.

		System.out.print("두 번째 정수 입력 : ");		//사용자한테 입력 받기2
		n2 = Integer.parseInt(br.readLine());

		
		//차례대로 사칙연산 계산 후, 변수에 대입.
		a = n1 + n2;
		b = n1 - n2;
		c = n1 * n2;
		d = n1 / n2;
		e = n1 % n2;

		//결과 출력
		System.out.println();
		System.out.println("===[결과]===");
		System.out.printf("%d + %d = %d", n1,n2,a);
		System.out.printf("\n%d - %d = %d", n1,n2,b);
		System.out.printf("\n%d * %d = %d" ,n1,n2,c);
		System.out.printf("\n%d / %d = %d", n1,n2,d);
		System.out.printf("\n%d %% %d = %d" , n1,n2,e);
		System.out.println("\n=============");

/*		Scanner sc = new Scanner(System.in);

		int n1,n2;
		int a,b,c,d,e;

		System.out.print("첫 번째 정수와 두 번째 정수를 입력하시오 [구분 공백] : ");

		n1 = sc.nextInt();
		n2 = sc.nextInt();

		a = n1 + n2;
		b = n1 - n2;
		c = n1 * n2;
		d = n1 / n2;
		e = n1 % n2;

		//결과 출력
		System.out.println();
		System.out.println("===[결과]===");
		System.out.printf("%d + %d = %d", n1,n2,a);
		System.out.printf("\n%d - %d = %d", n1,n2,b);
		System.out.printf("\n%d * %d = %d" ,n1,n2,c);
		System.out.printf("\n%d / %d = %d", n1,n2,d);
		System.out.printf("\n%d %% %d = %d" , n1,n2,e);
		System.out.println("\n=============");
*/




	}
}
/*  BufferedReader 사용
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2

===[결과]===
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
=============
계속하려면 아무 키나 누르십시오 . . .
*/




/* Scanner 사용
첫 번째 정수와 두 번째 정수를 입력하시오 [구분 공백] : 10 2

===[결과]===
10 + 2 = 12
10 - 2 = 8
10 * 2 = 20
10 / 2 = 5
10 % 2 = 0
=============
계속하려면 아무 키나 누르십시오 . . .
*/