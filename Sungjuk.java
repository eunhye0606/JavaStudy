/*=====================================
    ■■■ 클래스와 인스턴스 ■■■
======================================*/

// 클래스와 인스턴스 활용

// 2. Sungjuk 클래스
//    - 인원 수를 입력받아, 입력받은 인원 수 만큼
//    이름, 국어점수 영어점수, 수학점수를 입력받고
//    총점과 평균을 산출하는 클래스로 설계할 것 ~!!
//    속성 : 인원수, Record 형태의 배열
//    기능 : 인원수 입력, 상세 데이터 입력, 총점 및 평균 연산, 결과 출력
import java.util.Scanner;
import java.io.IOException;

public class Sungjuk
{

	//주요 속성 구성
	int inwon; //-- 인원 수
	//Record[] rec = new Record [inwon]; //-- Record 배열(학생 한 명 당 Record 배열 방 한개 활용)
				  //--Record를 기반으로 생성된 객체만 담아낼 수 있는 배열
				  //이거하면 Record 클래스의 변수 쓸수 있음.
				  //그래서 static 안붙어.x

	Record[] rec;
	//Record[] rec = new Record [inwon];
	//이거 안되는 이유 inwon이 뭔데 ~ 
	//자바는 순차적 ㄴㄴ 메소드안에서만 순차적..
	//이게 클래스변수인지 알아보기!★
	//배열은 방만들고 추후에 늘리고 줄이는거 못해!
	// 그래서 초기화하면서 방 예약못해!!

	
				  

	//[0] [1] [2] ..
	// rec[0] = new Record(); 인스턴스 생성. inwon까지 만들 수 있음!!!!



	//Scanner sc = new Scanner();
	//Record rec = new Record();
	//Sungjuk 인스턴스 생성되면 스캐너 모두 메모리 할당
	//ㅈㄴ비효율적.
	// 기능에 다 쓰더라도 
	//class에다가 인스턴스 여러개 박는다 ? 
	// 에바임.;
	
	//차라리 Scanner sc; 하면서 변수 선언하고
	// 메소드안에서 인스턴스 생성
	// sc = new Scanner();

	// 주요 메소드 정의(기능 구성)
	// 매개변수랑 return자료형 뭐할지.

	// ① 인원 수 입력
	public void set() throws IOException
	{
		
		Scanner sc = new Scanner(System.in);
		do
		{ System.out.print("인원 수 입력(1~100) : ");
		  inwon = sc.nextInt();
		}
		while (inwon<1 || inwon > 100);

		//check~1!!
		//Record 클래스를 기반으로 생성된 객체(인스턴스)를 담을 수 있는
		//배열방을 inwon 만큼 생성한 것이지
		//Record 클래스의 인스턴스를 생성한 것은 아니다.
		rec = new Record[inwon];

		//Record배열안에는 Record타입말고는
		// 들어갈 수 없어용!!! String도 안돼!!

		//Record타입은 Record클래스 생성?? 예스 
	
	}

	//② 상세 데이터 입력(총점 및 평균 산출 기능 포함)
	public void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		String[] title = {"국어 점수 : " ,"영어 점수 : " , "수학 점수 : "};

