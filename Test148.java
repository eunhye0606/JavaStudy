/*=====================================
■■■ 자바의 주요(중요) 클래스 ■■■
======================================*/

//Random 클래스

/*
○ java.util.Random 클래스는
   
   여러 형태의 난수를 발생시켜 제공하는 클래스이다.
   Math 클래스의 정적 메소드인 random() 메소드도
   난수를 제공하는 메소드이지만
   0.0 ~ 1.0 사이의 실수 형태만 발생하게 되므로
   필요한 여러 형태의 난수를 만들어내기 위해서는
   추가적인 연산을 수행해야 한다.
   그래서 자바는 여러 형태의 난수를 발생시켜주는
   전용 클래스인 Random 클래스를 별도로 제공하고 있다.

기술 면접 : 오버로딩, 오버라이딩 차이점
코테 : 로또 번호 

*/
// 로또 번호 생성기(난수 발생 프로그램)

// 프로그램이 실행되면 기본적으로 로또를 
// 5게임 수행하는 프로그램을 구현한다.

// 실행 예)
// 3   5 12 24 31 41
// 1   2  8 36 41 42
// 4   9 11 13 22 30
// 5  10 13 15 27 40
// 22 31 32 33 40 41
/*
정렬해서 출력하기
난수 범위는 1~45
*/

java util.Random;

class Lotto
{
	//주요 변수 선언
	int [] num = new int [6]; 



	//난수 발생하기
	public void game()
	{
	//Random 클래스 기반 인스턴스 생성.
		Random rd = new Random();
		for (int i = 1;i<=6 ;i++ )
		{
			num[i] = rd.nextInt(44)+1; //-- 0 ~ 44 이라서 1 ~ 45로 조정 
									   //   1 ~ 45 중 하나 난수 발생.
		
		}
	}//nansu() end

	

	// 자리 바꾸기
	private int change()
	{
		int n; 
		if ()
		{
		}
		return n;
	}//change() end


	//정렬하기(오름차순)
	private void sorting()
	{
		boolean flag = false; //-- 스왑 발생 X

		do
		{

		}
		while ();
		//향상된 버블 정렬
	}//sorting() end

	//결과 출력
	public void print()
	{
	}//print() end
}
public class Test148
{
	public static void main(String[] args)
	{
		//Lotto 클래스 기반 인스턴스 생성
		Lotto lotto = new Lotto();

		// 기본 5 게임
		for (int i =1;i<=5 ;i++ )
		{
			//로또 게임 수행
			lotto.game();
			//결과 출력
		}
		
	}
}