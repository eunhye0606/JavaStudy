/*=====================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
======================================*/

//Calendar Ŭ����

/*
�� Calendar Ŭ������ �߻� Ŭ�����̱� ������ ��ü�� ������ �� ����.
   (�߻� Ŭ���� : �̿ϼ��� Ŭ����)

   Calendar ob = new Calendar();
   �� �̿� ���� ������ ���� �ν��Ͻ� ���� �Ұ�.



�� Calendar Ŭ���� ��ü(�ν��Ͻ�)�� ������ �� �ִ� ���.
    
   1. Calendar ob1 = Calendar.getInstance();
                              -------------
							  ���� �޼ҵ�, staitc �޼ҵ�
   
   2. Calendar ob2 = new GregorianCalendar();
                         ��GregorianCalendar��� Ŭ������ �ְڱ���.
						 ��GregorianCalendarŬ������ Calendar�� �ڽ� Ŭ�����̰ڱ���.
						 ��� ĳ�����̱���.
						 ��GregorianCalendarŬ������ Calendar�� �߻�޼ҵ带 �������̵��߱���.

   3. GregorianCalendar ob3 = new GregorianCalendar();
      
   (�� GregorianCalendar : Calendar Ŭ������ ���� Ŭ����)
*/


// ��, ��, ��, ������ Calendar ��ü�κ��� �����ͼ� ���

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Test144
{
	public static void main(String[] args)
	{
		//Calendar Ŭ���� ��� �ν��Ͻ� ����
        //Calendar ob = new Calendar();
		// �� �߻� Ŭ������ �Ұ�.
		Calendar rightNow = Calendar.getInstance();
		//-- ��~! �޷��� �������.

		

		// ������ �޷�(Calendar) �ν��Ͻ��� ����
		// ��¥ ���� ������ �� �� �ִ� �޼ҵ�
		// �� ��get()��
		//     cf) �����ؼ� �޷��� ����°� ��set()��
		int y = rightNow.get(Calendar.YEAR);
		//           -------------
		//          static�̴ϱ� Ŭ������ ����� ����
		//          YEAR �빮�ڷ� ���� ���� fanal
		System.out.println(y);
		//--==>>2022


		int m = rightNow.get(Calendar.MONTH)+1; //check~!!
		//                                 ---
		//                            ���� �迭�ε��� ó��!
		//                            0�̸� 1��, 5�� 6��
		System.out.println(m);
		//--==>>2

		int d = rightNow.get(Calendar.DATE);
		System.out.println(d);
		//--==>>3



		int w = rightNow.get(Calendar.DAY_OF_WEEK);
		System.out.println(w);
		//--==>>5

		// � �������� ��� �ƴ���?
		// �׽�Ʈ
		/*
		System.out.println("SUNDAY"+Calendar.SUNDAY);
		System.out.println("MONDAY"+Calendar.MONDAY);
		System.out.println("TUESDAY"+Calendar.TUESDAY);
		System.out.println("WEDNESDAY"+Calendar.WEDNESDAY);
		System.out.println("THURSDAY"+Calendar.THURSDAY);
		System.out.println("FRIDAY"+Calendar.FRIDAY);
		System.out.println("SATURDAY"+Calendar.SATURDAY);
		*/
		/*
		SUNDAY1
		MONDAY2
		TUESDAY3
		WEDNESDAY4
		THURSDAY5
		FRIDAY6
		SATURDAY7
		*/

		System.out.println(y + "-" + m + "-" + d + " " + w);
		//--==>>2022-2-3 5

		String week = "";
		switch(w)
		{
		    /*
			case Calendar.SUNDAY: week = "�Ͽ���";break;
			case Calendar.MONDAY: week = "������";break;
			case Calendar.TUESDAY: week = "ȭ����";break;
			case Calendar.WEDNESDAY: week = "������";break;
			case Calendar.THURSDAY: week = "�����";break;
			case Calendar.FRIDAY: week = "�ݿ���";break;
			case Calendar.SATURDAY: week = "�����";break
			*/
			case 1: week = "�Ͽ���";break;
			case 2: week = "������";break;
			case 3: week = "ȭ����";break;
			case 4: week = "������";break;
			case 5: week = "�����";break;
			case 6: week = "�ݿ���";break;
			case 7: week = "�����";break;

		}
		System.out.println(y + "�� " + m+ "�� " + d +"�� " + week);
		//--==>>2022�� 2�� 3�� �����



		System.out.println("///////��� 2///////");

		//Calendar Ŭ���� ��� �ν��Ͻ� ����
		Calendar rightNow2 = new GregorianCalendar();

		String[] week2 = {"�Ͽ���", "������", "ȭ����", "������","�����","�ݿ���","�����"};


		//�޷��� ��¥ ���� �� ��set()�� �޼ҵ� Ȱ��
		rightNow2.set(2022,5,20); // 6�� -- ��-1�� check~!! �ε���!

		System.out.println(rightNow2.get(Calendar.DAY_OF_WEEK));
		//--==>>2

		System.out.println(week2[rightNow2.get(Calendar.DAY_OF_WEEK)-1]);
		//--==>>������




	}
}