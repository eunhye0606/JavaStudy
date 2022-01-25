 /*===============================================
	  ■■■ 클래스 고급 ■■■
================================================*/
// 상속(Inheritance)

/*
※ 메소드 오버라이딩(Method Overriding)의 특정
   - 메소드 이름, 리턴타입, 파라미터 수나 타입이 완전히 일치해야 한다.
   - 반드시 상속 관계가 있어야 한다.
   - 재정의된 하위 클래스의 메소드 접근제어지시자는
     상위 클래스의 메소드 접근제어지시자보다 범위가 크거나 같아야 한다.
	 예를 들어, 상위 클래스 메소드의 접근제어지시자가 『protected』인 경우
	 하위 클래스가 이 메소드를 오버라이딩(Overriding)하는 경우
	 접근제어지시자는 『protected』 또는 『public』이어야 한다.
   - 『static』,『final』,『private』 메소드는 오버라이딩(Overriding)할 수 없다.
	  --------
	  이미 클래스가 생성되면서 만들어지고 메모리 잡아서
	  바꾸기 힘듬. 탄생시점이 다름

	              -------
				  상속에 있어서 상수화도 여전~

				  		    ---------
							오버라이딩 전제 조건 상속이 가능해야함.
							private는 상속자체가 불가능! 나만 접근 가능!

   
   - Exception의 추가가 불가능하다.
     즉, 상위 메소드가 가지고 있는 기존 예외 사항에
	 새로운 Exception을 추가하는 것은 불가능 하다는 것이다.
	 자바에서 Exception도 객체입니다! 
	 예외처리를 추가추가추가하면 완전 다른애가 되버령
	 맘대로 Exception을 추가하면 가이드라인이 다 깨져버려!
	 */


// 부모 클래스(상위 클래스, super class)
class SuperTest116
{
	private int a = 5;
	protected int b = 10;
	public int c = 20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	} 
}


// 자식 클래스(하위 클래스, sub class)
class SubTest116 extends SuperTest116
{
	/*
	private 접근제어지시자는 아무도 접근 못해서
	자식은 저 존재조차 모름!

	protected int b = 10;
	→ 상속을 위한 접근제어지시자.

	public int c = 20;

	public void write()
	{
		System.out.println("Super write() 메소드 : " + a + " : " + b + " : " + c);
	} 
	*/
	protected int b = 100;

	public void print()
	{
		//System.out.println("Sub print() 메소드 : " + a + " : " + b + " : " + c );
		// -- 슈퍼클래스에서 선언된 변수 a 에는 접근할 수 없다.
		//    → private 변수이기 때문에...

		//System.out.println("Sub print() 메소드 : "  + b + " : " + c );
		//System.out.println("Sub print() 메소드 : "  + this.b);
		//System.out.println("Sub print() 메소드 : "  + super.b + " : " + c );
		// -- 변수 b 는 접근 방법에 따라 다른 b 로 접근 및 출력이 이루어진다.
		//    슈퍼 클래스에서 선언된 b, 서브 클래스에서 선언된 b
		

		//System.out.println("Sub print() 메소드 : " + c );
		//System.out.println("Sub print() 메소드 : " + this.c );
		//System.out.println("Sub print() 메소드 : " + super.c );
		// -- 변수 c 는 접근하는데 아무런 제약과 제한이 없다.
		//    슈퍼 클래스에서 선언된 c

		System.out.println("Sub print() 메소드 : "+ b + " : " + c);

		
	}

	@Override
	public void write()
	{
		//System.out.println("Sub write() 메소드 : " + a + " : " + b + " : " + c);
						// -- super가 아닙니다. 오버라이딩했어요.
						//    sub꺼 입니더.
		// -- 슈퍼 클래스에서 선언된 변수 a 에는 접근할 수 없다.
		//    → private 변수이기 때문에...
		System.out.println("Sub write() 메소드 : " + b + " : " + c);

	}
}


//main() 메소드를 포함하는 외부의 다른 클래스
public class Test116
{
	public static void main(String[] args)
	{
		SubTest116 ob = new SubTest116();

		ob.print();
		//--==>>Sub print() 메소드 : 100 : 20

		ob.write();
		//--==>> Super write() 메소드 : 5 : 10 : 20

		/*
		Sub print() 메소드 : 100 : 20
		Sub write() 메소드 : 100 : 20
		*/

		System.out.println("-----------------------구분선");

		System.out.println(ob.b);
		//--==>> 100

		System.out.println(((SuperTest116)ob).b);
		//--==>> 10
		// 변수 같은 경우 : 부모 변수, 자식 변수 메모리 위치가 다름
		//                   그래서 이게 가능

		((SuperTest116)ob).write();

		// 100
		//	10
		//	Sub write() 메소드 : 100 : 20

	// check~!!
	// 메소드와 변수를 꼭 구분하여 정리할 것
	// 메소드는 오버라이딩하면 부모껄로 못돌아가
	// 근데 부모밑에 자식이 여럿이면 a가 오버라이딩한거
	// b는 그냥 부모꺼 받나? 영향 ㄴㄴ?????????

	}
}