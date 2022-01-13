/*=====================================
■■■ 지역변수와 전역변수 ■■■
======================================*/

// 전역 변수의 초기화 테스트
// Test070.java와 비교

public class Test071
{
	//클래스의 영역
	int a;					//인스턴스에 생성해서 메모리에 올라간 a.
							//자바가 자동으로 0으로 초기화한거임
							//메모리에 올리면서 자동으로 설정.
	// 전역 변수 a 선언

	boolean b;
	char c;
	double d;

	public static void main(String[] args)
	{
		//메소드의 영역
		//System.out.println("a : " + a);

		// → 컴파일 에러 발생
		// non-static variable a cannot be referenced from a static context
		
		//Test071 클래스를 기반으로 인스턴스 생성.
		Test071 ob = new Test071(); 
		//자바는 메모리에 직접적인 접근을 허용하지 않는다.
		//ob안에 Test071설계도 주소.
		//ob.a : ob주소 안에서 a를 찾겠다.

		System.out.println("ob.a : " + ob.a);

		/*
		ob.a : 0
		계속하려면 아무 키나 누르십시오 . . .
		*/
		System.out.println("ob.b : " + ob.b);
		System.out.println("ob.c : " + ob.c);
		System.out.println("ob.d : " + ob.d);

/*

ob.b : false
ob.c :
ob.d : 0.0

*/		

	}

	/*
	다른 메소드1()
	{
	}
	*/

	/*
	다른 메소드2()
	{
	}
	*/
}