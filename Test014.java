/*==============================================
■■■자바의 개요 및 특징 ■■■

//변수와 자료형
// 자바의 기본 입출력 : BufferdReader 클래스
//버퍼 : 임시기억공간.키보드같은 장치
=============================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test014
{
	public static void main(String[] args) throws IOException 
										//--------------------
										//오류나면 그 오류 
										//밖으로 던질게 걱정마러 자바야 ~ !
	{
		//키보드 장착(생성)
		//→ 정식: BufferedReader 클래스 기반의 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//------------------------------------
		//     문자 입력을 읽어들이는 장치
		//									  ----------------------
		//									   바이트 → 문자 번역기
		//															-----------
		//															바이트 입력값



		// 주요 변수 선언
		int r;		// 반지름
		final double PI = 3.141592;		// 원주율(변수의 상수화)
		double area, length;		//넓이, 둘레

		//연산 및 처리
		// (1). 사용자에게 안내 메세지 출력
		//System.out.print("원의 반지름 입력 하세요 : ");	//--X 개행하면 요상하잖슴.
		System.out.print("원의 반지름 입력 하세요 : ");
		
		// (2). 사용자가 입력한 값을 받아와 반지름 변수 r 에 담아내기
		//r = br.readLine();		// BuffererdReader 의 readLine() -> 문자열 반환
		//r = "80";

		// r = Integer.parseInt(br.readLine());
		// r = Integer.parseInt("80");
		// r = 80;

		//Integer.parseInt("80") --> 80
		// 매개변수로 넘겨받은 문자여 데이터를 정수형으로 변환
		// 단, 이 때 넘겨받은 문자열 데이터는 숫자모양이여야 한다.
											//(NumberFormat)
		
		r = Integer.parseInt(br.readLine());
		// 사용자가 입력한 값을 BuffererReader(br)의 readLine
		// 메소드를 활용하여 문자열 형태로 읽어들인 후
		// 그 값을 Integer.parseInt()를 통해 숫자형(정수형)으로 변환한 후
		// 정수 형태의 반지름 변수 r에 담아내기



		//(3). 넓이, 둘레 연산.
		area = r * r * PI;
		length = r * 2 * PI;
	

	
		// 결과 출력
		
		System.out.printf("원의 넓이는 %.2f 이야 ~ \n", area);
		System.out.format("그리고 원의 둘레는 %f 이야 ~~~%n", length);

		System.out.format("반지름이 %d인 원의 넓이는 %f 이며,\n 원의 둘레는 %f이다. \n", r,area,length);


	}
}

/*
실행 결과
원의 반지름 입력 하세요 : 45
원의 넓이는 6361.72 이야 ~
그리고 원의 둘레는 282.743280 이야 ~~~
계속하려면 아무 키나 누르십시오 . . .




반지름이 91인 원의 넓이는 26015.523352 이며,
 원의 둘레는 571.769744이다.
계속하려면 아무 키나 누르십시오 . . .

*/
