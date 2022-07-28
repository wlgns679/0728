
public class ForDemo {
	public static void main(String[] args) {

		int count = 0;
		for(int i = 20; i <= 180; i ++) {
			if(i % 7 == 0) {
				System.out.print(i + "\t");
				count ++;
				if(count % 5 == 0) System.out.println();
			}
		}
	}

}
