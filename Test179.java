/*=============================================
＝＝＝ 梓端 送慶鉢(Object Serialization) ＝＝＝
==============================================*/
//PDA
//据維穿含
//RMI: 据維 梓端 搭重 奄綬
/*
】 梓端 送慶鉢(Object Serialization)澗
   
   五乞軒拭 持失吉 適掘什 梓端税 呉獄 痕呪税 薄仙 雌殿研(昔什渡什 持失 ≧ 適掘什亜 穿採
   														 五乞軒拭 臣虞亜澗 依戚 焼艦虞
														 五乞軒澗 RAM ROM 屍幻焼艦虞
														 慎蝕戚 陥 赤陥. 
														 昔什渡什 持失≧ 琵五乞軒拭
														 臣虞亜澗 闇 呉獄 痕呪級.
														 五社球級精 琵五乞軒 慎蝕戚 焼還
														 陥献 慎蝕拭辞 凧繕拝呪赤澗 姥繕 莫失)
	
	琵 五乞軒 - けけけけけ ≧ 梓端送慶鉢税 企雌. 琵 五乞軒拭 赤澗 呉獄 痕呪級
	什澱 五乞軒 - 切戟姥繕拝 凶
	什殿峠 五乞軒 - static 痕呪, static 五乞軒.

   益企稽 左糎背辞 督析拭 煽舌馬暗蟹
   革闘趨滴研 搭背 穿含拝 呪 赤澗 奄管生稽
   呉獄 痕呪税 葵聖 左糎廃陥暗蟹
   陥献 革闘趨滴拭 赤澗 硲什闘拭 葵聖 左馨 井酔 紫遂馬惟 吉陥.

   聡, 梓端 送慶鉢澗 鎧遂弘聖 郊戚闘 舘是稽 痕発馬食(鎧遂弘 : 梓端研 姥失馬澗 痕呪幻)
   督析 暁澗 革闘趨滴研 搭背 勺呪重(什闘顕)戚 亜管馬惟
   幻級嬢爽澗 依生稽 戚 凶, 梓端空 呉獄 痕呪税 五乞軒幻生稽 姥失吉 依聖 源廃陥.

   魚虞辞, 五社球人 持失切澗 梓端 送慶鉢税 企雌拭辞 薦須吉陥.


】 梓端 送慶鉢税 舌繊
   
   梓端 切端税 鎧遂聖 脊窒径 莫縦拭 姥蕉閤走 省壱(督析, 庚切..戚訓暗拭 薦廃 いい
   													Object稽 穿含背辞)
   梓端研 督析拭 煽舌敗生稽潤 慎紗失聖 薦因拝 呪 赤生悟(pc亜 襖閃亀 煽舌. DB拭 源壱
   														督析拭 煽舌背亀 慎紗失 左舌)
   梓端 切端研 革闘趨滴研 搭背 謝襲惟 嘘発拝 呪 赤惟 吉陥.

   梓端 送慶鉢澗 切郊 1.1 戚板拭 亀脊鞠醸澗汽
   益 戚政澗 RMI 人 Bean 凶庚戚醸陥.
   RMI 澗 据掘 梓端 搭重聖 走据背醤 馬奄 凶庚拭
   梓端亜 益企稽 戚疑拝 呪 赤嬢醤 廃陥.
   魚虞辞 戚研 走据馬奄 是背辞澗 梓端 送慶鉢亜 琶呪旋戚陥.

   暁廃, Bean精 竺域 獣 雌殿拭 企廃 舛左研 煽舌拝 凶
   戚 梓端 送慶鉢研 紫遂馬檎 畷馬惟 梓端 雌殿研 煽舌拝 呪 赤陥.

『 RMI(Remote Method Invocation) 城 猿股嬢亀喫.
   辞稽 陥献 亜雌 奄域舌帖拭 糎仙馬澗 敗呪研
   硲窒馬壱 叔楳馬澗 奄管聖 眼雁廃陥.
   辞稽 陥献 搭重 姥繕拭 是帖廃 唖唖税 据維 梓端級 娃税
   搭重 姥繕研 走据馬澗 鯵割生稽 戚背馬檎 疏畏陥.


『 Bean(朔) 城 掻推背 Spring拭辞!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
   C/S 姥繕旋 乞季拭辞 辞獄著 姥繕拭 背雁馬悟,
   仙紫遂 亜管廃 社覗闘裾嬢 鯵端研 幻級 呪 赤惟 馬澗 陳匂獲闘 奄綬.
   拙失吉 鯵端税 因政亜 亜管馬悟 覗稽詮闘拭 襲惟 匂敗獣迭 呪 赤亀系 廃陥.
   適虞戚情闘拭惟 朔戚虞澗 覗稽益轡 陳匂獲闘研 歳壕馬澗 号縦生稽 坦軒.
   陳匂獲闘 姥失 鋭帳(鉦紗) == Bean 鋭鉦
   神巨神 朝室闘 --> 巨什滴 --> USB

】 Serializable 昔斗凪戚什
   
   梓端 送慶鉢研 馬奄 是背 胡煽 梓端 送慶鉢亜 亜管馬亀系
   java.io.Serialzable 昔斗凪戚什研 姥薄背 爽嬢醤 廃陥.
   戚 昔斗凪戚什澗 梓端 送慶鉢亜 薦因鞠嬢醤 廃陥澗 紫叔聖
   JVM 拭惟 硝形爽澗 蝕拝聖 呪楳廃陥.
   暁廃, Serializable 昔斗凪戚什澗
   陥献 昔斗凪戚什人 含軒 姥薄背醤 拝 五社球亜 蒸奄 凶庚拭 
   舘走 識情幻 背爽檎 吉陥.

   莫縦)
   ?? 
   public class 適掘什誤 implements Serializble
   {
	   //...
   }

   ?? 
   Serializble 昔斗凪戚什研 姥薄廃 板
   ObjectInputStream 適掘什人 ObjectOutputStream 適掘什研 戚遂馬食
   梓端 舘是稽 脊窒径聖 呪楳馬惟 吉陥.

   『 呉獄 痕呪亜 static 生稽 識情吉 井酔
      (聡, 適掘什 痕呪析 井酔)
	  梓端 送慶鉢税 企雌拭辞 薦須吉陥.

】 Object Stream

   java.io.ObjectInputStream
   ObjectInputStream 適掘什澗 ObjectOutputStream 適掘什拭 税背 ≧ 郊戚闘奄鋼
   督析拭 煽舌鞠嬢 赤澗 梓端蟹 革闘趨滴研 搭背 穿含吉 梓端税
   送慶鉢研 背薦馬澗 奄管聖 薦因廃陥.
   舘, java.io.Serializble 昔斗凪戚什人
   java.io.Externalizable 昔斗凪戚什研 走据背爽澗 梓端拭 企背辞幻
   紫遂戚 亜管馬陥.
   聡, Serializble 昔斗凪戚什人 Externalizable 昔斗凪戚什研
   姥薄廃 梓端拭辞幻 紫遂戚 亜管馬陥澗 依戚陥.
   戚 凶, readObject() 五社球研 戚遂馬食
   什闘顕生稽採斗 送慶鉢吉 梓端研 石聖 呪 赤生悟

   戚係惟 石精 梓端澗 壕伸, 庚切伸 暁澗 唖 梓端 去
   据掘税 莫(Type)生稽 蝶什特 背 爽嬢醤 廃陥.

*/

