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
	//주요 변수 선언
	private int y, m, d; //--사용자가 입력한 연, 월, 일

		
	//【메소드 정의】 → 기능 : 연, 월, 일 입력 받기
	public void input() // 안내해서 직접 받기 때문에 매개변수 x
					    // 전역변수에 값을 담기 때문에 반환 값  x → void
		//______
		//유효성검사에 의해 유효한 데이터면 boolean true이게 반환하는 것두 가능.
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("년 월 일 입력(공백 구분) : "); // 2022 1 19
		                                                 // ABCD or -2022 → 유효성 검사 ! 
		y = sc.nextInt();                                // 월은 12월까지, 일수도 30,31,28,29까지 등.
		m = sc.nextInt();
		d = sc.nextInt();
	}


	//
	// 1.1.1 → 월요일 ▶▶▶ 2000.5.5
	//                 ______
	//                 얼마의 날 수가 지났는가.

	//                 만약 10일 지났으면
	//1.1.1 월 1.1.2 화 1.1.3 수

	//  날수 : 1 월요일     날수 : 2 화요일   날수 : 3 수요일

	//                 10 % 7 → 3 → 수요일
	// ★ 1/10 - 1/1아님! 1일부터 10일이 흐른게 1/10임!!★

	// 날수 % 7 → 0 →일
	// 날수 % 7 → 1 →월
	// 날수 % 7 → 2 →화
	// 날수 % 7 → 3 →수
	//         :

	// ★ 2022 1 19 → year은 2021년까지는 꽉 채워짐. ★
	
	// ② 2022.1.1 ~ 2022.11.19 얼마만큼의 날짜가 흘렀는가?
	// 『2022       1        19』
	//  ______①________
	//                +=
	//              ______②___ 
	//                         += 
	//                           _______일______

	// ① 1.1.1 ~ 2021. 12. 31 얼마만큼의 날짜가 흘렀는가?
	//(입력년도-1)*365 + (입력년도-1)/4 - (입력년도-1)/100 + (입력녀도 -1)/400;
	//→ 윤년과 평년 계산. 연도가 꽉채워졌을 때!

	// ② 2022.1.1 ~ 2022.10 얼마만큼의 날짜가 흘렀는가?
	// 배열구성 → {31 28 31 30 31 30 31 31 30 31 30 31}; 2월 자리는 확보해두어야돼. 안그러면 인덱스파괴돼.
	//                 ↓
	//                 ???


	//【메소드 정의】 → 기능 : 요일 산출하기
	public String week() // ymd은 전역변수라 매개변수 필요없음. 
	                     // 실행 결과가 『2022년 1월 19일 → 수요일』 이라서 문자열로 값 반환!
	//public void week()
	{
		// 각 월의 마지막 날짜(각 월의 최대값)을 배열 형태로 구성
		int [] months = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		//테스트!
		//System.out.println(months.length); // 이거 확인할라면 값 반환 없어야해.
		// -->>12

		//요일 이름에 대한 배열 구성
		String [] weekNames = {"일","월", "화" ,"수" ,"목", "금" ,"토"};

		//날 수를 종합할 변수
		int nalsu;

		//윤년에 따른 2월의 날 수 계산
		// 입력 년도가 윤년이라면 ... 2월의 마지막 날짜를 29일로 설정
		// 입력 년도가 평년이라면 ... 2월의 마지막 날짜를 28일로 설정

		if (y%4 == 0 && y %100 !=0 || y%400 == 0) // 입력 년도가 윤년이라면 ...
		{
			months[1] = 29; //2월의 마지막 날짜를 29일로 설정
		}
		else // 입력 년도가 평년이라면 ...
			months[1] = 28; //2월의 마지막 날짜를 28일로 설정
		
		//① 1년 1월 1일 부터 입력받은 년도의 이전 년도 12월 31일까지의 날 수 계산
		//                    --------------
		//                           y
		//                    --------------------------
		//                                 y-1

		nalsu = (y-1)*365 + (y-1)/4 - (y-1)/100 + (y-1)/400;
		//      ---------
		//      1년기본주기
		//               ------------
		//                4년마다 +1일
		//                         --------------
		//                          100년마다 -1일
		//                                        -----------
		//                                         400년마다 +1일
		// 윤년은 366이라서 윤년마다 365 +1일을 해주는 것임!


		//테스트!
		//System.out.println("날 수 : " + nalsu);
		//-->> 날 수 : 738155
	
		//② 입력받은 월의 이전 월 까지의 날 수 계산 후
		for (int i =0;i<(m-1) ;i++ ) //★★★
									 // 만약 4월을 받았다면, 3월까지는 꽉참
									 //2022 3 23
									 // 2월까지는 받기
									 // 0 1 번째. 
									 // i < m -1 ㅇㅋ
									 // 인덱스는 n-1이니까 
		{
			nalsu += months[i];
		}
		//테스트!
		//System.out.println("날 수 : " + nalsu);
		//-->>날 수 : 738307

		//   이 계산 결과를 ①결과에 더하는 연산
		//③ 입력받은 일의 날짜만큼 날 수 계산 후
		//   ②결과에 더하는 연산

		nalsu += d;
		//테스트!
		//System.out.println("날 수 : " + nalsu);
		//-->> 날 수 : 738327
		//-------------------------------------------여기까지 수행하면 날 수 연산 끝!
		

		//무슨 요일인지 확인하기 위한 연산
		int w = nalsu % 7; // -- 전체날수 % 7 == 0 → 일요일
						   // -- 전체날수 % 7 == 1 → 월요일
						   // -- 전체날수 % 7 == 2 → 화요일
						   // -- 전체날수 % 7 == 3 → 수요일
						   // -- 전체날수 % 7 == 4 → 목요일
						   // -- 전체날수 % 7 == 5 → 금요일
						   // -- 전체날수 % 7 == 6 → 토요일
		//테스트!
		//System.out.println("w   : " + w);
		return weekNames[w];
	}

	//【메소드 정의】 → 기능 : 결과 출력하기
	public void print(String day)
	{
		System.out.printf(">> %d 년 %d월 %d일 → %s요일\n", y,m,d,day);
	}

}
public class Test101
{
	public static void main(String[] args)
	{
		//WeekDay 클래스 기반 인스턴스 생성.
		WeekDay wd = new WeekDay();

		// 입력 메소드 호출
		wd.input();

		//요일 산출 메소드 호출 및 결과 확인
		String result = wd.week();

		//최종 결과 출력 메소드 호출
		wd.print(result);
	}
}

/*
년 월 일 입력(공백 구분) : 2022 1 19
>> 2022 년 1월 19일 → 수요일
계속하려면 아무 키나 누르십시오 . . .
*/











/*

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
*/