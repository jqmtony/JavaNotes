
public class Demo01 {
	public static void main(String[] args) {
		// ��ӡ9*9
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println("\n");
		}
		System.out.println("----------------------------------");
		
		for (int i = 1; i <= 9 ; i++) {
			//-- ��ӡÿ��ǰ�Ŀո�.
			for (int k = 1; k < i; k++) {
				System.out.print("\t\t");
			}
			for (int j = 1; j <= 9 ; j++) {
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}
	
	
}
