/*=====================================
■■■ 클래스와 인스턴스 ■■■
======================================*/

// 생성자(Constructor)

public class Test079
{
	//자바가 0으로 초기화!
	int val1;
	double val2;


//	// 사용자 정의 생성자가 정의되어 있으므로 default 생성자 자동으로 
	// 생성되지 않는다. 
	//그래서 default 생성자를 꼭 만들어야한다!.

	Test079()
	{
		val1 = 0;
		val2 = 0;
		System.out.println("매개변수 없는 생성자....");

	}


	Test079(int x)
	{
		val1 = x;
		val2 =0;

		System.out.println("int형 데이터를 매개변수로 받는 생성자...");
	}

	Test079(double y)
	{
		val1 = 0;
		val2 = y;
		System.out.println("double형 데이터를 매개변수로 받는 생성자...");
	}

	Test079(int x,double y)
	{
		val1 = x;
		val2 = y;
		System.out.println("int형 변수와 double형 변수를 매개변수로 받는 생성자...");
	}


	public static void main(String[] args)
	{
		//매개변수 없는 생성자....
		Test079 ob1 = new Test079();
		
		//int형 데이터를 매개변수로 받는 생성자...
		Test079 ob2 = new Test079(4);
		
		//double형 데이터를 매개변수로 받는 생성자...
		Test079 ob3 = new Test079(4.0);
		
		//int형 변수와 double형 변수를 매개변수로 받는 생성자...
		Test079 ob4 = new Test079(4,4.0);

		System.out.println(ob1.val1 + " , " + ob1.val2);
		//0 , 0.0
		System.out.println(ob2.val1 + " , " + ob2.val2);
		//4 , 0.0
		System.out.println(ob3.val1 + " , " + ob3.val2);
		//0 , 4.0
		System.out.println(ob4.val1 + " , " + ob4.val2);
		//4 , 4.0


	}
}

/*
매개변수 없는 생성자....
int형 데이터를 매개변수로 받는 생성자...
double형 데이터를 매개변수로 받는 생성자...
int형 변수와 double형 변수를 매개변수로 받는 생성자...
0 , 0.0
4 , 0.0
0 , 4.0
4 , 4.0
계속하려면 아무 키나 누르십시오 . . .
*/
