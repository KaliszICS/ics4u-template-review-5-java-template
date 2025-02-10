import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		System.out.println(Math.abs(s.nextDouble()));
		s.nextLine()
	}

	public static void q2() {
		//Write question 2 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = s.nextDouble();
		s.nextLine()
		System.out.print("Input another number: ");
		double num2 = s.nextDouble();
		s.nextLine()
		System.out.println(Math.floor(num/num2));
		System.out.println(Math.ceil(num/num2));
	}

	public static void q3() {
		//Write question 3 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		System.out.println(Math.round(Math.sqrt(s.nextDouble())));
		s.nextLine()
	}

	public static void q4() {
		//Write question 4 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = s.nextDouble();
		s.nextLine()
		System.out.print("Input another number: ");
		double num2 = s.nextDouble();
		s.nextLine()
		System.out.println(Math.pow(num,num2));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num = s.nextDouble();
		s.nextLine()
		System.out.print("Input another number: ");
		double num2 = s.nextDouble();
		s.nextLine()
		System.out.print("Input one more number: ");
		double num3 = s.nextDouble();
		s.nextLine()
		System.out.println(Math.max(num, Math.max(num2, num3)));
		System.out.println(Math.min(num, Math.min(num2, num3)));
	}
	public static void q6() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		System.out.println(s.nextLine().contains("on"));
	}
	public static void q7() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		System.out.println(s.nextLine().equalsIgnoreCase("mango"));
	}
	public static void q8() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = s.nextLine();
		System.out.print("Input a letter: ");
		String letter = s.nextLine();
		System.out.println(word.indexOf(letter));
		System.out.println(word.lastIndexOf(letter));
	}

	public static void q9() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		System.out.println("Your sentecne is " + s.nextLine().length() + " characters long");
	}
	public static void q10() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = s.nextLine();
		System.out.print("Input a word to replace: ");
		String word = s.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String word2 = s.nextLine();
		System.out.println(sentence.replaceAll(word, word2);
	}

	public static void q11() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sentence = s.nextLine();
		System.out.println(sentence.toUpperCase());
		System.out.println(sentence.toLowerCase());
	}

	public static void q12() {
		//Write question 5 code here
		Scanner s = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = s.nextLine();
		System.out.println(word.substring(0, 5));
		System.out.println(word.substring(word.length() - 4, word.length()));
	}
	

}
