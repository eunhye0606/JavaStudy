import java.util.ArrayList;
import java.util.Random;

class KingGame
{
	public static void main(String[] args)
	{
		String king; //-- ���̸� ���� ����
		String noYe1;// -- �뿹1
		String noYe2;//-- �뿹2
		int rdN1;
		int rdN2;

		ArrayList <String>ali = new ArrayList<String>();
		String [] todo = {"Ű���ϼ���!" , "����������!" , "�Ӹ�ī���� ����������!"};
		String [] mddm = {"ü����", "������","������","������","������","������","������","��"};
		Random rd = new Random();

		
		for (String s:mddm)
		{
			ali.add(s);
		}
		rdN1 = rd.nextInt(todo.length);//0~2
		rdN2 = rd.nextInt(mddm.length);

		

		
		king = ali.get(rdN2);
		ali.remove(king);
		

		noYe1 = ali.get(rdN2);
		ali.remove(noYe1);
		noYe2 = ali.get(rdN2);
		ali.remove(noYe2);
		

		System.out.println("[�հ����� �����մϴ�.]");
		System.out.printf("�̹� ������ ���� %3s �� �Դϴ�.",king);
		System.out.printf("\n�뿹1���� %3s, �뿹2���� %3s �Դϴ�. ",noYe1,noYe2);
		System.out.println("\n�뿹���� �տ��Լ� ������� ������ �����ϼ���.");
		System.out.println("\n\n\t   [����]");
		System.out.printf("%3s�� %3s���� %s",noYe1,noYe2,todo[rdN1]);
		System.out.println();
		System.out.println();
		System.out.println();
	

	}
}
