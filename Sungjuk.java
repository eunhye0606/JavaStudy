/*=====================================
    ���� Ŭ������ �ν��Ͻ� ����
======================================*/

// Ŭ������ �ν��Ͻ� Ȱ��

// 2. Sungjuk Ŭ����
//    - �ο� ���� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
//    �̸�, �������� ��������, ���������� �Է¹ް�
//    ������ ����� �����ϴ� Ŭ������ ������ �� ~!!
//    �Ӽ� : �ο���, Record ������ �迭
//    ��� : �ο��� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���
import java.util.Scanner;
import java.io.IOException;

public class Sungjuk
{

	//�ֿ� �Ӽ� ����
	int inwon; //-- �ο� ��
	//Record[] rec = new Record [inwon]; //-- Record �迭(�л� �� �� �� Record �迭 �� �Ѱ� Ȱ��)
				  //--Record�� ������� ������ ��ü�� ��Ƴ� �� �ִ� �迭
				  //�̰��ϸ� Record Ŭ������ ���� ���� ����.
				  //�׷��� static �Ⱥپ�.x

	Record[] rec;
	//Record[] rec = new Record [inwon];
	//�̰� �ȵǴ� ���� inwon�� ���� ~ 
	//�ڹٴ� ������ ���� �޼ҵ�ȿ����� ������..
	//�̰� Ŭ������������ �˾ƺ���!��
	//�迭�� �游��� ���Ŀ� �ø��� ���̴°� ����!
	// �׷��� �ʱ�ȭ�ϸ鼭 �� �������!!

	
				  

	//[0] [1] [2] ..
	// rec[0] = new Record(); �ν��Ͻ� ����. inwon���� ���� �� ����!!!!



	//Scanner sc = new Scanner();
	//Record rec = new Record();
	//Sungjuk �ν��Ͻ� �����Ǹ� ��ĳ�� ��� �޸� �Ҵ�
	//������ȿ����.
	// ��ɿ� �� ������ 
	//class���ٰ� �ν��Ͻ� ������ �ڴ´� ? 
	// ������.;
	
	//���� Scanner sc; �ϸ鼭 ���� �����ϰ�
	// �޼ҵ�ȿ��� �ν��Ͻ� ����
	// sc = new Scanner();

	// �ֿ� �޼ҵ� ����(��� ����)
	// �Ű������� return�ڷ��� ������.

	// �� �ο� �� �Է�
	public void set() throws IOException
	{
		
		Scanner sc = new Scanner(System.in);
		do
		{ System.out.print("�ο� �� �Է�(1~100) : ");
		  inwon = sc.nextInt();
		}
		while (inwon<1 || inwon > 100);

		//check~1!!
		//Record Ŭ������ ������� ������ ��ü(�ν��Ͻ�)�� ���� �� �ִ�
		//�迭���� inwon ��ŭ ������ ������
		//Record Ŭ������ �ν��Ͻ��� ������ ���� �ƴϴ�.
		rec = new Record[inwon];

		//Record�迭�ȿ��� RecordŸ�Ը����
		// �� �� �����!!! String�� �ȵ�!!

		//RecordŸ���� RecordŬ���� ����?? ���� 
	
	}

	//�� �� ������ �Է�(���� �� ��� ���� ��� ����)
	public void input() throws IOException
	{
		Scanner sc = new Scanner(System.in);

		String[] title = {"���� ���� : " ,"���� ���� : " , "���� ���� : "};

		for (int i =0;i<rec.length ;i++ )
			//int i =0;i<inwon;i++
		{
			//Record Ŭ���� ����� �ν��Ͻ� ����!!
			rec[i] = new Record();


			System.out.printf("%d��° �л��� �̸� �Է� : ",(i+1));
			rec[i].name=sc.next();

			//System.out.print("���� ���� : ");
			//rec[i].score[0] = sc.nextInt();
			//System.out.print("���� ���� : ");
			//rec[i].score[1] = sc.nextInt();
			//System.out.print("���� ���� : ");
			//rec[i].score[2] = sc.nextInt();
			

			//����, ����, ���� �ѹ��� ���ձ���!!
			for (int j =0;j<title.length ;j++ )
			{
				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt();

				rec[i].tot += rec[i].score[j];
			}

			//for (int j =0;j<rec[i].score.length ;j++ )
			//{
				//rec[i].tot += rec[i].score[j];
			//}
			rec[i].avg = rec[i].tot/3.0;

			}//end outer for
			
		}


		//Scanner sc = new Scanner(System.in);
		

		//for (int i = 0;i<inwon ;i++ )
		//{
			//rec[i] = new Record(); // �л� i�� ���� ������ ��ü ����!
			//System.out.printf("%d��° �л��� �̸� �Է� : ",(i+1));
			//System.out.print("���� ���� : ");
			//System.out.print("���� ���� : ");
			//System.out.print("���� ���� : ");

			//rec[i].name = sc.next();
			//for (int j =0;j<rec[i].score.length ;j++ )
			//{
				//rec[i].score[j] = sc.nextInt();
				//rec[i].tot += sc.nextInt();

			//}
			//rec[i].avg = rec[i].tot/3.0;
		
			
		//}
	//}

	
	//�� ��� ���
	public void print()
	{
		//System.out.printf("\n%5s %4s %4s %4s %5s %10s\n","�̸�","��������","��������","��������","����","���");
		for (int i =0;i<inwon ;i++ )
		{
			//�̸� ���
			System.out.printf("%5s",rec[i].name);

			//����(����, ����, ����) �ݺ� ���
			for (int j=0;j<3 ;j++ )
			{
				System.out.printf("%4d",rec[i].score[j]);
			}
			//����, ��� ���
			System.out.printf("%5d", rec[i].tot);
			System.out.printf("%8.2f",rec[i].avg);

			//���� ���
			ranking();

			System.out.println();
		}
	}
		
		/*
		System.out.printf("\n%s %s %s %s %s %s %s\n","�̸�","��������","��������","��������","����","���","����");
		for (int i = 0;i<rec.length ;i++ )
		{
			System.out.printf("%3s %4d %4d %4d %4d %.2f\n",rec[i].name,rec[i].score[0],rec[i].score[1],rec[i].score[2],rec[i].tot,rec[i].avg);
		}
		System.out.println();
		*/

		//+�� ���� ���� �޼ҵ� �߰�
	private void ranking() // �ܺο��� �Ⱦ�. ���� Ŭ���� print����.
	{
		//int rank; //-- ���� 123�� ��� ����
		int [] rank = new int [inwon];
		int n=1;

		for (int i =0; i<inwon;i++ )
		{
			rank[i] = n;
			n++;
		}
		//rank = {1 , ... ,inwon]
			
		int max=0; // -- ���� ū ��.

		//�񱳴� �������� ! 
		//res[i].tot�� ��.

		//int max = rec[0];
		//Record�� int�� �ٲܼ� ����.
		rank[0] = max;
		for (int i =1;i<inwon ;i++ )
		{
			if (max<rec[i].tot)
			{
				max = rec[i].tot;
			}
		}
			
		//���� ������� ���
		for (int i=0;i<inwon ;i++ )
		{
			System.out.printf("%4d",rank[i]);
		}
			
	}
	
}








	//	for (int i = 0;i<inwon ;i++ )
		//{
		//	System.out.println(rec[i]);
			

	//	}
	//}

		//System.out.printf
		// ���� ���� �޼ҵ� ȣ��
		//ranking(); 
	//}
	
	
