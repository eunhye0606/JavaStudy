/*================================
���� ����(Exception) ó�� ����
=================================*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;




public class Test150
{
	private String[] data = new String[3];

	public void proc() throws IOException //�� chekcked exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String str;
		int n = 0;

		System.out.print("�̸� �Է�[����:Ctrl+z] : ");

		while ( (str = br.readLine()) != null )//�� ��Ʈ��+z == null
		{
			data[n++] = str;
			System.out.print("�̸� �Է�[����:Ctrl+z] : ");
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


	public static void main(String[] args) throws IOException
	{
		Test150 ob = new Test150();
		ob.proc(); //--�� �� �޼ҵ带 �θ��� main()������ IOException �ؾ���.
	}
}

/*
�̸� �Է�[����:Ctrl+z] : dddd
�̸� �Է�[����:Ctrl+z] : r
�̸� �Է�[����:Ctrl+z] : erq
�̸� �Է�[����:Ctrl+z] : fff
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
                                     ��unchecked exception
									 
        at Test150.proc(Test150.java:27)
        at Test150.main(Test150.java:46)
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/

/*
�̸� �Է�[����:Ctrl+z] : aa
�̸� �Է�[����:Ctrl+z] : dd
�̸� �Է�[����:Ctrl+z] : ^Z �� null�̴�.
�Էµ� ����...
aa
dd
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
*/