/*======================================
   ■■■ 자바 기본 프로그래밍 ■■■
=========================================*/

// 변수와 자료형
// 키워드 및 식별자


public class Test006
{
	public static void main(String[] args)
	{
		double height = 172.8;
		int age = 27;
		char degree = 'A';

		System.out.println(height);
		//--> 172.8
		System.out.println(age);
		//--> 27
		System.out.println(degree);
		//-->A

		String name = "홍은혜";
	    System.out.println(name);
		//-->홍은혜
		// 스코프 영역 안에서 변수명은 식별자 ~!!!

		String tel = "01041394969";
		String 주소 = "경기도 용인시";

		System.out.println(tel);
		//-->01041394969
		System.out.println(주소);
		//--> 경기도 용인시 
		// 문법적으로는 가능하지만 실무에서 ㄴㄴ

	}
}