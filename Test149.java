/*================================
���� ����(Exception) ó�� ����
=================================*/
/*
�� ���α׷����� �߻��ϴ� ���� (Error)��
   
   �� �߸��� ������ ����ϰų� ���� ���� �������� ���� ���¿���
      ��������ν� ������ �ܰ迡�� �߻��ϴ� �������� ����(Error)��

   �� ���α׷��� �����ϴ� �������� �߻��Ǵ� ��Ÿ�� ����(Error)��
      ���� �� �ִ�.

	  - �����ڰ� ���� �м��� �߸��ϰų� �Ǽ��� ����
	    ������ ����� �������� �Ǵ� ������ ����(Error)��

	  
	  - �ý��� �̻󿡼� �߻��Ǵ� �ý��� ����(Error), �׸���


	  - ���α׷� ���� �� �߻��Ǵ� ���������� ��Ȳ�� �ǹ��ϴ�
	    ���ܻ���(Exception)�� �ִ�.

	  
	    ���� ���,
		�� � ���� 0���� �����ų�...
		�� �迭 ÷�ڸ� ����� ��Ȳ�� �߻��ϰų�
		�� �������� �ʴ� ������ �����Ͽ� �о���δٰų�...

	�ᢺ�� �����ڰ� �̷� ���� ������ �߻��� ��츦 �̸� �����Ͽ�
	       ������ �����ϱ� ���� ������ �����ϵ��� ������ ������ ���� ��.
		   ����.��.ó.��������..?


�� ������ ���� ���� ~!!!(�� Exception Ŭ����)
  
   - ���ܴ� ���α׷� ���� �߿� �߻��� �� �ִ�
     ��ɾ��� �������� �帧�� �����ϴ� �̺�Ʈ��
	 �ڹٿ��� ���ܴ� �ϳ��� ������Ʈ(Object, ��ü)�̴�.

   - ���α׷� ���� �߿� �޼ҵ� �ȿ��� ����(Error)�� �߻��ϰ� �� ���,
     �޼ҵ�� �� ������ �ش��ϴ� ���� ������Ʈ�� �����
	 �װ��� �ڹ� ��Ÿ�� �ý���(Runtime System)�� ������ �ش�.
	 �� �� �ܰ� ���п� �ֿܼ��� ���� �������� ����ؼ� �� �� �ִ�.

   - �ڹٿ����� ��� ���� Ŭ������ Throwable Ŭ������
     Throwable Ŭ������ ���� Ŭ������ ��ӹ޾� ����Ѵ�.
	 �� Throwable�� �ڽ��̰ų� �ڼ��̴�.

   - Throwable Ŭ������ ���ܸ� �����ϴ� �����̳�
     ���ܰ� �߻��� ���� ���α׷��� ���¿� ���� ������ �����ϰ� �ִ�.
	 �� �� ������ ���ǵ��� �ʾҴ� ... ��

   - Throwable Ŭ�������� �Ļ��� Ŭ����
     
	 Exception Ŭ����
	 Exception ���� Ŭ������ �Ϲ������� ���α׷��ӿ� ����
	 ������ �� �ִ� ���� ��Ȳ����
	 �޼ҵ尡 ���� �߿� ������ ���ܸ� ����Ų��.
	 �� �̷��� �߻��ϸ� �̷��� ó���ϸ� �ǰڱ���

	 Error Ŭ����
	 �ɰ��� ������ ���·� �����ڰ� ������ �� ���� ������ �����̴�.
	 �� �ɰ������� �����ڰ� �ǵ� �� �ִ°� �ƴ�.


�� ������ ����
   
   - checked exception
     �޼ҵ� ������ ���ܰ� �߻��� ���
	 �޼ҵ带 ������ �� ��throws������ �޼ҵ� ������ �߻��� �� �ִ�
	 ���ܵ��� ����� �ְų� �Ǵ� �� ���ܸ� ��try ~ catch���ؼ�
	 ó���� �־�߸� �ϴ� �����̴�.
	 �����Ϸ��� ������ �ϴ� �������� ��checked exception�� ��
	 ��throws���Ǵ°��� ���� Ȥ�� ��try ~ catch���Ǵ����� ���θ� �Ǵ��Ͽ�
	 ���α׷����� ���ܸ� � ������ε� ó������ ������
	 ������ ��ü�� �Ұ����ϴ�.
	 �� ���� �߻� ���ɼ��� ���� BufferedReader�� readLine()������
	    ������Ʈ!!!!! �ڹ� ���� ����
		���� �������鼭 throws�� try~catch���ϸ� ������ �Ƚ�����

   - unchecked exception
     ������ ó������ �ʾƵ� �����Ϸ��� üũ���� �ʴ�
	 ��Ÿ�� �ÿ� �߻��� �� �ִ� �����̴�.
	 �� ���� ���ص� �ڹٰ� ���� ��������.

*/
/*
�� java.lang.Throwable Ŭ������ �ֿ� �޼ҵ�
   
   - String toString()
     : Throwable ������ ���� ������ ���ڿ� ���·� ��ȯ�Ѵ�.
	 �� Objet : Ŭ������@�ؽ��ڵ�
	    String : ���� ���� ��� �� (���ڿ�) ������
		try ~ catch (Exception e) 
		e.toString()
		e.printStackTrace()..
   
   - void printStackTrace(PrintStream s)
   - void printStackTrace(PrintWriter w)
     : ǥ�� ��� ��Ʈ���� ���� ȣ�� ����� ������ �޼ҵ���� ����Ѵ�.

�� �ֿ� ��Ÿ�� ���� Ŭ����
   
   - ArithmeticException
    : ��ġ ������ ����(0���� ������ ��)
   
   - ArrayStoreException
    : �迭�� �߸��� ������ ���� �����Ϸ� ���� ��� �߻��ϴ� ����
	��unchecked exception

   - IndexOutOfBoundsException
    : �迭, ���ڿ�, ���� ��� �ε��� ������ ��� ��� �߻��ϴ� ����

   - ClassCastException
	: Ŭ���� ��ȯ�� �߸��� ��� �߻��ϴ� ����

   - NullPointerException
	: �� ��ü�� �����ϴ� ���(�ʱ�ȭ ���� ���� ���� ��� ��)
	  �߻��ϴ� ����

   - SecurityException
	: �ڹ��� ���� ���� ������ �����Ͽ��� ��� �߻��ϴ� ����
	
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 


public class Test149
{											//����ó�� ��Ĩ�
	public static void main(String[] args) //throws IOException
	{
//========================================================================
		//BufferedReader Ŭ���� �ν��Ͻ� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//�ֿ� ���� ����
		int a, b, c;



		//����ó�� ��Ĩ� �� �����Ͽ��� �߻� ����!
		/*
		try
		{
			System.out.print("ù ��° ���� �Է�: " );
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�: " );
			b = Integer.parseInt(br.readLine());

			c = a+b;

			System.out.println("��� : " + c);
			//--==>>��error: unreported exception IOException; must be caught or declared to be thrown

		}
		catch (IOException e)
		{
			// IOException �� checked exception
			// -- �޼ҵ带 �����ϴ� �������� throws �� ����.
			//    ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�.
			System.out.println(e.toString());
		}
		*/

