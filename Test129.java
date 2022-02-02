/*=====================================
■■■ 자바의 주요(중요) 클래스 ■■■
======================================*/

// ※ Test128.java 와 비교 ~!!!


//import java.lang.*;

public class Test129 //extends Object
{

	/*
	...
	public String toString()
	{
		 ...;
	}

	...
	*/

	/*
	@Override
	public String toString()
	{
		return "재정의한 toString()...";
	}
	*/

	public static void main(String[] args)
	{
		Test129 ob = new Test129();

		System.out.println(ob.toString());
		//--==>>재정의한 toString()... 
		

		System.out.println(ob.hashCode());
		//-- toString()이랑은 또 다름.
		System.out.println(ob);
		//--==>>재정의한 toString()...

		// println()에서 쓰는 toString()이 같은거구나!
		// 오버라이딩해서 덮어쓰기 했구나!
	}
}

/*
재정의한 toString()... (오버라이딩 전에는 Test129@15db9742 였음)
366712642
재정의한 toString()...
계속하려면 아무 키나 누르십시오 . . .
*/