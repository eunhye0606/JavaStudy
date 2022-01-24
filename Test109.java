 /*===============================================
	  ���� ����(Sort) �˰��� ����
================================================*/ 
/*
�� ����
   : �����͸� Ư���� ��Ģ(����)�� �°� ������� ���� (��������, ��������)

�� ������ ����
   : ������ ó�� ������ ���Ǽ��̳� �������� ���̱� ����
     �� ���� ���� ... �˻��ϱ� ����

�� ������ ����
   : ���� ����, ���� ����, ���� ����, �� ����, �� ����, �� ���� ....
     �� ȸ�翡�� order by ������ �� ������ ���ҽ� �Ҹ� ũ��.

     
*/

// ���� ����(Selection Sort)
// �ϳ��� �������� ���ذ���~1

// ���� ��)
// Source Data : 52 42 12 62 60
// Sorted Data : 12 42 52 60 62
// ����Ϸ��� �ƹ� Ű�� ��������...

public class Test109
{
	public static void main(String[] args)
	{
		int [] a = {52, 42, 12, 62, 60};
		/*
		42 52 12 62 60			0 vs 1
		== -- 
		12 52 42 62 60			0 vs 2
		==    --
		12 52 42 62 60			0 vs 3
		==       --
		12 52 42 62 60			0 vs 4
		==	        --
		------------------------1ȸ��
		12 42 52 62 60			1 vs 2
		   == --
		12 42 52 62 60			1 vs 3
		   ==    --
		12 42 52 62 60			1 vs 4
		   ==       --
		------------------------2ȸ��
		12 42 52 62 60			2 vs 3
		      == -- 
		12 42 52 62 60			2 vs 4
		      ==    --
		------------------------3ȸ��
		12 42 52 60 62			3 vs 4
		         == --
		------------------------4ȸ��

		*/

		//��

		int i, j;
		System.out.print("Source Data : " );
		/*
		for (i = 0;i<a.length ;i++ )
			System.out.print(a[i] + " ");
		System.out.println();
		*/
		// ���� for��(foreach ����)
		// �ڷᱸ���� ŻŻ �аڴ�! a�� ÷���� ���������� �����ϰڴ�.
		// int�迭Ÿ�� ���� �ϳ��� ����� ������ Ÿ�� = intŸ��
		/*
		for (��� �ϳ��� �ڷ�Ÿ�� ������(�ƹ��ų�)	:���ڷᱸ��)
		{
			a�ڷᱸ���� ���� ù��° �����ͼ� n�� ��Ƽ� �ݺ��� ����
			a������ a.length��ŭ
			5�� ���ƿ�... a�� �氹����ŭ!
			a���� ������� ������ �ݺ���������..
		}
		*/
		for (int n :a )
			System.out.print(n + " "); //a[0], a[i], a[2], ..., a[4]
		System.out.println();

	

		// Selection Sort
		for (i=0;i<a.length ;i++ ) // ���� ~~�񱳱��ص����� 0 1 2 3 //// 52,~,60������
		{
			for (j=i;j<a.length ;j++ ) //����~!!!! �񱳴������  1234 234 34 4
			{
				if (a[i] < a[j])			//if (a[i] > a[j]) //�������� ����
				{
					//�ڸ��ٲٱ�
					a[i] = a[i]^a[j];
					a[j] = a[j]^a[i];
					a[i] = a[i]^a[j];
				}

			}
		}


		/*
		System.out.print("Sorted Data : " );
		for (i=0;i<a.length ; i++)
			System.out.print(a[i] + " ");
		System.out.println();
		*/
		System.out.print("Sorted Data : " );
		for (int n:a )
			System.out.print(n + " " );
		System.out.println();
		
		
		
	}
}
		
		
		
		/*
		//Source Data
		System.out.print("Source Data : " );
		for (int i = 0;i<a.length ;i++ )
			System.out.printf("%4d",a[i]);
		System.out.println();


		//����
		for (int i = 1;i<=a.length ;i++ )
		{
			for (int j = 0;j<i ;j++ )
			{
				for (int h =j+1;h<i ;h++ )
				{
					if (a[j] > a[h])  //0 vs 1, 0 vs 2
					{
						a[j] = a[j]^a[h];
						a[h] = a[h]^a[j];
						a[j] = a[j]^a[h];
					}
				}
			}
		}
		

		//������
		//Sorted Data
		System.out.print("Sorted Data : ");
		for (int i = 0;i < a.length ;i++ )
		{
			System.out.printf("%4d",a[i]);
		}
		System.out.println();
		


	}
}
*/

/*
������

Source Data :   52  42  12  62  60
Sorted Data :   12  42  52  60  62
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/