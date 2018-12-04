import java.util.Arrays;
import java.util.Random;

class lottery {
	public static void main(String[] args) {
		// 1. 鍒涘缓Random闅忔満鏁?
		Random random = new Random();
		// 2. 鍒涘缓鍒楄〃锛寋 {6涓孩锛?涓摑} {6涓孩锛?涓摑} {} {} {} {} {} {} {}....{n=100}}
		int[][] lottery = new int[100][7];
		
		// 2.1 钃濊壊鍙栧€?-16锛岀孩鑹插彇鍊?-33涓斾笉閲嶅锛岀孩鑹插拰钃濊壊鍙互閲嶅
		for(int i=0; i<lottery.length;i++) {
			for(int j=0; j<lottery[i].length; j++) {
				// 褰搄鏄7涓厓绱狅紝鍗充笅鏍囦负6鏃惰緭鍑鸿摑鐞冮殢鏈哄€?
				if(j==6) { 
					lottery[i][j] = random.nextInt(16)+1;
					break;
				}else {
					lottery[i][j] = random.nextInt(33)+1; 
					// 0~5杩?涓厓绱犳槸绾㈢悆鏁板€硷紝瑕佹眰涓嶉噸澶?
					for(int k=0;k<j;k++) {
						if(lottery[i][j]==lottery[i][k]) {
							j--;
						}
					}
				}
			}
			//-- 棰勮100鏈熺殑6绾?钃濇暟缁勶紝杈撳嚭鏍煎紡锛氱1鏈熷弻鑹茬悆搴忓垪锛歿.......}  绗?鏈?
			System.out.print("绗?+i+"鏈熷弻鑹茬悆搴忓垪锛?);
			System.out.println(Arrays.toString(lottery[i]));
		}
		System.out.println("-------------------- 鍙岃壊鐞冨簭鍒楄緭鍑哄畬姣?-------------------");
		
		// 3. 缁熻鏁板€肩殑鍑虹幇娆℃暟锛屾柟娉曪細鍊煎搴斾笅鏍囧嚭鐜版鏁拌嚜澧?
		int[] blueEleCount = new int[16]; // 钃濊壊鐞冨彇鍊艰寖鍥达細1~16锛屼笅鏍?~15
		int[] redEleCount = new int[33]; // 绾㈣壊鐞冨彇鍊艰寖鍥达細1~33锛屼笅鏍?~32
		
		for(int i=0;i<lottery.length;i++) { // 鑾峰彇姣忔湡鍙岃壊鐞冩暟缁?
			for(int j=0;j<lottery[i].length;j++) { // 鑾峰彇姣忔湡鍙岃壊鐞冩暟缁勭殑鍊?
				if(j==6) { // 濡傛灉鏄6涓厓绱狅紝鎶婂€煎綋鍋氫笅鏍囩粰blueEleCount骞惰嚜澧?
					/*
					if(lottery[i][j]==3) { // 楠岃瘉鍏冪礌鍑虹幇娆℃暟鏄惁涓虹湡
						System.out.println(lottery[i][j]);
					}
					*/
					blueEleCount[lottery[i][j]-1] = blueEleCount[lottery[i][j]-1]+1; // 鍚屾牱涓嬫爣鍑虹幇涓€娆″垯瀵瑰簲鍊?1
				}else { // 绗?~5涓厓绱狅紝缁檙edEleCount
					redEleCount[lottery[i][j]-1] = redEleCount[lottery[i][j]-1]+1; // 鍊?6瀛樺偍鍦ㄤ笅鏍?5涓?
				}
			}
		}
		// 棰勮钃濊壊鍜岀孩鑹叉暟鍊奸噸澶嶅嚭鐜扮殑娆℃暟
		System.out.println("钃濊壊鐞冪殑鍊?[0]1~[15]16)鍑虹幇鐨勬鏁帮細"+Arrays.toString(blueEleCount));
		System.out.println("绾㈣壊鐞冪殑鍊?[0]1~[15]33)鍑虹幇鐨勬鏁帮細"+Arrays.toString(redEleCount));
		System.out.println("--------------------鈫?绾㈣壊鍜岃摑鑹插嚭鐜扮殑娆℃暟搴忓垪 鈫?-------------------");
		// 4. 姣忎釜鍏冪礌鐨勫嚭鐜版鐜?
		// 4.1 鍒涘缓涓€涓簩缁存暟缁勶紝{ {鍙栧€?锛屽嚭鐜版鏁?or姒傜巼1} {鍙栧€?锛屽嚭鐜版鏁皁r姒傜巼} {...} {} {} {} {} {}}
		double[][] bluePoss = new double[16][2]; // 100鏈熺殑钃濊壊鐞冨彇鍊硷紝鑼冨洿1~16锛屾暟缁勫厓绱爗鍊?鍑虹幇/姒傜巼}
		double[][] redPoss = new double[32][2];
		int p=0;
		
		// 4.2 鍙栬摑鑹诧紝{1~16, blueEleCount[i]}
		for(int i=0;i<bluePoss.length;i++) {
			bluePoss[i][0]=i+1; // 绗竴涓厓绱狅紝涓嬫爣0~15鐨勫€间负1~16
			// 鑾峰彇姒傜巼
			double possibilityblue =blueEleCount[i]/100.0; // 鏁扮粍鍏冪礌鍊兼槸灏忔暟锛屽瓧鑺?锛屽彲浠ヨ嚜鍔ㄨ浆鎹负double8瀛楄妭
			bluePoss[i][1]=possibilityblue; // 灏哾ouble姒傜巼璧嬪€肩粰double鏁扮粍
		}
		// 棰勮钃濊壊鍙栧€煎拰姒傜巼
		System.out.println("钃濊壊鐞?~16锛堝彇鍊硷紝姒傜巼锛夛細"+Arrays.deepToString(bluePoss));
		
		// 4.3 鍙栫孩鑹诧紝{1~33, redEleCount[i]}
		p=0;
		for(int i=0;i<redPoss.length;i++) {
			redPoss[i][0]=i+1;
			double possibilityred =redEleCount[i]/100.0; 
			redPoss[i][1]=possibilityred; 
		}
		System.out.println("绾㈣壊鐞?~33锛堝彇鍊硷紝姒傜巼锛夛細"+Arrays.deepToString(redPoss));
		System.out.println("--------------------鈫戠孩鑹插拰钃濊壊锛堝彇鍊硷紝姒傜巼锛?鈫?-------------------");

		// 5. 姣忎釜鍏冪礌鐨勫嚭鐜版鐜囨帓搴?
		double[] temp= new double[2];

		// 5.1 閫掑綊钃濊壊姣忔湡鏁扮粍鐨勭2涓厓绱狅紝鎸夊ぇ灏忚繘琛屽啋娉℃帓搴?
		for(int i=0;i<bluePoss.length-1;i++) {
			for(int j=0;j<bluePoss.length-1;j++) {
				if(bluePoss[j][1]>bluePoss[j+1][1]){// 姣旇緝钃濊壊鐞冪殑娆℃暟{鍊硷紝娆℃暟}
					temp =bluePoss[j+1]; // 鎸変粠灏忓埌澶ф帓鍒?
					bluePoss[j+1] =bluePoss[j];
					bluePoss[j]=temp;
				}
			}
		}
		// 棰勮
		System.out.println("钃濊壊鐞?~16锛堝彇鍊硷紝姒傜巼锛夛紝鎺掑簭鍚庯細"+Arrays.deepToString(bluePoss));
		
		// 5.2 閫掑綊绾㈣壊
		for(int i=0;i<redPoss.length-1;i++) {
			for(int j=0;j<redPoss.length-1;j++) {
				if(redPoss[j][1]>redPoss[j+1][1]){// 姣旇緝钃濊壊鐞冪殑娆℃暟{鍊硷紝娆℃暟}
					temp =redPoss[j+1]; // 鎸変粠灏忓埌澶ф帓鍒?
					redPoss[j+1] =redPoss[j];
					redPoss[j]=temp;
				}
			}
		}
		System.out.println("绾㈣壊鐞?~33锛堝彇鍊硷紝姒傜巼锛夛紝鎺掑簭鍚庯細"+Arrays.deepToString(redPoss));
	}
}
