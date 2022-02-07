/*===================================================
���� �÷��� �����ӿ�ũ(Collection Framework) ����
====================================================*/

// Test165 Ŭ������ �ϼ��Ͽ� ���� ����� ���� ���α׷��� �����Ѵ�.

/*
���� ��)
	
	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 1
	
	1��° ��� �Է� : ������
	1��° ��� �Է� ���� ~!!!
	��� �Է� ���(Y/N)? : y

	2��° ��� �Է� : ���̻�
	2��° ��� �Է� ���� ~!!!
	��� �Է� ���(Y/N)? : N			// Y/N ��ҹ��� ���� x

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 2

	[���� ��ü ���]
		������
		���̻�
	���� ��ü ��� �Ϸ� ~!!!

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 3

	�˻��� ��� �Է� : ���̻�

	[�˻� ��� ���]
	�׸��� �����մϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 3

	�˻��� ��� �Է� : �Ӽҹ�

	[�˻� ��� ���]
	�׸��� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 4

	������ ��� �Է� : ȫ����

	[���� ��� ���]
	�׸��� �������� �ʾ� ������ �� �����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 4

	������ ��� �Է� : ������

	[���� ��� ���]
	������ �׸��� �����Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 5

	������ ��� �Է� : ��μ�

	[���� ��� ���]
	������ ����� �������� �ʽ��ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 5

	������ ��� �Է� : ���̻�
	������ ���� �Է� : ������

	[���� ��� ���]
	������ �Ϸ� �Ǿ����ϴ�.

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 2

	[���� ��ü ���]
		������
	���� ��ü ��� �Ϸ� ~!!!

	[�޴� ����]
	1. ��� �߰�
	2. ��� ���
	3. ��� �˻�
	4. ��� ����
	5. ��� ����
	6. ����
	>> �޴� ����(1 ~ 6) : 6

	���α׷� ����~!!!
	����Ϸ��� �ƹ� Ű��...
*/
import java.util.Vector;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Menus //�� �ϼ� Ķ����Ŭ���� ���� ���ȭ�� ���.
			//   ���ڴ� ���� ����ϱ� �����. sunday�� �Ͽ���������
			//   �ݹ� ��������� �װ� 1���� 0������ �򰥸��� ������
			//   �̷��� ���ȭ�� ���� Ȱ���ϴ°���.
			//   ȥ�� �ڵ��� �ƴ��ݽ�.
{
	public static final int E_ADD = 1;  //-- ��� �߰�
	public static final int E_DISP = 2; //-- ��� ���
	public static final int E_FIND = 3; //-- ��� �˻�
	public static final int E_DEL = 4;  //-- ��� ����
	public static final int E_CHA = 5;  //-- ��� ����
	public static final int E_EXIT = 6; //-- ����

}

public class Test165
{
	// �ֿ� �Ӽ� ���� �� �ϼ�
	private static final Vector<Object> vt;		//-- �ڷᱸ��(�ڷ�����)
	private static BufferedReader br;			//-- �Է� �� Ȱ��
	private static Integer sel;					//-- ���� ��
	private static String con;					//-- ��� ����

	// static �ʱ�ȭ ��
	static
	{
		// Vector �ڷᱸ�� ����
		vt = new Vector<Object>();


		//BufferedReader Ŭ���� �ν��Ͻ� ����
		br = new BufferedReader(new InputStreamReader(System.in));


		// ����� �Է°� �ʱ�ȭ
		sel = 1;
		con = "Y";
	}

	// �޴� ��� �޼ҵ�
	public static void menuDisp() throws IOException
	{
		System.out.println("\n\t[�޴� ����]");
		System.out.println("\t1. ��� �߰�");
		System.out.println("\t2. ��� ���");
		System.out.println("\t3. ��� �˻�");
		System.out.println("\t4. ��� ����");
		System.out.println("\t5. ��� ����");
		System.out.println("\t6. ����");
		menuSelect(); //�޴� ���� �޼ҵ� ȣ��.
		//�׽�Ʈ.
		//System.out.println(sel);
	}

	// �޴� ���� �޼ҵ�
	public static void menuSelect() throws IOException, NumberFormatException
	{
		System.out.print("\t>> �޴� ����(1 ~ 6): ");
		sel = Integer.parseInt(br.readLine());
		menuRun();
	}
	
	// ���õ� �޴� ���࿡ ���� ��� ȣ�� �޼ҵ�


