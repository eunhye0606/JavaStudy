/*===================================
���� �ڹ��� �⺻ �����(I/O) ����
====================================*/
//Reader Writer �ǽ�
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.io.IOException;



public class Test178
{
	public void process(InputStream is) //System.in�� InputStream���� ��ĳ�����ؼ� �Ű������� ��. �ȹٲٸ� System.in�� �״�ξ���? 
										// System.in �� SystemŬ������ in ���� static�̱���.
										// public static final InputStream in
										// System ��ü �ȿ� InputStream ��ü�� �̹� ����. �׷��� ������ new ���ص� �����Ѱ�! �ڹٿ��� ����!
	{									//InputStream�� ����ü�� �̰� ����!
		int data;
		System.out.println("���ڿ� �Է�(����:Ctrl+z)");

		try
		{	//�Ű����� is ��� ����Ʈ ��� ��ü(InputStream)��
			//���� ��Ʈ������ ��ȯ�Ͽ�
			// �� InputSteamReader �� ����
			// Reader Ÿ���� rd���� ������ �� �ֵ��� ó��.
			Reader rd = new InputStreamReader(is); //is : ����Ʈ�����
												   // ���ڱ������ �ٲ�.
												   //InputSteam�� InputStreamReader�� ����
												   //���� ���� ��ĳ���� �� ������ �̰��ΰ�?


		
			// ����Ʈ ��� ��Ʈ���� �ڹ� �⺻ ��� ��Ʈ�� (System.out)��
			// ���� ��Ʈ������ ��ȯ�Ͽ�
			// �� OutputStreamWrite �� ����
			// Writer Ÿ���� wt���� ������ �� �ֵ��� ó��.
			Writer wt = new OutputStreamWriter(System.out); //System.out: �ڹ� �⺻ ���
							// ���ڱ���� ��� ��Ʈ������ �ٲ�.

			while ((data = rd.read())!= -1)
			{
				wt.write(data);	//-- �������� ��Ʈ�� ���ٱ⿡ ���
				wt.flush();		//-- ����� ��Ʈ�� �о�� ������.
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
	}



	public static void main(String[] args)
	{
		Test178 ob = new Test178();
		ob.process(System.in);
	}
}
/*

���ڿ� �Է�(����:Ctrl+z)
1234
1234
�ȳ��ϼ���
�ȳ��ϼ���
abcd
abcd
�����ٶ�
�����ٶ�
*/