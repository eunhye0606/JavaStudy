/*=======================
■■■ 클래스 고급 ■■■
=========================*/
// 상속 관계에 있는 클래스들 간의 캐스팅
// 업 캐스팅, 다운 캐스팅



// super class , 부모 클래스 , 상위 클래스
class SuperTest118
{
	public int a = 10, b = 20;
	
	public void write()
	{
		System.out.println("슈퍼 클래스 write() 메소드...");
	}

	public int hap()
	{
		return a+b;
	}

}


//sub class , 자식 클래스 , 하위 클래스
class SubTest118 extends SuperTest118
{
	public int b = 100, c = 200;

	@Override
	public int hap()
	{
		return a+ b+ c; // a 보여요 상속받아서!
	}

	public void print()
	{
		System.out.println("서브 클래스 print() 메소드 ...");
	}
}



//main() 메소드를 포함하는 외부의 다른 클래스
public class Test118
{
	public static void main(String[] args)
	{
		//sub class 기반 인스턴스 생성
		SubTest118 ob1 = new SubTest118();

		System.out.println("ob1.b : " + ob1.b);
		//--==>> ob1.b : 100
		
		//SuperTest118타입으로 ob2라는 변수를 참조변수
		//형태로 쓸거라고 선언한거임.
		// ○ 업 캐스팅
		//    실제 선언한건 자식 객체
		//    부모 객체로 캐스팅됨.
		SuperTest118 ob2;
		ob2 = ob1;
		// ↑위 아래 같은거 자동형변환 규칙임.↓
		//  작은 걸 큰 곳에 담는 거 가능.
		//-- 『SuperTest118 ob2 = (SuperTest118)ob1;』

		System.out.println("ob2.b : " + ob2.b);
		// --==>> ob2.b : 20
		// -- 변수는 객체별로 따로 할당되므로
		//    변수 b는 ob2의 변수이다.
		//    메모리 따로! 접근방식에 따라 변수에 따로 접근 가능.
		System.out.println("ob2.a : " + ob2.a);
		//System.out.println("ob2.c : " + ob2.c);
		// 하위 객체의 변수는 안보여!
		
		System.out.println("합		" + ob2.hap());

		// -- hap() 메소드 → Override돼서 자식 클래스 hap() 
		// -- 변수 b는? → 100 → hap에서는 자식 b가 보여요
		// -- 변수 a는? → hap에서는 부모 a가 보여요 상속받아서
		// == a + b + c == 10 + 200 + 100 == 310
		// hap()은 메소드 오버라이딩(Overriding)되어 있고
		// ob2는 ob1을 업캐스팅한 상태의 객체이므로
		// 『SuperTest118』의 hap() 메소드를 호출하는 것이 아니라
		// 『SubTest118』에서 재정의한 hap() 메소드를 호출하게 된다.
		//  즉, 메소드는 업캐스팅이 되더라도
		//  재정의(덮어쓰기)한 이상... 원래의 기능으로 되돌릴 수 없다..

		ob2.write(); 
		//--==>>슈퍼 클래스 write() 메소드.
		//ob2.print();
		//--==>> cannot find symbol
		// 부모객체임으로 자식 메소드가 안보여요


		//○ 다운 캐스팅
		((SubTest118)ob2).print();
		//-->>서브 클래스 print() 메소드 ...
		//자식객체로 내려옴

		//※ 추가관찰 ----------------------------
		//    다운 캐스팅 가능 여부

		SuperTest118 ob3 = new SuperTest118();
		SubTest118 ob4;

		//System.out.println(((SubTest118)ob3).c);
		//이거도 불가능 왜냐하면 SuperTest118할때
		//SubTest118에 접근 불가
		//
		//System.out.println(ob3.c);
		//--== 부모한테 c가 안보여요 컴파일에러!
		//-- 상위 객체는 하위 객체의 멤버에 접근하는 것이 불가능하다.

		//ob4 = ob3;
		//--==>>에러 발생(컴파일 에러)
		// -- 상위 객체는 하위 객체에 담을 수 (참조할 수 ) 없다.
		//ob4 = (SubTest118)ob3;
		//ClassCastException: 런타임에러!
		//클래스를 캐스팅하는 과정에서 문제가 발생했습니다.
		// -- 작성된 구문의 문법적인 구조만 봤을 때
		//    다운 캐스팅이 이루어진 상황이다.
		//    하지만, 정상적인 캐스팅이 이루어지지 않는다.

		// 현재 SubTest118 객체에 대해 메모리 할당이 이루어지지 않은 상태이기 때문에
		// 인스턴스 생성, 메모리 할당을 하면 되는 것인가?ㄴㄴ
		// -- 그래도 안돼. 그렇게 따지면
		//    하위클래스에 대한 객체 생성을 하긴했는데
		//    메모리 할당이 아니라 슈퍼클래스를 통해 자식클래스에 접근할 수 
		//    있냐 없냐가 문제.
		// 다운 캐스팅은 불가능한 것이다.



	}
}

/*
○ 업 캐스팅, 다운 캐스팅 정상적으로 이루어지는 경우 ------------------------
   
	1. 하위 객체 생성;	//-- check~!!!!!
	2. 상위 = 하위;	// 업 캐스팅. 정상
	3. 하위 = 상위; // 에러 발생.
	4. 하위 = (하위)상위; → 명시적	// 다운 캐스팅.정상


○ 업 캐스팅, 다운 캐스팅 정상적으로 이루어지는 않는 경우 ------------------------
   
   1. 상위 객체 생성; //-- check~!!!!!
   2. 하위 = 상위; //에러 발생.
   3. 하위 = (하위)상위; //다운 캐스팅. 런타임에러.

※ 업 캐스팅은 항상 가능. 
   다운 캐스팅은 경우(1번)에 따라 가능.

class 학생 
{
}

class 호석
{
}

학생 ob = new 학생();
호석 ob1 = new 호석();

학생 ob = new 호석();
가능.
*/