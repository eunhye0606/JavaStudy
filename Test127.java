/*=======================
■■■ 클래스 고급 ■■■
=========================*/
// 중첩 클래스

// 무명 클래스 (실무에서 만날 수 있어요)

/*
○ Annonymous 클래스(익명의 클래스 : 무명 클래스)
  
   - awt 나 안드로이드 이벤트 처리에서 일반적으로 사용
   - 상위 클래스 메소드를 하나 정도 재정의할 필요성이 있을 때 사용
   - 클래스의 객체가 필요하면 또 다시 클래스를 생성해야 하는
     번거로움 때문에 익명의 클래스를 생성하여 처리한다.


○ 형식 및 구조
   
   new 상위클래스의 생성자()
   {
	   접근제어지시자 자료형 메소드()
	   {

		   ...;

		}
	
	}; //-- 세미콜론 check~!!
*/

/*
모든 객체의 조상은 object이다.
*/

//import java.lang.*;

class Test3 //extends Object
{
	/*
	Object 클래스의 멤버들...
	...
	public String toString()
	{
		...;
	}
	*/
	/*
	object 메소드()
	{
		Object result;
		FruitSeller seller = new FruitSeller();
		result = seller; → 이게 업캐스팅
		return(Object)seller;
	}
	*/
	public Object getString() //return 자료형이 Object 모든 객체는 Object의 자식이다.
	{						  // 업캐스팅.
		/*
		return new object();
		       ------------- Object 형이면 return자료형이 맞는것
			   → 이러면 원래 Object를 반환하는거고.
		*/
		/*
		return new object()
		{
			특정메소드재구성 
		};
		*/
		return new Object() //-- new 상위클래스의 생성자()
		{
			@Override
			public String toString() //-- 접근제어지시자 자료형 메소드()
			{
				return "익명의 클래스...";
			}
		}; //-- 세미콜론( 미 작성 시 에러 발생 )
	}
}
public class Test127 //extends Object
{
	/*
	Object가 갖고있는 멤버들...
	*/
	public static void main(String[] args)
	{
		Test3 ob1 = new Test3();

		System.out.println(ob1.toString()); // ob1에는 getString()밖에없져.
		//--==>>Test3@15db9742

		System.out.println(ob1.getString());
		//--==>>익명의 클래스...

		/*
		둘은 내부적으로는 toString을 쓴거지만
		toString()은 오버라이딩해서 쓴것.
		*/
	
	}
}