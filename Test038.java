/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/
// if 문
//if ~ else 문 실습

//1. 프로그램을 작성할 때 주어진 조건에 따라
//   분기 방향을 정하기 위해 사용하는 제어문에는
//   if문, if~else문, 조건연산자, 복합if문(if문 중첩),
//   switch 문이 있다.

//2. if문은 if 다음의 조건이 참일 경우,
//   특정 문장을 수행하고자 할 때 사용되는 구문이다.

//사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 연산 처리 결과를 출력하는 프로그램을 구현해라.
// 단, if 조건문을 활용하여 처리할 수 있도록 하며,
// 연산 결과는 편의상 정수 기반으로 처리될 수 있도록 한다.

// 실행 예 )
// 첫 번째 정수 입력 : 
// 두 번째 정수 입력 : 
// 연산자 입력 [+ - * /] : +

// >> 10 + 3 = 13
// 계속하려면 아무 키나 누르세요...
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test038
{

	public static void main(String[] args) throws IOException
	{
	/*	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n1, n2;
		char oper; //연산자


		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 [+ - * /] : ");
		//oper = br.readLine();
		oper = (char)System.in.read();
		//연산자 단일문자라 String에 안들어가서 readLine(); 불가.



		if (oper == '+')
		{
			System.out.printf(">>%d + %d = %d",n1,n2,n1+n2);
		}
		else if (oper == '-')
		{
			System.out.printf(">>%d = %d = %d",n1,n2,n1-n2);
		}
		else if (oper == '*')
		{
			System.out.printf(">>%d * %d = %d",n1,n2,n1*n2);
		}
		else if (oper == '/')
		{
			System.out.printf(">>%d / %d = %d",n1,n2,n1/n2);
		}
		else 
			System.out.println("알 수 없음."); //→ 이게 있어야 연산자 말고 딴거 넣을때 알수없음 나옴.
	System.out.println();	
*/
    int a, b, result = 0;
	char op;

	System.out.print("첫 번째 정수 입력 : " );
	a = Integer.parseInt(br.readLine());
	System.out.print("두 번째 정수 입력 : " );
	b = Integer.parseInt(br.readLine());
	System.out.print("연산자 입력 [+ - * /] : ");
	op = (char)System.in.read();

	if (op == '+')
	{
		result = a + b;
	}
	else if (op == '-')
	{
		result = a - b;
	}
	else if (op == '*')
	{
		result = a * b;
	}
	else if (op == '/')
	{
		result = a / b;
	}
	System.out.printf("\n >> %d %c %d = %d%n", a,op,b,result);





/*	String str;
	char ch = 'A';
	//str = ch;
	str = "a";
	System.out.print(str);*/
	//char가 String에 못들어가는거
	//String안에 단일문자는 ""형태로 가능

// 단일문자는 문자열에 포함안돼. ㄴㄴ됨
/*	String str = "안녕";
	boolean b;
	b = str == "안녕";
	// String도 == 가능.
*/
	}
}

/*
첫 번째 정수 입력 : 10
두 번째 정수 입력 : 20
연산자 입력 [+ - * /] : +
10 + 20 = 30
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
연산자 입력 [+ - * /] : -
10 = 2 = 8
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
연산자 입력 [+ - * /] : *
10 * 2 = 20
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
연산자 입력 [+ - * /] : /
10 / 2 = 5
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 10
두 번째 정수 입력 : 2
연산자 입력 [+ - * /] : =
알 수 없음.

계속하려면 아무 키나 누르십시오 . . .
*/