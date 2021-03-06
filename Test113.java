 /*===============================================
	  ■■■ 클래스 고급 ■■■
================================================*/
// 상속(Inheritance)

/*
○ 상속(Inheritance)이란
   새로 설계(생성)하고자 하는 클래스가
   이미 설계되어 있는 다른 클래스의 기능과 중복되는 경우
   이미 설계된 클래스의 일부분이나 전체 구조를 공유할 수 있도록 하는 기능을 의미한다.

   즉, 상속은 객체를 좀 더 쉽게 만들 수 있는
   고수준의 재사용성(reusability)을 확보하고
   객체간의 관계를 구성함으로써
   객체 지향의 또 다른 특징인 『다형성』의 문법적 토대가 된다.

   상속은 기존 프로그램의 클래스 내용을 공유함으로써
   중복된 코드들을 재작성할 필요 없이
   반복적이고 세부적인 작업을 처리하지 않기 대문에
   프로그램을 작성하는 시간을 절약할 수 있고
   유지보수를 편리하게 할 수 있으며,
   프로그램의 길이도 짧아지게 된다.

   또한, 이미 작성된 프로그램들은 앞서 테스트되었기 때문에
   오류를 줄일 수 있어 현재 작성 중인 프로그램에만 전념할 수 있다.

※ 주의할 점 ★★★★★
   자바는 『다.중.상.속』을 지원하지 않기 때문에
   두 개 이상의 클래스로부터 상속받을 수 없다.

   자바는 『단.일.상.속』만 지원한다.

자바에서 상속은 자식이 "우리 부모님 누구야 ~!!!!" 하는 거!
*/
// 상위 클래스 == 부모 클래스 == Super클래스 → 물려주는 클래스
// 하위 클래스 == 자식 클래스 == Sub 클래스  → 상속받는 클래스


// 접근제어지시자 default vs protected
//                           ---------
//                 상속x       상속o

//부모클래스
class SuperTest113
{
	protected double area;
	

	//부모 클래스의 생성자
	SuperTest113()
	{
		System.out.println("Super class....");
	}

	void write(String title)
	{
		System.out.println(title + " - " + area);
	}

}

//자바에서 상속은 자식이 "우리 부모님 누구야 ~!!!!" 하는 거! : 클래스에 extends 키워드!
//자식클래스
public class Test113 extends SuperTest113 //, SuperTest114, SuperTest115, SuperTest116 .. 자바에서 다중상속 불가. 이거 안돼. 
{					//-------------------
					/*
					extends SuperTest113하는 순간. ①

					protected double area;		// -- 부모로부터 물려받은 area ↙ ② 접근제어지시자에 해당하는것 받음.
	
					// ※ 생성자는 상속 대상에서 제외된다. ③

					void write(String title) → 접근제어지시자 default는 상속 x 이지만 같은 패키지라 접근 가능. ↙  부모가 준 write()
					{
						System.out.println(title + " - " + area);
					}
					*/
	
												// -- 변수명 같지만 허용됨.

	//자식 클래스의 생성자
	Test113()
	{	// ※ 모든 자식클래스의 생성자 안에는 부모 클래스의 생성자 호출이 포함된다. 우리가 안해도!
		// ※ 생성자 문법 : 생성자 내부에서 또다른 생성자를 호출하는 문법
		//    - 가능하다. 단, 생성자 내부에서 가장 먼저 실행되어야 한다.
		// ※ this(10); 클래스명으로 직접적으로 부르는거 불가능 → static에서 선점해감.
		//     부모클래스도 직접적으로 명시 불가능 → super();로 사용. this하고 비슷함.
		//     this는 포함된 클래스만 보면됨.
		//     super이 포함된 클래스의 부모(상위)클래스로 치환

		//부모클래스의 생성자를 직접 명시 안되니까
		//super(); // -- 얘가 포함된 클래스를 보면 extends 뭐시기가 있음.
		         // -- super() == 뭐시기.. 치환해서 생각해라...
				 // 주석 풀든 안풀든 똑같다..

		//SuperTest113(); -- 생성자 내부에서 가장 먼저 다른 생성자 호출이 출력된다.
		//Test113(10.5) // -- 하 이거 안돼.
		//this(10.5) // -- 얘가 포함된 클래스를 찾아가서 치환해서 써라.. 내가 내 생성자
		System.out.println("Sub Class.....");
		//SuperTest113(); -- 여기가 아니라..
		//super();
		//--==>>Test113.java:101: error: call to super must be first statement in constructor
                //super(); 컴파일에러 발생! 내부에서 생성자 호출하는건 가장 먼저 실행되어야한다.
	}

	Test113(double x)
	{
		area = x;
	}

	public void actionCircle()
	{
		int r = 10; //지역변수
		area = r * r * 3.141592;				// -- area check~!!!
		write("원"); // 지가 만든 메소드마냥 부르고 있누
	}

	public void actionRect()
	{
		int w = 20, h = 5;
		area = w * h;							// -- area check~!!!
		write("사각형");
	}

	public static void main(String[] args)
	{
		// Test113 클래스(자식) 기반 인스턴스 생성
		Test113 ob = new Test113();
		//--==>>Super class....
		//		Sub Class.....
		// -- 자식클래스에서 부모클래스의 생성자를 생성함.
		//    왜 부모클래스를 먼저 출력하는가?
		

		//생성자에서 내부에서 다른 생성자를 호출하는 것은 가능하다.
		// 단, 가장 먼저 호출된다. ★★★★★★★★★★★★★★★★★★
		ob.actionCircle();
		// --==>> 원 - 314.1592

		ob.actionRect();
		// --==>> 사각형 - 100.0

		//-->> 자식이 area변수랑 write()는 없는데 잘쓰누
	}
}