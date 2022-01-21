/*===============================================
■■■ 메소드 중복정의(Method Overloading) ■■■
================================================*/

/*
○ 메소드 오버로딩의 개요
   메소드 오버로딩(Overloading)이란
   메소드가 처리하는 기능은 같고
   메소드 괄호 속에 오는 인수(인자 == 매개변수 == 파라미터)의 갯수가 다르거나
   자료형(Data Type)이 다른 경우
   메소드의 이름을 동일한 이름으로 부여하여 메소드를 정의할 수 있도록
   문법적으로 허용하게 되는데
   이를 메소드 오버로딩(Method Overloading)이라고 한다.
*/


public class Test105
{
	public static void main(String[] agrs)// static
	{

		/*
		Test105 ob = new Test105(); //-- 왜 객체생성을  105를하지 darwLine은 메소드임.
		ob.drawLine();
		*/
		drawLine(); //--static붙으면돼.
		//-->>====================

		drawLine('-');
					// 메소드명이 같아도 매개변수가 달라서 
					// 누굴 부르는지 식별가능!
		//-->>--------------------
		drawLine('<');
		//-->><<<<<<<<<<<<<<<<<<<<
		drawLine('+',30);
		//-->>++++++++++++++++++++++++++++++
		drawLine('/',50);
		//-->>//////////////////////////////////////////////////


		/*
		System.out.println(10);
		System.out.println("ABCD");
		System.out.println('K');
		System.out.println(3.141592);
		System.out.println(true);
		매개변수 자료형이 다 다름.

		System.out.printf("%d\n",10);
		System.out.printf("%d + %d = %d\n",10,20,30);
		매개변수 개수가 다 다름.
		
		
		*/
			}
	//선을 그리는 메소드 정의
	public static void drawLine()
	{
		System.out.println("====================");
	}

	//선의 형태를 바꾸어 그리는 메소드 정의
	//public static void drawLine()// 이러면 어떤 메소드부르는지 모름
								 // default는 메소드이름이 같을 수 없다.
	public static void drawLine(char c)							 
	{
		for (int i =0;i<20 ;i++ )
		{
			System.out.print(c);
		}
		System.out.println();
	}

	// 선의 형태와 길이를 바꾸어 그리는 메소드 정의
	public static void drawLine(char c,int n)
	{
		for (int i =0 ;i<n ;i++ )
		{
			System.out.print(c);
		}
		System.out.println();
	}

}