/*=====================================
■■■ 클래스와 인스턴스 ■■■
======================================*/

// 사용자로부터 임의의 정수를 입력받아
// 1 부터 입력받은 수 까지의 합을 연산하여
// 결과값을 출력하는 프로그램을 구현한다.

//단, 클래스와 인스턴스의 개념을 활용하여 처리할 수 있도록 한다.
// 또한, 입력 처리 과정에서 BufferedReader의 readLine()을 사용하며,
// 입력 데이터가 1보다 작거나 1000보다 큰 경우
// 다시 입력 받을 수 있는 처리를 포함하여 프로그램을 구현할 수 있도록 한다.

//실행 예)
//임의의 정수 입력 (1~1000) : 1050
//임의의 정수 입력 (1~1000) : -45
//임의의 정수 입력 (1~1000) : 100
// >> 1 ~ 100 까지의 합 : 5050
// 계속하려면 ............


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Hap
{
	//주요 변수 선언(사용자의 입력값을 담아낼 변수)
	int su;

	//입력 메소드 정의 //여기서 알맞는 범위의 값들어옴.
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.print("임의의 정수 입력 (1 ~ 1000) : ");
			su = Integer.parseInt(br.readLine());
		}
		while (su<1 || su>1000);
	}

	// 연산 처리 메소드 정의
	int calculate()
	{
		int result = 0;

		for (int i =1;i<=su ;i++ )
		{
			result += i;
		}
		return result;
	}
	//결과 출력 메소드 정의

	void print(int sum)
	{
		System.out.printf(">> 1 ~ %d 까지의 합 : %d\n", su,sum);
	}
}
public class Test074
{
	public static void main(String[] args) throws IOException
	{
		// Hap 인스턴스 생성
		Hap ob = new Hap();

		//생성한 인스턴스를 통해 입력 메소드 호출 → input()
		//______________________
		//    참조변수 활용
		ob.input();

		//생성한 인스턴스를 통해 연산 처리 메소드 호출 → calculate()
		int sum = ob.calculate();
		
		ob.print(sum);
		
	}
}

/*
임의의 정수 입력 (1 ~ 1000) : 100
>> 1 ~ 100 까지의 합 : 5050
계속하려면 아무 키나 누르십시오 . . .

*/




	


/*
	//클래스 = 변수 + 메소드
	//변수선언. 
	int num; //--합끝에 있는 정수.

	//입력받기 + 범위 밖이면 다시 물어보기.
	void input() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("임의의 정수 입력 (1 ~ 1000) : ");
		num = Integer.parseInt(br.readLine());
	}

	//누적합하기
	int hapSum()
	{
		int sum=0; //-- 누적합을 담을 변수
		int n=1; //--반복문 루프변수
		
		do
		{
			sum += n;
			n++;
		}
		while (num>=1 && num<=100);
		
		return sum;
	}
		
		

	//출력하기
	void print(int sum)
	{
		if (num >= 1 && num <= 100)
		{
			System.out.printf("1~%d 까지의 합은 : %d", num,sum);
		}
		
	}
	
}

public class Test074
{
	public static void main(String[] args) throws IOException
	{
		//Hap 인스턴스 생성.
		Hap h = new Hap();

		h.input();
		int s = h.hapSum();
		h.print(s);
	}
}

*/