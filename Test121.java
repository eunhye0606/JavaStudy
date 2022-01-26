/*=======================
■■■ 클래스 고급 ■■■
=========================*/

// 인터페이스(Interface)

// 인터페이스
interface Demo
{
	public void write();
	public void print();
}


// 인터페이스를 구현하는 추상 클래스
abstract class DemoImpl implements Demo
{
	@Override
	public void write()
	{
		System.out.println("write() 메소드 재정의...");
	}
	//public void print();
}


// 추상 클래스를 상속받는 추상 클래스
//abstract class DemoImplSub extends DemoImpl
//				↓
//추상 클래스를 상속받는 클래스
class DemoImplSub extends DemoImpl
{
	/*
	@Override
	public void write()
	{
		System.out.println("write() 메소드 재정의...");
	}
	*/
	@Override
	public void print()
	{
		System.out.println("print() 메소드 재정의...");
	}
}



// main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test121
{
	public static void main(String[] args)
	{
		//Demo ob = new Demo(); //-- 인터페이스라서 인스턴스 생성 불가


		//DemoImpl ob2 = DemoImpl(); // -- 추상클래스라서 인스턴스 생성 불가

		DemoImplSub ob3 = new DemoImplSub();
		ob3.write();
		ob3.print();
		//--==>>write() 메소드 재정의...
		//		print() 메소드 재정의...
	}
}