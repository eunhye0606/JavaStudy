 /*===============================================
	  ■■■ 주민등록번호 유효성 검사■■■
================================================*/ 

/*
○ 주민등록번호 검증 공식

   ① 마지막 자리를 제외한 앞자리 수를 규칙에 맞게 곱한다.

   123456-1234567 (주민번호)
   ****** ****** ---------------------- 각 자릿수에 곱하기
   234567 892345 (각 자리에 곱해질 수)

   ② 규칙에 맞게 곱셈 연산을 수행한 결과를 모두 더한다.

   ex) 7 5 0 6 1 5 - 1 8 6 2 1 3 3
       * * * * * *   * * * * * *
	   2 3 4 5 6 7   8 9 2 3 4 5
	   ----------------------------
	   → 14 + ... + 15
	    9 8 0 6 0 6 - 2 1 6 9 2 1 7
		2 3 4 5 6 7   8 9 2 3 4 5
		
		
	      
		  == 217
	③ 더해진 결과값을 11로 나누어 『나머지』를 취한다.
	         19  → 몫(x)
	      ----------
	   11 | 217
	        11 
		  ----------
		    107
			 99
		  ----------
		      8 → 나머지(O)
	
	④ 11에서 나머지 8을 뺀 결과값을 구한다.
	   
	   11 - 8 → 3

	   ※ ③의 처리 과정에서 나머지가 0인 경우 → 11-0 → 11
	                         나머지가 1인 경우 → 11-1 → 10

		  이를 다시 10으로 나누어 나머지를 취한다.     → 1
		                                               → 0
	      
	  
	⑤ ④의 연산 결과가 주민번호를 구성하는 마지막 숫자와 
	   일치하는지의 여부를 비교한다.

	   일치   → 유효한 주민번호
	   불일치 → 잘못된 주민번호

*/

// 실행 예 )
// 주민번호입력(XXXXXX - XXXXXXX) : 123456 - 12345678 → 입력 갯수 초과
// >> 입력 오류 ~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호입력(XXXXXX - XXXXXXX) : 123456 - 123456   → 입력 갯수 미달
// >> 입력 오류 ~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호입력(XXXXXX - XXXXXXX) : 750615 - 1252085 → 유효한 주민번호
// >> 정확한 주민번호 ~!!!
// 계속하려면 아무 키나 누르세요...

// 주민번호입력(XXXXXX - XXXXXXX) : 750615 - 1252086 → 유효하지 않은 주민번호
// >> 잘못된 주민번호 ~!!!
// 계속하려면 아무 키나 누르세요...


// ※ 문제 해결을 위한 추가 tip~!!!

//    배열.length     → 배열의 길이(배열방의 갯수) 반환
//    문자열.length() → 문자열의 길이 반환
//                      m,    n  → m번째에서 n-1번째 까지. 인덱스는 0부터.
//    문자열.substring(int i, int j) → 문자열 추출
//                     i ~ j-1까지.   이 이상인거도 런타임에러뜸.

