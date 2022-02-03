/*=====================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
======================================*/

//Calendar Ŭ����

/*
�� java.util.Calendar Ŭ������
   ��¥�� �ð��� ��ü �𵨸�ȭ �� Ŭ������
   ��, ��, ��, ����, ��, ��, �� ������
   �ð��� ��¥�� ���õ� ������ �����Ѵ�.
   �׸��� Calendar Ŭ������ �߻�Ŭ�����̹Ƿ� ���� ��ü�� ������ �� ������
   �������� �޼ҵ� ������ Calendar Ŭ������ ���� Ŭ������
   GregorianCalendar Ŭ������ ���ǵǾ� �ִ�.

   �ý������κ��� ���� �ý��� �ð� ������ ���� ��
   getInstance() ��� ����(static) �޼ҵ带 �̿��Ͽ� ��ü�� ������ �� �ִ�.
   ������ Calendar Ŭ���� ��ü�� �ý����� ���� ��¥�� �ð� ������ ������,
   �� ��ü�� �����Ǹ� �����ִ� �ð� ��������
   get() �޼ҵ带 �̿��Ͽ� ���� ������(�����) �� �ִ�.

   getInstance() �޼ҵ�� ���������� GregorianCalendar ��ü�� �����Ͽ�
   �����ֱ� ������ GregorianCalendar ��ü�� ���� �����Ͽ� �ð� ������
   ���� ���� �ִ�.
*/

// �� �ǽ� ����
//    ����ڷκ��� ��, ���� �Է¹޾�
//    �޷��� �׷��ִ�(����ϴ�) ���α׷��� �����Ѵ�.
//    ��, ����޷��� �ƴ϶� Calendar Ŭ������ Ȱ���Ͽ� �ۼ��� �� �ֵ��� �Ѵ�.


// ���� ��)
// ���� �Է� : 0
// ���� �Է� : 2022
// �� �Է� : -2
// �� �Է� : 16
// �� �Է� : 7

