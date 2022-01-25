 /*===============================================
	  ■■■ 클래스 고급 ■■■
================================================*/
// 상속(Inheritance)

// 다음과 같은 프로그램을 구현한다.
// 단, 상속의 개념을 적용하여 작성할 수 있도록 한다.

// 실행 예)
// 임의의 두 정수 입력(공백 구분):  20 15
// 연산자 입력(+ - * /): -
// >> 20 - 15 = 5.00
// 계속하려면.....

//==============================================================
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class Aclass
{
	protected int x,y;
	protected char op;

	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(" >> %d %c %d = %.2f%n", x, op, y, result);
	}
}

class Bclass extends Aclass
{
	/*
	protected int x,y;
	protected char op;

	void write(double result) //-- 원래 접근제어지시자 default는 
	                               접근안되는데 같은 패키지 안이라
								   접근가능한것!
	{
		System.out.printf(" >> %d %c %d = %.2f%n", x, op, y, result);
	}
	*/
	Bclass()
	{
	}

	boolean input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("임의의 두 정수 입력(공백 구분) : "); //" 20 15"
		String temp = br. readLine(); 

		


		// ※ 문자열.split("구분자")	//-- 구분자 → 공백으로 써라
		//    문자열.split("\\s")	//-- 구분자 → 공백으로 써라
		//    ex)     "10 20 30 40 50".split("\\s");
		//    반환 → {"10","20","30","40","50"}
		//    요소를 문자열로 취하는 배열

		//    ex) "010-1234-1234".split("-");
		//    반환 → {"010","1234","1234"}
		//    요소를 문자열로 취하는 배열

		String[] strArr = temp.split("\\s");

		if (strArr.length != 2)
			return false;
			//-- false 를 반환하며 input() 메소드 종료
			//   이 조건을 수행할 경우
			//   아래 수행해야 할 코드가 남아있더라도
			//   결과값을 반환하며 메소드는 종료된다.
		

		x = Integer.parseInt(strArr[0]);
		y = Integer.parseInt(strArr[1]);
		
		
		System.out.print("연산자 입력(+ - * /): ");
		op = (char)System.in.read(); //--아스키코드
		
		/*
		if (op != '+' && op != '-' && op != '*' && op != '/')
			return false;
		*/
		if (op == '+' || op == '-' || op == '*' || op == '/')
			return false;
		

		//저 위에 if 조건문 두 개가 아니면
		// true를 반환한다! else는 따로 안씀
		// return하면서 input()이 완전 끝나기 때문에!
		return true;

	} // close input()

	double calc()
	{

		double result = 0;
		//-- default 값을 써주는걸로도 해결 가능

		switch(op)
		{
			case '+' : result = x + y; break;
			case '-' : result = x - y; break;
			case '*' : result = x * y; break;
			case '/' : result = (double)x / y; break;
		}
	}

} //-- 여기 파싱구문!


//main() 메소드를 포함하는 외부의 다른 클래스
public class Test115
{
	public static void main(String[] args) throws IOException
	{
		//Bclass 인스턴스 생성
		Bclass ob = new Bclass();

		if (!ob.input())
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();

		ob.write(result);

		
		
	}
}



//==============================================================
/*
import java.util.Scanner;
import java.io.IOException;

//부모 클래스 
class Aclass
{
	protected int x,y;
	protected char op;
	
	//부모 클래스 생성자
	Aclass()
	{
	}

	void write(double result)
	{
		System.out.printf(" >> %d %c %d = %.2f%n", x, op, y, result);
	}
}

//Aclass 를 상속받는 클래스로 설계

//자식 클래스
class Bclass extends Aclass
{
	//자식 클래스 생성자
	Bclass()
	{
	}

	//사용자에게 입력 받는 메소드
	boolean input() throws IOException
	{   		
		// Scanner 기반의 인스턴스 생성
		Scanner sc = new Scanner(System.in);
		int sum = 0 ; // -- 입력받은 정수 개수 누적합.
		boolean user = true ; // 다음 값이 있으면 true;
		//boolean userOp = false; // -- 사용자 연산자 조건

		//int [] arr = new int [1];
		

		//userOp = (op == '+') || (op == '-') || (op == '*') || (op == '/');

		//사용자에게 입력받기
		System.out.print("임의의 두 정수 입력(공백 구분):  ");
		x = sc.nextLine();
		y = sc.ne
		System.out.println(x);*/
		

		
		/**

			System.out.print("임의의 두 정수 입력(공백 구분):  ");
			x = sc.nextInt();
			y = sc.nextInt();

			int n = sc.nextInt();

			if (n > 0 && n <= 0)
			{
				user = false;
			}

			*/

		/*
		for (int i = 0;i<arr.length ;i++ )
		{
			System.out.print("임의의 두 정수 입력(공백 구분):  ");
			arr[i] = sc.nextInt();
		}
		*/
			
	
/*		
			System.out.print("연산자 입력(+ - * /): ");
			super.op = (char)System.in.read(); //--아스키코드
		
		if ((op != '+' && op != '-' && op != '*' && op != '/'));
			user = false;*/
		
		/**
			sum = 0; //-- 초기화
			System.out.print("임의의 두 정수 입력(공백 구분):  ");
			super.x = sc.nextInt();
			sum++;
			System.out.println("첫번째 sum " + sum);
			super.y = sc.nextInt();
			sum++;
			System.out.println("두번째 sum " + sum);

			System.out.print("연산자 입력(+ - * /): ");
			super.op = (char)System.in.read(); //--아스키코드
			System.out.println("사용자가 입력한 연산자는 : " + op);
		**/
	
		/*
		do
		{
			System.out.print("연산자 입력(+ - * /): ");
			super.op = (char)System.in.read(); //--아스키코드
			System.out.println("사용자가 입력한 연산자는 : " + op);


		}
		while (!userOp);
		*/
		/*
		if (sum == 2)
		{
			user = true;
			
		}
		*/
		/*
		return user; //-- 사용자가 입력 잘 했다!
	}




	double calc()
	{

		double r = 0; // -- 결과값.
		switch (op)
		{
		case '+': r = x + y; break;
		case '-': r = x - y; break;
		case '*': r = x * y; break;
		case '/': r = (double)x / y; break;
		}
		return r;
	}
}


//main() 메소드를 포함하는 외부의 다른 클래스
public class Test115
{
	public static void main(String[] args) throws IOException
	{
		//Bclass 인스턴스 생성
		Bclass ob = new Bclass();

		//ob.input(); // 이거 내가 쓴거였네



		if (!ob.input())
		{
			System.out.println("Error...");
			return;
		}

		double result = ob.calc();

		ob.write(result);
		
	}
}
*/