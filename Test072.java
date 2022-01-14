/*=====================================
■■■ 클래스와 인스턴스 ■■■
======================================*/

// 직사각형 클래스 설계 실습

/*
직사각형의 넓이와 둘레 계산 → 클래스 표현

클래스의 정체성 → 직사각형
클래스의 속성   → 『가로,세로』, 넓이, 둘레, 부피, 무게, 재질, 색깔... 등
클래스의 기능   → 넓이 계산, 둘레 계산, 가로세로 입력, 결과 출력...등



객체를 구성     → 데이터(속성, 상태) + 기능(동작, 행위)
	↓
클래스를 설계   →		 변수         +      메소드
*/

/*
class 직사각형
{
	//데이터(속성, 상태) → 변수(순서 의미 없음)	→ 객체지향에서	『순차적』은 메소드 안에서만 해당. 
	int 가로, 세로;

	//기능(동작, 행위) → 메소드(순서 의미 없음)
	가로세로 입력()
	{
	}

	둘레 계산()
	{
	}

	넓이 계산()
	{
	}

	결과출력()
	{
	}
}
*/
//import java.util.Scanner;
/*
하나의 파일에 하나의 클래스 → 설계도 보다는 먼저 해야 함.
하나의 파일에 두개 이상의 클래스 → 두 클래스 통틀어서 클래스가
									설계되기 이전에 작성해야함.
*/
//class Rect	//직사각형 클래스 설계

/*
클래스 만들기 단계
① 변수 뭐하지?
② 메소드 뭐하지?
③ 메소드 매개변수 뭐하지?


*/
//{
	//Scanner sc = new Scanner(System.in);
	//			________인스턴스 생성___

	//맨날 main()안에서 작성.
	//클래스에 선언 ㄴㄴ 전역변수 ㄴㄴ
	//문법적인 문제는 없어요.	
	//★★★ 클래스 설계도를 작성하면 인스턴스 생성을 먼저해야함 ★★★

	/*
	Rect ob = new Rect
	→ 아직 메모리 ㄴㄴ
	→ → 이걸 클래스에 주면 input등장 전부터 메모리 잡아먹음.
	→ → → 다른 메소드는 Scanner필요없는데 쟤네 까지 쓸 수 있는 
		     Scanner만들어서 괜히 메모리 잡아먹음.
	ob.input();
	→ 메모리 올라가.
	ob.calLength();
	ob.print();
	*/

	/*
★★ 클래스 안에 인스턴스 생성 안해. 잘. ★★ 
class 클래스명
{
	int 내돈;
	int 사과갯수; → 인스턴스 변수, 인스턴스 생성될 때, 메모리 할당.
					 멤버변수. 
					 전역변수이기도 하면서 인스턴스, 멤버 변수이기도..


	Scanner sc = new Scanner(System.in); //→ 문법적으로 가능
										 // 이렇게 잘 안씀.

	메소드명1()
	{
		Scanner sc = new Scanner(System.in); //→ 문법적으로 가능
		이러면 메소드1이 호출될 때, 
		Scanner가 메모리로 감.
	}
	메소드명2()
	{
		Scanner sc = new Scanner(System.in);
	}
	메소드명3()
	{
		Scanner sc = new Scanner(System.in);
	}
	메소드명4()
	{
		Scanner sc = new Scanner(System.in);
	}
	// 메소드 각각 다 쓴다 해도. 각각 인스턴스 생성.
	   메소드1의 sc는 메소드 2의 sc가 안보이고 ~
}

	*/
import java.util.Scanner;

class Rect	//직사각형 클래스
	{

	// 데이터(속성, 상태) → 변수
	int w, h; // -- 가로,세로 

	
	// 기능(동작, 행위) → 메소드
	
	
	void input()	//가로세로 입력()
//_______
//반환자료형
//반환 되는 곳: 호출한 곳.
	{
		//Scanner기반에 인스턴스 생성.
		Scanner sc = new Scanner(System.in);
		System.out.print("가로 입력 : ");
		w = sc.nextInt();

		System.out.print("세로 입력 : ");
		h = sc.nextInt();

		//return이 없다.
		//생성자가 아니다. → void
	}

	int calLength()	//둘레 계산() → (가로 + 세로) * 2
	{
		int test;
		test = (w + h) *2;

		// w ,h 는 전역변수라 보임.
		return test;
		// return (w+h)*2 가 간단하지만 메소드 틀 만들 떄,
		// 반환하는 변수에 대한 선언하고 
		// 채워넣는 형식을 쓰면 좋은 팁.

		//return (test);	→ void
	}

	 int calArea()	//넓이 계산()	→ 가로 * 세로
	{
		int resultArea;	//호출한 곳에 담아둘 곳이 없넹
		resultArea = w *h;
		return resultArea;
	}

	void print(int test, int resultArea)	//결과출력()
	{
		// 가로 : 10 → 전역변수
		// 세로 : 20 → 전역변수
		// 넓이 : xxx → 지역변수
		// 둘레 : xxx → 지역변수
		System.out.printf("가로 : %d\n",w);
		System.out.printf("세로 : %d\n",h);
		System.out.printf("넓이 : %d\n",resultArea);
		System.out.printf("둘레 : %d\n",test);

		//void는 그 자리에 두고 오는 것.
		//출력만 할 뿐이지 그 위치에 문자열을 두고 오는 것이 아님.

	}


}
// ※ 하나의 자바 파일 (.java)에 여러 개의 클래스(class)를 설계 할 수 있나???
// 	  : Yes
//    ★하지만, 『public class』는 하나만 올 수 있다.★
//    main()이 없는 java파일도 있다~


// 그렇다면 파일 명은?
// 『public class』이 붙은 class명을 지정.

// 일반적으로는 하나의 파일에 하나의 클래스를 설계한다.
// 또한, 여러 개의 클래스가 설계된 파일을 컴파일하게 되면
// ★내부에 설계된 클래스의 수 만큼 클래스 파일(.class)이 파생된다.★
//________________________________________________________________


public class Test072
{
	public static void main(String[] args)
	{
		//Rect 클래스 기반의 인스턴스 생성
		//객체 생성해야 메모리에 할당돼.
		Rect ob = new Rect();

		//입력 메소드 호출
		ob.input();

		//연산 메소드 호출
		int area = ob.calArea();

		int length = ob.calLength();

		ob.print(area, length);
//              ______________
//               데이터 타입, 순서만 맞으면돼.

	}
}

/*
가로 입력 : 20
세로 입력 : 30
가로 : 20
세로 : 30
넓이 : 100
둘레 : 600
계속하려면 아무 키나 누르십시오 . . .
*/