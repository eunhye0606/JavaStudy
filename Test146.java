/*=====================================
���� �ڹ��� �ֿ�(�߿�) Ŭ���� ����
======================================*/

//Calendar Ŭ����

// �� �ǽ� ����
//    ������ �������� �Է¹޴� ��¥��ŭ ���� ��, ��, ��, ������
//    Ȯ���Ͽ� ����� ����ϴ� ���α׷��� �����Ѵ�.
//    �� ���� ��¥�� �������� �� �� ���ϴ� ���� �޼ҵ� Ȱ��
//       �� 


// ���� ��)
// ���� ��¥ : 2022-2-3 �����
// �� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

//=========[Ȯ�� ���]=========
//200�� �� : xxxx-xx-xx x����
//=============================
//���....


import java.util.Calendar;
import java.util.Scanner;


public class Test146
{
	public static void main(String[] args)
	{
	
	//Scanner Ŭ���� ��� �ν��Ͻ� ����
	Scanner sc = new Scanner(System.in);
	
	//Calendar Ŭ���� ��� �ν��Ͻ� ����
	Calendar now = Calendar.getInstance();


	//�ֿ� ���� ����
	int nalsu; //-- ����ڷκ��� �Է¹��� �� ��
	int y,m,d,w; //-- ��, ��, ��, ����
	String [] week = {"��","��","ȭ","��","��","��","��"};


	// ������ ��, ��, ��, ���� Ȯ��(�������� : get())
	// �� Calendar Ŭ���� ��� �ν��Ͻ��� �����ߴµ�..
	// YEAR�̳� MONTH���� ������ �� ��
	// �տ� Calendar�� ������ �ɱ�????????????????
	// �ϴ� �տ� Calendar ���ָ� ������ ���� ��
	// ã�� �� ����.
	// �� Calendar Ŭ������ �߻�Ŭ������
	//    �ν��Ͻ��� ������ �� ����.
	y = now.get(Calendar.YEAR);
	m = now.get(Calendar.MONTH)+1;
	d = now.get(Calendar.DATE);
	w = now.get(Calendar.DAY_OF_WEEK);

	// ������ ��, ��, ��, ���� Ȯ�ΰ�� ���
	System.out.println("���� ��¥ : " + y+ "-" + m+"-"+d+" " + week[w-1] + "����");
	

	do
	{
		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		nalsu = sc.nextInt();
	}
	while (nalsu<1);

	// check~!!
	now.add(Calendar.DATE,nalsu);

	//��� ���
	System.out.println();
	System.out.println("=========[Ȯ�� ���]=========");
	System.out.printf("%d�� �� : %tF %tA",nalsu,now,now); //check~!!
	// ��¥ ��ü�� �޴� : %t
	// %t �ڿ� �ɼǿ� ���� �� �����ϴ��� ����.
	System.out.println();
	System.out.println("=============================");



/* ���װ� �Ѱ�
		// Calendar ����� �ν��Ͻ� ����.
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();


		//�ֿ� ���� ����
		int y,m,d,w;
		String week;
		int user; //-- ����� �Է� �� ��
		String [] weekArr = {"�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
		

		//add()�� ����ϸ鼭 �̰� �Ⱦ��� ��.
		y = cal.get(Calendar.YEAR);
		m = cal.get(Calendar.MONTH)+1;
		d = cal.get(Calendar.DATE);
		w = cal.get(Calendar.DAY_OF_WEEK);
		week = weekArr[cal.get(Calendar.DAY_OF_WEEK)];
		

		//�׽�Ʈ
		//System.out.println(y + "-" + m + "-" +d + " " +w);
		
		switch (w)
		{
		case 1: week = "�Ͽ���"; break;
		case 2: week = "������"; break;
		case 3: week = "ȭ����"; break;
		case 4: week = "������"; break;
		case 5: week = "�����"; break;
		case 6: week = "�ݿ���"; break;
		case 7: week = "�����"; break;
		default : week = "�� �� ����.";
		}
		
		//�׽�Ʈ
		//System.out.println(y + "-" + m + "-" +d + " " +week);

		//�����ϱ�
		cal.set(y,m,d);


		//Scanner ��� �ν��Ͻ� ����.
		Scanner sc = new Scanner(System.in);

		//����ڿ��� ����
		System.out.print("�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : ");
		user = sc.nextInt();
		//System.out.println(user);

		cal2.add(Calendar.DATE,user);
		

	

		


		// �� �� ���ϱ�


		// ��� ���
		System.out.println();
		System.out.print("���� ��¥ : "+(cal.get(Calendar.YEAR))+"-"+(cal.get(Calendar.MONTH))+"-"+(cal.get(Calendar.DATE))+" "+(weekArr[cal.get(Calendar.DAY_OF_WEEK)]));
		System.out.println();
		System.out.println("=========[Ȯ�� ���]=========");
		System.out.print(user+"�� ��  : "+(cal2.get(Calendar.YEAR))+"-"+(cal2.get(Calendar.MONTH))+"-"+(cal2.get(Calendar.DATE))+" "+(weekArr[cal2.get(Calendar.DAY_OF_WEEK)]));
		System.out.println();
		System.out.println("=============================");

*/
	}
}
/*
���� ���� ���
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

���� ��¥ : 2022-2-3 �ݿ���
=========[Ȯ�� ���]=========
200�� ��  : 2022-7-22 ȭ����
=============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
���� ��¥ : 2022-2-3 �����
�� �� ���� ��¥�� Ȯ���ϰ��� �Ͻʴϱ�? : 200

=========[Ȯ�� ���]=========
200�� �� : 2022-08-22 ������
=============================
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/