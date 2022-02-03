/*=====================================
■■■ 자바의 주요(중요) 클래스 ■■■
======================================*/

//StringTokenizer 클래스
// 지금은 적극적으로 활용되는 클래스가 아님.
// 그래도 이걸로 만든 프로그램이 있을 수 있기에
// 막 삭제할 수는 없음.

/*
○ StringTokenizer 클래스는
   문자열 파싱(parsing)을 위한 정보를 제공하는 클래스로
   파싱(parsing)하고자 하는 문자열을 인자로 받아 생성하는데,
   여기에서 파싱(parsing)이란 하나의 문자열을 여러 문자열로
   나누는 작업을 의미하게 되며, 이 때 나누는 단위가 되는 문자열을
   토큰(token)이라고 한다.

   StringTokenizer 클래스를 사용하기 위해서는
   java.util 패키지의 StringTokenizer 를 import 해야 한다.


   StringTokenizer 클래스는 호환성을 유지하는 목적으로
   보관 유지되고 있으며 문자열을 파싱(parsing)하기 위해서는
   String 클래스의 split() 메소드나 java.util.regex 패키지를
                                              리절트 + ex..
											  정규패키지...
   사용할 것을 권장하고 있다.


○ 생성자
   - 원형
     StringTokenizer(String str) → 전체문자열을 담는 객체로 구성.
	 StringTokenizer(String str, String delim) → 두번째 매개변수로 자름
	 StringTokenizer(String str, String delim, boolean returnDelims) → 두번째로 자르고 그 자른거까지 포함시키냐 안시키냐 t/f
	 → 주어진 문자열 str을 단어로 분리하는 객체를 생성하며
	    공백(구분)문자는 delim에 포함된 문자로 처리하게 된다.
		만약 returnDelims 가 true이면
		구분 문자도 분리된 데이터로 처리하게 된다.


*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Test142
{
	public static void main(String[] args) throws IOException
	{
		String strTemp;
		String [] strArr;
		int n;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("파싱할 문자열 입력 (컴마 구분) : " );
		strTemp = br.readLine();
		//-- "사과, 딸기, 바나나, 토마토"
		//    readLine()으로 하나의 문자열로 읽어옴.

		//StringTokenizer 클래스 인스턴스 생성
		StringTokenizer st = new StringTokenizer(strTemp,",");
		// 매개변수 2개짜리 생성자 호출하면서
		// strTemp를 대상문자열로...("사과, 딸기, 바나나, 토마토")
		// 『,』를 구분자로...
		// 객체가 생성된거지 배열을 만든건 아님.


		//st의 『countTokens()』 메소드 호출
		// 『int counTokens()』
		//  : 파싱된 문자열의 갯수를 리턴(반환)한다.
		strArr = new String[st.countTokens()];
		//                 -----------------
		//                         4

		// → strArr = new String[4];
		//    배열은 여기서 만듬.



//===========================================================
//                       여기 구조 확인!
// 두 개의 메소드가 협업. 컬렉션에서 사용.

		n = 0;
		// -- 『hasMoreTokens()』
		//    사용할 수 있는 토큰이 남아있는 경우 ture 반환
		//    더 이상 사용할 토큰이 없는경우 false 반환
		//    확인 결과만 반환할 뿐
		//    실제 내용을 읽어들이지 않도
		//    실제 내용을 읽는 헤드를 이동시키지도 않는다.


		// -- nexToken()
		//    다음 토큰을얻어온다.
		//    다음 토큰을 얻어오며 헤드도 이동시키게 된다.
		//    구분자를 바꾸었을 경우 다음 호출에
		//    바뀐 구분자를 이용하여 토큰을 분리한다.

		while (st.hasMoreTokens()) //얘가 다음 토큰 있는지 확인 t/f
			strArr[n++] = st.nextToken(); //얘가 가져옴.
		//①true → strArr[0] = "사과";
		//②true → strArr[1] = "딸기";
		//③true → strArr[2] = "바나나";
		//④true → strArr[3] = "토마토";
		//⑤false → while 안들어갑니다.

		System.out.print("파싱된 토큰 (문자열) : " );
		for (String str:strArr )
			System.out.print(str + " " );
		System.out.println();

//===========================================================
	}
}

/*
 hasmoreToken()은 얘가 움직이지 않고 다음 값이 있는지 없는지만
  true, false만 반환.
▼→ 얠 움직이는건 nextToken() 
-----------------------------------------------------------
사과, 딸기, 바나나, 토마토
-----------------------------------------------------------
*/