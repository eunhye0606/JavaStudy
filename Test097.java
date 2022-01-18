/*=====================================
		    ■■■ 배열 ■■■
======================================*/

//배열과 난수 처리(※ Random 클래스 활용)

//사용자로부터 임의의 정수를 입력받아
//그 정수의 갯수만큼 난수를 발생시켜 배열에 담고
//배열에 담겨있는 데이터들 중
//가장 큰 값과 가장 작은 값을 선택하여
//결과를 출력하는 프로그램을 구현한다.

//실행 예)
//발생시킬 난수의 갯수 입력 : 10
//(50 7 24 81 72 45 61 38 1 99 → 무작위로 발생한 정수들 ...)
//(int[] arr = {50 7 24 81 72 45 61 38 1 99} → 배열에 담아내기(배열 구성))
//가장 큰 값 : 99, 가장 작은 값 : 1
//계속하려면 .........


import java.util.Scanner;
import java.io.IOException;
import java.util.Random;


public class Test097
{
	public static void main(String[] args)
	{
		//Scanner 인스턴스 생성
		Scanner sc = new Scanner(System.in);

		//안내 메세지 출력
		System.out.print("발생시킬 난수의 갯수 입력 : ");
		int size = sc.nextInt();

		//size 변수에 담아낸 수 만큼의 배열방 만들기
		// (배열 선언 및 메모리 할당)
		int [] arr =new int[size];

		//무작위 정수(난수)를 발생시키기 위해서는
		//난수 발생 전용 객체가 필요하다.
		// → 『java.util.Random』

		//랜덤 인스턴스 생성 ~ 매개변수 안주고 저렇게 생성하는 구나 ~
		Random rd = new Random();

		// ※ Random 클래스의 『nextInt()』 메소드
		//    0 ~ 매개변수로 넘겨받은 정수 n - 1까지의 수 중
		//    무작위 정수(난수) 1개를 발생시킨다.

		//rd.nextInt(10) // 0 ~ 9
		               // 개수는 한개, 그 수의 범위가 0 ~ 9임.

		//테스트
		//System.out.println("발생한 난수 : " + rd.nextInt(10));
		// 0 ~ 9 까지의 범위 내에서 무작위 정수 한 개 발생 ~!!!

		//배열 구성
		//for (int i = 0;i<size ;i++ )
		for (int i = 0;i<arr.length;i++ )
		{
			//rd.Random(101);
			// 0 ~ 100 → 우리는 1 ~100 필요.
			arr[i] = rd.nextInt(100)+1;
			// 0 ~99 → +1 → 1 ~ 100!

		}
		// -- rd.nextInt(100)     → 0 ~ 99 까지의 무작위 정수 한 개 발생
		// -- rd.nextInt(100) + 1 → 1 ~ 100 까지의 무작위 정수 한 개 발생

		

		//테스트 → 구성된 배열의 전체 요소 출력
		
		for (int i = 0 ;i<arr.length;i++ )
		{
			System.out.printf("%4d",arr[i]);
		}
		System.out.println();
		

		/*
		발생시킬 난수의 갯수 입력 : 10
		85  38  73  49  81  39  33  75  36  72
		계속하려면 아무 키나 누르십시오 . . .
		*/

		
		// [0] ~ [arr.length -1]
		// [i] < [i+1] → arr[i] ^ arr[i+1]
		//                arr[i+1] ^ arr[i]
		//                arr[i] ^ arr[i+1]

		// 첫번째 > 두번째 → 자리바꿈
		// 첫번째 > 세번째 → 자리바꿈
		// 두번째 > 세번째 → 자리바꿈..

		//가장 작은 값 , 가장 큰 값 출력 ~ !!
		int max, min;	//-- 최댓값, 최솟값
		max = min = arr[0];	//max = min = 69; //쌤난수들

		for (int i =1 ;i<arr.length ;i++ )  // 1 2 3 4 5 6 7 8 9     0번째는 이미 max랑 min에 담음.
		{
			if (max<arr[i])
			{
				max = arr[i]; // 자리 바꿈 말고 걍 대입해 초기화하셈. 덮어쓰기
			}
			if (min >arr[i])  //최댓값, 최솟값 둘이 관계 ㄴㄴ
			{
				min = arr[i];
			}

		}
		System.out.printf("최댓값: %4d     최솟값: %4d\n",max,min);


		/*
		for (int j=0,n=1;j<arr.length;j++ ,n++)
		{ 
		
			if (arr[j]>arr[j+n-3])
			{
				arr[j] = arr[j+n-3];
			}
			else
				arr[j] = arr[j];


		}
		System.out.println();
		*/

	}
}
