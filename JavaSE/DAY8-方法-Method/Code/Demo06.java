
public class Demo06 {

	public static void main(String[] args) {
		
		String[] array = {"ab","a","abc","de","abcde"};
		
		sortArrayDesc(array);
		for (String str : array) {
			System.out.println(str);
		}
		
		
	}

	private static void sortArrayDesc(String[] array) {
		if (array == null || array.length == 0) {
			System.out.println("参数有问题!");
			return ;
		}
		
		String temp = "";
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j].length() < array[j+1].length()) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
	}
}
