import java.util.Arrays;

/*
 * 	6.	����һ�ŵ�ͼ,��ͼЧ�����ұ�.(���Ҫ�����ǺŴ�ӡ2.��ͥ��ҵ)
 *  ��ģ�����30�����ţ�m=0��n=0~29
 *  ���ģ���30��������5����m=1~5��n=30
 *  ��ģ���������Ӻ���30����m=6��n=0~29
 *  ���ģ��ٽ�����5����m=7~12��n=30~35
 *  ��ģ��ٽӺ��30����m=13��n=0~29
 */
public class D8_Ex7_drawMap {
	public static void main(String[] args) {
		// �������飬0~100
		String[] array = new String[100];
		
		for(int i=0;i<array.length;i++) {
			// 0~29�����������
			if(i<30) {
				array[i]="*";
				System.out.print(array[i]);
			}else if(i<35){
				// 30~34�س�����������29���ո�
				if(i==30) {
					System.out.println();
				}
				// �����array[i]֮ǰ���29���ո�
				for(int j=0; j<29;j++) { 
					System.out.print(" "); // ���У���1
				}
				array[i]="*";
				System.out.println(array[i]); // ���У���1
			}else if(i<64) {
				// 35~64����������������������
					array[array.length-1 - i]="*"; // ��100-1-i = 99-i
					array[63] = "/"; // ��֤�Ƿ������
					System.out.print(array[array.length-1 - i]); // ���У���1					
			}else if(i<70) {
				//  65~69�س��������2
				array[i]="*";
				System.out.println(array[i]); // ���У���2
			}else {
				// 70~99�����������
				array[i]="*";
				System.out.print(array[i]);
			}
			
		}
		
		
	}
}
