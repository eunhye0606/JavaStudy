/*=====================================
■■■ 자바의 주요(중요) 클래스 ■■■
======================================*/
// Wrapper 클래스

public class Test136
{
	//java.lang.Number 클래스(추상 클래스)는
	//모든 숫자형 Wrapper 클래스들의 부모 클래스
	//(슈퍼 클래스, 상위 클래스)이다.
	//b2, i2자료형이 Number에 들어오면서
	// 업캐스팅이 일어난다.
	// Auto-Boxting이 일어나게 된다. 인스턴스 생성하면서.
	//                        ↓3
	static void printtt(Number n) //--Byte, Integer, ... 등 가능.
								  //--매개변수를 Object로 안하는 이유 : 안정성때문에.
								  //--자바스크립트에서는 변수 자료형을 선언안해
								  //   그래서 쓸 때가 불편함. 같은 이유.
								 
						
	{
		 //System.out.println("print 오버로딩 : " + o.getClass());
		 System.out.println(n);
		 System.out.println(n.intValue());
		 //--문제인식 잘못! 이미 업캐스팅 된것을 가져와라 이거임.

		 


	}
	public static void main(String[] args)
	{

		//byte b = 3;
		//int i = 256;

		//Byte b2 = new Byte(b);
		//Integer i2 = new Integer(i);

		//System.out.println("b2의 결과 : " + b2);
		//System.out.println("i2의 결과 : " + i2);
		//b2의 결과 : 3
		//i2의 결과 : 256


		//* wrapper 클래스는 안에 인자가 있어야 한다.
		//Byte b3 = new Byte();
		//System.out.println(b3);

		//=============================================

		byte b = 3;
		Byte b2 = new Byte(b);


		int i = 256;
		Integer i2 = new Integer(i);
		//print(b2);
		//print(i2);
		System.out.println(i2.hashCode()); //-- 이거 못돌아가. 값 넣었어.

		//Integer i3 = new Integer(i);
		//System.out.println(i2.hashCode());
		//System.out.println(i3.toString());
		//256
		//256
		Object obj = new Object();
		System.out.println(obj.toString());
		//--java.lang.Object@15db9742
		System.out.println(obj.hashCode());
		//--366712642
		/*
		System.out.println(toString(b));
		System.out.println(hashCode(b));
		// * 프리미티브형은 값타입이라서 toString()과 hashCode()를 사용할 수 없다. 당연; ;;
		*/


		System.out.println("obj : " + obj.getClass());
		System.out.println("i2 : " + i2.getClass());
		System.out.println("b2 : " + b2.getClass());

		//obj : class java.lang.Object
		//i2 : class java.lang.Integer
		//b2 : class java.lang.Byte

		System.out.println("==========================");
		printtt(b2);
		System.out.println("==========================");
		//--==print 오버로딩 : class java.lang.Byte



		// Byte 클래스의 byteValue() 메소드 호출
		byte b3 = b2.byteValue(); //언박싱


		//Integer 클래스의 intValue() 메소드 호출
		int i3 = i2.intValue(); //언박싱
		System.out.println("===================");
		//●check●
		int i4 = b2.byteValue();
		System.out.println(i4); //3
		//byte b4 = i2.intValue(); //--자동형변환 위배. 컴파일에러.
		byte b4 = i2.byteValue();
		System.out.println(b4);//0
		b4 = (byte)i2.intValue(); //--이거도가능
		System.out.println(b4);//0
		//int형을 byte타입으로 타입은 맞는데 0으로 나옴.
		//잘못된 값으로 나오는거임!!!!!!!!!!!!!!!!!!!!!!check!!!!!!!!!!!●●●●●●●

	}
	
	
	
}

		
		



	
	/*
	static void print(Byte b)
	{
	}
	static void print(Integer i)
	{                        
	} 
	*/

	//메소드 하나로만 만들기
	

	/*

	static void print(Object o)
	{
		//int 형이면 intValue
		// 써서 객체 → 프리미티브형으로 바꿔서 변수에 넣으면 될거같은데
		// 매개변수로 받는 객체타입을 구분을 어떻게 하냐.
		// 객체 타입별로 구분할 수 있는게 있다면?
		// 해쉬코드.... equal써서 true면 intvalue하고 변수에 담고


		//매개변수로 객체를 받아와서
		//그거를 오토언박싱? 
		//오토언박싱은 프리미티브형 = 객체
		//그걸 할라면 프리미티브 형을 선언해야해.
		// 근데 wrapper클래스랑 같은 형의 프리미티브형을 선언해라


		//Object obj = new Object(o);
		//error: constructor Object in class Object cannot be applied to given types;

		
		*/