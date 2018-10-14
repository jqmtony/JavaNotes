class multiple1 {
	public static void main(String[] args) {
		int multiple = 1;
		for(int i=1;i<=9;i++) {
			// 最后两个相乘的数字大小一样，可见i=j,j<=i
			for(int j=1;j<=i;j++) {
				multiple = i*j;
				// println 改为 print 不要自动自动换号，\t 式子间间隔
				System.out.print(i+"*"+j+"="+multiple+"\t");
			}
			// 每行输出完了之后，换行，以满足格式
			System.out.println("");
		}
	}
}


class multiple2 {
	public static void main(String[] args) {
		int multiple = 1;
		int i=1;
		int j=1;
		while(i<=9) {
			while(j<=i) {
				multiple = i*j;
				System.out.print(i+"*"+j+"="+multiple+"\t");
			}
			System.out.println("");
			i++;
			j++;
		}
	}
}


