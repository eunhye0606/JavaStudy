/*=====================================
    ���� Ŭ������ �ν��Ͻ� ����
======================================*/

// Ŭ������ �ν��Ͻ� Ȱ��

// �л����� ��������, ��������, ���������� �Է¹޾�
// ����, ����� ����ϴ� ���α׷��� �����Ѵ�.
// ��, Ŭ������ ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.
// ����, �� �������� �迭�� ���������� Ȱ���� �� �ֵ��� �Ѵ�.
// Ŭ���� ����� ������ ���̵���ο� ���� ������ �� �ֵ��� �Ѵ�.

// ���α׷��� �����ϴ� Ŭ����
// 1. Record Ŭ����
//    - �Ӽ��� �����ϴ� Ŭ������ ������ �� ~!!
//
// 2. Sungjuk Ŭ����
//    - �ο� ���� �Է¹޾�, �Է¹��� �ο� �� ��ŭ
//    �̸�, �������� ��������, ���������� �Է¹ް�
//    ������ ����� �����ϴ� Ŭ������ ������ �� ~!!
//    �Ӽ� : �ο���, Record ������ �迭
//    ��� : �ο��� �Է�, �� ������ �Է�, ���� �� ��� ����, ��� ���
//
// 3. Test103 Ŭ����
//    - main() �޼ҵ尡 �����ϴ� �ܺ� Ŭ������ ������ ��~!!

// ���� ��)
// �ο� �� �Է�(1~100) : 102
// �ο� �� �Է�(1~100) : -10
// �ο� �� �Է�(1~100) : 3

// 1��° �л��� �̸� �Է� : ����
// ���� ���� : 90
// ���� ���� : 80
// ���� ���� : 70

// 2��° �л��� �̸� �Է� : �Ӽҹ�
// ���� ���� : 92
// ���� ���� : 82
// ���� ���� : 72

// 3��° �л��� �̸� �Է� : �̿���
// ���� ���� : 82
// ���� ���� : 72
// ���� ���� : 62

// ���� 90 80 70 240 xx.xx 2
// �Ӽҹ� 92 82 72 xxx xx.xx 1
// �̿��� 82 72 62 xxx xx.xx 3

//����Ϸ��� �ƹ� Ű�� ��������...

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;

public class Test103
{
	public static void main(String[] args) throws IOException
	{
		Sungjuk sc = new Sungjuk();
		sc.set();
		sc.input();
	
		sc.print();

	}
}
/*
�ο� �� �Է�(1~100) : 3
1��° �л��� �̸� �Է� : ȫ����
���� ���� : 90
���� ���� : 80
���� ���� : 70
2��° �л��� �̸� �Է� : �ֹ���
���� ���� : 82
���� ���� : 92
���� ���� : 76
3��° �л��� �̸� �Է� : ��μ�
���� ���� : 99
���� ���� : 88
���� ���� : 77
  ȫ����  90  80  70  240   80.00
  �ֹ���  82  92  76  250   83.33
  ��μ�  99  88  77  264   88.00

����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
�ο� �� �Է�(1~100) : -1
�ο� �� �Է�(1~100) : 101
�ο� �� �Է�(1~100) : 3
1��° �л��� �̸� �Է� : ȫ����
���� ���� : 100
���� ���� : 90
���� ���� : 80
2��° �л��� �̸� �Է� : �ڰ���
���� ���� : 50
���� ���� : 40
���� ���� : 30
3��° �л��� �̸� �Է� : ��ҿ�
���� ���� : 2
���� ���� : 3
���� ���� : 4
  ȫ���� 100  90  80  270   90.00    1
  �ڰ���  50  40  30  120   40.00    2
  ��ҿ�   2   3   4    9    3.00    3
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

*/