import java.io.File;
import java.util.Hashtable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


import java.io.FileInputStream;
import java.io.ObjectInputStream;


import java.util.Enumeration;


public class Test179
{
	public static void main(String[] args) throws Exception //--乞窮 Exception精 lang鳶徹走 照拭赤嬢辞 魚稽 import 照背亀喫.
	{
		String appDir = System.getProperty("user.dir"); //--charaterSet拭辞 背砂.

		//砺什闘
		//System.out.println(appDir);
		//--==>>C:\JavaStudy
		//巨刑塘軒 井稽 鋼発
		
		//督析 梓端 持失
		File f0 = new File(appDir, "\\data\\test.ser"); //--test.ser精 督析戚硯.
		//-- appDir ≧ C:\JavaStudy (庚切伸照拭 \\砧鯵澗 \馬蟹研 妊薄馬奄 是敗.)
		//-- appDir 是帖研 奄層生稽(掻宿生稽) "\\data\\test.ser" 研
		//   姥失馬畏陥澗 税耕
		//   衣引旋生稽 〆C:\JavaStudy\data\test.ser〇 姥失

		//砺什闘 ??
		//System.out.println(f0.getParentFile().exists());
		//-- 衣引亜 幻級嬢 霜 呪 赤亀系 薄仙 井稽亜 糎仙馬澗亜?
		//--==>>false
		//-- 〆test.ser〇 督析戚 幻級嬢霜 巨刑斗軒 井稽亜 姥失鞠嬢 赤走 省陥.

		//-- JavaStudy 照拭 data 巨刑塘軒 持失!

		//砺什闘 ??
		//〆C:\JavaStudy〇 井稽拭 〆data〇 巨刑斗軒 持失 板 陥獣 溌昔
		//System.out.println(f0.getParentFile().exists());
		//--==>>true
		//-- 〆test.ser〇 督析戚 幻級嬢霜 巨刑斗軒 井稽亜 姥失鞠嬢 赤陥.

		



		// !(巨刑塘軒 井稽亜 姥失鞠嬢 赤陥檎..)
		// 巨刑塘軒 井稽亜 姥失鞠嬢 赤走 省陥檎...
		if (!f0.getParentFile().exists())
		{
			f0.getParentFile().mkdirs();
			//                 巨刑塘軒級聖 幻級畏陥.
		}




		//Hashtable 切戟姥繕 昔什渡什 持失(MAP 切戟姥繕 昔斗凪戚什研 姥薄馬澗 適掘什)
		Hashtable<String,String> h1 = new Hashtable<String,String>();

		// 持失廃 h1 戚虞澗 Hashtable 切戟姥繕拭 推社 蓄亜
		h1.put("2202091","戚硲汐");
		h1.put("2202097","沿舛遂");
		h1.put("2202090","置庚舛");
		h1.put("2202094","置識馬");
		h1.put("2202099","沿殿莫");

		//砺什闘
		//System.out.println(h1.get("2202094"));
		//--==>>置識馬


		// 督析 穿遂 窒径 什闘顕 持失(呪亀伽走 伸奄)
		FileOutputStream fos = new FileOutputStream(f0);
		// 叔薦 益 督析戚 蒸聖 呪亀 赤奄拭 checked exception. 陳督析 拭君
		//-- 督析 穿遂 窒径 什闘顕(弘匝奄)拭
		//   f0 虞澗 督析 梓端研 句酔畏陥.
		// ♂ 戚暗櫛 旭製 ♂
		//InputStreamReader isr = new InputStreamReader(System.in);


		//梓端 穿遂 窒径 什闘顕 持失
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//-- 梓端 穿遂 窒径 什闘顕(弘匝奄)生稽
		//   fos 虞澗 督析 穿遂 窒径 什闘顕聖 姶塾畏陥.
		// ♂ 戚暗櫛 旭製 ♂
		//BufferedReder br = new BufferedReader(isr);


		//是税 line 177 ~ 190 引 疑析廃 姥庚
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f0));


		// line 194 税 鯵割引 搾嘘拝 姥庚(姥繕旋生稽 疑析廃 姥庚)
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 『 ObjectOutputStream 適掘什澗
		//    梓端級聖 窒径馬澗 奄管聖 薦因馬澗 適掘什稽
		//    窒径 什闘顕拭 窒径馬奄 穿拭
		//    鎧採旋生稽 梓端 送慶鉢研 呪楳馬惟 吉陥.
		//    切郊 奄沙莫 汽戚斗 暁澗 梓端級聖 
		//    督析拭 煽舌馬暗蟹 革闘趨滴研 搭背 穿含馬奄 是背
		//    穿含拝 梓端研 送慶鉢馬澗 奄管聖 薦因馬澗 依戚陥.


		oos.writeObject(h1);
		//--持失吉 什闘顕拭 鎧左馨 梓端研 奄系

		oos.close();
		//--ObjectOutputStream 軒社什 鋼崖

		fos.close();
		//-- FileOutputStream 軒社什 鋼崖

		// (梓端研 送慶鉢馬食 督析稽) 鎧左鎧奄 魁~!!! output
