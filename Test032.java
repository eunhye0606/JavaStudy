/*==============================
   ���Ῥ����(Operator)����
=================================*/

//���� ������ == ���� ������

//����ڷκ��� ������ ������ �Է¹޾�
//�Է¹��� ������... �������� ������� �Ǻ��Ͽ�
//�� ����� ����ϴ� ���α׷��� �����Ѵ�.
//��, �Է��� BufferedReader�� readLine()�� Ȱ���ϰ�
//���� �����ڸ� Ȱ���Ͽ� ������ ������ �� �ֵ��� �Ѵ�.

// ���� ��)
// ������ ���� �Է� : 2000
// 2000�� �� ����
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 2012
// 2021�� �� ����
// ����Ϸ��� �ƹ� Ű�� ��������...

// ������ ���� �Է� : 2022
// 2022�� �� ���
// ����Ϸ��� �ƹ� Ű�� ��������...

// �� 2���� 28�ϱ��� �ִ� �� �� ���
//		    29�ϱ��� �ִ� �� �� ����
// �� ������ �Ǻ� ����
//    ������ 4�� ����̸鼭 100�� ����� �ƴϰų�
//    400�� ����̸� �����̴�.
//    �׷��� ������ ����̴�.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Test032
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int year; // �Է��� ����
		String strResult; // �Ǻ� ���

		System.out.print("������ ���� �Է� : ");
		year = Integer.parseInt(br.readLine());


		strResult = year%4 == 0 && year%100 != 0 || year%400==0 ? "����": "���";
		System.out.printf("%d�� �� %s\n", year,strResult);



/*		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("������ ���� �Է� : ");

		int nUserYear; //����ڰ� �Է��� ��
		
		boolean yoonYear1, yoonYear2; //��������
		String strResult; //���� ���

		nUserYear = Integer.parseInt(br.readLine());


		yoonYear1 = ((nUserYear % 4) == 0) && ((nUserYear % 100) != 0);
		yoonYear2 = (nUserYear % 400) == 0;
		

		strResult = yoonYear1 ? "����" : (yoonYear2 ? "����" : "���");

		System.out.println(nUserYear + "��" + " �� " + strResult);
*/
	}
}

/*
������ ���� �Է� : 2000
2000�� �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

������ ���� �Է� : 2012
2012�� �� ����
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


������ ���� �Է� : 2022
2022�� �� ���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/