import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args){
		//-- 0.Scanner和Random提供
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int npcNameChoose = 0;
		String npcName = "";
		
		int playScore = 0;
		int npcScore = 0;
		int gameCount = 0;
		
		//-- 1.游戏介绍
		System.out.println("*******************************");
		System.out.println("************猜拳,开始**********");
		System.out.println("*******************************");
		
		System.out.println("出拳规则:1.剪刀\t2.石头\t3.布");
		System.out.print("请选择对方角色(1.赛文 2.艾斯 3.泰罗):\t");
		
		while(true){
			try{
				npcNameChoose = scan.nextInt();
				//-- 防止输入的不是数字
				if(npcNameChoose < 1 || npcNameChoose > 3){
					System.out.println("超出范围只能选择1-3");
					continue;
				}
				//-- 脱离while死循环.
				break;
			}catch(InputMismatchException e){
				System.out.println("输入类型不匹配只能是数字.");
				//-- 上面的录入不匹配保留在Scanner中要取出来.
				scan.next();
			}
		}		
		
		//-- 2.玩家姓名初始化
		System.out.println("请输入你的姓名:\t");
		String playName = scan.next();
		
		switch(npcNameChoose){
			case 1:
				npcName = "赛文";
				break;
			case 2:
				npcName = "艾斯";
				break;
			case 3:
				npcName = "赛罗";
				break;
			default:
				//-- 裸分号 代表这是一个空语句.
				;
				break;
		}
		System.out.print(playName + "VS" + npcName);
		
		//-- 3.重复操作		
		
		//-- 写循环可以遵循这样一个思路:先把重复执行的写出来.最后套入循环中.
		//-- 套入时注意循环条件.
		
		System.out.println("要开始吗?(y/n)");
		String answer = scan.next();
		for(;"y".equalsIgnoreCase(answer);){
			System.out.println("*******************************");
			//-- 3.1.玩家出拳和NPC的随机出拳
			System.out.print("请出拳:1.剪刀\t2.石头\t3.布(输入相应数字)");
			int playChoose = scan.nextInt();		
			
			showPlayerChoose(playName, playChoose);	
			
			int npcChoose = random.nextInt(3)+1;
		
			showPlayerChoose(npcName, npcChoose);
			
			//-- 3.2.玩家和NPC的出拳比较
			if(
				playChoose == 1 && npcChoose == 3 ||
				playChoose == 2 && npcChoose == 1 || 
				playChoose == 3 && npcChoose == 2
			){
				System.out.println("你赢了好厉害");
				playScore += 1;
			}else{
				System.out.println("连电脑都打不过!");
				npcScore += 1;
			}
			
			//-- 游戏局数 + 1;
			gameCount ++;
			
			//-- 3.3.提示是否继续
			System.out.println("是否要开始下一局:\t");
			answer = scan.next();
		}		
		System.out.println("*******************************");
		//-- 4.显示对战局数和积分.
		System.out.println(playName + "VS" + npcName);
		System.out.println("对战次数:\t" + gameCount );
		System.out.println("姓名\t" + "\t得分");
		System.out.println(playName +"\t\t" + playScore);
		System.out.println(npcName +"\t\t" + npcScore);
		
		if(playScore > npcScore){
			System.out.println("你好棒!");
		}else{
			System.out.println("咦咦咦咦咦咦!");
		}		
	}
	
	
	/**
	 * 显示玩家的选择
	 * @param playName
	 * @param playChoose
	 */
	public static void showPlayerChoose(String playName,int playChoose) {
		String temp = "";
		switch(playChoose){
			case 1:
				temp = "剪刀";
				break;
			case 2:
				temp = "石头";
				break;
			case 3:
				temp = "布";
				break;
			default:
				break;
			}
		System.out.println(playName + "出拳:\t" + temp);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