/*
class Record //�� java���Ͼȿ��� public�� �ϳ�! �ֳ��ϸ� �װɷ� �ڹ����� �������.
{
	//String [] �̸� �迭
	//int su = 0;
	//static String [] name= new String [su];
	//static String name; // ����ڰ� �Է��� �̸� ��� ����
					    // �ν��Ͻ� ���� ���� �ٸ� Ŭ�������� Ȱ���ҰŶ� 
						// static�� ����!

	//int [] ���� �迭
	//static int [] scoreK = new int [su];
	//static int [] scoreE = new int [su];
	//static int [] scoreM = new int [su];

	//static int scorek; // ����ڰ� �Է��� ������ ��� ����
					  // �ν��Ͻ� ���� ���� �ٸ� Ŭ�������� Ȱ���ҰŶ� 
					  // static�� ����!
					  // Ŭ������.���������� Ȱ������!
	//static int scoreE;
	//static int scoreM; 
	
	static String name; //-- �л��̸�
	static int scoreK;  //-- ��������
	static int scoreE;  //-- ��������
	static int scoreM;  //-- ��������
 	static int sumScore;//-- �����ջ�
    static double avg;  //-- ���
	static int rank;    //-- ���, ���� ū����� 1

}
class Sungjuk
{	//�Ӽ� : �ο���, Record ������ �迭.
	// Record r1 = new Record(); �ϸ� r1��ü ����.
	// r1 ���� �̸�, ������, ���� ,����� ��.
	// r1�� �迭 .. ?
	// �ٵ� string�̶� int�� double�� ��� �� �迭�� ���ų�..


	int numberOfp; // �ο����� ��� ����
	Record [] student;

	//[ob1] [ob2] [ob3] ... [ob numberofp-1]
	// ��
	// �̸� ������ ���� ���...
	//
	//Record ob1 = new Record();
	//ob1.name ob1.���� ob1.���� ob1.���..

	//// �׷��ٸ� �ο�����ŭ ��ü�� �����ϰ�
	// �̸� �迭�� ���� ..? 
	// ���� �迭�� �ϳ� ..?
	

	
	

	//�ο��� ��ŭ ��ü ����.

	// �̸�, ������ ��� �迭 

	String [] strArr = new String[numberOfp];
	int [] kArr = new int[numberOfp];
	int [] eArr = new int[numberOfp];
	int [] mArr = new int[numberOfp];
	int [] sumArr = new int[numberOfp];
	double [] avgArr = new double[numberOfp];
	int [] rankArr = new int[numberOfp];

	
	

	//[0] �� �̸�
	//[1] �� ���� ����
	//[2] �� ���� ����
	//[3] �� ���� ����
	//[4] �� ����
	//[5] �� ���
	//[6] �� ��� ( ���߿� ��ü���� ��պ�);

	//Record.name = new String [numberOfp]; 
	//Record.scoreK = new int [numberOfp];
	//Record.scoreE = new int [numberOfp];
	//Record.scoreM = new int [numberOfp];

	// �� �̰� �ȵǴ� ���� Sungjuk ��ü �ȸ���
	//    ����ȵ�����!
	//    a = 10; �̰Ŷ� ����.
	


	// �ο��� �Է� �� ���鱸�� �����ϱ� BufferedReader��
	//                ���� �̻����ϸ� �ٽù��� �� do ~ while
	void input() throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("�ο� �� �Է� (1~100) : ");
			numberOfp = Integer.parseInt(br.readLine());

		}
		while (numberOfp<1 || numberOfp>100);
		
		//�׽�Ʈ!
		//System.out.println("�Է¹��� �ο� �� : " + numberOfp);
		//�ο� �� �Է� (1~100) : 102
		//�ο� �� �Է� (1~100) : -5
		//�ο� �� �Է� (1~100) : 3
		//�Է¹��� �ο� �� : 3
	}
	// �� ������ �Է� �� ����� ���ϸ� name�� ��µ�
	//                     �� ���� name �迭�� score �迭�� �ʿ��ϰڴ�.
	void write() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//String[] nameArr = new String[numberOfp]; //Ŭ���������� ������.
		for (int i =0;i<numberOfp;i++)
		{
			System.out.printf("%d��° �л��� �̸� �Է� : ",(i+1));
			Record.name = br.readLine();
			System.out.print("���� ���� : ");
			Record.scoreK = Integer.parseInt(br.readLine());
			System.out.print("���� ���� : ");
			Record.scoreE = Integer.parseInt(br.readLine());
			System.out.print("���� ���� : ");
			Record.scoreM = Integer.parseInt(br.readLine());
		

			strArr[i] = Record.name;
			kArr[i] = Record.scoreK;
			eArr[i] = Record.scoreE;
			mArr[i] = Record.scoreM;

					

		}	
	
	}
	// ���� �� ��տ��� 
	void cal()
	{   for (int i = 0;i<recArr.length ;i++ )
		{
			sumArr[i] = kArr[i]+eArr[i] + mArr[i];
			avgArr[i] = sumArr[i]/3.0;
		}
	}
		
	// ��� ���.
	void print()
	{
		for (int i = 1;i<=recArr.length ;i++ )
		{
			System.out.printf("%5d %4d %4d %4d %5d %.2f",strArr[i],kArr[i],eArr[i],mArr[i],sumArr[i],avgArr[i]);
			
		}
		// ���� 90 80 70 240 xx.xx 2
		// �Ӽҹ� 92 82 72 xxx xx.xx 1
		// �̿��� 82 72 62 xxx xx.xx 3
		
	}
}
public class Test103
{
	public static void main(String[] args) throws IOException
	{
		Sungjuk sj = new Sungjuk();

		sj.input();
		sj.write();
		sj.print();
	}
}
*/
