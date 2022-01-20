/*=====================================
    ■■■ 클래스와 인스턴스 ■■■
======================================*/

// 클래스와 인스턴스 활용

// 학생별로 국어점수, 영어점수, 수학점수를 입력받아
// 총점, 평균을 계산하는 프로그램을 구현한다.
// 단, 클래스의 개념을 활용하여 작성할 수 있도록 한다.
// 또한, 이 과정에서 배열을 적극적으로 활용할 수 있도록 한다.
// 클래스 설계는 다음의 가이드라인에 따라 진행할 수 있도록 한다.

// 프로그램을 구성하는 클래스
// 1. Record 클래스
//    - 속성만 존재하는 클래스로 설계할 것 ~!!
//
// 2. Sungjuk 클래스
//    - 인원 수를 입력받아, 입력받은 인원 수 만큼
//    이름, 국어점수 영어점수, 수학점수를 입력받고
//    총점과 평균을 산출하는 클래스로 설계할 것 ~!!
//    속성 : 인원수, Record 형태의 배열
//    기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력
//
// 3. Test103 클래스
//    - main() 메소드가 존재하는 외부 클래스로 설계할 것~!!

// 실행 예)
// 인원 수 입력(1~100) : 102
// 인원 수 입력(1~100) : -10
// 인원 수 입력(1~100) : 3

// 1번째 학생의 이름 입력 : 김상기
// 국어 점수 : 90
// 영어 점수 : 80
// 수학 점수 : 70

// 2번째 학생의 이름 입력 : 임소민
// 국어 점수 : 92
// 영어 점수 : 82
// 수학 점수 : 72

// 3번째 학생의 이름 입력 : 이연주
// 국어 점수 : 82
// 영어 점수 : 72
// 수학 점수 : 62

// 김상기 90 80 70 240 xx.xx 2
// 임소민 92 82 72 xxx xx.xx 1
// 이연주 82 72 62 xxx xx.xx 3

//계속하려면 아무 키나 누르세요...

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

public class Test103
{
	public static void main(String[] args) throws IOException
	{
		Sungjuk sc = new Sungjuk();
		sc.set();
		sc.input();
	
		sc.print();

	}
}
/*
인원 수 입력(1~100) : 3
1번째 학생의 이름 입력 : 홍은혜
국어 점수 : 90
영어 점수 : 80
수학 점수 : 70
2번째 학생의 이름 입력 : 최문정
국어 점수 : 82
영어 점수 : 92
수학 점수 : 76
3번째 학생의 이름 입력 : 김민성
국어 점수 : 99
영어 점수 : 88
수학 점수 : 77
  홍은혜  90  80  70  240   80.00
  최문정  82  92  76  250   83.33
  김민성  99  88  77  264   88.00

계속하려면 아무 키나 누르십시오 . . .
*/
/*
인원 수 입력(1~100) : -1
인원 수 입력(1~100) : 101
인원 수 입력(1~100) : 3
1번째 학생의 이름 입력 : 홍은혜
국어 점수 : 100
영어 점수 : 90
수학 점수 : 80
2번째 학생의 이름 입력 : 박건태
국어 점수 : 50
영어 점수 : 40
수학 점수 : 30
3번째 학생의 이름 입력 : 길소영
국어 점수 : 2
영어 점수 : 3
수학 점수 : 4
  홍은혜 100  90  80  270   90.00    1
  박건태  50  40  30  120   40.00    2
  길소영   2   3   4    9    3.00    3
계속하려면 아무 키나 누르십시오 . . .

*/










