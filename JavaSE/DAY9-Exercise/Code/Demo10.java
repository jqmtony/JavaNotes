/*
 * 
 *题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。
 *已抽签决定比赛名单。有人向队员打听比赛的名单。
 *a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。
 */
public class Demo10 {

	public static void main(String[] args) {
		//-- 甲队
		char[] f = {'a','b','c'};
		//-- 乙队
		char[] s = {'x','y','z'};
		
		for (int i = 0; i < f.length; i++) {
			for (int j = 0; j < s.length; j++) {
				if (f[i] == 'a' && s[j] == 'x') {
					continue;
				}else if(f[i] == 'a' && s[j] == 'y') {
					continue;
				}else if(f[i] == 'c' && s[j] == 'x' || f[i] == 'c' && s[j] == 'z' ) {
					continue;
				}else if(f[i] == 'b' && s[j] == 'y' || f[i] == 'b' && s[j] == 'z') {
					continue;
				}else {
					System.out.println(f[i] + "\tVS\t" + s[j]);
				}
				
			}
		}
	}
}
