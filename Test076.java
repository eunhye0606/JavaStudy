/*=====================================
■■■ 클래스와 인스턴스 ■■■
======================================*/

// 생성자(Constructor)

/*
○ 생성자(Constructor)의 역할
 
   1. 인스턴스 생성 → 메모리 할당
   2. 초기화

○ 생성자(Constructor)의 특징

   1. 생성자는 메소드이지만, 일반 메소드처럼 호출될 수 없으며,
   							_______________
							자주 호출 불가
      반환 자료형을 가질 수 없다.
	  (『void』 조차 가질 수 없으며, 값을 반환할 수도 없다.)
	  return 있으면 안된다.

	2. 생성자는 클래스와 동일한 이름을 가져야 한다.
	   (대소문자 명확히 구분)
	
	3. 생성자는 객체를 생성하는 과정에서 『new생성자();』의 형태로 호출한다.
	   (인스턴스 생성 시 단 한 번만 호출)
	   __________________________________
	   이러한 특징 때문에 final 변수 초기화가 가능하다.
*/

class NumberTest

{
	int num; // 전역변수는 자바가 0으로 초기화 해줌.



/*				 // ★ 사용자 정의 생성자가 존재하지 않을 경우
	NumberTest() // -- 컴파일 과정에서 자동으로 삽입되는 『디폴트 생성자』
				 //    (default Constructor)
				 //    클래스 이름과 같은 메소드를 만들어 주고
				 //    텅 비어있는 상태, 매개변수 없는 메소드.
				 //    눈에 보이지는 않지만.
	{
	}
*/
	NumberTest() // 사용자가 직접 정의하는 생성자
				 // 『사용자 정의 생성자』
	{
		num = 10;
		System.out.println("사용자 정의 생성자 호출 ~!!!");
	} 
	 //별도로 생성자 만들었다면 디폴트 생성자가 만들어지지 않는다.

	int getNum()
	{
		return num;
	}
}


public class Test076
{

	public static void main(String[] args)
	{
			// NumberTest 클래스 기반의 인스턴스 생성.
			NumberTest nt1 = new NumberTest();
			//                   ------------
			//                   생성사 생성 구문

			// -- 인스턴스가 생성되는 시점에서
			//    이와 동시에 선택의 여지 없이 생성자 호출이 이루어진다.
			//								   ___________
			//                                 NumberTest()
			//                                 이런 모양에 메소드 없는데
			//								   컴파일 에러 안뜸. 
			//								   자동으로 디폴트 생성자 만듬.
											
			//									『사용자 정의 생성자』있으면
			//									호출됨.
			//

			/*
			NuberTest nt1 = new NumberTest
								  +

							  NumberTest()
			*/

			//nt1.NumberTest();
			//→ 컴파일 에러 발생.
			/*
			Test076.java:88: error: cannot find symbol
                        nt1.NumberTest();
                           ^
			symbol:   method NumberTest()
			location: variable nt1 of type NumberTest
			1 error
			계속하려면 아무 키나 누르십시오 . . .
			*/
			System.out.println(nt1.getNum());
			/*
			사용자 정의 생성자 호출 ~!!!
			10
				→전역변수는 자바가 0으로 초기화해줌.
			계속하려면 아무 키나 누르십시오 . . .

			*/
			nt1.num =100;
			System.out.println(nt1.getNum());

			//100

			NumberTest nt2 = new NumberTest();
			// 같은 설계도 기반 객체이지만
			// nt1과 nt2는 다른 객체
			// ex)보드마카 두개..
			int testResult = nt2.getNum();
			System.out.println(testResult);
			// NumberTest(); 
			//  num = 10; 
			// → 10

	}

}
/*
사용자 정의 생성자 호출 ~!!!
10
100
사용자 정의 생성자 호출 ~!!!
10
계속하려면 아무 키나 누르십시오 . . .

*/