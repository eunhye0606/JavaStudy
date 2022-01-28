/*=====================================
＝＝＝ 切郊税 爽推(掻推) 適掘什 ＝＝＝
======================================*/
// String 適掘什 (社鯵拭辞澗 茨挑暗軒)
// 五乞軒 舵榎 匝虞檎 析奄床壱 弦戚 早希艦 hi戚君壱 赤製.
// 覗軒耕銅崎 切戟莫生稽 妊薄 公背.

//壕伸精 疑霜税 失維級 乞製.
//String精 鎧遂聖 痕鉢獣迭 呪 蒸陥.
/*String name = "畠掩疑";			けけ2gdeffけけけけ		けけ畠掩疑けけけけ
									けけけけけけけけけ		けけけけけけけけけ
  name ="壱掩疑";					けけけけ524fdsafけ		けけけ壱掩疑けけけ
									けけけけけけけけけ		けけけけけけけけけ
  name +="照括";					43243fdsffけけけけ		けけけけけけけけけ
									けけけけけけけけけ		け壱掩疑照括けけけ

cf) 切郊什滴験闘 辞鷺鹸 庚狛
*/



/*
】 String 適掘什澗 鎧採 庚切伸 汽戚斗拭 企廃 呪舛戚 災亜管馬陥.
   (聡, 鎧遂 災痕 : Immutable)
   庚切伸税 鎧遂戚 痕井鞠檎 歯稽錘 梓端研 持失馬悟
   凧繕 企雌聖 籍嬢獄鍵 梓端澗 亜搾走 鎮刑芝税 企雌戚 鞠壱,
   歯稽錘 梓端拭 歯 爽社研 拝雁馬惟 鞠糠稽
   背獣坪球亀 痕馬惟 吉陥.

】 String 適掘什 娃拭 〆+〇尻至切研 紫遂馬惟 鞠檎
   庚切伸 娃税 衣杯戚 亜管馬悟,
   String 適掘什人 陥献 適掘什 梓端, 暁澗 奄沙莫 汽戚斗 娃拭
   〆+〇 尻至切研 紫遂馬澗 井酔拭亀
   鎧採旋生稽 切疑 String 適掘什稽 痕発戚 亜管馬陥.

   『 勧生稽 溌昔鞠澗 衣引澗 戚係走幻...
      String精 鎧遂聖 痕井拝 呪 蒸奄 凶庚拭
	  〆+〇 尻至切研 紫遂馬惟 鞠檎
	  鎧採旋生稽 StringBuffer 研 持失馬食	≧ StringBuffer亜 雌是 適掘什? No 焼還. 持失切 神獄稽漁 掻拭 String(StringBuffer buffer) 戚惟 赤製. 古鯵痕呪研 梓端稽 閤焼身.
	  append() 五社球研 戚遂馬食
	  庚切伸拭 企廃 衣杯聖 呪楳馬惟 吉陥.
	  陥虞辞 疑旋昔 庚切伸聖 弦戚 紫遂馬澗 Servlet 去拭辞澗
	  鞠亀系戚檎 String 聖 紫遂馬澗 依 左陥
	  StringBuffer 蟹 char[] 聖 紫遂馬澗 依戚 反晴旋析 呪 赤陥.

	  ==> 舛旋昔 庚切伸聖 坦軒馬澗 井酔拭澗 爽稽 String 適掘什研 紫遂
	      疑旋昔 庚切伸聖 坦軒馬澗 井酔拭澗
		  訓 展績 獣 疑旋生稽 坦軒背爽澗 StringBuffer 適掘什研
		  紫遂馬澗 依戚 反晴旋戚陥.

】 String 梓端税 持失 貢 働臓

   String 梓端研 持失馬澗 号狛精
   �� 庚切伸 雌呪研 走舛馬澗 号狛引
   �� String 適掘什税 持失切研 戚遂馬澗 号狛
   戚係惟 砧 亜走 号狛戚 赤陥.

   String str1 = "Java";
   String str2 = new String("Java");

   馬走幻 〆庚切伸 雌呪〇研 企脊 尻至切研 紫遂馬食
   走舛馬澗 号狛聖 搭背 梓端研 持失馬澗 井酔人
   〆new〇 尻至切研 戚遂馬食 梓端研 持失馬澗 依精
   税耕亜 陥牽陥.


*/