		for (int i =0;i<rec.length ;i++ )
			//int i =0;i<inwon;i++
		{
			//Record 클래스 기반의 인스턴스 생성!!
			rec[i] = new Record();


			System.out.printf("%d번째 학생의 이름 입력 : ",(i+1));
			rec[i].name=sc.next();

			//System.out.print("국어 점수 : ");
			//rec[i].score[0] = sc.nextInt();
			//System.out.print("영어 점수 : ");
			//rec[i].score[1] = sc.nextInt();
			//System.out.print("수학 점수 : ");
			//rec[i].score[2] = sc.nextInt();
			

			//국어, 영어, 수학 한번에 총합까지!!
			for (int j =0;j<title.length ;j++ )
			{
				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt();

				rec[i].tot += rec[i].score[j];
			}

			//for (int j =0;j<rec[i].score.length ;j++ )
			//{
				//rec[i].tot += rec[i].score[j];
			//}
			rec[i].avg = rec[i].tot/3.0;

			}//end outer for
			
		}


		//Scanner sc = new Scanner(System.in);
		

		//for (int i = 0;i<inwon ;i++ )
		//{
			//rec[i] = new Record(); // 학생 i명에 대한 각각의 객체 생성!
			//System.out.printf("%d번째 학생의 이름 입력 : ",(i+1));
			//System.out.print("국어 점수 : ");
			//System.out.print("영어 점수 : ");
			//System.out.print("수학 점수 : ");

			//rec[i].name = sc.next();
			//for (int j =0;j<rec[i].score.length ;j++ )
			//{
				//rec[i].score[j] = sc.nextInt();
				//rec[i].tot += sc.nextInt();

			//}
			//rec[i].avg = rec[i].tot/3.0;
		
			
		//}
	//}

	
	//③ 결과 출력
	public void print()
	{
		ranking(); //같은 클래스라서 그냥 부름 호출! 
		//System.out.printf("\n%5s %4s %4s %4s %5s %10s\n","이름","국어점수","영어점수","수학점수","총점","평균");
		for (int i =0;i<inwon ;i++ )
		{
			//이름 출력
			System.out.printf("%5s",rec[i].name);

			//성적(국어, 영어, 수학) 반복 출력
			for (int j=0;j<3 ;j++ )
			{
				System.out.printf("%4d",rec[i].score[j]);
			}
			//총점, 평균 출력
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f",rec[i].avg);

			//석차 출력
			System.out.printf("%5d",rec[i].rank);

			System.out.println();
		}
	}
		
		/*
		System.out.printf("\n%s %s %s %s %s %s %s\n","이름","국어점수","영어점수","수학점수","총점","평균","석차");
		for (int i = 0;i<rec.length ;i++ )
		{
			System.out.printf("%3s %4d %4d %4d %4d %.2f\n",rec[i].name,rec[i].score[0],rec[i].score[1],rec[i].score[2],rec[i].tot,rec[i].avg);
		}
		System.out.println();
		*/

		//+④ 석차 산출 메소드 추가
		//   - 석차 산출 과정에서 연산에 필요한 데이터 이미 존재하는 상황
		//   - Record 배열의 rank 변수(속성)을 초기화 기능 수행 → 반환 자료형 void.
		//   - 클래스 내부에서 활용할 메소드 정의라서 → 접근제어지시자 private

		// 전역변수가 왜 0이 되는지 찾기!!!!!!!!
	private void ranking() // 외부에서 안씀. 같은 클래스 print만씀.
	{
		//모든 학생들의 등수(석차, rank)를 1로 초기화 
		for (int i = 0;i<inwon ;i++ )
			rec[i].rank = 1;

		// 등수 산출
		for (int i =0 ;i<inwon-1 ;i++ ) // -- 웅~ → 비교기준!
										// 비교대상이 3개면 01까지 .왜냐면 2는 대상임. 1이랑 2랑 비교
		{
			for (int j =i+1;j<inwon ;j++ ) //-- 쑝쑝 비교대상! //이해하기!!!!!!!!!!
										   // 아 ! 마지막 인덱스는 inwon -1임ㅋㅋ
			{							   // 헷갈리지좀 마 ~ 
				//비교기준의 평균 > 비교대상의 평균
				// 비교대상 rank +1
				if (rec[i].avg > rec[j].avg)
				{
					rec[j].rank ++;
				}
				
				//비교기준의 평균 < 비교대상의 평균
				//비교기준 rank + 1
				else if (rec[i].avg <= rec[j].avg) // <=안해도됨. 그거 아닐때는 그냥 넘어가서.
				{
					rec[i].rank++;
				}
					

			}
		}
		












		// 내가 틀린 이유 : i-1이랑 i+1이랑비교안함ㅋ
		//다시해보면 되려나 모르겠네 ㅅㅂ
		
		// 88 100 1  20
		// 100 기준으로 i-1보다 크면 n + 0
		// i + 1 보다 크면 n+ 0
		// 기준점이 80이면
		// i -1이 없음
		// i +1 은 100 크면 n+0
		//             작으면 n+1
		//
		/*
		int n =1;
		for (int i= 0;i < inwon ;i++ )
		{
			rec[i].rank = 1;
		}

		for (int i =1;i<inwon-1 ;i++ )
			// __ __ __
		{
			if (rec[i-1].tot > rec[i].tot)
			{
				rec[i].rank ++;
			}
			else if (rec[i-1].tot <= rec[i].tot)
			{
				rec[i-1].rank ++;
			}
				

			else if (rec[i].tot>rec[i+1].tot)
			{
				rec[i+1].rank ++;
			}
			else if (rec[i].tot <= rec[i+1].tot)
			{
				rec[i].rank ++;
			}
		}
			*/
				
			
		
	}
}


		
		/*
		String [] strArr = new String [inwon];
		// -- 학생 이름으로 배열에 담자구 ~ !
		//    이 배열에 맨앞은 1등으로 할구야!


		//총점으로 비교
		// 만약 3명의 학생이면 1,2,3등 나오게
		for (int i= 0;i<inwon ;i++ )
		{
			if (rec[i].tot > rec[i+1].tot)
			{
				strArr[i] = rec[i].name;

			}
			else 
				strArr[i] = rec[i+1].name;

			
			//rec[0]은 첫번째 학생이니까
			//rec[inwon-1]이 마지막 학생
			// 얘네 비교해서 새로운 배열에 넣자.
			//그리고 새 배열 arr[0]이면 j = 0부터 시작해서
			// arr[j] = j+1등 인걸루.. 

		}
		return String[];
		/*
		//int rank; //-- 석차 123등 담는 변수
		int [] rank = new int [inwon];
		int n=1;

		for (int i =0; i<inwon;i++ )
		{
			rank[i] = n;
			n++;
		}
		//rank = {1 , ... ,inwon]
			
		int max=0; // -- 가장 큰 값.

		//비교는 총점으로 ! 
		//res[i].tot로 비교.

		//int max = rec[0];
		//Record는 int로 바꿀수 없음.
		rank[0] = max;
		for (int i =1;i<inwon ;i++ )
		{
			if (max<rec[i].tot)
			{
				max = rec[i].tot;
			}
		}
			
		//석차 순서대로 출력
		for (int i=0;i<inwon ;i++ )
		{
			System.out.printf("%4d",rank[i]);
		}
		*/
			








	//	for (int i = 0;i<inwon ;i++ )
		//{
		//	System.out.println(rec[i]);
			

	//	}
	//}

		//System.out.printf
		// 석차 산출 메소드 호출
		//ranking(); 
	//}
	
	
