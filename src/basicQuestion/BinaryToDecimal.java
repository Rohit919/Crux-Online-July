package basicQuestion;

import java.util.*;
public class BinaryToDecimal {
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int bpow = 1;
		int dnum = 0;
		while(num > 0) {
			int rem = num % 10;
			num = num / 10;
			dnum += rem*bpow;
			bpow *= 2;
		}
		System.out.print(dnum);

    }
}