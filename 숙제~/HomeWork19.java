/*===================================================
■■■ 컬렉션 프레임워크(Collection Framework) ■■■
====================================================*/

// Test165 클래스를 완성하여 다음 기능을 가진 프로그램을 구현한다.

/*
실행 예)
	
	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 1
	
	1번째 요소 입력 : 박현수
	1번째 요소 입력 성공 ~!!!
	요소 입력 계속(Y/N)? : y

	2번째 요소 입력 : 오이삭
	2번째 요소 입력 성공 ~!!!
	요소 입력 계속(Y/N)? : N			// Y/N 대소문자 구분 x

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 2

	[벡터 전체 출력]
		박현수
		오이삭
	벡터 전체 출력 완료 ~!!!

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 3

	검색할 요소 입력 : 오이삭

	[검색 결과 출력]
	항목이 존재합니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 3

	검색할 요소 입력 : 임소민

	[검색 결과 출력]
	항목이 존재하지 않습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 4

	삭제할 요소 입력 : 홍은혜

	[삭제 결과 출력]
	항목이 존재하지 않아 삭제할 수 없습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 4

	삭제할 요소 입력 : 박현수

	[삭제 결과 출력]
	박현수 항목이 삭제되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 5

	변경할 요소 입력 : 김민성

	[변경 결과 출력]
	변경할 대상이 존재하지 않습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 5

	변경할 요소 입력 : 오이삭
	수정할 내용 입력 : 정은정

	[변경 결과 출력]
	변경이 완료 되었습니다.

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 2

	[벡터 전체 출력]
		정은정
	벡터 전체 출력 완료 ~!!!

	[메뉴 선택]
	1. 요소 추가
	2. 요소 출력
	3. 요소 검색
	4. 요소 삭제
	5. 요소 변경
	6. 종료
	>> 메뉴 선택(1 ~ 6) : 6

	프로그램 종료~!!!
	계속하려면 아무 키나...
*/

class MenusHomeWork //→ 완성
{
	public static final int E_ADD = 1;  //-- 요소 추가
	public static final int E_DISP = 2; //-- 요소 출력
	public static final int E_FIND = 3; //-- 요소 검색
	public static final int E_DEL = 4;  //-- 요소 삭제
	public static final int E_CHA = 5;  //-- 요소 변경
	public static final int E_EXIT = 6; //-- 종료

}

public class HomeWork19
{
	// 주요 속성 구성 → 완성
	private static final Vector<Object> vt;		//-- 자료구조(자료적재)
	private static BufferedReader br;			//-- 입력 시 활용
	private static Integer sel;					//-- 선택 값
	private static String con;					//-- 계속 여부

	// static 초기화 블럭
	static
	{
		// Vector 자료구조 생성
		vt = new Vector<Object>();


		//BufferedReader 클래스 인스턴스 생성
		br = new BufferedReader(new InputStreamReader(System.in));


		// 사용자 입력값 초기화
		sel = 1;
		con = "Y";
	}

	// 메뉴 출력 메소드
	public static void menuDisp() 
	{
	}

	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException, NumberFormatException
	{
	}
	// 선택된 메뉴 실행에 따른 기능 호출 메소드
	public static void menuRun() 
	{
	}
	
	// 자료구조에 요소 추가(입력) 메소드
	public static void addElement()
	{
	}
	// 자료구조 전체 요소 출력 메소드
	public static void dispElement() 
	{
	}

	// 자료구조 내 요소 검색 메소드
	public static void findElement() 
	{
	}

	// 자료구조 내 요소 삭제 메소드
	public static void delElement() 
	{
	}

	// 자료구조 내 요소 수정(변경) 메소드
	public static void chaElement() 
	{	
	}

	// 프로그램 종료 메소드 → 완성
	public static void exit() 
	{
		System.out.println("\n\t프로그램 종료~!!!");
		System.exit(-1);
		// exit() 원래 있는 메소드
		// 프로그램 종료한다는 뜻.
	}
	


	
	//main() 메소드 → 완성
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
		

	}
}

