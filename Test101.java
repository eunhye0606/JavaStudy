/*=====================================
    ■■■ 클래스와 인스턴스 ■■■
======================================*/

// 클래스 설계
// 배열 활용
// 접근제어지시자와 정보은닉


// 사용자로부터 년, 월, 일을 입력받아
// 해당 날짜의 요일을 출력하는 프로그램을 구현한다.
// 단, 달력 클래스(Calendar)는 사용하지 않는다.
// 또한, 클래스의 개념을 활용하여 작성할 수 있도록 한다. (→WeekDay 클래스 설계)
// 그리고, 배열의 개념도 적용시켜서 작성할 수 있도록 한다.
// 접근제어지시자의 개념도 확인하여 작성할 수 있도록 한다.
// 최종적으로 WeekDay 클래스 설계를 통해
// Test101 클래스의 main() 메소드가 정상적으로 프로그램 실행 될 수 있도록 한다.

// ※ 1년 1월 1일 → "월요일"

// 실행 예)
// 년 월 일 입력 (공백 구분) : 2022 1 19
// 2022년 1월 19일 → 수요일
// 계속하려면 아무 키나....

// 2000년 5월 4일 → 목요일
// 계속하려면 아무 키나....



import java.util.Scanner;
import java.io.IOException;


class WeekDay 
{
	//사용자가 입력한 날짜담는 변수
	private int nUserY; //--년
	private int nUserM; //--월
	private int nUserD; //--일

	int days; //-- 사용자가 입력한 날짜가 1년 1월 1일 기준으로 며칠 흘렀는지.
			  //--날수..

	
	//1년 1월 1일 → 0이라 생각하면
	//1년 2월 1일 → 1.

	//2022년 8월 19일 → (2022 - 1) 윤년일 때 366 
	                              //평년일 때 365
					   //8월      1부터 8월 까지 몇 day
					   //+ 19-1일..?
	


	

	//사용자에게 입력 받는 메소드
	public void input()
	{
		boolean yoon = true; // 윤년이면 t, 평년이면 f.

		Scanner sc = new Scanner (System.in);
		System.out.print("년 월 일 입력 (공백 구분) : ");
		nUserY = sc.nextInt();
		nUserM = sc.nextInt();
		nUserD = sc.nextInt();

		int sum =0;
		int sum2 =0;
		int sum3 = 0;

		



		// 윤년판별식
		// 4의 배수 이면서 100의 배수가 아니다.
		// 400의 배수이다.
		if (nUserY % 4 == 0 && nUserY % 100 !=0)
		{
			yoon = true;
			//System.out.println(nUserY + "윤년");
		}
		
		else if (nUserY % 400 ==0)
		{
			yoon = true;
			//System.out.println(nUserY + "윤년");
		}
		else if (nUserY % 4 != 0)
		{
			yoon = false;
			//System.out.println(nUserY + "평년");
		}
		else
			System.out.println(nUserY + "알 수 없음.");

		//1,3,5,7,8,10,12월 → 31일
		//윤년이면 2월 → 29일
		//평년이면 2월 → 28일.

		// 1년부터 nUserY까지 반복해서 누적합. 연도 날수구하기

		
		for (int i = 1;i<=nUserY ; i++)
		{
			if (yoon) //윤년이면
			{
				sum += 366;
			}
			else 
				sum += 365;
		}
		System.out.println(nUserY + "년까지의 일수는 " +sum+"입니다");


		//int sum2 = 0;
		for (int j = 1 ; j<=nUserM;j++ )
		{
			if (j==2) // 2월이면
			{
				if (yoon) //2월이고 윤년이면
				
					sum2 += 29;
				
				else
					sum2 += 28; //2월이고 평년이면
			}
			else if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j==10 || j==12)
		
				sum2+=31;
			
			else
				sum2+=30;
			
				
			
		}

		int n = 1;
		System.out.println(nUserM + "월 까지의 일수는 " + sum2+"입니다.");

		//int sum3 = 0;

		for (int k =1;k <=nUserD ;k++ )
		{
			sum3 += n;
		}
		System.out.println(nUserD + "일 까지의 일수는 " + sum3+"입니다.");

		days = sum + sum2 + sum3;
		
		System.out.println( "1년 1월 1일부터 사용자는 " + days + "일수가 지났습니다");

			
	}

	// 요일 산출하기
	public void week()
	{
		int n=1; // n=1월  2    3    4    5    6    7
		char [] w = {'월','화','수','목','금','토','일'};
	//	int [] numW = {1, 2, 3, 4, 5, 6, 7};
		int number=0 ; //인덱스넘버

	//	char userW; // 유저요일
		

		//문자배열과 숫자배열이 같다면 .. ? 
	//	for (int i = 0;i<w.length ;i++ )
	//	{
		//	if (w[i] == num[W])
		//	{
			//	userW = w[i];
			//}
	//	}
		days = 8;
		System.out.println("days :" + days);
		System.out.println("days/7 :"+days/7);
		for (int i = 1;i <=days ;i++ )
		{
			number = days % 7 * i;
			System.out.println("number :"+ number);
			
		}
		
		

	
		System.out.println(days + "날의 요일은 " + w[number]);
		
	}


	

	
	//1년 1월 1일 → arr[0], 사용자 입력 날arr[arr.length]
	//4 배수 이거나 100의 배수 아님.
	// 400의 배수이면 윤년 → 366일.

	//출력하는 메소드

}



public class Test101
{
	public static void main(String[] args) throws IOException
	{
		WeekDay ob = new WeekDay();

		ob.input();
		ob.week();
		
		
		
	}
}