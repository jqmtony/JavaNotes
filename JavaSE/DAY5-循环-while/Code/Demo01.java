import java.util.Scanner;
class Demo01{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		/*
			1 2 4 3 
			  2 4 3
		 */
		int count = 0;
		String answer = "";
		for(int i = 1 ; i <= 5 ; i ++){
			System.out.println("欢迎光临第" + i + "家店");
			answer = "n";
			for(int j = 1 ; j <= 3 && "n".equalsIgnoreCase(answer); j++){
				System.out.println("是否要离开?(y/n)");
				answer = scan.next();
				if(answer.equalsIgnoreCase("n")){
					System.out.println("第" + i + "家店,购买了第" + j + "件衣服");
					count ++;
				}				
			}
			
			System.out.println("离店结账!");
		}
		System.out.println("一共买了:\t" +count +"件衣服");
	}
}