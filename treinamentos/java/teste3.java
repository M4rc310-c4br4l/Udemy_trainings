import java.util.Scanner;

public class teste3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int a, b, c, d;

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

		int AB = a*b;
		int CD = c*d;
		int diff = AB-CD;

		System.out.println(diff);

		sc.close();
	}
}