/*
class Record //한 java파일안에서 public은 하나! 왜냐하면 그걸로 자바파일 만들어져.
{
	//String [] 이름 배열
	//int su = 0;
	//static String [] name= new String [su];
	//static String name; // 사용자가 입력한 이름 담는 변수
					    // 인스턴스 생성 전에 다른 클래스에서 활용할거라 
						// static이 붙음!

	//int [] 점수 배열
	//static int [] scoreK = new int [su];
	//static int [] scoreE = new int [su];
	//static int [] scoreM = new int [su];

	//static int scorek; // 사용자가 입력한 점수를 담는 변수
					  // 인스턴스 생성 전에 다른 클래스에서 활용할거라 
					  // static이 붙음!
					  // 클래스명.변수명으로 활용하자!
	//static int scoreE;
	//static int scoreM; 
	
	static String name; //-- 학생이름
	static int scoreK;  //-- 국어점수
	static int scoreE;  //-- 영어점수
	static int scoreM;  //-- 수학점수
 	static int sumScore;//-- 총점합산
    static double avg;  //-- 평균
	static int rank;    //-- 등수, 총점 큰사람이 1

}
class Sungjuk
{	//속성 : 인원수, Record 형태의 배열.
	// Record r1 = new Record(); 하면 r1객체 만듬.
	// r1 에는 이름, 점수들, 총점 ,평균이 들어감.
	// r1도 배열 .. ?
	// 근데 string이랑 int랑 double이 어떻게 한 배열에 들어거냐..


	int numberOfp; // 인원수를 담는 변수
	Record [] student;

	//[ob1] [ob2] [ob3] ... [ob numberofp-1]
	// ↓
	// 이름 점수들 총점 평균...
	//
	//Record ob1 = new Record();
	//ob1.name ob1.점수 ob1.총점 ob1.평균..

	//// 그렇다면 인원수만큼 객체를 생성하고
	// 이름 배열은 따로 ..? 
	// 점수 배열만 하나 ..?
	

	
	

	//인원수 만큼 객체 생성.

	// 이름, 점수들 담는 배열 

	String [] strArr = new String[numberOfp];
	int [] kArr = new int[numberOfp];
	int [] eArr = new int[numberOfp];
	int [] mArr = new int[numberOfp];
	int [] sumArr = new int[numberOfp];
	double [] avgArr = new double[numberOfp];
	int [] rankArr = new int[numberOfp];

	
	

	//[0] → 이름
	//[1] → 국어 점수
	//[2] → 영어 점수
	//[3] → 수학 점수
	//[4] → 총점
	//[5] → 평균
	//[6] → 등수 ( 나중에 객체끼리 평균비교);

	//Record.name = new String [numberOfp]; 
	//Record.scoreK = new int [numberOfp];
	//Record.scoreE = new int [numberOfp];
	//Record.scoreM = new int [numberOfp];

	// → 이거 안되는 이유 Sungjuk 객체 안만들어서
	//    실행안도ㅑㅐ!
	//    a = 10; 이거랑 같음.
	


	// 인원수 입력 → 공백구분 없으니까 BufferedReader와
	//                범위 이상이하면 다시묻기 → do ~ while
	void input() throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("인원 수 입력 (1~100) : ");
			numberOfp = Integer.parseInt(br.readLine());

		}
		while (numberOfp<1 || numberOfp>100);
		
		//테스트!
		//System.out.println("입력받은 인원 수 : " + numberOfp);
		//인원 수 입력 (1~100) : 102
		//인원 수 입력 (1~100) : -5
		//인원 수 입력 (1~100) : 3
		//입력받은 인원 수 : 3
	}
	// 상세 데이터 입력 → 물어보고 답하면 name에 담는데
	//                     그 전에 name 배열과 score 배열이 필요하겠당.
	void write() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//String[] nameArr = new String[numberOfp]; //클래스변수를 가져옴.
		for (int i =0;i<numberOfp;i++)
		{
			System.out.printf("%d번째 학생의 이름 입력 : ",(i+1));
			Record.name = br.readLine();
			System.out.print("국어 점수 : ");
			Record.scoreK = Integer.parseInt(br.readLine());
			System.out.print("영어 점수 : ");
			Record.scoreE = Integer.parseInt(br.readLine());
			System.out.print("수학 점수 : ");
			Record.scoreM = Integer.parseInt(br.readLine());
		

			strArr[i] = Record.name;
			kArr[i] = Record.scoreK;
			eArr[i] = Record.scoreE;
			mArr[i] = Record.scoreM;

					

		}	
	
	}
	// 총점 및 평균연산 
	void cal()
	{   for (int i = 0;i<recArr.length ;i++ )
		{
			sumArr[i] = kArr[i]+eArr[i] + mArr[i];
			avgArr[i] = sumArr[i]/3.0;
		}
	}
		
	// 결과 출력.
	void print()
	{
		for (int i = 1;i<=recArr.length ;i++ )
		{
			System.out.printf("%5d %4d %4d %4d %5d %.2f",strArr[i],kArr[i],eArr[i],mArr[i],sumArr[i],avgArr[i]);
			
		}
		// 김상기 90 80 70 240 xx.xx 2
		// 임소민 92 82 72 xxx xx.xx 1
		// 이연주 82 72 62 xxx xx.xx 3
		
	}
}
public class Test103
{
	public static void main(String[] args) throws IOException
	{
		Sungjuk sj = new Sungjuk();

		sj.input();
		sj.write();
		sj.print();
	}
}
*/
