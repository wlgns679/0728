
public class Test1 {
	public static void main(String[] args) {
		// a = 97  A = 65
		int count = 0;
		for(char ch = 65;  ch <=90; ch ++) {
			if(ch  % 10 >= 5) {
				System.out.printf("%c\t", ch);
			}else{
				System.out.printf("%c\t", ch+32);		
			}
			count ++;
			if(count % 5 == 0) System.out.println();
		}
	}
}
