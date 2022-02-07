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
import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus //→ 완성 캘린더클래스 요일 상수화랑 비슷.
			//   숫자는 쉽게 기억하기 어렵쥬. sunday가 일요일인지는
			//   금방 기억하지만 그게 1인지 0인지는 헷갈리기 때문에
			//   이래서 상수화된 값을 활용하는거임.
			//   혼자 코딩이 아니잖슴.
{
	public static final int E_ADD = 1;  //-- 요소 추가
	public static final int E_DISP = 2; //-- 요소 출력
	public static final int E_FIND = 3; //-- 요소 검색
	public static final int E_DEL = 4;  //-- 요소 삭제
	public static final int E_CHA = 5;  //-- 요소 변경
	public static final int E_EXIT = 6; //-- 종료

}

public class Test165
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
	public static void menuDisp() throws IOException
	{
		System.out.println("\n\t[메뉴 선택]");
		System.out.println("\t1. 요소 추가");
		System.out.println("\t2. 요소 출력");
		System.out.println("\t3. 요소 검색");
		System.out.println("\t4. 요소 삭제");
		System.out.println("\t5. 요소 변경");
		System.out.println("\t6. 종료");
		menuSelect(); //메뉴 선택 메소드 호출.
		//테스트.
		//System.out.println(sel);
	}

	// 메뉴 선택 메소드
	public static void menuSelect() throws IOException, NumberFormatException
	{
		System.out.print("\t>> 메뉴 선택(1 ~ 6): ");
		sel = Integer.parseInt(br.readLine());
		menuRun();
	}
	
	// 선택된 메뉴 실행에 따른 기능 호출 메소드


	public static void menuRun() throws IOException
	{
		switch (sel)
		{
		case Menus.E_ADD: addElement(); break;
		case Menus.E_DISP: dispElement(); break;
		case Menus.E_FIND: findElement(); break;
		case Menus.E_DEL: delElement(); break;
		case Menus.E_CHA: chaElement(); break;
		case Menus.E_EXIT: exit(); break;
		default :System.out.println("잘못 입력 하셨습니다.");
		}
	}
	
	// 자료구조에 요소 추가(입력) 메소드
	public static void addElement() throws IOException
	{
		int n =0;
		do
		{
			n++;
			
			System.out.printf("\n\n\t%d번째 요소 입력 : ",n);
			vt.add(br.readLine());
			System.out.printf("\t%d번째 요소 입력 성공 ~!!!\n",n);
			System.out.print("\t요소 입력 계속(Y/N)? : ");
			con = br.readLine();
			//System.out.println(con);
			
		}
		//while (con != "y" && con != "Y");// 이걸로는 안돼 equals() 쓰셈.
		// con은 String 객체 → 참조타입
		// 참조타입끼리 비교할 때, equals() 메소드 사용해야 문자열 비교!!★
		while (con.equals("y") || con.equals("Y"));
	
		menuDisp(); //-- 메뉴 선택 메소드 출력
	}

	
	
	// 자료구조 전체 요소 출력 메소드
	public static void dispElement() throws IOException
	{
		System.out.println("\n\t[벡터 전체 출력]");
		for (Object obj:vt)
		{

			System.out.println("\t"+(String)obj); //다운캐스팅
		}
		System.out.println("\t벡터 전체 출력 완료 ~!!!");

		System.out.println("\t벡터에 요소가 없습니다.");
		

		menuDisp();//-- 메뉴 선택 메소드 출력
	}


	// 자료구조 내 요소 검색 메소드
	public static void findElement() throws IOException
	{
		System.out.print("\n\n\t검색할 요소 입력 : ");
		if (vt.indexOf(br.readLine()) >-1) //indexOf() 는 없으면 음수 반환
		// contains 써도됨. .. .
		{
			System.out.println("\n\n\t[검색 결과 출력]");
			System.out.println("\t항목이 존재합니다.");
		}
		else
		{
			System.out.println("\n\n\t[검색 결과 출력]");
			System.out.println("\t항목이 존재하지 않습니다.");
		}
		menuDisp();//-- 메뉴 선택 메소드 출력
	}

	// 자료구조 내 요소 삭제 메소드
	public static void delElement() throws IOException
	{
		System.out.print("\n\n\t 삭제할 요소 입력: ");

		String strUser = br.readLine();
		int delNum = vt.indexOf(strUser);
		System.out.println(delNum);
		
		if (delNum <=-1)
		{
			System.out.println("\t[삭제 결과 출력]");
			System.out.println("\t항목이 존재하지 않아 삭제할 수 없습니다.");
		}
		else
		{
			System.out.println("\t[삭제 결과 출력]");
			vt.removeElementAt(delNum); // 삭제
			System.out.println("\t"+strUser + " 항목이 삭제 되었습니다.");
		}
		menuDisp();//-- 메뉴 선택 메소드 출력
	}


	// 자료구조 내 요소 수정(변경) 메소드
	public static void chaElement() throws IOException
	{
		System.out.print("\n\n\t변경할 요소 입력 : ");
		int pre = vt.indexOf(br.readLine());

		if (pre>=0)
		{
			System.out.print("\n\t수정할 내용 입력: ");
			String after = br.readLine(); //-- 수정할 문자열 담음.
			vt.setElementAt(after,pre);
			System.out.println("\t[변경 결과 출력]");
			System.out.println("\t변경이 완료되었습니다.");
		}
		else
		{
	
			System.out.println("\t[변경 결과 출력]");
			System.out.println("\t변경할 대상이 존재하지 않습니다.");
		}
		menuDisp();//-- 메뉴 선택 메소드 출력
		
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


//============================================================
/*
	//생성자.
	Menus()
	{
		//메뉴 출력하기 메소드 호출
	}// end 생성자


	//메뉴출력하고 사용자 입력 받기
	private int userWrite() 
	{
		int n; //-- 사용자 입력값.
		try
		{
			//BufferedReader 기반의 인스턴스 생성
			BufferedReader br = new BufferedReader(InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		return n;
	}//userWrite()

	//1번 요소 추가하기
	//2번 요소 출력하기
	//3번 요소 검색하기
	//4번 요소 삭제하기
	//5번 요소 변경하기
	//6번 종료하기
	//벡터 결과 출력하기
	private void print()
	{
	}//end print()
	일단 내가 생각한거.
	*/
//============================================================