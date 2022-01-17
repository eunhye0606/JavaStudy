/*=====================================
		    ■■■ 배열 ■■■
======================================*/

// 배열의 선언과 초기화
// 배열의 기본적 활용

// 사용자로부터 인원수를 입력 받고
// 입력받은 인원 수 만큼의 학생 이름과 전화번호를 입력받고
// 이를 이름 배열과 전화번호 배열로 구성하여 
// 결과를 출력할 수 있는 프로그램을 구현한다.

// 실행 예)
// 입력 처리할 학생 수 입력(명, 1 ~ 10) : 27
// 입력 처리할 학생 수 입력(명, 1 ~ 10) : -5
// 입력 처리할 학생 수 입력(명, 1 ~ 10) : 3
// 이름 전화번호 입력[1](공백 구분) : 박현수 010-1111-1111
// 이름 전화번호 입력[2](공백 구분) : 신시은 010-2222-2222
// 이름 전화번호 입력[3](공백 구분) : 오이삭 010-3333-3333

//---------------------------------
// 전체 학생 수 : 3명
//---------------------------------
//이름		       전화번호
//박현수	       010-1111-1111
//신시은		   010-2222-2222
//오이삭		   010-3333-3333
//---------------------------------
//계속하려면 ................
/*
import java.util.Scanner;
import java.io.IOException;


public class Test084
{
	public static void main(String[] args) throws IOException
	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		// ①사용자가 입력하는 학생 수를 담아낼 변수  
		int memberCount = 0;

		do
		{
			System.out.print("입력 처리할 학생 수 입력 (1 ~ 10) : ");
			memberCount = sc.nextInt();

		}
		while (memberCount<1 || memberCount>10);
		//1보다 작거나 10보다 크면 반복혀라~

		// 테스트
		//System.out.println("두와일 탈출~!!!" + memberCount);

		// ②인원 수 만큼의 이름 저장 배열 구성
		String [] names = new String[memberCount];

		// 인원 수 만큼의 전화번호 저장 배열 구성
		String [] tels = new String[names.length];
		//memberCount == names.length == tels.length


		// ③인원 수 만큼의 안내 메세지 출력 및 입력값 담아내기
		//for (int i = 0 ;i<names.length; i++ )
		//for (int i = 0 ;i<tels.length; i++ )
		for (int i = 0 ;i<memberCount; i++ )
		{
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ",(i+1));
			//박현수 010-1111-1111
			// ----- --------------
			names[i] = sc.next(); // 문자열로 가져옴.
			tels[i] = sc.next();

		}
		
		// 최종 결과 출력(이름, 전화번호) 출력
		System.out.println();
		System.out.println("---------------------------------");
		System.out.printf("전체 학생 수 : %d\n",memberCount);
		System.out.println("---------------------------------");
		System.out.println("이름	전화번호");
		//학생 리스트 반복 출력
		for (int i = 0;i < memberCount ;i++ )
		
			System.out.printf("%4s %14s\n", names[i], tels[i]); 
		
		System.out.println("---------------------------------");
	}
}
*/
/*
실행결과
입력 처리할 학생 수 입력 (1 ~ 10) : 27
입력 처리할 학생 수 입력 (1 ~ 10) : -5
입력 처리할 학생 수 입력 (1 ~ 10) : 3
이름 전화번호 입력[1](공백 구분) : 박현수 010-1111-1111
이름 전화번호 입력[2](공백 구분) : 신시은 010-2222-2222
이름 전화번호 입력[3](공백 구분) : 오이삭 010-3333-3333

---------------------------------
전체 학생 수 : 3
---------------------------------
이름    전화번호
 박현수  010-1111-1111
 신시은  010-2222-2222
 오이삭  010-3333-3333
---------------------------------
계속하려면 아무 키나 누르십시오 . . .

*/






import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Test084
{
	public static void main(String[] args) throws IOException
	{

		//전체 인원수 입력 받기
		//단 인원수 범위 밖이면 다시 묻기
		// do ~ while

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int nUser; //-- 입력받은 인원수를 담는 변수.
		do
		{
			System.out.print("입력 처리할 학생 수 입력(명, 1 ~ 10) : ");
			nUser = Integer.parseInt(br.readLine());
		}
		while (nUser <1 || nUser>11);
		

		//System.out.println(nUser); //- nUser 수 확인.

		//2. 이름과 전화번호를 담을 배열을 구성한다.

		//String [] strnUser = [nUser];

		//String [] strName = [nUser];
		//String [] strNumber = [nUser];

		
		String [] strnUser = new String[nUser]; //--nUser크기의 배열 만듬.

		String [] arr1 = new String[nUser];
		String [] arr2 = new String[nUser];


		Scanner sc = new Scanner(System.in);
		String nName="0";
		String nNumber="0";


		int i;
		
		//3. 입력을 받고 배열에 넣는다.
		for (i=0;i<strnUser.length ;i++ )
		{
	
			System.out.printf("이름 전화번호 입력[%d](공백 구분) : ",i);
			nName = sc.next();
			nNumber = sc.next();

			arr1[i] = nName;
			arr2[i] = nNumber;
			

		}
			
			
		System.out.println("---------------------------------");
		System.out.printf("전체 학생 수 : %d \n" , nUser);
		System.out.println("---------------------------------");
		System.out.println("  이름    전화번호");

		for (int j=0;j<arr1.length ;j++ ) //왜 마지막꺼만 뜰까..
		{
			System.out.printf("%4s %8s\n",arr1[j],arr2[j]);
			//System.out.printf("%4s %8s\n",nName,nNumber);	→ 여기서 잘못줌.
			//System.out.println(arr1[i]);
			//System.out.println(arr2[i]);

		}
		System.out.println("---------------------------------");

		
		

		//for (i=0;i<nUser.length ;i++ )
		//{
		//	strName[i] = nName;
		//	strNumber[i] = nNumber;
		//}
	}
}
/*
입력 처리할 학생 수 입력(명, 1 ~ 10) : 3
이름 전화번호 입력[0](공백 구분) : 최문정 010-1111-1111
이름 전화번호 입력[1](공백 구분) : 정은정 010-2222-2222
이름 전화번호 입력[2](공백 구분) : 홍은혜 010-3333-3333
---------------------------------
전체 학생 수 : 3
---------------------------------
  이름    전화번호
 최문정 010-1111-1111
 정은정 010-2222-2222
 홍은혜 010-3333-3333
---------------------------------
계속하려면 아무 키나 누르십시오 . . .
*/





/*

		for (int i=0;i<strArr.length ;i++ )
		{
			System.out.print(strArr[i]);
			
		}
*/
		//Scanner을 이용해서 이름과 전화번호를 받는다.
		
