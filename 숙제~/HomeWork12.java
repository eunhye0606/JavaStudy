// �¼���ġ ���α׷� �����غ���

import java.util.Random;
public class HomeWork12
{
	public static void main(String[] args)
	{
		//�츮�� 24��
		/*
             [��Ź]   

		[] [] [] [] [] []

		[] [] [] [] [] []

		[] [] [] [] [] []

		[] [] [] [] [] []
		*/
		


		//���� �� �߻�.

		Random rd = new Random();
		// �迭 ����
		int [][] arr = new int [4][6];

		//�л��� ���� �迭
		int [] student = new int [24];
		int n=1;

		
		/*
		for (int i =0;i <student.length ;i++ )
		{
			student[i] = n;
			n++;
		}
		*/
		//�����ϰ� arr�� ���ڸ� �ְ�
		//�̹� �� ���ڸ� �ٽ� �����ϰ� ������.

		//rd.nextInt(24)+1; // 0~23����. �� 1~24����
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