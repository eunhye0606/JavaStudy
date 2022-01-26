/*=======================
���� Ŭ���� ��� ����
=========================*/

// �������̽�(Interface)

// �� �ǽ� ����
// ���� ó�� ���α׷��� �����Ѵ�.
// ��, �������̽��� Ȱ���� �� �ֵ��� �Ѵ�.

// ���� ��)
// �ο� �� �Է�(1~10) : 2
// 1��° �л��� �й� �̸� �Է�(���� ����) : 2280946 ȫ����
// ���� ���� ���� ���� �Է�   (���� ����) : 90 100 85
// 2��° �л��� �й� �̸� �Է�(���� ����) : 2250847 �ֹ���
// ���� ���� ���� ���� �Է�   (���� ����) : 85 70 65

//2280946 ȫ����	90 100 85  ������   ���
//                  ��  �� ��
//2250847 �ֹ���    85  70 65  ������   ���
//                  ��  �� ��
//
// ����Ϸ��� �ƹ� Ű�� ��������....

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

//�Ӽ��� �����ϴ� Ŭ���� �� �ڷ��� Ȱ��
class Record
{
	String hak, name; //-- �й�, �̸�
	int kor,eng,mat; //-- ����, ����, ���� ����
	int tot, avg; //-- ����, ���(���ǻ� ���� ó��)
}


// �������̽�
interface Sungjuk
{
	public void set() throws IOException; //-- �ο� ����
	public void input() throws IOException; //-- ������ �Է�
	public void print(); //-- ��� ���
}

// ���� �ذ� �������� �����ؾ� �� Ŭ���� �� Sungjuk �������̽��� �����ϴ� Ŭ����
class SungjukImpl extends Record implements Sungjuk
{
	public int inwon;
	private Record[] rec;

	//�������̽� �������̵�
	@Override
	public void set() throws IOException //-- �ο� ����
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do
		{
			System.out.print("�ο� �� �Է�(1~10) : ");
			inwon = Integer.parseInt(br.readLine());
		}
		while (inwon<1 || inwon >10);

		rec = new Record [inwon];
	} //end set()

	@Override
	public void input() throws IOException //-- ������ �Է�
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp; // --�й� �̸� ���ڿ��� ���� ����
		String [] arr; //-- ���� ���� \\s �������� �����ؼ� �迭�� ��������.
		String suTemp; //-- ������ ���� ���ڿ��� ���� ����
		String [] suArr; //-- ������ ���� ���� �����ؼ� ����Ÿ������ ��������.


		// �л��� ��ŭ �л� ��ü �����ؼ� �迭 ���
		for (int i = 0;i<rec.length ;i++ )
		{
			rec[i] = new Record();
		}

		for (int i = 0;i<inwon ;i++ )
		{
			do
			{
				System.out.printf("%d��° �л��� �й� �̸� �Է�(���� ����) : ",i+1);
				temp = br.readLine(); // "2280946 ȫ����"
				arr = temp.split("\\s");// ���� �����ؼ� ��ƶ�.
			}
			while (arr.length != 2);

			rec[i].hak = arr[0];
			rec[i].name = arr[1];
				//----------------------------------------------------------------
			do
			{
				System.out.print("���� ���� ���� ���� �Է�   (���� ����) : ");
				suTemp = br.readLine(); //-- �߰� ���鶧���� ���ڿ��� ����
				suArr = suTemp.split("\\s"); //--���鱸���ؼ� int������ ��ȯ�ѵ� ����.				
			}
			while (suArr.length != 3);
					//-------------------------------------------------------------
			
			rec[i].kor = Integer.parseInt(suArr[0]);
			rec[i].eng = Integer.parseInt(suArr[1]);
			rec[i].mat = Integer.parseInt(suArr[2]);

			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			rec[i].avg = rec[i].tot / 3;
		}				
				
	}//end input()


	@Override
	public void print() //-- ��� ���
	{	
		for (int i = 0;i<rec.length ;i++ )
		{
			System.out.println();
			System.out.println("�й�       �̸�   �������� �������� �������� ���� ���");
			System.out.printf("%-8s %4s " , rec[i].hak, rec[i].name);
			System.out.printf("%8d %8d %8d " , rec[i].kor, rec[i].eng, rec[i].mat);
			System.out.printf("%4d %4d", rec[i].tot, rec[i].avg);
			System.out.println();
			System.out.printf("%25s %8s %6s",panjung(rec[i].kor),panjung(rec[i].eng),panjung(rec[i].mat));
		}
		System.out.println();

	}//end print()


	// ���������� ��޿� ���� ������ ������ �޼ҵ�
	private String panjung(int s)
	{
		String result = "���� �Ұ�";
		//int s = score; //--�̵��� ���ص� ��.

		if (s >= 90)
			result = "��";
		else if (s>=80)
			result = "��";
		else if (s>=70)
			result = "��";
		else if (s>=60)
			result = "��";
		else 
			result = "��";

		return result;
	}//end panjung
}


//main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ����
public class Test123
{
	public static void main(String[] args) throws IOException
	{
		SungjukImpl ob = new SungjukImpl();

		// ���� �ذ� �������� �ۼ��ؾ� �� ob ����
		ob.set();
		ob.input();
		ob.print();
	}
}