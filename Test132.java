/*=====================================
■■■ 자바의 주요(중요) 클래스 ■■■
======================================*/
// Wrapper 클래스

/*
○ Wrapper 클래스
  
   1. 자바에서는 언어 수준에서 제공하는 기본형 데이터를 제외한
      나머지는 클래스로 정의하여 객체 단위로 처리한다.
	  따라서 자바에서는 이러한 기본형 데이터를
	  객체 단위로 처리할 수 있도록 클래스를 제공할 수 밖에 없는데
	  이러한 클래스들을 가리켜 Wrapper 클래스라 한다.

   2. 기본 자료형인
       byte, short, int,     long, float, double, char, boolean 형에 대응하는
	   Byte, Short, Integer, Long, Float, Double, Character, Boolean
	   → 얘네를 통틀어서 뤱펄클래스라고 합니다!
	   Wrapper 클래스 및 큰 숫자들을 다루기 위한
	   java.math.BigInteger와 java.math.BigDecimal 클래스를 제공한다.

	   Wrapper 클래스는 java.lang 패키지에 포함되어 있으므로
	   별도의 import 과정 없이 바로 사용하는 것이 가능하며
	   기본형과 마찬가지로 Wrapper 클래스도 내부 메소드를 통해
	   형 변환이 가능하고 동등 비교와 같은 연산도 가능하다.

	   ex) java.lang.Integer 클래스
	       int 기본 자료형의 Wrapper 클래스로
		   정수를 다루는데 필요한 상수나 메소드, 진수 변환 등에 필요한
		   메소드 등을 포함하고 있다.

		   static int parseInt(String s)
		   문자열 형식으로 지정된 숫자를 정수 형태로 변환한다.

		   static Integer valueOf(int i)
		   int 형을 Integer 형으로 변환한다.

		   byte byteValue(), int intValue(),
		   shor shortValue(), long longValue(),
		   float floatValue(), double doubleValue()
		   해당 기본 자료형으로 형 변환한 값을 반환한다.

아하~ 프리미티브 자료형은 값타입이고
      Wrapper 형은 객체라 참조타입이겠다.
*/

/*
○ 오토 박싱(Auto-Boxing)과 오토 언박싱(Auto-Unboxing)

   일반적으로 레퍼런스 형과 기본 자료형은 호환되지 않으며
           객체는 레퍼런스타입    == 프리미티브
		   사용하는 메모리 구조가 다름
		   메모리 구조가 다르면 연산이고 나발이고 안돼
		   그래서 형변환해서 관리하고 처리하고 유지해 데이터를
		   형변환이 없으면 각기 다른 메모리구조에 있는 데이터를
		   처리할 수가 없다!!!
   이 경우 발생하는 문제 해결을 위해 자바에서는 Wrapper 클래스를 제공하게 되었다.
   하지만 JDK 1.5 부터 레퍼런스 형과 기본 자료형이
   다음과 같이 형 변환이 가능하게 되었다.
   → 여전히 호환은 안돼
       자바가 복잡하게 하나하나 형변환하던거
	   자동으로 해주는거임.
	   

   int a = 10, b;
   Integer ob;
   //-- 설계도가 어디있는거지
   //   인스턴스 생성도 안해서 메모리 할당도 안돼
   //   몇바이트인지도 몰라
   
   ob = a;
        근데도 여기에 a를 담는대 이게 자바가 해줘

        기본 자료형(int)이 Integer 형으로 자동 변환
		통통 튀는 프리미티브형을 객체에 넣는걸 오토 박싱
		실제로는 『ob = new Integer(a);』
		                --------------
						int를 매개변수로 받아 객체를 생성하는
						생성자가 있긴 있어요 이건 박싱

   b = ob;
   	   클래스안에 정적으로 들어있던 억압되었던 애들을
	   프리미티브로 풀어주는걸 자바가 자동으로 해주면
	   오토 언박싱

		실제로는 『b = ob.intValue();』
   이는 JDK 1.5 이후 추가된 오토 박싱 / 오토 언박싱이라는
   기능으로 인해 가능해진 것이다.
*/

public class Test132
{
	public static void main(String[] args)
	{
		int a =10, b;
		Integer c;
		Object d;

		b = a;				// -- int 형 데이터(자료) → int 형 변수
		c = new Integer(0);
		// c = 0;
		
		// ※ 레퍼런스 형(참조 타입)과 기본 자료형(기본 타입)은 호환되지 않는다.


		b = c;				// -- Integer 형 데이터(객체) → int 형 변수(오토 언박싱)
		b = c.intValue();   // -- 언박싱(오토아님)

		d = new Object();
		System.out.println("d.toString() : " + d.toString());
		// 주소값 아님!!!! 
		//d.toString() : java.lang.Object@15db9742
		// 클래스명 엣 해쉬코드

		d = new Integer(10); //-- 업캐스팅
							 // -- d는 계속 Object 타입입니다!
							 // -- 한번 선언은 죽어도 선언
		System.out.println("d.toString() : "+ d.toString());
		//-- 두 toString()은 둘다 Object꺼임.
		//--==>>d.toString() : 10
		// 이걸 자바가 해주는겁니다.

		d = new Double(12.345); //-- 업캐스팅
		System.out.println("d.toString() : "+ d.toString());
		//--==>> d.toString() : 12.345
		d = 10; // 오토 박싱
		System.out.println("d.toString() : "+ d.toString());
		//--==>>d.toString() : 10
		//d = new Integer(10); //-- 업캐스팅 얘랑 같음.

		

		//-- 배열도 참조타입인데 오토 박싱이 될까?
		//   ㄴㄴ 배열은 인덱스로 접근해서 안돼
		int [] arr = new int [3];
		int x = 10;

		//arr = 10;
		// 안돼
		Integer y;

		//-- 결론!
		//   객체에 프리미티브형 담고 뺄때 
		//   원래는 안돼
		//   근데 자바가 해줘 그러면 오토박싱 오토언박싱
		//   내가 하면 Wrapper클래스 생성자로 박싱 언박싱
		
	}
}