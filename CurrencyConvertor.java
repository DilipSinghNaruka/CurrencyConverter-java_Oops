import java.util.Scanner;

class CurrencyConvertor {
	static int output = 0;

	class doller {

		doller(int data) {
			output = data * 100;
			System.out.println("Output :- " + data + " dollars is " + output + " rupees.");
		}

	}

	class rupees {
		rupees(int data) {
			output = data / 100;
			System.out.println("Output :- " + data + " rupees is " + output + " dollars.");
		}
	}

	static boolean exit() {
		return false;
	}

	public static void main(String args[]) {
		CurrencyConvertor obj = new CurrencyConvertor();
		Scanner sc = new Scanner(System.in);

		int d;
		while (true) {
			System.out.println("=====================================");
			System.out.println("1 -> Doller to Rupees");
			System.out.println("2 -> Ruppes to Doller ");
			System.out.println("3 -> Exit ");
			System.out.println("Enter Choice -> ");
			int value = sc.nextInt();
			switch (value) {
				case 1:
					System.out.print("Enter you doller -> ");
					d = sc.nextInt();
					doller dl = obj.new doller(d);
					break;
				case 2:
					System.out.println("Enter you rupees -> ");
					d = sc.nextInt();
					rupees rp = obj.new rupees(d);
					break;
				case 3:
					break;

			}

			if (value == 3) {
				break;
			}
		}

	}

}