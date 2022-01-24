 /*===============================================
	  ■■■ 정렬(Sort) 알고리즘 ■■■
================================================*/ 

// ○ 과제
//    사용자로부터 여러 학생의 성적 데이터를 입력받아
//    점수가 높은 학생부터 낮은순으로 등수를 부여하여
//    결과를 출력하는 프로그램을 구현한다.
//    단, 배열과 정렬 알고리즘을 활용하여 작성할 수 있도록 한다.


// 실행 예)
// 인원 수 입력 : 5
// 이름 점수 입력(1, 공백 구분) : 이아린 90
// 이름 점수 입력(2, 공백 구분) : 박현수 80
// 이름 점수 입력(3, 공백 구분) : 이지연 85
// 이름 점수 입력(4, 공백 구분) : 서민지 75
// 이름 점수 입력(5, 공백 구분) : 김민성 95

/*
--------------
1등 김민성 95
2등 이아린 90
3등 이지연 85
4등 박현수 80
5등 서민지 75
--------------
계속하려면 아무 키나 누르세요...
*/



import java.util.Scanner;
import java.io.IOException;

public class Test112
{
	public static void main(String[] args) throws IOException
	{
		int inwon; // -- 학생 수를 담을 변수
		int [] score; // -- 점수 담을 변수
		String [] name; // -- 이름 담을 배열
		






		//Scanner 기반 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		do
		{
			System.out.print("인원 수 입력: ");
			inwon = sc.nextInt();
			//System.out.println(inwoon);
		}
		while (inwon<1);

		score = new int [inwon];
		name = new String [inwon];
	

		for (int i = 0;i<inwon ;i++ )
		{
			System.out.printf("이름 점수 입력(%d, 공백 구분) : ",i+1);
			name[i] = sc.next();
			score[i] = sc.nextInt();

		}
		System.out.println();

		for (int i = 0;i<name.length ;i++ )
		{
			System.out.printf("점수 : %2d\t", score[i]);
			System.out.printf("이름 : %s\n", name[i]);

		}
		System.out.println();

		//점수로 정렬 내림차순.
		//①선택정렬 
		/*
		90 80 75 85 95
		== --
		90 80 75 85 95
		==    --
		90 80 75 85 95
		==       --
		95 80 75 85 90 
		==          --
		------------------1회전
		95 80 75 85 90 
		   == --
		95 85 75 80 90 
		   ==    --
		95 90 75 80 85
		   ==       --
		-------------------2회전
		.
		.
		.

		*/
		
		/*
		for (int i = 0;i<score.length-1 ;i++ )
		{
			for (int j = i+1;j<score.length ;j++ )
			{
				if (score[i] < score[j])
				{
					//자리바꾸기
					score[i] = score[i]^score[j];
					score[j] = score[j]^score[i];
					score[i] = score[i]^score[j];
					System.out.println("선택정렬!");

				}
			}
		}
		*/

		

		//②버블정렬
		/*
		90 80 75 85 95    01     j vs j+1
		== --
		90 80 75 85 95    12
		   == --
		90 80 85 75 95    23
		      == --
		90 80 85 95 75    34     j <4   
		         == --
		----------------1회전    
		90 80 85 95 75    01
		== --
		90 85 80 95 75    12
		   == --
		90 85 95 80 75    23      j<3
		      == --
		----------------2회전
		                  01

						  12      j<2


						  01      j<1
		.
		.


		.
		*/
		/*
		for (int i = 1;i<score.length ;i++ )
		{
			for (int j = 0;j<score.length-i ;j++ ) // 
			{
				if (score[j] < score[j+1])
				{
					//자리바꾸기
					score[j] = score[j]^score[j+1];
					score[j+1] = score[j+1]^score[j];
					score[j] = score[j]^score[j+1];
					System.out.println("버블정렬!");
				}

			}
		}
		*/



		//정렬된 점수를 출력해 볼게요!
		System.out.print("내림차순으로 정렬된 점수들!");
		for (int i = 0;i<score.length ;i++ )
		{
			System.out.printf("%4d",score[i]);
		}
		System.out.println();
	}
}