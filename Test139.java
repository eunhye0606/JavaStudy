/*=====================================
■■■ 자바의 주요(중요) 클래스 ■■■
======================================*/
// String 클래스

public class Test139
{
	public static void main(String[] args)
	{
		String s = "seoul korea";
		System.out.println(s);
		//--==>>seoul korea

		System.out.println("======================");

		//○ 문자열 추출 ●
		System.out.println(s.substring(6,9));
		//--==>>kor

		System.out.println("======================");
		//※ 『String.substring(s,e)』
		//    String 문자열을 대상으로
		//    s 번째에서 e-1번째까지 추출
		//    (단, 인덱스는 0부터 시작)


		System.out.println("======================");
		System.out.println(s.substring(7));
		//==>>orea

		// ※ 『String.substring(s)』★★★ Oracle substring이랑 헷갈리지 않게 잘 정리해라
		//     String 문자열을 대상으로
		//     s번째에서 끝까지 추출
		//     (즉, 문자열이 가진 길이만큼. ..)

		

		System.out.println("======================");
		//○ 문자열의 데이터(값) 비교  ●
		System.out.println(s.equals("seoul korea"));
		System.out.println(s.equals("seoul Korea"));
		//--==>>true
		//		false
		//-- 대소문자 구분★

		System.out.println("======================");
		System.out.println(s.equalsIgnoreCase("Seoul Korea")); 
		//--==>>true
		//-- 대소문자 구분 안함 ●


		//○ 찾고자 하는 대상 문자열(s)에 ●
		//   『kor』 문자열이 존재할까?
		//   존재한다면... 그 위치는 어떻게 될까?

		System.out.println("======================");
		//"seoul korea"
		// 0123456
		System.out.println(s.indexOf("kor"));
		//--==>>6
		//인덱스번호 반환
		System.out.println("대문자를 indexOf가 구분할까? : "+s.indexOf("K"));
		//--==>>대문자를 indexOf가 구분할까? : -1 
		// 못해!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		System.out.println(s.indexOf("ea"));
		//--==>>9

		System.out.println(s.indexOf("e"));
		//--==>>1 두번째인거 e 찾음

		System.out.println(s.indexOf("아"));
		//--==>>-1
		// -- 찾고자 하는 문자열이 대상 문자열에 존재할 경우
		//    그 문자열의 인덱스를 반환하지만
		//    존재하지 않을 경우 음수를 반환하게 된다.
		//    -1일거라는 보장이 없기 때문에 『음수』라 표현합니다!

		


		//○ 대상 문자열(s)이 『rea』로 끝나는지의 여부 확인  ●
		//   (true/false)
		System.out.println(s.endsWith("rea"));
		//--==>>true
		System.out.println(s.endsWith("oul"));
		//--==>>false



		//○ 찾고자 하는 대상 문자열(s)에
		//   『e』문자열이 존재할까?
		//    존재한다면 그 위치는 어떻게 될까?
		//    (단, 뒤에서 부터 검사)

		//"seoul korea"
		System.out.println(s.indexOf("e"));
		//--==>> 1 
		// 앞에서부터 찾다가 찾으면 뒤를 확인하지 않고
		// 값을 반환하고 끝남.

		System.out.println(s.indexOf("o"));
		//--==>>2


		System.out.println(s.lastIndexOf("e")); // ●
		//--==>>9
		//1. 뒤에서 부터 찾다가 찾으면
		//2. 앞에서부터 인덱스를 세서
		//3. 인덱스 번호 반환
		System.out.println(s.lastIndexOf("o"));
		//--==>>7

		//○ 대상 문자열(s) 중
		//   『6』번째 인덱스 위치의 문자는? ●


		//"seoul korea"
		System.out.println(s.charAt(6));
		//--==>>k
		//System.out.println(s.charAt(22));
		//--==>>Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 22
		// 런타임 에러
		// subString() 할때 array인덱스 에러랑 같이 생각.



		//===========================================

		//○ 대상 문자열(s) 과 비교 문자열 『seoul corea』 중
		//   어떤 문자열이 더 큰가? → 문자열에 대한 크기 비교  ●

		//→ 두 문자열이 같다면   → 0
		//→ 두 문자열이 다르다면 → 차이를 확인(사전식 배열)
		
		System.out.println(s.compareTo("seoul korea"));
		//--==>>0
		
		System.out.println(s.compareTo("seoul corea"));
		//--==>>8
		//-- c - k→ defghijk → 8
		System.out.println("대문자랑은 사전식 배열 차이 k랑 K"+s.compareTo("seoul Korea"));
		//--==>>대문자랑은 사전식 배열 차이 k랑 K32



		//===========================================
		//○ 대상 문자열(s) 중
		//   해당 문자열을 찾아서 원하는 형태로 수정  ●
		
		s = "사랑하는 우리 엄마";
		s = s.replaceAll("엄마","지여사");
		System.out.println("처리 결과 : " + s);
		//--==>>처리 결과 : 사랑하는 우리 지여사

		//===========================================
		//○ 공백 제거  ●
		s = "          사         랑              ";
		System.out.println("|||" + s + "|||");
		//--==>>|||          사         랑              |||


		System.out.println("|||" + s.trim() + "|||");//●
		//--==>>|||사         랑|||
		//1.앞에공백 (하나씩)제거하면서 뭐가 있으면 멈춰
		//2.뒤에공백 (하나씩)제거하면서 뭐가 있으면 멈춰

		//양족 가장자리 공백 제거


		//trim() 가장자리부터 접근한다. 양쪽공백 다 제거.
		//손톱깎기처럼 깎은건 버리고 남은걸 가짐.
		//다른메소드는 남은걸 버리자나
		//Oracle에서 써. 그냥 trim없고 ltrim, rtrim

		System.out.println("|||" + s.replaceAll(" ","") + "|||");
		//--==>>|||사랑|||
		//공백있는 문자를 공백없는 문자로 바꿔라.


		//"30"
		int temp = Integer.parseInt("30"); //--숫자처럼 생긴 문자열을 넘기면
		//System.out.println("temp: " + temp);
		//--==>>temp: 30

		System.out.printf("%d : \n", temp); //--확인
		//오버라이딩해서 Integer가 쓰고있음
		s = Integer.toString(30);
		System.out.printf("%s : \n", s);   //--확인
		//System.out.println("s : " + s);


		int n = 2345678;
		System.out.printf("%d", n);
		System.out.println();
		System.out.format("%d", n);
		System.out.println();

		//--==>>2345678
		//		2345678




		////===========================================
		//이런형태의 문자열로 반환해라 그래서 단독으로 못쓴다 !@@@@@@@@@@@!!!!!!!!
		//printf(),format()은 이런 모양새로 출력해라..●
		//-------- --------
		//         String에서 자주씀.
		
		//사용법은 같다.
		System.out.println();
		s = String.format("%d",n); //그래서 단독으로 못써
		System.out.println(s);
		System.out.println();
		//--==>>2345678

		

		s = String.format("%,d",n);
		System.out.println(s);
		//--==>>2,345,678

		System.out.printf("%,d\n",n);
		//--==>>2,345,678


		//String str = " 기본,열정,배려";
		//String [] strArr = str.split(",");
		// ↑	↓ 같은 구문

		String [] strArr = "기본,열정,배려".split(",");//●
		
		for(String str :strArr)
			System.out.print(str + " ");

		System.out.println();
		//--==>>기본 열정 배려



		
		
		



	}
}