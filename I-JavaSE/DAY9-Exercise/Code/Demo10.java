/*
 * 
 *��Ŀ������ƹ����ӽ��б������������ˡ��׶�Ϊa,b,c���ˣ��Ҷ�Ϊx,y,z���ˡ�
 *�ѳ�ǩ���������������������Ա����������������
 *a˵������x�ȣ�c˵������x,z�ȣ��������ҳ��������ֵ�������
 */
public class Demo10 {

	public static void main(String[] args) {
		//-- �׶�
		char[] f = {'a','b','c'};
		//-- �Ҷ�
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
