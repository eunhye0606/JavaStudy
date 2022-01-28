/*=====================================
■■■ 자바의 주요(중요) 클래스 ■■■
======================================*/
// Wrapper 클래스

public class Test133
{
	public static void main(String[] args)
	{

		boolean bi = true;
		Boolean wrapBi = new Boolean(bi); // 박싱. 인스턴스 생성임.
		Boolean wBi = bi; // 오토박싱

		int n = 300;
		Integer wrapN = new Integer(n); //박싱. 인스턴스 생성임.
		int n2 = wrapN; // 프리미티브형에 객체를 담음. 오토언박싱

		float f = 300.3f;  //접미사f
		Float wrapF = new Float(f);  //객체생성

		System.out.println(wrapBi.toString());
		System.out.println(wrapN.toString());
		System.out.println(wrapF.toString());

		System.out.println(wrapBi);
		System.out.println(wrapN);
		System.out.println(wrapF);


		//Integer 클래스
		
		String sn = "12";
		int ni = Integer.parseInt(sn);
		System.out.printf("ni : %3d\n", ni);


		ni = Integer.parseInt("0101",2); //--오버로딩    문자열을 2진수로 반환하겠다.
		System.out.printf("ni : %3d\n",ni);
		//--==>> ni :  5


		ni = Integer.parseInt("12",8);
		System.out.printf("ni  : %3d\n",ni);
		//--==>>ni  :  10  문자열을 8진수로 바꿨음.

		ni = Integer.parseInt("A",16);
		System.out.printf("ni  : %3d\n",ni);
		//--==>>ni  :  10 16진수는 15까지있는데 9다음으로 표현 못하니까
		//                 A는 10이구나


		sn = Integer.toBinaryString(20);
		System.out.printf("sn : %s\n",sn);
		//--==>>sn : 10100
		// 아 toBinaryString() 얘도 static 클래스 메소드구나
		// 인스턴스 생성없이 쓸 수 있기때문에
		// to ~ () 는 변환을 수행하는 메소드구나~

		sn = Integer.toOctalString(31);
		System.out.printf("sn : %s\n",sn);
		//--==>>sn : 37
		// 8진수

		sn = Integer.toHexString(31);
		System.out.printf("sn : %s\n",sn);
		//--==>>sn : 1f
		// 16진수.

		Integer num = new Integer(50); // 인스턴스생성
		System.out.println(num.toString());
		//--==>>50

		int n3 = 345;
		Integer n4 = Integer.valueOf(n3);
		System.out.println(n4); // 클래스명@해쉬태그가 아니라 값이 나오는구나
		//--==>>345

		
	}
}

/*
true
300
300.3
true
300
300.3
ni :  12
ni :   5
계속하려면 아무 키나 누르십시오 . . .
*/