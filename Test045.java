/*=====================================
■■■실행 흐름의 컨트롤(제어문)■■■
======================================*/

// switch 문 실습

// 사용자로부터 임의의 두 정수와 연산자를 입력받아
// 해당 연산자의 처리 결과를 출력하는 프로그램을 구현하라.
// 단, switch 문을 활용하여 처리할 수 있도록 하며
// 연산 결과는 편의상 정수 형태로 처리할 수 있도록 한다.

// 실행 예)
// 첫 번째 정수 입력 : 3
// 두 번째 정수 입력 : 17
// 연산자 입력 [+ - * /] : -

// >> 3 - 17 = -14
// 계속 ..............
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test045

{
	public static void main(String[] args) throws IOException

	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n1, n2, nOp;
		int a,b,c,d; //사칙연산 결과
		char cOp;

		System.out.print("첫 번째 정수 입력 : ");
		n1 = Integer.parseInt(br.readLine());

		System.out.print("두 번째 정수 입력 : ");
		n2 = Integer.parseInt(br.readLine());
	
		System.out.print("연산자 입력 [ + - * / ] : ");
		nOp = System.in.read();
		cOp = (char)nOp;

		// + 43
		// - 45
		// * 42
		// / 47

		//op = (char)System.in.read();

		a = n1 + n2;
		b = n1 - n2;
		c = n1 * n2;
		d = n1 / n2;

		switch (nOp)
		{
				// result = a + b; 이렇게 하는게 더 간단.
		case 43: System.out.printf("%d %c %d = %d",n1,cOp,n2,a); break;
		case 45: System.out.printf("%d %c %d = %d",n1,cOp,n2,b); break;
		case 42: System.out.printf("%d %c %d = %d",n1,cOp,n2,c); break;
		case 47: System.out.printf("%d %c %d = %d",n1,cOp,n2,d); break;
		default : return;
		//1.값의 반환
		//2.메소드 종료 → 단독으로 쓰일 때, → main()가 이걸 품고 있으니
											//  main()의 종료를 의미!.
											//  → 프로그램 종료.

		//default: System.out.println("연산자 잘못 기재.");
		
		
		}
		System.out.println();
	}
}


/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, result;
		char op;

		System.out.print("첫 번째 정수 입력 : ");
		a = Integer.parseInt(br.readLine());
		System.out.print("두 번째 정수 입력 : ");
		b = Integer.parseInt(br.readLine());

		System.out.print("연산자 입력 [ + - * / ] : ");
		op = (char)System.in.read();

		switch (op)
		{
		case '+': result = a + b; break;
		case '-': result = a - b; break;
		case '*': result = a * b; break;
		case '/': result = a / b; break;

		default : return;
		
		}
		System.out.printf("\n>>%d %c %d = %d\n", a, result, b);
	}

}*/ 
// 이버전에는 수식안에 char 불가. 도큐먼트 찾기


/*

첫 번째 정수 입력 : 5
두 번째 정수 입력 : 8
연산자 입력 [ + - * / ] : /
5 / 8 = 0
계속하려면 아무 키나 누르십시오 . . .

첫 번째 정수 입력 : 3
두 번째 정수 입력 : 5
연산자 입력 [ + - * / ] : *
3 * 5 = 15
계속하려면 아무 키나 누르십시오 . . .
*/