//========================================================================



		//����ó�� ��Ĩ� ��Ÿ�� ����
		/*
		try
		{
			System.out.print("ù ��° ���� �Է�: " );
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�: " );
			b = Integer.parseInt(br.readLine());

			c = a+b;

			System.out.println("��� : " + c);
			//--==>>��error: unreported exception IOException; must be caught or declared to be thrown

		}
		catch (IOException e1) //�̰� �Ⱦ��� �����ϾȽ�����. ����.
		{
			// IOException �� checked exception
			// -- �޼ҵ带 �����ϴ� �������� throws �� ����.
			//    ��Ƴ��ų� ������ ���� ��� ������ ���� �߻�.
			System.out.println(e1.toString());
			System.out.println("readLine() ������ throws IOException �ض�"); //--�̰� �ȳ����� �ӽ�.
		}
		catch (NumberFormatException e2)
		{
			// NumberFormatException �� unchecked exception
			// -- ��Ÿ�� �� �߻��� �� �ִ� ���ܷ�
			//    �ݵ�� ���� �ʿ䵵, ��Ƴ� �ʿ䵵 ����.
			//    �̰� ���Ѵ� �ؼ� ������ �Ƚ������� ����.
			System.out.println(e2.toString());
			System.out.println("���� ������ �����͸� �Է��ؾ� �մϴ�!!!");
		}
		*/
		/*
		ù ��° ���� �Է�: a
		java.lang.NumberFormatException: For input string: "a" �� e2.toString()
		���� ������ �����͸� �Է��ؾ� �մϴ�!!!
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/

//========================================================================	




		//���� ó����
		/*
		try
		{
			System.out.print("ù ��° ���� �Է�: " );
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�: " );
			b = Integer.parseInt(br.readLine());

			c = a+b;

			System.out.println("��� : " + c);
			//--==>>��error: unreported exception IOException; must be caught or declared to be thrown

		}
		catch (Exception e) //�ѹ��� ���� ó��
		{
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println("printStackTrace..º");
			e.printStackTrace();
		}
		*/

//========================================================================
	
		//etc...
		try
		{
			System.out.print("ù ��° ���� �Է�: " );
			a = Integer.parseInt(br.readLine());
			System.out.print("�� ��° ���� �Է�: " );
			b = Integer.parseInt(br.readLine());

			c = a+b;

			System.out.println("��� : " + c);
			//--==>>��error: unreported exception IOException; must be caught or declared to be thrown

		}
		catch (Exception e) //�ѹ��� ���� ó��
		{
			System.out.println(e.toString());
			/*
			ù ��° ���� �Է�: a
			java.lang.NumberFormatException: For input string: "a"
			����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
			��, ù��° �������� ������ ��������.
			*/
		}
		finally
		{
			//���ܰ� �߻��ϰų� �߻����� �ʰų� ������ ����Ǵ� ����.
			//������ ������ϰ� ������ ����.
			System.out.println("��� �����̽��ϴٶ���~!");
		}
		/*
		ù ��° ���� �Է�: 10
		�� ��° ���� �Է�: 20
		��� : 30
		��� �����̽��ϴٶ���~!
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .

		ù ��° ���� �Է�: a
		java.lang.NumberFormatException: For input string: "a"
		��� �����̽��ϴٶ���~!
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/






		
	
	
	}
}