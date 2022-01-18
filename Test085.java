/*=====================================
		    ■■■ 배열 ■■■
======================================*/

// 배열의 기본적 활용

//○ 과제
//   사용자로부터 임의의 정수를 임의의 갯수만큼 입력받아
//   입력받은 수 중에서 가장 큰 수를 출력하는 프로그램을 작성한다.
//   단, 배열을 활용하여 구현할 수 있도록 한다.

// 실행 예)
// 입력할 데이터의 갯수 : 12
// 데이터 입력 (공백 구분) : 74 65 13 91 5 67 33 41 2 50 11 38
// >> 가장 큰 수 → 91
// 계속하려면 아무 키나 누르세요...

/*
1.입력 받기 Scanner로 공백 구분
2. for,if 문써서 자리 바꾸기... 큰수는 살리고 살리고~!
*/
import java.util.Scanner;
import java.io.IOException;


public class Test085
{
	public static void main(String[] args) throws IOException
	{
		// Scanner 인스턴스 생성.
		Scanner sc = new Scanner(System.in);

		//사용자에게 질문.
		System.out.print("입력할 데이터의 갯수 : ");
		int nUser = sc.nextInt();

		//nUser만큼 숫자를 넣을 배열 생성
		int [] arr = new int[nUser];
		// 0 0 0 0 ...
		// arr[0] arr[1] ....arr[nUser]
		System.out.println(arr.length);

		//nUSer 갯수만큼 데이터를 입력받도록 질문.
		//System.out.print("데이터 입력 (공백 구분) : ");
		//System.out.println();


		//배열에 숫자넣기
		int n=0;
		//do
		//{
			System.out.print("데이터 입력 (공백 구분) : ");// 1 2 3 4
			
			for (int i =0;i<arr.length ;i++ ) //i<arr.length가 있으니까 do ~ while이 없어도돼.
			{
				n = sc.nextInt();
				System.out.println(n);
				arr[i] = n;   //이미 여기에 arr.length까지만 담음. n 에다가 
				              // 그 n을 arr[i]에 담음
			}
			

		//}
		//while (arr.length>nUser); //check point!!!
		


		//배열 출력 구문 전체 요소 출력
		for (int i=0;i<arr.length ; i++)
		{
			System.out.printf("%4d",arr[i]); 
		}
		System.out.println();


		//가장 큰 수 구하기!

		int max = arr[0];
		for (int i =1;i<arr.length ;i++ )
		{
			if (max < arr[i])
			{
				max = arr[i];
			}
		}

		System.out.println("가장 큰 값 : " + max);

	}
}
/*
입력할 데이터의 갯수 : 3
데이터 입력 (공백 구분) : 4 55 1
   4  55   1
가장 큰 값 : 55
계속하려면 아무 키나 누르십시오 . . .
*/