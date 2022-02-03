/*=====================================
■■■ 자바의 주요(중요) 클래스 ■■■
======================================*/

//Calendar 클래스

// ○ 실습 문제
//    오늘을 기준으로 입력받는 날짜만큼 후의 연, 월, 일, 요일을
//    확인하여 결과를 출력하는 프로그램을 구현한다.
//    ※ 현재 날짜를 기준으로 날 수 더하는 연산 메소드 활용
//       → 


// 실행 예)
// 오늘 날짜 : 2022-2-3 목요일
// 몇 일 후의 날짜를 확인하고자 하십니까? : 200

//=========[확인 결과]=========
//200일 후 : xxxx-xx-xx x요일
//=============================
//계속....


import java.util.Calendar;
import java.util.Scanner;


public class Test146
{
	public static void main(String[] args)
	{
	
	//Scanner 클래스 기반 인스턴스 생성
	Scanner sc = new Scanner(System.in);
	
	//Calendar 클래스 기반 인스턴스 생성
	Calendar now = Calendar.getInstance();


	//주요 변수 선언
	int nalsu; //-- 사용자로부터 입력받은 날 수
	int y,m,d,w; //-- 연, 월, 일, 요일
	String [] week = {"일","월","화","수","목","금","토"};


	// 현재의 연, 월, 일, 요일 확인(가져오기 : get())
	// 왜 Calendar 클래스 기반 인스턴스를 생성했는데..
	// YEAR이나 MONTH같은 변수를 쓸 때
	// 앞에 Calendar을 붙히는 걸까????????????????
	// 일단 앞에 Calendar 없애면 컴파일 에러 뜸
	// 찾을 수 없대.
	// ※ Calendar 클래스는 추상클래스로
	//    인스턴스를 생성할 수 없다.
	y = now.get(Calendar.YEAR);
	m = now.get(Calendar.MONTH)+1;
	d = now.get(Calendar.DATE);
	w = now.get(Calendar.DAY_OF_WEEK);

	// 현재의 연, 월, 일, 요일 확인결과 출력
	System.out.println("오늘 날짜 : " + y+ "-" + m+"-"+d+" " + week[w-1] + "요일");
	

	do
	{
		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
		nalsu = sc.nextInt();
	}
	while (nalsu<1);

	// check~!!
	now.add(Calendar.DATE,nalsu);

	//결과 출력
	System.out.println();
	System.out.println("=========[확인 결과]=========");
	System.out.printf("%d일 후 : %tF %tA",nalsu,now,now); //check~!!
	// 날짜 객체를 받는 : %t
	// %t 뒤에 옵션에 따라 뭘 추출하는지 보임.
	System.out.println();
	System.out.println("=============================");



/* 으네가 한거
		// Calendar 기반의 인스턴스 생성.
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();


		//주요 변수 선언
		int y,m,d,w;
		String week;
		int user; //-- 사용자 입력 날 수
		String [] weekArr = {"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
		

		//add()를 사용하면서 이걸 안쓰게 됨.
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);
		week = weekArr[cal.get(Calendar.DAY_OF_WEEK)];
		

		//테스트
		//System.out.println(y + "-" + m + "-" +d + " " +w);
		
		switch (w)
		{
		case 1: week = "일요일"; break;
		case 2: week = "월요일"; break;
		case 3: week = "화요일"; break;
		case 4: week = "수요일"; break;
		case 5: week = "목요일"; break;
		case 6: week = "금요일"; break;
		case 7: week = "토요일"; break;
		default : week = "알 수 없음.";
		}
		
		//테스트
		//System.out.println(y + "-" + m + "-" +d + " " +week);

		//세팅하기
		cal.set(y,m,d);


		//Scanner 기반 인스턴스 생성.
		Scanner sc = new Scanner(System.in);

		//사용자에게 묻기
		System.out.print("몇 일 후의 날짜를 확인하고자 하십니까? : ");
		user = sc.nextInt();
		//System.out.println(user);

		cal2.add(Calendar.DATE,user);
		

	

		


		// 날 수 더하기


		// 결과 출력
		System.out.println();
		System.out.print("오늘 날짜 : "+(cal.get(Calendar.YEAR))+"-"+(cal.get(Calendar.MONTH))+"-"+(cal.get(Calendar.DATE))+" "+(weekArr[cal.get(Calendar.DAY_OF_WEEK)]));
		System.out.println();
		System.out.println("=========[확인 결과]=========");
		System.out.print(user+"일 후  : "+(cal2.get(Calendar.YEAR))+"-"+(cal2.get(Calendar.MONTH))+"-"+(cal2.get(Calendar.DATE))+" "+(weekArr[cal2.get(Calendar.DAY_OF_WEEK)]));
		System.out.println();
		System.out.println("=============================");

*/
	}
}
/*
으네 실행 결과
몇 일 후의 날짜를 확인하고자 하십니까? : 200

오늘 날짜 : 2022-2-3 금요일
=========[확인 결과]=========
200일 후  : 2022-7-22 화요일
=============================
계속하려면 아무 키나 누르십시오 . . .
*/

/*
오늘 날짜 : 2022-2-3 목요일
몇 일 후의 날짜를 확인하고자 하십니까? : 200

=========[확인 결과]=========
200일 후 : 2022-08-22 월요일
=============================
계속하려면 아무 키나 누르십시오 . . .
*/