/*=====================================
������� �帧�� ��Ʈ��(���)����
======================================*/
// if ��
//if ~ else �� �ǽ�

//1. ���α׷��� �ۼ��� �� �־��� ���ǿ� ����
//   �б� ������ ���ϱ� ���� ����ϴ� �������
//   if��, if~else��, ���ǿ�����, ����if��(if�� ��ø),
//   switch ���� �ִ�.

//2. if���� if ������ ������ ���� ���,
//   Ư�� ������ �����ϰ��� �� �� ���Ǵ� �����̴�.

//�� ������ �Է¹޾� Ȧ��/¦�� �Ǻ��ϴ� ���α׷��� �����Ѵ�.
//   ��, ���� if ������ ����Ѵ�.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Test034
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	System.out.print("���� �Է� : ");
	int num;
	String result = "Ȧ��";

	num = Integer.parseInt(br.readLine());

	if (num % 2 == 0)
		result = "¦��";

	System.out.println(result);

	//if(num%2==0)
	//	System.out.printf("%d�� ¦���Դϴ�.\n",num);
	//if(num%2!=0)
	//	System.out.printf(%d�� Ȧ���Դϴ�.\n",num);

	
	

	}
}