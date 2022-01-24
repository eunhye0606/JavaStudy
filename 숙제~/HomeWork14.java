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

public class HomeWork14
{
	public static void main(String[] args) throws IOException
	{
		int inwon; // -- 학생 수를 담을 변수
		int [][] score; // -- 점수 담을 변수
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

		score = new int [inwon][2];
		name = new String [inwon];
	
		for (int i = 0;i<inwon ;i++ )
		{
			System.out.printf("이름 점수 입력(%d, 공백 구분) : ",i+1);
			name[i] = sc.next();
			for (int j =0;j<1 ;j++ )
			{
				score[i][j] = sc.nextInt();
				score[i][j+1] = i;
			}
			

		}
		System.out.println();


		for (int i = 0;i<name.length ;i++ )
		{
			System.out.printf("이름 : %s\n", name[i]);

		}
		
/*
건태 80
으네 100
자빗 90
삐삐 10

[80] 0]
 [100] [1]
 90 2
 10 3]

[100] [1]
[90] [2]
[80] [0]
[10] [3]
*/
/*
name = 건태 으네 자비스 삐삐
score = 80 100 90 10
k =0 ;  1    2   3   4   // -- 학번

score 바뀌면
score[0] = 100 
k[0] = 2
name[k[0]-1]
*/
		
		
		for (int i = 0;i<score.length-1 ;i++ )
		{
			if (score[i][0] < score[i+1][0])
				{
					//자리바꾸기
					score[i][0] = score[i][0]^score[i+1][0];
					score[i+1][0] = score[i+1][0]^score[i][0];
					score[i][0] = score[i][0]^score[i+1][0];
					
					score[i][1] = score[i][1]^score[i+1][1];
					score[i+1][1] = score[i+1][1]^score[i][1];
					score[i][1] = score[i][1]^score[i+1][1];

					System.out.println("선택정렬!");

				}
		}
		System.out.println("내림차순으로 정렬된 점수들!");
		for (int i =0 ;i<inwon ;i++ )
		{
			System.out.printf("점수 : %4d" , score[i][0]); //-- 점수
			System.out.printf("이름 : %s\n" , name[(score[i][1])]);
		}
			/*
			for (int j = 0;j <=1 ;j++ )
			{
				System.out.printf("%4d",score[i][0]);
				System.out.print("정렬좀 되라 :" + name[(score[i][1]]);
			}
			System.out.println();
			*/
	}
}

		
		
