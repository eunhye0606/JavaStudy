/*=====================================
		    ■■■ 배열 ■■■
======================================*/

// 배열의 배열(2차원 배열)


//○ 과제
//   배열의 배열(다차원 배열)을 활용하여
//   다음과 같은 데이터를 요소로 취하는 배열을 구성하고
//   그 결과를 출력하는 프로그램을 구현한다.

// 실행 예)
/*
A  B  C  D  E
F  G  H  I  J
K  L  M  N  O
P  Q  R  S  T
U  V  W  X  Y

계속하려면 아무 키나 누르십시오 . . .
*/

public class Test094
{
	public static void main(String[] args)
	{

		//배열의 배열을 구성
		char [][] arr = new char [5][5];
		int n = 65; //-- A부터 들어갑시다
		//배열에 값 넣기
		//①배열안에는 char 자료형이 들어간당
		//②A=65 ~ 
		//[00]~[04] → [10]~[14] →[24]~[44] → [34]~[44] →[40]~[44]
		
		for (int i =0;i<arr.length ;i++ )
		{
			for (int j =0;j<arr[i].length ;j++ )
			{
				arr[i][j] = (char)n;
				n++;
			}
		}


		//배열 전체 요소 출력
		for (int i = 0;i <arr.length ;i++ )
		{
			for (int j =0;j<arr[i].length ;j++ )
			{
				System.out.printf("%4c",arr[i][j]);
			}
			System.out.println();
			
		}
		System.out.println();
	}
}

/*
실행결과

   A   B   C   D   E
   F   G   H   I   J
   K   L   M   N   O
   P   Q   R   S   T
   U   V   W   X   Y

계속하려면 아무 키나 누르십시오 . . .
*/