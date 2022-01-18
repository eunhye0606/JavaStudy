/*=====================================
		    ■■■ 배열 ■■■
======================================*/

// 배열의 기본적 활용

//○ 과제
//   사용자로부터 임의의 학생 수를 입력받고
//   그만큼의 점수(정수 형태)를 입력받아
//   전체 학생 점수이 합, 평균, 편차를 구하여
//   결과를 출력하는 프로그램을 구현한다.
//   단, 배열을 활용하여 처리할 수 있도록 한다.


// 실행 예)
// 학생 수 입력 : 5
// 1번 학생의 점수 입력: 90
// 2번 학생의 점수 입력 :82
// 3번 학생의 점수 입력: 64
// 4번 학생의 점수 입력 :98
// 5번 학생의 점수 입력 :98

// >> 합 : 370
// >> 평균 : 74.0
// >> 편차 :												평균 - 표본(==각 점수들)
// 90 : -16.0
// 82 : -8.0
// 64 : 10.0
// 36 : 38.0
// 98 : -24.0


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Test086
{
	public static void main(String[] args) throws IOException
	{
		// BufferedReader 인스턴스 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 사용자한테 입력 받기

		System.out.print("학생 수 입력 : ");
		int nUser = Integer.parseInt(br.readLine());

		
		//배열생성 및 사용자한테 입력받은 값 만큼의 size
		int arr [] = new int [nUser];



		int n = 0;
		int sum =0; // -- 합산 누적합

		//arr[i] 점수 ~  .. . 배열에 값 넣고
		//arr[0] == 1번학생의 점수 .... . arr[arr.length-1] == arr.length번째의 학생의 점수
		for (int i = 0;i<arr.length ;i++ )
		{
			System.out.printf("%d번 학생의 점수 입력 : ",(i+1));
			n = Integer.parseInt(br.readLine());
			arr[i] = n;
			sum += n;
			
		}
		
		//System.out.println(sum);
		//System.out.println("배열에 값넣기 탈출");


		//배열 출력
	/*
		for (int i = 0;i < arr.length ;i++ )
		{
			System.out.printf("%4d",arr[i]);
		}
		System.out.println();
	*/


		//합,평균,편차 연산
		//int sum; //--합산

		double avg; //-- 평균

		avg = (sum*1.0)/ nUser;

		double d;   // -- 편차

		//System.out.println(avg);


		
		//결과출력
		
		System.out.println("\n >> 합 : " + sum); //--합
		System.out.printf(" >> 평균 : %.1f\n",avg); //--평균
		//편차 구하기

		System.out.println(" >> 편차 : ");

		for (int i =0;i<arr.length ;i++ )
		{
			d = avg - arr[i];
			System.out.printf("%d : %.1f\n", arr[i],d);
		}
		System.out.println();

	}
}

/*
실행결과
학생 수 입력 : 5
1번 학생의 점수 입력 : 90
2번 학생의 점수 입력 : 82
3번 학생의 점수 입력 : 64
4번 학생의 점수 입력 : 98
5번 학생의 점수 입력 : 98

 >> 합 : 432
 >> 평균 : 86.4
 >> 편차 :
90 : -3.6
82 : 4.4
64 : 22.4
98 : -11.6
98 : -11.6

계속하려면 아무 키나 누르십시오 . . .
*/