//    문자열.substring(int i) → 매개변수 1개도 가능.
//                     i 부터 문자열 끝까지!

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Test108
{
	public static void main(String[] args) throws IOException
	{ 
		// 입력받는 주민번호(문자열 형태)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력받는 주민번호 (문자열 형태)
		String str;
		
		// 주민번호의 각 자릿수에 곱하게 될 수 → 배열 형태로 구성
		//            7  5  0  6  1  5  -  1  8  6  2  1  3  3       
		int [] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
		//                             ---
		//                             check~!!

		// 곱셈 연산 후 누적합 ( 각 곱셈의 결과를 더해 나가라...)

		int tot = 0; //7*2 + 5*3 + .. + 3 * 5 그래서 초기화 0으로

		System.out.print("주민번호입력(XXXXXX - XXXXXXX) : ");
		//"750615-1862133"
		str = br.readLine();
		
		if (str.length() != 14)
		{
			System.out.println("입력 오류 ~!!");
			return; // → 메소드 종료 → main() 메소드 종료 → 프로그램 종료
		}

		// ex)"750615-1862133"
		for (int i =0;i<13 ;i++ )//0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			if (i ==6)
			{
				//break;
				continue; // -- 뒷부분 무시하고 계속해라.
			}
			tot+= chk[i] * Integer.parseInt(str.substring(i,i+1)); //문자열의 인덱스 마지막 값이 13이라 i+1가능.
			// 여기가 뒷부분임!

		}
		//System.out.println(tot);
		int result; //-- 마지막 값이랑 비교할 변수

		result = tot%11;
		if (result == Integer.parseInt(str.substring(13)))
		{
			System.out.println(" >> 정확한 주민번호 ~!!!");
		}
		else if (result % 10 ==  Integer.parseInt(str.substring(13)))
		{
			 System.out.println(" >> 정확한 주민번호 ~!!!");
		}
		else
			System.out.println(" >> 잘못된 주민번호 ~!!!");
	}
}



















		/*
		String strTemp = "홍은혜";
		System.out.println(strTemp.length());
		//-->>3

		strTemp = "동해물과 백두산이";
		System.out.println(strTemp.length());
		//-->>9
		//---------------------------------------------
		strTemp = "안녕하세요";
		System.out.println(strTemp.substring(2,5));
		//-->>하세요

		strTemp = "안녕하세요";
		//System.out.println(strTemp.substring(2,100));
		//-->>StringIndexOutOfBoundsExcep

		strTemp = "안녕하세요";
		System.out.println(strTemp.substring(4));
		//-->> 요
		*/
		//========================================================
/*
		//BufferedReader 인스턴스 생성
		// 스캐너는 공백구분하면서 다음 문자 안가져가는게 디폴트.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//주요 변수 선언
		String user;  // -- 사용자가 입력한 문자열 저장 변수
		int nUser; // -- user 길이 담는 변수
		String userA; // -- 사용자가 입력한 문자 앞 저장 변수
		int a ; // -- userA의 길이 담는 변수
		String userB; // -- 사용자가 입력한 문자 뒤 저장 변수
		int b ; // -- userB의 길이 담는 변수


		// 사용자 입력 받고
		// 주민번호 길이 유효성 검사
		// 1. 앞자리 6개
		// 2. 뒷자리 7개
		
		//====================================================

		//테스트
		//System.out.print("주민번호입력(XXXXXX-XXXXXXX) : ");
		//user = br.readLine();
		//System.out.println(user);
		//userA = user.substring(0,6);
		//System.out.println(userA);
		//userB = user.substring(7);
		//System.out.println(userB);
		//ㅇㅋ

		

		//====================================================
		/*
			System.out.print("주민번호입력(XXXXXX-XXXXXXX) : ");
			user = br.readLine();
			userA = user.substring(0,6);
			System.out.println(userA);
			userB = user.substring(7);
			System.out.println(userB);
			a = userA.length();
			System.out.println("a : "+a);
			System.out.println("a가 문자열인가? : " + (a == 6));
			b = userB.length();
			System.out.println("b : " +b);
			System.out.println("a+b : "+a+b);
			
		    if (a+b==14)
		    {
				System.out.println("유효한 주민번호 입력~!!");
		    }
			else 
				System.out.println("입력오류~!!");

		*/
/*		
		System.out.print("주민번호입력(XXXXXX-XXXXXXX) : ");
		
		user = br.readLine();
		System.out.println(user);
		nUser = user.length();
		System.out.println(nUser);

		if (nUser == 14)
		{
			System.out.println("테스트");
		}
		else
			System.out.println("입력오류~!!");
		

		// 주민번호 연산.
		int sum=0;
		int number;
		int result=0;
		//연산 배열용
		int [] arr = {2, 3, 4, 5, 6, 7,8, 9, 2, 3, 4, 5};

		for (int i = 0;i<arr.length ;i++ )
		{
			int n = i+1;
			number = Integer.parseInt(user.substring(i,n));
			sum += number * arr[i];
		}
		
		result = (sum % 11)%10;

		int x ; 
		x = Integer.parseInt(user.substring(13,14));

		if (x == result)
		{
			System.out.println("유효한 주민번호 입력~!!");
		}
		else 
			System.out.println("유효하지않음.");

		




		// 결과 출력


		
		
		
		
	}
}
*/