public class Test138
{
	public static void main(String[] args)
	{
		String s1 = "seoul";
		String s2 = "seoul";
		String s3 = new String("seoul");
		String s4 = new String("seoul");

		System.out.println(s1 == s2);
		// 梓端 == 梓端 
		// 背習殿益 搾嘘
		//--==>>true
		System.out.println(s1 == s3);
		//--==>>false
		System.out.println(s1 == s4);
		//--==>>false

		

		//String適掘什税 equals()澗 Object税 五社球研 神獄虞戚漁(仙舛税)背辞
		//庚切伸聖 搾嘘廃陥.
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s4.equals(s1));
		//true
		//true
		//true
		//true

		//『 s1引 s2梓端亜 凧繕馬澗 庚切食 雌呪亜 疑析廃 井酔
		//   庚切伸戚 船焼吉 奄常舌社税 慎蝕戚 疑析馬奄 企庚拭
		//   s1 梓端人 s2梓端澗 疑析廃 奄常 舌社研 凧繕馬惟 吉陥.
		//   馬走幻,
		//   s3人 s4澗 疑析廃 慎蝕戚 焼観 陥献 奄常 因娃聖
		//   歯罫惟(new) 溌左馬食 庚切伸 雌呪研 益 因娃拭
		//   企脊廃 井酔戚糠稽
		//   砧 昔什渡什澗 旭精 慎蝕聖 凧繕馬澗 依戚 焼艦陥.
		//   魚虞辞 〆s3 == s4〇澗 暗憎戚 鞠悟
		//   幻鉦 旭精 庚切伸 雌呪昔走税 食採研 搾嘘背醤 拝 井酔虞檎
		//   〆equals()〇 五社球研 戚遂背醤 廃陥.
		//『 String 適掘什澗 Object税 equals() 研 Overriding~!!


		System.out.println("===================");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);

		//--==>>s1 : seoul
		//		s2 : seoul
		//		s3 : seoul
		//		s4 : seoul
		
		System.out.println("s1 : " + s1.hashCode());
		System.out.println("s2 : " + s2.hashCode());
		System.out.println("s3 : " + s3.hashCode());
		System.out.println("s4 : " + s4.hashCode());
		//--==>>s1 : 109324212
		//		s2 : 109324212
		//		s3 : 109324212
		//		s4 : 109324212

		//『 梓端亜 旭生檎 背習坪球亜 旭走幻
		//   背習坪球亜 旭陥壱 背辞 旭精 梓端澗 焼艦陥.

		s2 += "korea";
		System.out.println(s2);
		s2 = "korea";
		System.out.println(s2);
		//--==>>seoulkorea
		//		korea

		//--戚人 旭精 井酔
		//  s2 亜 凧繕廃 seoul戚 煽舌吉 慎蝕精
		//  〆s2 += "korea";〇呪楳鞠澗 獣繊拭辞
		// 亜搾走 鎮刑芝税 企雌戚 鞠悟
		// "seoulkorea"雌呪亜 煽舌吉 慎蝕聖
		// s2亜 凧繕馬惟 鞠醸陥亜
		// 陥獣 s2亜 凧繕廃 "seoulkorea"亜 煽舌吉 慎蝕精
		// 〆s2 = "korea";〇亜 呪楳鞠澗 獣繊拭辞
		// 亜搾走 鎮刑芝税 企雌戚 鞠悟
		// "korea"庚切伸 雌呪亜 歯罫惟 煽舌吉 慎蝕聖
		// s2亜 凧繕馬惟 吉陥.
		//==> 『 String 梓端税 鎧遂精 災痕戚陥~!!!
	}
}