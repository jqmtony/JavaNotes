import java.util.Scanner;

public class ifrepeat {

	public static void main(String[] args) {
		//-- 1.�ṩ����(��������������)
		int[] array = {8,4,2,1,23,344,12,12,12,344,2,4,8};
		
		//-- 2.ѭ����ӡ�����е�Ԫ��
		//-- ������Դ array ��ȡ int ���͵�Ԫ�ر��浽i����ȥ.
		for(int i : array) {
			System.out.println(i);
		}
		
		//-- 3.������������Ԫ�صĺ�
		int sum = 0;
		/*
		 * For-Each �Ǽ�ǿFor.�����˵������Ա������м�ǿ.
		 * ���Ա������ٶȻ����ͨ��ForҪ��һ��.
		 * ���ֻ�ǵ����ı���.����Ҫʹ���±��������Ƽ�ʹ�ü�ǿfor
		 */
		for(int i : array) {
			sum +=i;
		}
		System.out.println("��:\t" + sum);

		sum = 0;
		for(int i = 0 ; i < array.length ; i ++) {
			sum += array[i];
		}
		System.out.println("��:\t" + sum);
		
		//-- 4.�Ӽ���¼��һ����.�ж��������Ƿ��������
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please Enter A Number:\t");
//		int target = scan.nextInt();
//		
		//-- �������е�Ԫ�ؽ��б���.ȡÿһ��Ԫ�غ�¼���Ԫ�ؽ��бȽ�.�ж��Ƿ���ͬ
//		int index = 0;
//		for(int i : array) {
//			if(i == target){
//				System.out.println("������Ԫ��.�±�Ϊ:\t" + index);
//				break;
//			}
//			index ++;
//		}
//		
		// ֵ��ͬ������±�
		for(int i=0;i<array.length;i++) {
			for(int j=0; j<array.length-1;j++) {
				if(array[i]==array[j]) {
					if(i!=j) {
						System.out.println("----------------------------");
						System.out.println("��"+i+"��Ԫ�����"+j+"��Ԫ�ص�ֵ��ͬ���ֱ�Ϊ��"+array[i]+"��"+array[j]);
						System.out.println("�˴��±�i��ֵΪ��"+i);
						System.out.println("�˴��±�j��ֵΪ��"+j);
						System.out.println("�˴�array[i])��ֵΪ��"+array[i]);
						System.out.println("�˴�array[j])��ֵΪ��"+array[j]);
					}
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