/*
	[2022�� 7��]
��  ��  ȭ  ��  ��  ��  ��
==========================
                     1   2
3   4   5   6   7   8   9
				:
				:
31
==========================
����Ϸ��� �ƹ� Ű�� ��������...
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test145
{
	public static void main(String[] args) throws IOException
	{
		//BufferedReader ����� �ν��Ͻ� ����. �����ϰ� �� ���� �Ŵϱ�.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//GregorianCalendar ����� �ν��Ͻ� ���� �����ϰ� ���� �޷��� �����ҰŶ�.
		Calendar cal = Calendar.getInstance();



		//�ֿ� ���� ����
		int y, m;			//-- ��, ��
		int w;				//-- ����
		int i;				//-- ���� ����


		// ����� ���� �ޱ�, 1�⺸�� ���� �� �Է� �� �ٽ�
		do
		{
			System.out.print("���� �Է� : ");
			y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		// ����� �� �ޱ�, 1������ �۰ų� 12������ ũ�� �� �ٽ�
		do
		{
			System.out.print("�� �Է� : " );
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12); // �ΰ� �̻��� ���� ���� �� ��������



		// ����ڷκ��� �Է¹��� ��(y), ��(m)�� �̿��Ͽ�
		// �޷��� ��¥ ����
		cal.set(y,m-1,1);
		//            --
		//-- �� ���� �� �Է°�(m)�� �״�� ����ϴ� ���� �ƴ϶�
		//   �Է°����� 1�� �� ������ ���� �����ؾ� �Ѵ�.
		//-- �� ���� �� �Է¹��� ��, ���� �ش��ϴ� 1�Ϸ� �����ؾ� �Ѵ�.


		//���õ� �޷��� ��¥�κ��� ���� ��������.
     	w = cal.get(Calendar.DAY_OF_WEEK);

		// Ȯ��
		//System.out.println("����� �޷� ���� ���� : " + w);
		//--==>>���� �Է� : 2022
		//		�� �Է� : 6
		//		����� �޷� ���� ���� : 4 �� 2022�� 6�� ���� �� ������ �� 2022�� 6�� 1�� �� ������


		//��� ��� �� �޷� �׸���
		System.out.println();
		System.out.println("\t[ " + y + "��" +m+ "�� ]\n");
		System.out.println("  ��  ��  ȭ  ��  ��  ��  ��");
		System.out.println("=============================");

		//���� ���� �ڡڡڡڡ� �̰� ���߳� ~!!
		for (i = 1;i<w ;i++ )
		{
			System.out.print("    "); //���� 4ĭ �߻�
		}
		// �׽�Ʈ
		//System.out.println("    1");

		//Calendar Ŭ���� ��getActualMaximum()�� �޼ҵ� check~!!
		//                  �ý��ۿ��� �ش� ��¥�� ������ ��¥
		//                  �������ȵ�������.����
		for (i = 1;i<=cal.getActualMaximum(Calendar.DATE) ;i++ )
		{
			System.out.printf("%4d",i);
			w++; // -- �ݺ����� �����ϸ� ��¥�� ���� �� �� ����
			     //    ���ϵ� �Բ� ������ �� �ֵ��� ó��.

			if (w%7 == 1) // -- ������ ������ �Ͽ����� �� �� ����
			              //    ���� �� ��µ� �� �ֵ��� ó��.
			{
				System.out.println();
				
			}
		}
		if (w%7!=1) //-- �Ͽ��� ������ ������� �ʾ��� ��츸
		            //-- ���� ���� �ٽ� �����ϱ�!!!!!!!!!!!!!!!
		{
			System.out.println();
		}
		/*
		���� �Է� : 2022
�� �Է� : 4

        [ 2022��4�� ]

  ��  ��  ȭ  ��  ��  ��  ��
=============================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
							  �� ���� ���� ��°�ұ��~~
=============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

             ��
���� �Է� : 2022
�� �Է� : 4

        [ 2022��4�� ]

  ��  ��  ȭ  ��  ��  ��  ��
=============================
                       1   2
   3   4   5   6   7   8   9
  10  11  12  13  14  15  16
  17  18  19  20  21  22  23
  24  25  26  27  28  29  30
=============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/


		System.out.println("=============================");



















		/*
		���װ� �Ѱ�
		//BufferedReader ����� �ν��Ͻ� ����.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//GregorianCalendar ����� �ν��Ͻ� ����
		Calendar cr = new GregorianCalendar();
		// ���� �迭
		String [] week = {"�Ͽ���", "������","ȭ����","������","�����","�ݿ���","�����"};
		int y,m; //-- ����ڿ��� �Է¹��� ��, ��
		int lastM; // -- ������� �޿��� ������ ��

		


		//����ڿ��� �Է� �ޱ�
		do
		{
			System.out.print("���� �Է� : ");
		    y = Integer.parseInt(br.readLine());
		}
		while (y<1);

		do
		{
			System.out.print("�� �Է� : ");
			m = Integer.parseInt(br.readLine());
		}
		while (m<1 || m>12);
		

		
		//��¥ ����

		cr.set(y,m-1,1);


		//������ �˱�
		//�׽�Ʈ
		System.out.println(cr.get(Calendar.DAY_OF_WEEK));
		//--==>>3
		//System.out.println("����� ���� ���� : " + week[cr.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>>ȭ����
			
		int userWeek = cr.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(userWeek);

		lastM = cr.getActualMaximum(Calendar.DATE);
		//�׽�Ʈ
		//System.out.println(lastM);

		//���
		System.out.println(); // ����
		System.out.printf("\t\t[%d�� %d��]\n",y,m);
		
		for (String str:week)
			System.out.printf(" %s",str);
		System.out.println();
		System.out.println("=================================================");

		//��¥ ���
		for (int k = 1;k<=lastM ;k++ )
		{ 
			//���� �� ����� ???..�ڡڡڡڡ�
			System.out.printf(" %5d ",k);
			userWeek ++; 
			if (userWeek %7==0)
			{
				System.out.println();
			}
		}
		System.out.println();

		System.out.println("=================================================");
		

	*/

	}
}