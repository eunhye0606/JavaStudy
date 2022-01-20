/*=====================================
    ■■■ 클래스와 인스턴스 ■■■
======================================*/

// 클래스와 인스턴스 활용

// 1 ~ 3 사이의 난수를 발생시켜서
// 가위, 바위, 보 게임 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 배열을 활용하여 처리할 수 있도록 한다.
// 최종적으로 RpsGame 클래스를 완성할 수 있도록 한다.

// ※ 기준 데이터 → 1: 가위, 2: 바위, 3: 보

//실행 예)
// 1: 가위, 2: 바위, 3: 보 중 입력(1 ~ 3) : 4
// 1: 가위, 2: 바위, 3: 보 중 입력(1 ~ 3) : -2
// 1: 가위, 2: 바위, 3: 보 중 입력(1 ~ 3) : 2

// -유저 : 바위
// -컴퓨터 :보

// >> 승부 최종 결과 : 컴퓨터가 이겼습니다 ~!!
// 계속하려면 아무 키나 누르세요...
import java.util.Scanner;
import java.io.IOException;
import java.util.Random;


class RpsGame
{
	//RpsGame이 가지는 변수(속성)
	int nUser; //-- 유저가 입력한 값.
	int com; // -- 컴퓨터가 가진 값.
	
	//RpsGame이 가지는 메소드(기능)
	
	//1. 입력받기(1~3)중 하나.
	public void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print(" 1: 가위, 2: 바위, 3: 보 중 입력(1 ~ 3) : ");
			nUser = sc.nextInt(); // 입력값은 변수에 담자.
		}
		while (nUser<1 || nUser >3); //범위 밖이면 다시 해라.
	}

	//2. 난수만들기(1~3)중 하나.
	private void nansu()
	{
		Random rd = new Random(); // 랜덤 인스턴스 생성.
		//int com;
		com = rd.nextInt(3) + 1; // next(3) → 0 ~ 2까지니까. +1해서 1 ~ 3으로
		//System.out.println(com);
		//return com;
		System.out.println("리얼리 컴퓨터 값은 : " +com);


	}
	//3. 사용자값 (1 ~ 3) 과 컴퓨터난수(1~3)비교하기
	private int compare()
	{
		//int com = nansu(); //난수 메소드 호출.
		int result=-1; // 유저가 이기면 1 지면 0 담을 변수
		if (nUser >com) // user == 3(보), com == 2(주먹)
						// user == 3, com == 1(가위)
		{
			if (nUser ==3 && com ==1) // 보일때.
			{
				result = 0;
			}
			else 
				result = 1;
		}
		else if (nUser < com)
		{
			if (nUser == 1 && com == 3) //가위 조건!
			{
				result = 1;
			}
			else
				result = 0;
		}
		else if (nUser == com)
		{
			result = 100;
		}

		return result;
	}

	
	//4. 결과 출력하기
	public void print()
	{
		nansu();
		// 유저가 뭐냈는지 말해줘야됨.
		// 가위 바위 보 담는 배열 
		
					  // 0      1     2
                              //1-1
		
		String [] a = {"가위","바위","보"}; //--가위바위보 배열.
		//int nUser2 = nUser -1;
		//int com2 = com-1;
		System.out.println(" - 유저 : " +a[nUser-1]);
		System.out.println(" - 컴퓨터 : "+a[com-1]);
		//System.out.println("컴퓨터가 낸값:"+com);
		

		int x = compare(); // 비교메소드 호출
		if (x ==1)
		{
			System.out.println("유저가 승리~!!");
		}
		else if (x ==0)
		{
			System.out.println("컴퓨터가 승리~!!");
		}
		else if (x ==100)
		{
			System.out.println("비겼습니다 ~!!");
		}
	}

}


public class Test104
{
	public static void main(String[] args) throws IOException
	{
		RpsGame rps = new RpsGame();

		rps.input();
		//rps.nansu();
		rps.print();
	
	}
}