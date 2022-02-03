/*=====================================
■■■ 자바의 주요(중요) 클래스 ■■■
======================================*/

//Calendar 클래스

/*
○ java.util.Calendar 클래스는
   날짜와 시간을 객체 모델링화 한 클래스로
   연, 월, 일, 요일, 시, 분, 초 까지의
   시간과 날짜와 관련된 정보를 제공한다.
   그리고 Calendar 클래스는 추상클래스이므로 직접 객체를 생성할 수 없으며
   실제적인 메소드 구현은 Calendar 클래스의 서브 클래스인
   GregorianCalendar 클래스에 정의되어 있다.

   시스템으로부터 현재 시스템 시간 정보를 얻어올 때
   getInstance() 라는 정적(static) 메소드를 이용하여 객체를 생성할 수 있다.
   생성된 Calendar 클래스 객체는 시스템의 현재 날짜와 시간 정보를 가지며,
   이 객체가 생성되면 갖고있는 시간 정보들은
   get() 메소드를 이용하여 쉽게 가져올(사용할) 수 있다.

   getInstance() 메소드는 내부적으로 GregorianCalendar 객체를 생성하여
   돌려주기 때문에 GregorianCalendar 객체를 직접 생성하여 시간 정보를
   구할 수도 있다.
*/

// ○ 실습 문제
//    사용자로부터 연, 월을 입력받아
//    달력을 그려주는(출력하는) 프로그램을 구현한다.
//    단, 만년달력이 아니라 Calendar 클래스를 활용하여 작성할 수 있도록 한다.


// 실행 예)
// 연도 입력 : 0
// 연도 입력 : 2022
// 월 입력 : -2
// 월 입력 : 16
// 월 입력 : 7

/*
	[2022년 7월]
일  월  화  수  목  금  토
==========================
                     1   2
3   4   5   6   7   8   9
				:
				:
31
==========================
계속하려면 아무 키나 누르세요...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test145
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader 기반의 인스턴스 생성. 연도하고 월 받을 거니까.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//GregorianCalendar 기반의 인스턴스 생성 연도하고 월로 달력을 세팅할거라서.
		Calendar cal = Calendar.getInstance();



		//주요 변수 선언
		int y, m;			//-- 연, 월
		int w;				//-- 요일
		int i;				//-- 루프 변수


		// 사용자 연도 받기, 1년보다 작은 값 입력 → 다시
		do
		{
			System.out.print("연도 입력 : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		// 사용자 월 받기, 1월보다 작거나 12월보다 크면 → 다시
		do
		{
			System.out.print("월 입력 : " );
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12); // 두개 이상의 조건 등장 → 논리연산자



		// 사용자로부터 입력받은 연(y), 월(m)을 이용하여
		// 달력의 날짜 세팅
		cal.set(y,m-1,1);
		//            --
		//-- 월 구성 시 입력값(m)을 그대로 사용하는 것이 아니라
		//   입력값에서 1을 뺀 값으로 월을 설정해야 한다.
		//-- 일 구성 시 입력받은 연, 월에 해당하는 1일로 설정해야 한다.


		//세팅된 달력의 날짜로부터 요일 가져오기.
     	w = cal.get(Calendar.DAY_OF_WEEK);

		// 확인
		//System.out.println("사용자 달력 시작 요일 : " + w);
		//--==>>연도 입력 : 2022
		//		월 입력 : 6
		//		사용자 달력 시작 요일 : 4 → 2022년 6월 기준 → 수요일 → 2022년 6월 1일 → 수요일


		//결과 출력 → 달력 그리기
		System.out.println();
		System.out.println("\t[ " + y + "년" +m+ "월 ]\n");
		System.out.println("  일  월  화  수  목  금  토");
		System.out.println("=============================");

		//공백 구성 ★★★★★ 이걸 안했네 ~!!
		for (i = 1;i<w ;i++ )
		{
			System.out.print("    "); //공백 4칸 발생
		}
		// 테스트
		//System.out.println("    1");

		//Calendar 클래스 『getActualMaximum()』 메소드 check~!!
		//                  시스템에서 해당 날짜의 마지막 날짜
		//                  윤년평년안따져도됨.ㅎㅎ
		for (i = 1;i<=cal.getActualMaximum(Calendar.DATE) ;i++ )
		{
			System.out.printf("%4d",i);
			w++; // -- 반복문을 수행하며 날짜가 증가 할 때 마다
			     //    요일도 함께 증가할 수 있도록 처리.

			if (w%7 == 1) // -- 증가한 요일이 일요일이 될 때 마다
			              //    개행 후 출력될 수 있도록 처리.
			{
				System.out.println();
				
			}
		}
		if (w%7!=1) //-- 일요일 개행이 적용되지 않았을 경우만
		            //-- 개행 여기 다시 생각하기!!!!!!!!!!!!!!!
		{
			System.out.println();
		}
		/*
		연도 입력 : 2022
월 입력 : 4

        [ 2022년4월 ]

  일  월  화  수  목  금  토
=============================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
							  → 여기 개행 우째할까요~~
=============================
계속하려면 아무 키나 누르십시오 . . .

             ▼
연도 입력 : 2022
월 입력 : 4

        [ 2022년4월 ]

  일  월  화  수  목  금  토
=============================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
=============================
계속하려면 아무 키나 누르십시오 . . .
		*/


		System.out.println("=============================");



















		/*
		으네가 한거
		//BufferedReader 기반의 인스턴스 생성.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//GregorianCalendar 기반의 인스턴스 생성
		Calendar cr = new GregorianCalendar();
		// 요일 배열
		String [] week = {"일요일", "월요일","화요일","수요일","목요일","금요일","토요일"};
		int y,m; //-- 사용자에게 입력받은 연, 월
		int lastM; // -- 사용자의 달에서 마지막 날

		


		//사용자에게 입력 받기
		do
		{
			System.out.print("연도 입력 : ");
		    y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("월 입력 : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);
		

		
		//날짜 세팅

		cr.set(y,m-1,1);


		//시작점 알기
		//테스트
		System.out.println(cr.get(Calendar.DAY_OF_WEEK));
		//--==>>3
		//System.out.println("사용자 시작 요일 : " + week[cr.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>>화요일
			
		int userWeek = cr.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(userWeek);

		lastM = cr.getActualMaximum(Calendar.DATE);
		//테스트
		//System.out.println(lastM);

		//출력
		System.out.println(); // 개행
		System.out.printf("\t\t[%d년 %d월]\n",y,m);
		
		for (String str:week)
			System.out.printf(" %s",str);
		System.out.println();
		System.out.println("=================================================");

		//날짜 출력
		for (int k = 1;k<=lastM ;k++ )
		{ 
			//시작 점 어떻게해 ???..★★★★★
			System.out.printf(" %5d ",k);
			userWeek ++; 
			if (userWeek %7==0)
			{
				System.out.println();
			}
		}
		System.out.println();

		System.out.println("=================================================");
		

	*/

	}
}