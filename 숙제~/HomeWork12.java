// 좌석배치 프로그램 구현해보자

import java.util.Random;
public class HomeWork12
{
	public static void main(String[] args)
	{
		//우리반 24명
		/*
             [교탁]   

		[] [] [] [] [] []

		[] [] [] [] [] []

		[] [] [] [] [] []

		[] [] [] [] [] []
		*/
		


		//랜덤 수 발생.

		Random rd = new Random();
		// 배열 생성
		int [][] arr = new int [4][6];

		//학생들 담을 배열
		int [] student = new int [24];
		int n=1;

		
		/*
		for (int i =0;i <student.length ;i++ )
		{
			student[i] = n;
			n++;
		}
		*/
		//랜덤하게 arr에 숫자를 넣고
		//이미 들어간 숫자면 다시 랜덤하게 돌려라.

		//rd.nextInt(24)+1; // 0~23까지. → 1~24까지
		int i=0;
		int j=0;
		do
		{
			for (i =0;i<arr.length ;i++ )
			{
				for (j =0;j<arr[i].length ;j++ )
				{
					arr[i][j] = rd.nextInt(24)+1;
				}
			}
		}
		while (true);


		
	}
}