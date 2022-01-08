/*==============================================
■■■자바 기본 프로그래밍■■■

// 자바의 기본 입출력 : System.in.read()
//readLine()은 BufferedReader에서 사용.

/*
System.in.read() 메소드는 한 문자만 가져온다.
readLine() 처럼 문자열대기열에 있는거 가져오는 건 같음.
단 , 입력받은 하나의 문자를 문자 그대로 가져오는 것이 아니라
ASCII Code 값으로 반환한다.


// 실행 예)
// 한 문자 입력 : A
// 한 자리 정수 입력 : 8

// 입력한 문자 : A
// 입력한 정수 : 8
// 계속하려면 아무 키나 ............

*/
import java.io.IOException;


public class Test017
{
	public static void main(String[] args) throws IOException
	{
		/*char ch;

		// 사용자에게 안내 메세지 출력
		System.out.print("문자 하나 입력 : ");
		ch = (char)System.in.read();	// A
										// 65
		//결과 출력
		System.out.println(ch);
*/
/*		char ch;
		int n;

		System.out.print("한 문자 입력 : ");
		ch = System.in.read();

		System.out.print("한 자리 정수 입력 : ");	
		n = System.in.read();	
		//BufferedReader에 있는 readLine()은 문자열로 사용자 입력 값을 받아옴.
		//근거 : Test016에 name = br.readLine(); 이게 수행됨. 
		//System.in.read();에서 받은 정수가 String타입이라 int로 변환 실패
		//String, Integer.paseInt(), char 안돼
		//int에 들어가. → 근데 시부렐 출력하면 4가 아니라 52가 나옴. 
		//뭐냐? 4가 문자열인가? 근데 그러면 String이랑 char에 들어가야지


		System.out.printf("\n 입력한 문자 : %s\n\n 입력한 정수 : %d\n",ch, n);
		//(1). System.out.printf("\n 입력한 정수 : %d\n"); 
		//	   이때 printf()를 썼는데 뒤에 %d에 들어갈 값을 안줘서 
		//     『런타임에러』가 발생.
		//	    "" 안에 문자열 있고 그걸 출력하니까 문법적으로는 오류가 없다.
		//	    그러나 실행과정에서 %d들어갈 값을 찾는데 없어서 런타임에러 발생.

*/
		

		//주요 변수 선언
		char ch;	//-- 입력받은 문자를 담을 변수
		int n;

		//연산 및 처리
		//안내 메세지 출력
		System.out.print("한 문자 입력 : ");
		ch = (char)System.in.read();	//System.in.read();는 아스키문자코드로 가져옴. 명시적형변환 ㄱ

		//입력 대기열에 남아있는 \r과 \n을 스킵(건너뛰기)

		//System.in.skip(2);
		//몇개 → 매개변수
		//두 글자 안읽고 건너뜀.


		System.out.print("한 자리 정수 입력 : ");
		n = System.in.read();
		n -= 48;

		//혹은 char형 추가해서 int를 명시적변환하고 거기에 담기

		//결과 출력
		System.out.println();
		System.out.println("입력한 문자 : " + ch);
		System.out.println("입력한 정수 : " + n);
	}
}

/*
문제 발생 

한 문자 입력 : A
한 자리 정수 입력 :			▶ 두번째 질문 대기안하고 넘어감 ▶ System.in.skip(); 
입력한 문자 : A
입력한 정수 : 13			▶ 공백인데 13이 변수에 담겨있다고? -48하면됨. 
계속하려면 아무 키나 누르십시오 . . .

*/