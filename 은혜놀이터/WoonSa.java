import java.util.Scanner;
import java.util.Random;

import java.util.ArrayList;


class WoonSa
{
	public static void main(String[] args)
	{
		//�ֿ� ���� ����
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		String user; //-- �������
		String userY;// ����� ������� �´�?
		ArrayList <String> strAli = new ArrayList <String>();
		ArrayList <String> strAli2 = new ArrayList <String>();
		ArrayList <String> strAli3 = new ArrayList <String>();

		String [] colors = {"����","���","�ʷ�","�Ķ�","����","�Ͼ�","����"};
		String [] mddm = {"����", "����", "����", "����", "���", "��", "����", "����"};

		int rdNum;// ���° � ����Ұ���
		int rdNum2;// ���° ����� �� ����Ұ���

		String user2; //�������Դϱ�?

		//2.�������� ������ � �迭���� ���ڿ� ������ֱ�
		strAli.add("���� ������ ������\n����� ���ΰ� ������̴ϴ� ����~!\n ������ ���ٸ� ������ 3�Ⱓ�� �ַ��Դϴ�!!");
		strAli.add("���ִ°� ���ּ���!");
		strAli.add("���ָ� ���� �����ּ���!�׷��� ���� ���� �Ͼ�ϴ�.");
		strAli.add("������ ���ָ� ���ϴ� ���� ���� �̷�����ϴ�!");
		
		for (String s: colors)
		{
			strAli2.add(s);
		}
		

		rdNum = rd.nextInt(strAli.size());
		rdNum2 = rd.nextInt(strAli2.size());
		//System.out.println(mddm.length);
		int rdNum3 = rd.nextInt(mddm.length);
		//System.out.println(rdNum3);
		

	

		//1.����ڿ��� �������(19980606) 8�ڸ� �ޱ�
		while (true)
		{
			do
			{
				System.out.print("�������(ex.19980606) 8�ڸ��� �Է��� �ּ��� : " );
				user = sc.next();
				if (user.length()!=8)
				{
					System.out.print("8�ڸ��� ����.�á��Է����ּ���! :");
					user = sc.next();
				}
				System.out.printf("�Է��Ͻ� ���� ������ϡ�%s���� �½��ϱ�? :",user);
				userY = sc.next();
			}
			while (!userY.equals("y")&&!userY.equals("Y"));
			
			System.out.print("����� ������ �Ҽ� �Դϱ� ? (Y/N) : " );
			user2 = sc.next();
			

			if (user2.equals("y") ||user2.equals("Y") )
			{	
				System.out.println("\n\na�ڡڡڴ���� ������ ���? �αٵα�~!!�ڡڡ�");
				System.out.println("[������ ����]\n ������ �����ϸ� ���ù����� ���� �Ͼ�ϴ�!");
				System.out.print("����� " + mddm[rdNum3] +" ���� ");
				System.out.println(strAli.get(rdNum));
				System.out.print("����� ����� ���� ?" + strAli2.get(rdNum2)+"�Դϴ�!\n\n");
			}
			else
			{
				strAli3.add("����� ���׿��� ���� ������ ������\n����� ���ΰ� ������̴ϴ� ����~!\n ������ ���ٸ� ������ 3�Ⱓ�� �ַ��Դϴ�!!");
				strAli3.add("����� ���׿��� ���ִ°� ���ּ���!");
				strAli3.add("����� ���׿��� �����̸� ��������!!�׷��� ���� ���� �Ͼ�ϴ�.");
				strAli3.add("����� ���׿��� ������ ���ָ� ���ϴ� ���� ���� �̷�����ϴ�!");

				int rdNum4 = rd.nextInt(strAli3.size());
				
				System.out.println("\n\na�ڡڡڴ���� ������ ���? �αٵα�~!!�ڡڡ�");
				System.out.println("[������ ����]\n ������ �����ϸ� ���ù����� ���� �Ͼ�ϴ�!");
				System.out.println(strAli3.get(rdNum));
				System.out.println();
				System.out.println();
			}
		
		}
	}	
}