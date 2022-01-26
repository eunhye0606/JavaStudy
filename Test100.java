/*=====================================
    ■■■ 클래스와 인스턴스 ■■■
======================================*/ //이거 다시 확인

// 정보 은닉과 접근 제어 지시자(접근지정자, 접근제한자...)
import java.util.Scanner;
class CircleTest2
{
	int num;
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름 입력 : ");
		num = sc.nextInt();
	}

	double calArea()
	{
		return num * num * 3.14;
	}

	void write(double area)
	{
		System.out.println("반지름 : " + num);
		System.out.println("넓이 : " + area);
	}

}
/*
public class Test100
{
	public static void main(String[] args)
	{
	

	// 정보 은닉(Information Hiing)
	// 멤버 변수,인스터스 변수 ,전역 변수
	// 『private』이라는 접근제어지시자의 선언은
	// 클래스 내부에서만 접근 및 참조가 가능하게 하겠다는 의미.
	// ↓ 
	// CircleTest2 의 멤버 변수 선언, 인스턴스 변수, 전역변수
	//int num;	//→ 인스턴스 생성 시, 메모리 할당 받음.
	
	
	private int num;

	// int 형 전역변수 → 자동0으로 초기화 지원.

	// getter / septter 구성
	int getNum()
		return num;
	
	//void setNum;

	void setNum(int num)
		this sum.sum;
	
	*/	
	




public class Test100

{
	public static void main(String[] args)
	{
		CircleTest2 ob1 = new CircleTest2();
		/*
		//CircleTest2의 인스턴스 생성
		CircleTest2 ob1 = new CircleTest2();

		//ob1.num = 10;
		ob1.setNum;

		//System.out.println("원의 반지름 : " + ob1.num);
		// cc앞에 private로 제한걸어서 못염.
		System.out.println("원의 반지름 : " + ob1.getnum);
	}	*/
		ob1. input();

		double result = ob1.calArea();
		ob1.write(result);
	}


}