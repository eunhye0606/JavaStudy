/*=====================================
		    ■■■ 배열 ■■■
======================================*/

// 배열의 기본적 활용

// 임의의 정수들이 들어있는 배열의 숫자 데이터들 중
// 짝수인 요소만 골라서 출력하고, 3의 배수인 요소만 골라서 출력하는
// 프로그램을 구현한다.

// 배열을 구성하는 임의의 정수 = 4 7 9 1 3 2 5 6 8

// 실행 예)
// 배열 요소 전체 출력
// 4 7 9 1 3 2 5 6 8

// 짝수 선택적 출력
//4 8 2 6 
//3의 배수 선택적 출력
// 9 3 6
//계속하려면 아무 키나 누르세요..

/*
public class Test082
{
	public static void main(String[] args)
	{


		//배열 구성
		int [] arr = {4, 7, 9, 1, 3, 2, 5, 6, 8};

		// 방 개수 구하는 메소드.
		System.out.println(arr.length);
		//※ 배열 arr 의 길이(방의 갯수) 확인.
		//   : arr.length
		// 9
		// 인덱스 = arr.length - 1개


		//전체출력
		System.out.println("배열 요소 전체 출력");
		for (int i =0;i<arr.length ;i++ )
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();

	}
}
*/

public class Test082
{
	public static void main(String[] args)
	{


		//배열 구성
		int arr [] = {4, 7, 9, 1, 3, 2, 5, 6, 8};
		
		//전체출력
		System.out.println("배열 요소 전체 출력");
		for (int i =0;i<9 ;i++ )
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();

		
		//짝수만
		System.out.println("짝수 선택적 출력");
		for (int j=0;j<9 ;j++ )
		{
			if (arr[j]%2 ==0)
			{
				
				System.out.print(arr[j]+" ");
			}
		}
		System.out.println();
		

		//홀수만
		System.out.println("3의 배수 선택적 출력");
		for(int h=0;h<9;h++) 
		{
			if (arr[h]%3 ==0)
			{
				
				System.out.print(arr[h]+" ");
			}
		}
		System.out.println();
	}
}


/*
실행 결과
배열 요소 전체 출력
4 7 9 1 3 2 5 6 8
짝수 선택적 출력
4 2 6 8
3의 배수 선택적 출력
9 3 6
계속하려면 아무 키나 누르십시오 . . .
*/

