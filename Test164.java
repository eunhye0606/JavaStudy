/*===================================================
���� �÷��� �����ӿ�ũ(Collection Framework) ����
====================================================*/
// ���� �ڷᱸ�� ��ü ���� �� ���� ��
// ����� ���� Ŭ���� Ȱ��
// �� �ڷ���


import java.util.Vector;

// ����� ���� Ŭ���� ���� �� �ڷ���ó�� Ȱ��
class MyData
{
	// �ֿ� �Ӽ� ���� �� �ֿ� ���� ����(��� ����)

	private String name; //-- �̸�
	private int age;	 //--����

	
	// ��� ������ ��� private�� �ܺο��� Ȱ���� ���ϴ�..
	//getXxx() �� getter
	//setXxx() �� setter

	//getter / setter ���� (��� ������ Ȱ���ϱ� ���� �޼ҵ� - ���)
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	//������(�Ű����� 2���� ������) �� ����� ���� ������
	public MyData(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// �� ����� ���� �����ڰ� ������ ���
	//    default �����ڰ� �ڵ����� ���Ե��� �ʱ� ������
	//    default ������ ������ �����ڸ� ����� ���� �����ڷ�
	//    �߰� �����ϰ� �Ǵ� ���� �Ϲ����� Ŭ���� ���� ����
	//    (��, �ݵ�� �����ؾ� �� �ʿ�� ����)

	// ������(�Ű����� ���� ������) �� ����� ���� ������
	public MyData()
	{
		name = "";
		age = 0;
	}

}
public class Test164
{
	public static void main(String[] args)
	{
		// ���� �ڷᱸ�� ����
		Vector<MyData> v = new Vector<MyData>();
		// ���� ���� v ����ǵ�
		// MyData ������ ���¸� ���� �ž�.

		// ���� �ڷᱸ�� v��
		// ȫ���� 13��/ ������ 7�� / ������ 78��
		// ��Ƴ���
		//��
		/*
		MyData st1 = new MyData();
		st1.setName("ȫ����");
		st1.setAge(13);
		v.add(st1);

		MyData st2 = new MyData();
		st2.setName("������");
		st2.setAge(7);
		v.add(st2);

		MyData st3 = new MyData();
		st3.setName("������");
		st3.setAge(78);
		v.add(st3);
		*/
//========================================================================
		//��
		/*
		MyData st1 = new MyData("ȫ����", 13);
		v.add(st1);
		MyData st2 = new MyData("������", 7);
		v.add(st2);
		MyData st3 = new MyData("������", 78);
		v.add(st3);
		*/
//========================================================================
		//��
		v.add(new MyData("ȫ����",13));
		v.add(new MyData("������",7));
		v.add(new MyData("������",78));
//========================================================================

		/*
		String [] strArr = {"ȫ����", "������","������"};
		int [] nArr = {13, 7, 78};
		//MyData mydata = new MyData();
		//MyData [] mdArr;
		//mdArr = new MyData[strArr.length];

		MyData[] mdArr = new MyData[strArr.length];

		for (int i = 0;i<mdArr.length ;i++ )
		{
			mdArr[i] = new MyData();
			mdArr[i].setName(strArr[i]);
			mdArr[i].setAge(nArr[i]);		
		}
		// ��������� MyData �ν��Ͻ� ������ ������ ����
		// �װ� ���Ϳ� �ֱ�
		for (MyData mydata:mdArr)
		{
			v.add(mydata);
		}
		*/
		/*
		String a;
		int b;
		
		for (int i =0;i<strArr.length ;i++ )
		{
			mdArr[i] = new MyData();
			for (String s:strArr)
			{
				a =mdArr[i].setName(s); // �̰ɷ� ��ȯ ����
				
			}
			for (int n:nArr)
			{
				b =mdArr[i].setAge(n);
			}

			v.add(a);
		}

		for (MyData m:mdArr)
		{
			v.add(m);
		}
		*/

		//���� ��� ��ü ���
		// ���� ��)
		// �̸� : ȫ����, ���� : 13
		// �̸� : ������, ���� :  7
		// �̸� : ������, ���� : 78
//=================================================================================	

		// ���
		// ��
		/*
		for (MyData obj:v) // ���׸� ǥ������ MyData�ϱ�!
		{
			System.out.printf("�̸�:%s, ����%d��\n",obj.getName(),obj.getAge());
		}
		System.out.println();
		*/
		/*
		�̸�:ȫ����, ����13��
		�̸�:������, ����7��
		�̸�:������, ����78��
		*/
//=================================================================================
		for (int i = 0;i<v.size() ;i++ )
		{
			System.out.printf("�̸�:%s, ����%d��\n",v.elementAt(i).getName(),v.elementAt(i).getAge());
											  //    -- 
											  //     -------------
											  //    ����.����ϳ�������.
											  //    MyDataŸ��
		}
		System.out.println();
		/*
		�̸�:ȫ����, ����13��
		�̸�:������, ����7��
		�̸�:������, ����78��
		*/
//=================================================================================
		//�� ���� ���� ���!!
		for (Object temp:v) //�̷����� ���¸� ��Ƽ� Object�� ������.
		{
			System.out.printf("�̸� %s , ���� %3d��\n",((MyData)temp).getName(), ((MyData)temp).getAge());// Object�� MyDataŸ������ �ٿ�ĳ����!!
		}
		System.out.println();

		/* 
		�����Ѱ�
		for (MyData m:v) // ���� �ڷᱸ������ �ϳ��� ���� �װ� MyDataŸ��.
		{
			System.out.printf("�̸� : %s, ����: %3d\n",m.getName(),m.getAge());
		}
		System.out.println();
		*/
		

		
	}
}
/*
���� �Ѱ� 
ȫ����13�� ������7�� ������78��
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/
/*
�̸� : ȫ����, ����:  13
�̸� : ������, ����:   7
�̸� : ������, ����:  78
*/