//================================================================================================

		// (梓端研 送慶鉢馬食 鎧左浬 督析) 石嬢級戚奄 獣拙~!!! input 蝕送慶鉢!!

		// f0 督析 梓端亜 糎仙廃陥檎...
		if (f0.exists())
		{
			FileInputStream fis = new FileInputStream(f0);
			ObjectInputStream ois = new ObjectInputStream(fis);

			//ois(ObjectInputStream)稽 採斗 石嬢級昔 梓端(Object)研
			//蝶什特(Hashtable)馬食	(h1梓端税 据掘 展脊戚 Hashtable戚虞辞)
			//h2 虞澗 Hashtable 切戟姥繕拭 眼焼鎧奄
			// Object obj = ois.readObject(); 
			Hashtable h2 = (Hashtable)ois.readObject();	//--陥錘蝶什特績
														//Hashtable ≧ Object背辞 鎧左鎧壱
														//食奄辞 陥獣 Hashtable
			
			ois.close();
			//--ois 鋼崖 ≧ ObjectInputStream 軒社什 鋼崖

			fis.close();
			//--fis 鋼崖 ≧ FileInputStream 軒社什 鋼崖

			// 食奄猿走馬檎 石嬢級戚奄 魁~!!!
//================================================================================================
			

			// 石嬢級昔 h2 梓端税 鎧遂 溌昔
			String key;
			String value;

			// 『 Iterator 紫遂拝 呪 蒸製~!!!
			Enumeration e = h2.keys();

			while (e.hasMoreElements())
			{
				key = (String)e.nextElement(); // 陥錘蝶什特
				//-- Hashtable 切戟姥繕研 企雌生稽 key 葵聖 石嬢級戚澗 引舛

				//砺什闘
				//System.out.println(key);
				/*
				2202091
				2202099
				2202090
				2202097
				2202094
				*/

				value = (String)h2.get(key); //陥錘蝶什特
				//--Hashtable 切戟姥繕研 企雌生稽 key研 醗遂馬食 value研 条嬢鎧澗 引舛
				System.out.println(key + " ≧ " + value);
			}

			
		}
	}
}
/*
授辞 税耕 X
Key - Value幻 限仲走檎 喫.

2202091 ≧ 戚硲汐
2202099 ≧ 沿殿莫
2202090 ≧ 置庚舛
2202097 ≧ 沿舛遂
2202094 ≧ 置識馬
*/