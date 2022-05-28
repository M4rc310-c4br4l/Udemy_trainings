import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double raio = sc.nextDouble();
		double B = Math.PI;
		double area = Math.pow(raio, 2);

		System.out.println("Area = " + area*B);

		sc.close();
	}
}