	public static void menuRun() throws IOException
	{
		switch (sel)
		{
		case Menus.E_ADD: addElement(); break;
		case Menus.E_DISP: dispElement(); break;
		case Menus.E_FIND: findElement(); break;
		case Menus.E_DEL: delElement(); break;
		case Menus.E_CHA: chaElement(); break;
		case Menus.E_EXIT: exit(); break;
		default :System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
	}
	
	// �ڷᱸ���� ��� �߰�(�Է�) �޼ҵ�
	public static void addElement() throws IOException
	{
		int n =0;
		do
		{
			n++;
			
			System.out.printf("\n\n\t%d��° ��� �Է� : ",n);
			vt.add(br.readLine());
			System.out.printf("\t%d��° ��� �Է� ���� ~!!!\n",n);
			System.out.print("\t��� �Է� ���(Y/N)? : ");
			con = br.readLine();
			//System.out.println(con);
			
		}
		//while (con != "y" && con != "Y");// �̰ɷδ� �ȵ� equals() ����.
		// con�� String ��ü �� ����Ÿ��
		// ����Ÿ�Գ��� ���� ��, equals() �޼ҵ� ����ؾ� ���ڿ� ��!!��
		while (con.equals("y") || con.equals("Y"));
	
		menuDisp(); //-- �޴� ���� �޼ҵ� ���
	}

	
	
	// �ڷᱸ�� ��ü ��� ��� �޼ҵ�
	public static void dispElement() throws IOException
	{
		System.out.println("\n\t[���� ��ü ���]");
		for (Object obj:vt)
		{

			System.out.println("\t"+(String)obj); //�ٿ�ĳ����
		}
		System.out.println("\t���� ��ü ��� �Ϸ� ~!!!");

		System.out.println("\t���Ϳ� ��Ұ� �����ϴ�.");
		

		menuDisp();//-- �޴� ���� �޼ҵ� ���
	}


	// �ڷᱸ�� �� ��� �˻� �޼ҵ�
	public static void findElement() throws IOException
	{
		System.out.print("\n\n\t�˻��� ��� �Է� : ");
		if (vt.indexOf(br.readLine()) >-1) //indexOf() �� ������ ���� ��ȯ
		// contains �ᵵ��. .. .
		{
			System.out.println("\n\n\t[�˻� ��� ���]");
			System.out.println("\t�׸��� �����մϴ�.");
		}
		else
		{
			System.out.println("\n\n\t[�˻� ��� ���]");
			System.out.println("\t�׸��� �������� �ʽ��ϴ�.");
		}
		menuDisp();//-- �޴� ���� �޼ҵ� ���
	}

	// �ڷᱸ�� �� ��� ���� �޼ҵ�
	public static void delElement() throws IOException
	{
		System.out.print("\n\n\t ������ ��� �Է�: ");

		String strUser = br.readLine();
		int delNum = vt.indexOf(strUser);
		System.out.println(delNum);
		
		if (delNum <=-1)
		{
			System.out.println("\t[���� ��� ���]");
			System.out.println("\t�׸��� �������� �ʾ� ������ �� �����ϴ�.");
		}
		else
		{
			System.out.println("\t[���� ��� ���]");
			vt.removeElementAt(delNum); // ����
			System.out.println("\t"+strUser + " �׸��� ���� �Ǿ����ϴ�.");
		}
		menuDisp();//-- �޴� ���� �޼ҵ� ���
	}


	// �ڷᱸ�� �� ��� ����(����) �޼ҵ�
	public static void chaElement() throws IOException
	{
		System.out.print("\n\n\t������ ��� �Է� : ");
		int pre = vt.indexOf(br.readLine());

		if (pre>=0)
		{
			System.out.print("\n\t������ ���� �Է�: ");
			String after = br.readLine(); //-- ������ ���ڿ� ����.
			vt.setElementAt(after,pre);
			System.out.println("\t[���� ��� ���]");
			System.out.println("\t������ �Ϸ�Ǿ����ϴ�.");
		}
		else
		{
	
			System.out.println("\t[���� ��� ���]");
			System.out.println("\t������ ����� �������� �ʽ��ϴ�.");
		}
		menuDisp();//-- �޴� ���� �޼ҵ� ���
		
	}

	// ���α׷� ���� �޼ҵ� �� �ϼ�
	public static void exit() 
	{
		System.out.println("\n\t���α׷� ����~!!!");
		System.exit(-1);
		// exit() ���� �ִ� �޼ҵ�
		// ���α׷� �����Ѵٴ� ��.
	}
	


	
	//main() �޼ҵ� �� �ϼ�
	public static void main(String[] args) throws IOException, NumberFormatException
	{
		
		do
		{
			menuDisp();
			menuSelect();
			menuRun();
		}
		while (true);
		

	}
}


//============================================================
/*
	//������.
	Menus()
	{
		//�޴� ����ϱ� �޼ҵ� ȣ��
	}// end ������


	//�޴�����ϰ� ����� �Է� �ޱ�
	private int userWrite() 
	{
		int n; //-- ����� �Է°�.
		try
		{
			//BufferedReader ����� �ν��Ͻ� ����
			BufferedReader br = new BufferedReader(InputStreamReader(System.in));
			n = Integer.parseInt(br.readLine());
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		return n;
	}//userWrite()

	//1�� ��� �߰��ϱ�
	//2�� ��� ����ϱ�
	//3�� ��� �˻��ϱ�
	//4�� ��� �����ϱ�
	//5�� ��� �����ϱ�
	//6�� �����ϱ�
	//���� ��� ����ϱ�
	private void print()
	{
	}//end print()
	�ϴ� ���� �����Ѱ�.
	*/
//============================================================