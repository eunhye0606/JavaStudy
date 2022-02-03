/*=====================================
■■■ 자바의 주요(중요) 클래스 ■■■
======================================*/

//Calendar 클래스

/*
※ Calendar 클래스는 추상 클래스이기 때문에 객체를 생성할 수 없다.
   (추상 클래스 : 미완성된 클래스)

   Calendar ob = new Calendar();
   → 이와 같은 구문을 통해 인스턴스 생성 불가.



○ Calendar 클래스 객체(인스턴스)를 생성할 수 있는 방법.
    
   1. Calendar ob1 = Calendar.getInstance();
                              -------------
							  정적 메소드, staitc 메소드
   
   2. Calendar ob2 = new GregorianCalendar();
                         ①GregorianCalendar라는 클래스가 있겠구나.
						 ②GregorianCalendar클래스는 Calendar의 자식 클래스이겠구나.
						 ③업 캐스팅이구나.
						 ④GregorianCalendar클래스는 Calendar의 추상메소드를 오버라이딩했구나.

   3. GregorianCalendar ob3 = new GregorianCalendar();
      
   (※ GregorianCalendar : Calendar 클래스의 하위 클래스)
*/


// 연, 월, 일, 요일을 Calendar 객체로부터 가져와서 출력

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Test144
{
	public static void main(String[] args)
	{
		//Calendar 클래스 기반 인스턴스 생성
        //Calendar ob = new Calendar();
		// → 추상 클래스라 불가.
		Calendar rightNow = Calendar.getInstance();
		//-- 펑~! 달력이 만들어짐.

		

		// 생성된 달력(Calendar) 인스턴스를 통해
		// 날짜 관련 정보를 얻어낼 수 있는 메소드
		// → 『get()』
		//     cf) 지정해서 달력을 만드는건 『set()』
		int y = rightNow.get(Calendar.YEAR);
		//           -------------
		//          static이니까 클래스명 대놓고 쓰고
		//          YEAR 대문자로 쓴거 보니 fanal
		System.out.println(y);
		//--==>>2022


		int m = rightNow.get(Calendar.MONTH)+1; //check~!!
		//                                 ---
		//                            월은 배열인덱스 처리!
		//                            0이면 1월, 5면 6월
		System.out.println(m);
		//--==>>2

		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);
		//--==>>3



		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(w);
		//--==>>5

		// 어떤 요일인지 어떻게 아느냐?
		// 테스트
		/*
		System.out.println("SUNDAY"+Calendar.SUNDAY);
		System.out.println("MONDAY"+Calendar.MONDAY);
		System.out.println("TUESDAY"+Calendar.TUESDAY);
		System.out.println("WEDNESDAY"+Calendar.WEDNESDAY);
		System.out.println("THURSDAY"+Calendar.THURSDAY);
		System.out.println("FRIDAY"+Calendar.FRIDAY);
		System.out.println("SATURDAY"+Calendar.SATURDAY);
		*/
		/*
		SUNDAY1
		MONDAY2
		TUESDAY3
		WEDNESDAY4
		THURSDAY5
		FRIDAY6
		SATURDAY7
		*/

		System.out.println(y + "-" + m + "-" + d + " " + w);
		//--==>>2022-2-3 5

		String week = "";
		switch(w)
		{
		    /*
			case Calendar.SUNDAY: week = "일요일";break;
			case Calendar.MONDAY: week = "월요일";break;
			case Calendar.TUESDAY: week = "화요일";break;
			case Calendar.WEDNESDAY: week = "수요일";break;
			case Calendar.THURSDAY: week = "목요일";break;
			case Calendar.FRIDAY: week = "금요일";break;
			case Calendar.SATURDAY: week = "토요일";break
			*/
			case 1: week = "일요일";break;
			case 2: week = "월요일";break;
			case 3: week = "화요일";break;
			case 4: week = "수요일";break;
			case 5: week = "목요일";break;
			case 6: week = "금요일";break;
			case 7: week = "토요일";break;

		}
		System.out.println(y + "년 " + m+ "월 " + d +"일 " + week);
		//--==>>2022년 2월 3일 목요일



		System.out.println("///////방법 2///////");

		//Calendar 클래스 기반 인스턴스 생성
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"일요일", "월요일", "화요일", "수요일","목요일","금요일","토요일"};


		//달력의 날짜 세팅 → 『set()』 메소드 활용
		rightNow2.set(2022,5,20); // 6월 -- 『-1』 check~!! 인덱스!

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--==>>2

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>>월요일




	}
}