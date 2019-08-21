package prob2;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		System.out.print("두 정수와 연산자를 입력하세요: ");
		
		Scanner scanner = new Scanner(System.in);
		
		String sentence = scanner.nextLine();
		String[] array = sentence.split(" ");
		int n1 = Integer.parseInt(array[0]);
		int n2 = Integer.parseInt(array[1]);
		String operation = array[2];
		
		if(operation.equals("+")) {
			Add add = new Add();
			System.out.println(add.calculate(n1, n2));
		}
		else if(operation.equals("-")) {
			Sub sub = new Sub();
			System.out.println(sub.calculate(n1, n2));
		}
		else if(operation.equals("*")) {
			Mul mul = new Mul();
			System.out.println(mul.calculate(n1, n2));
		}
		else if(operation.equals("/")) {
			Div div = new Div();
			System.out.println(div.calculate(n1, n2));
		}

	}

}
