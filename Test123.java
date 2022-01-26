/*=======================
■■■ 클래스 고급 ■■■
=========================*/

// 인터페이스(Interface)

// ○ 실습 문제
// 성적 처리 프로그램을 구현한다.
// 단, 인터페이스를 활용할 수 있도록 한다.

// 실행 예)
// 인원 수 입력(1~10) : 2
// 1번째 학생의 학번 이름 입력(공백 구분) : 2280946 홍은혜
// 국어 영어 수학 점수 입력   (공백 구분) : 90 100 85
// 2번째 학생의 학번 이름 입력(공백 구분) : 2250847 최문정
// 국어 영어 수학 점수 입력   (공백 구분) : 85 70 65

//2280946 홍은혜	90 100 85  총점수   평균
//                  수  수 우
//2250847 최문정    85  70 65  총점수   평균
//                  우  미 양
//
// 계속하려면 아무 키나 누르세요....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

//속성만 존재하는 클래스 → 자료형 활용
class Record
{
	String hak, name; //-- 학번, 이름
	int kor,eng,mat; //-- 국어, 영어, 수학 점수
	int tot, avg; //-- 총점, 평균(편의상 정수 처리)
}


// 인터페이스
interface Sungjuk
{
	public void set() throws IOException; //-- 인원 세팅
	public void input() throws IOException; //-- 데이터 입력
	public void print(); //-- 결과 출력
}

// 문제 해결 과정에서 설계해야 할 클래스 → Sungjuk 인터페이스를 구현하는 클래스
class SungjukImpl extends Record implements Sungjuk
{
	public int inwon;
	private Record[] rec;

	//인터페이스 오버라이딩
	@Override
	public void set() throws IOException //-- 인원 세팅
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("인원 수 입력(1~10) : ");
			inwon = Integer.parseInt(br.readLine());
		}
		while (inwon<1 || inwon >10);

		rec = new Record [inwon];
	} //end set()

	@Override
	public void input() throws IOException //-- 데이터 입력
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp; // --학번 이름 문자열로 담을 변수
		String [] arr; //-- 위에 변수 \\s 공백으로 분할해서 배열에 담을거임.
		String suTemp; //-- 국영수 점수 문자열로 담을 변수
		String [] suArr; //-- 국영수 점수 공백 분할해서 정수타입으로 담을거임.


		// 학생수 만큼 학생 객체 생성해서 배열 담기
		for (int i = 0;i<rec.length ;i++ )
		{
			rec[i] = new Record();
		}

		for (int i = 0;i<inwon ;i++ )
		{
			do
			{
				System.out.printf("%d번째 학생의 학번 이름 입력(공백 구분) : ",i+1);
				temp = br.readLine(); // "2280946 홍은혜"
				arr = temp.split("\\s");// 공백 구분해서 담아라.
			}
			while (arr.length != 2);

			rec[i].hak = arr[0];
			rec[i].name = arr[1];
				//----------------------------------------------------------------
			do
			{
				System.out.print("국어 영어 수학 점수 입력   (공백 구분) : ");
				suTemp = br.readLine(); //-- 중간 공백때문에 문자열로 담음
				suArr = suTemp.split("\\s"); //--공백구분해서 int형으로 변환한뒤 담자.				
			}
			while (suArr.length != 3);
					//-------------------------------------------------------------
			
			rec[i].kor = Integer.parseInt(suArr[0]);
			rec[i].eng = Integer.parseInt(suArr[1]);
			rec[i].mat = Integer.parseInt(suArr[2]);

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3;
		}				
				
	}//end input()


	@Override
	public void print() //-- 결과 출력
	{	
		for (int i = 0;i<rec.length ;i++ )
		{
			System.out.println();
			System.out.println("학번       이름   국어점수 영어점수 수학점수 총점 평균");
			System.out.printf("%-8s %4s " , rec[i].hak, rec[i].name);
			System.out.printf("%8d %8d %8d " , rec[i].kor, rec[i].eng, rec[i].mat);
			System.out.printf("%4d %4d", rec[i].tot, rec[i].avg);
			System.out.println();
			System.out.printf("%25s %8s %6s",panjung(rec[i].kor),panjung(rec[i].eng),panjung(rec[i].mat));
		}
		System.out.println();

	}//end print()


	// 내부적으로 등급에 대한 판정을 수행할 메소드
	private String panjung(int s)
	{
		String result = "판정 불가";
		//int s = score; //--이딴거 안해도 됨.

		if (s >= 90)
			result = "수";
		else if (s>=80)
			result = "우";
		else if (s>=70)
			result = "미";
		else if (s>=60)
			result = "양";
		else 
			result = "가";

		return result;
	}//end panjung
}


//main() 메소드를 포함하고 있는 외부의 다른 클래스
public class Test123
{
	public static void main(String[] args) throws IOException
	{
		SungjukImpl ob = new SungjukImpl();

		// 문제 해결 과정에서 작성해야 할 ob 구성
		ob.set();
		ob.input();
		ob.print();
	}
}