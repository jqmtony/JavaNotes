import java.util.Arrays;

/*
 * 	������Test�������
 */
public class TestOnly {
	public static void main(String[] args) {
		// ����ĵ������
		String[] array = {"5","abcd","aaa","4","a","#%(*","3","abcd","1"};
		for (int i = array.length-1; i >=0; i--) {
			System.out.println("�����±�\t"+i+"\t����Ԫ��\t"+array[i]);
		}
	}
}
