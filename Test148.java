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

import java.util.Random;
import java.util.Arrays;

class Lotto
{
	// 배열 변수 선언 및 메모리 할당 → 로또 번호를 담아둘 배열방 6칸
	private int [] num;
	
	// 생성자
	Lotto()
	{
		num = new int[6];
	}

	// getter
	punlic int [] getNum()
	{
		return num;
	}


	// 6개의 난수를 발생시키는 메소드 정의
	public void start()
	{ 
		Random rd = new Random();
		int n;
		int cnt =0;

		jump: 

		while (cnt<6)		// 0    1    2    3    4    5
		{
			n = rd.nextInt(45)+1; // 1 ~ 45			//가정1. 10, 가정2. 10

			for (int i =0 ;i<cnt ;i++ )	//cnt가 0일 때, 돌지 않음  //여기 역할은 중복된 값 거르기.
			                            //중복값 거르려면 여태 무슨 값이 있는지 하나하나 확인해야함.
			{
				if (num[i]==n) //num[0]의 값 가정1.10 임. n의 값 가정2. 10임.
				{
					continue jump; //뒷부분 num[cnt++] = n; 이거 무시하고 jump로 감.
				}
			}
			num[cnt++] = n;		//num[0] num[1] num[2] num[3] num[4] num[5]
		}	//다음 단계에서 cnt++값이 들어감.
	}//strat() end





	private void sorting()
	{
		Arrays.sort(num);//api도큐먼트 잘 찾아보자 ^ㅁ^
	}//sorting() end

}





public class Test148
{
	public static void main(String[] args)
	{
		// Lotto 클래스 기반 인스턴스 생성
		Lotto lotto = new Lotto();

		// 기본 5게임
		for (int i = 1;i<=5 ;i++ )
		{
			// 로또 게임 수행
			lotto.start();

			//결과 출력
			for (int n :lotto.getNum())
			{
				System.out.printf("%4d",n);
			}
			System.out.println();
		}
	}
}







































































/*
	//주요 변수 선언
	int [] num = new int [6]; 


	//난수 발생하기
	public void game()
	{
		//Random 클래스 기반 인스턴스 생성.
		Random rd = new Random();
		for (int i = 1;i<num.length ;i++ )
		{
			num[i] = rd.nextInt(44)+1; //-- 0 ~ 44 이라서 1 ~ 45로 조정 ,1 ~ 45 중 하나 난수 발생.
			sorting(i,i+1);
		}
	}//nansu() end

	

	// 자리 바꾸기
	private void change(int i, int j)
	{
		int temp;
		temp = num[i];
		num[i] = num[j];
		num[j] = temp;
	}//change() end


	//정렬하기(오름차순)
	private void sorting(int i, int j)
	{
		boolean flag = false;
		int pass =0;
		//향상된 버블 정렬
		do
		{
			flag = false; //-- 스왑 발생 X
			pass++;
			for (int k = 0;k<num.length-pass ;k++ )
			{
				if (num[k] > num[k+1])
				{
					change(k,k+1);
					flag = true;
				}
			}
		}
		while (flag = true);
	}//sorting() end



	//결과 출력
	public void print()
	{
		for (int n:num)
			System.out.printf("%3d",n);
		System.out.println();
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
			lotto.print();
		}
		
	}
}
*/