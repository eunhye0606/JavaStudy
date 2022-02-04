/*================================
���� ����(Exception) ó�� ����
=================================*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Test151
{

	private String[] data = new String[3];

	public void proc() //throws IOException //�� checked exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str;
		int n = 0;
		

		//�̹� �޼ҵ� ������ ����ó���ؼ�
		//main()���� proc()�� ȣ���ص� ���� �Ȼ���.
		try
		{
			System.out.print("�̸� �Է�[����:Ctrl+z] : ");

			while ( (str = br.readLine()) != null )//�� ��Ʈ��+z == null
			{
				data[n++] = str;
				System.out.print("�̸� �Է�[����:Ctrl+z] : ");
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
		catch (ArrayIndexOutOfBoundsException e1) //--�̰� ��üũ����??????????????????
		{										//--unchecked exception ���� ��Ÿ�Կ����� ������ �̰����� �˱�!!!!!!!!!!!!!!!
			System.out.println("���� �߻�~!!!");
			System.out.println("getMessage:" + e1.getMessage());
			System.out.println("printStackTrace...º");
			e1.printStackTrace();
		}

		System.out.println("�Էµ� ����...");
		for (String s:data )
		{
			if (s != null) //�� ��Ʈ��+z == null
			{
				System.out.println(s);
			}
		}
	
	}





	public static void main(String[] args) //throws IOException 
	                                       //�� proc()�޼ҵ忡��
										   //   ������
										   // main()���ο� ����
										   // �׷��� main()�� ����

	{
		Test151 ob = new Test151();
		ob.proc();
	}
}

/*
�̸� �Է�[����:Ctrl+z] : d
�̸� �Է�[����:Ctrl+z] : 1
�̸� �Է�[����:Ctrl+z] : d
�̸� �Է�[����:Ctrl+z] : d
���� �߻�~!!!
getMessage:3
printStackTrace...º
java.lang.ArrayIndexOutOfBoundsException: 3
        at Test151.proc(Test151.java:32)
        at Test151.main(Test151.java:69)
�Էµ� ����...
d
1
d
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .


�ڹٿ��� �˾Ƽ� �޼ҵ尡 ��Ÿ�ӽý�������
�������� �˷��ִµ�
�� �츮�� �����ϴ°�?
�츮�� ���� �ֱܼ���̶� ��¸� �����ִµ�
�� �ȿ��� ������ �� �� �ִ�! �̰���
���󿡼� ������ �������
�̷� ���ܰ� �߻����� ��, �αױ���� �߻��ϰų�
�ۿ� ���������� ���� �� ����.

���츮�� ��Ʈ�� �Ѵ�.��
*/