/*===================================
���� �ڹ��� �⺻ �����(I/O) ����
====================================*/

//OutputStream �ǽ�
import java.io.OutputStream;
import java.io.IOException;

public class Test175
{
	public static void main(String[] args) throws IOException
	{
		// System.in : �ڹ��� ǥ�� �Է� ��Ʈ��
		// System.out: �ڹ��� ǥ�� ��� ��Ʈ��

		OutputStream out = System.out;
		//����ü		 = �ڽ� ��ü : ��ĳ����.
		//                 Buffer����
		// System.out�� OutputStream���·� �޾Ƽ� ���°Ŷ� Buffer����.
		// InputSteam		OutputStream�� ����Ʈ ����� ����.
		//��, �ڽĵ��� Buffer�� ����.

		// �迭 ����
		byte[] ch = new byte[3];
		ch[0] = 65;			// A
		ch[1] = 97;			// a
		ch[2] = 122;		// z


		out.write(ch);		//-- ������ ������ ������(����)�� ��Ʈ���� ���.
							//   �� ���ٱ� ���� ������ �ø���.

		out.flush();		//-- ��ϵ� ��Ʈ���� ��������(�о��) ����� ����
							//   ������ Buffer�� Ȱ������ �ʰ� �ִ� ��Ȳ�̱� ������
							//   ������ ������ �ڵ�.
							//   (Buffered �Ǿ� �ִ� ��Ʈ��(stream)�� ��� ���� �Ұ�)
							//	 ���۰� ä���� �������� �����͵��� ������ �ʾƼ� ���� �Ұ�.
							//   �� ���ٱ� ���� �ִ� �����͵��� �о��.
							//		ex)�ֻ�� �ǽ���

		out.close();        //-- ��� ��Ʈ��(���ٱ�)�� ���� ���ҽ� �ݳ�.
							//   (out ��Ʈ����(����������) �ᰡ���� ��Ȳ)
							//   �� ���ᰡ�� �� �� �̻� ����������ٴ� ��!
		
		System.out.println("�������� �ŷڸ� ���� �ִ� ����...");
		// out.close(); �� �������� �ᰡ�� 
		// �̰� ���� �ȵȴ�..



		// -- ��out.close();�� �� �ۼ��� ���� ��µ��� �ʴ� ����
		//     ��µǴ� ��Ʈ��(���ٱ�)�� �ݾұ� ������...!
	}
}