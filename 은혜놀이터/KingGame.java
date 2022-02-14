import java.util.ArrayList;
import java.util.Random;

class KingGame
{
	public static void main(String[] args)
	{
		String king; //-- 왕이름 들어가는 변수
		String noYe1;// -- 노예1
		String noYe2;//-- 노예2
		int rdN1;
		int rdN2;

		ArrayList <String>ali = new ArrayList<String>();
		String [] todo = {"키갈하세요!" , "뺨때리세요!" , "머리카락을 쥐어뜯으세요!"};
		String [] mddm = {"체도리", "렙도리","수도리","란돌이","깨돌이","진돌이","종골이","라갱"};
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
		

		System.out.println("[왕게임을 시작합니다.]");
		System.out.printf("이번 게임의 왕은 %3s 님 입니다.",king);
		System.out.printf("\n노예1번은 %3s, 노예2번은 %3s 입니다. ",noYe1,noYe2);
		System.out.println("\n노예들은 왕에게서 벗어나려면 지령을 수행하세요.");
		System.out.println("\n\n\t   [지령]");
		System.out.printf("%3s는 %3s에게 %s",noYe1,noYe2,todo[rdN1]);
		System.out.println();
		System.out.println();
		System.out.println();
	

	}
}
