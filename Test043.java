/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/

// switch �� �ǽ�

/*
�� ���� ���ù��̶� �ϸ�. switch �� ������ ���� ����
   ���� ���� ������ ���� �������� �б��� �� ����ϴ�
   �����̴�.

�� ���� �� ����
   switch(����)
   {
	   case ���1 : ����1; [break;]		break ���߰� (����������.)
	   									continue (�޺κ� �����ϰ�) ����ض�
	   case ���2 : ����2; [break;]
	       :              :
	   [default : ����n+1; [break;]]		//[]�� ��������!
	}										//if���� else�� ���
											//�ݵ�� ����Ʈ ����
											//ó������������ ����
											// ��¿��� ���������� ����.

	switch ���� �����ġ��� case�� ���������
	byte, short, int, long ���̾�� �Ѵ�.
	//���������� ������Ƽ�����ĸ�

	case �� �ڿ� ��break;���� ���� ������ ���
	���� case ���� ������ ����ؼ�(�̾) �����ϰ� �ȴ�. �� (�⺻��)
	��break;���� ������ ���
	�ش� �������� ������ ���� �� switch ���� ����������. �� (�Ϲݸ�)

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 
public class Test043
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name; //--�̸�
		int kor, eng, mat, sum; //--����,����,����,����
		//double avg; //--��� byte, short, int, long ���̾�� �Ѵ�.(switch)
		int avg;
		char level; //--���


		System.out.print("�̸� �Է� : ");
		name = br.readLine();

		System.out.print("���� ���� �Է� : ");
		kor = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");
		eng = Integer.parseInt(br.readLine());

		System.out.print("���� ���� �Է� : ");
		mat = Integer.parseInt(br.readLine());

		sum = kor + eng + mat; //--����
		//avg = sum / 3.0;
		avg = sum / 3; //--���
		level = 'F';

		switch (avg/10)
		{
			case 10: case 9: level = 'A' ; break;
			case 8: level = 'B' ; break;
			case 7 : level = 'C' ; break;
			case 6: level = 'D' ; break;
			//default : level = 'F'; break;
		}



/*		switch (avg/10)
		{
			case 10: level = 'A' ; break;
			case 9 : level = 'A' ; break;
			case 8: level = 'B' ; break;
			case 7 : level = 'C' ; break;
			case 6: level = 'D' ; break;
			default : level = 'F'; break;
		}
*/
/*		switch (avg/10)
		100/10 = 10
		99 /10 = 9
		89 /10 = 8

		{
			case 10: level = 'A' ; break;
			case 9 : level = 'A' ; break;
			case 8: level = 'B' ; break;
			case 7 : level = 'C' ; break;
			case 6: level = 'D' ; break;
			case 5 : level = 'F' ; break;
			case 4: level = 'F' ; break;
			case 3 : level = 'F' ; break;
			case 2: level = 'F' ; break;
			case 1 : level = 'F' ; break;
			case 0: level = 'F' ; break;
		}
*/
		
		//case�ȿ� ������ ������Ƽ�길 ���µ� 
		//���� ��������?
/*		switch (avg)
		{
		case 100:level = 'A'; 
		case 90:level = 'A'; 
		case 89:level = 'B'; 
		case 80:level = 'B'; 
		case 79:level = 'C';
		case 70:level = 'C'; 
		case 69:level = 'D'; 
		case 60:level = 'D'; 
		default : level = 'F';
		}
*/
		System.out.printf(">>�̸��� %s, ������ %d, ����� %d, ����� %c�Դϴ�.",name,sum,avg,level);


	}

}