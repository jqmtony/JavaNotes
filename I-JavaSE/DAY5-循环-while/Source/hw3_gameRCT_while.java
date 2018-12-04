import java.util.Scanner;
import java.util.Random;

/* 
	流程参考：
	1.游戏介绍
	2.玩家姓名初始化
	3. 重复操作
		3.1玩家出拳和NPC的随机出拳
		3.2比较
		3.3提示是否继续
	4.显示对战局数和积分
 */

class gameRCT {
	public static void main(String[] args) {
		// 创建Scanner和Random
		Scanner scan = new Scanner(System.in);
		Random random=new Random();
		
		//-- 1.游戏介绍
		System.out.println("\n\n\t\t\t*************************");
		System.out.println("\t\t\t********猜拳，开始********");
		System.out.println("\t\t\t*************************\n\n");
		
		System.out.println("出拳规则：1.剪刀 2.石头 3.布");
		
		/* 输入的异常处理可以用while实现，具体看D5/Code/GameGuess */
		
		//-- 2.玩家姓名初始化
		System.out.print("请选择对方角色（1.刘备 2.孙权 3.曹操）");
		int role = scan.nextInt();
		
		System.out.print("请输入你的名字：");
		String name = scan.next();
		
		String roleB = "";
		switch(role){
			case 1:
				roleB = "刘备";
				break;
			case 2:
				roleB = "孙权";
				break;
			case 3:
				roleB = "曹操";
				break;
			default:
				// 空语句
				;
				break;
		}
		
		System.out.println(name+" VS "+roleB);
		
		//-- 3.重复操作
		System.out.print("要开始吗？(y/n)：");
		String ifnext = scan.next();
		
		int playA = 1;
		int playB = 1;
		int count = 0;
		int scoreA = 0;
		int scoreB = 0;
		String temp = "";
		
		//-- 3.1 玩家出拳和NPC的随机出拳
		do {
			System.out.println("////////////");
			System.out.println("*************************");
			System.out.print("请出拳\t：1.剪刀 2.石头 3.布：");
			playA = scan.nextInt();
			
			String playAout = "";
			switch(playA) {
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
					;
					break;
			}
			System.out.println("\n你出拳：\t"+temp);
			
			playB = random.nextInt(3)+1;
			String playBout = "";
			switch(playB) {
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
					;
					break;
			}
			System.out.println(roleB+"出拳：\t"+temp+"\n");
			
			//-- 3.2比较
			if(playA==1&&playB==3){
				scoreA++;
				System.out.println("哇，你赢了，好厉害！");
			}else if(playA==3&&playB==1){
				scoreB++;
				System.out.println("诶，你输了，好可怕！");
			}else if(playA == playB){
				System.out.println("啊，你们平局咯！");
			}else if(playA > playB) {
				scoreA++;
				System.out.println("哇，你赢了，好厉害！");
			}else{
				scoreB++;
				System.out.println("诶，你输了，好可怕！");
			}
			
			//-- 3.3提示是否继续
			System.out.print("是否开始下一局(y/n)：");
			ifnext = scan.next();
			System.out.println("\n*************************\n");
			
			//-- 4.显示对战局数和积分
			if("y".equals(ifnext)) {
				count++;
				continue;
			}else {
				System.out.println("*************************");
				System.out.println(name+"\tVS\t"+roleB);
				System.out.println("对战次数\t"+count);
				System.out.println("姓名\t\t"+"得分");
				System.out.println(roleB+"\t\t"+scoreB);
				System.out.println(name+"\t\t"+scoreA);
			}
			
			if(scoreA>scoreB){System.out.println("哇，你好棒！");}
		}while("y".equals(ifnext));
		
	}
}