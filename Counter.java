package counter;

import java.util.Random;
import java.util.Scanner;

public class Counter {

	public static void main(String[] args) {
		Random random=new Random();
		int counterA,counterB,counterResult;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to CounterPro!Wish you hava fun!");
		for (;;) {
		
			counterA=random.nextInt(100);
			counterB=random.nextInt(100);
			int choose=choice();
			switch (choose) {
			case 1:
	
				System.out.println(counterA+"+"+counterB+"=？");
				counterResult=scanner.nextInt();
				if (counterResult==(counterA+counterB)) {
					System.out.println("You are right！The result is"+(counterA+counterB));
				}else {
					System.out.println("Sorry！The result is"+(counterA+counterB));
				}
				break;

			case 2:				
				System.out.println(counterA+"-"+counterB+"=？");
				counterResult=scanner.nextInt();
				if (counterResult==(counterA-counterB)) {
					System.out.println("You are right！The result is"+(counterA-counterB));
				}else {
					System.out.println("Sorry！The result is"+(counterA-counterB));
				}
				break;
			case 3:
				
				System.out.println(counterA+"X"+counterB+"=？");
				counterResult=scanner.nextInt();
				if (counterResult==(counterA*counterB)) {
					System.out.println("You are right！The result is"+(counterA*counterB));
				}else {
					System.out.println("Sorry！The result is"+(counterA*counterB));
				}
				break;
			case 4:
				
				System.out.println(counterA+"/"+counterB+"=？");
				counterResult=scanner.nextInt();
				if (counterResult==(counterA/counterB)) {
					System.out.println("You are right！The result is"+(counterA/counterB));
				}else {
					System.out.println("Sorry！The result is"+(counterA/counterB));
				}
				break;
			case 5:
				
				System.out.println("GoodBye!");
				System.exit(0);
		
			default:
				System.out.println("Sorry！You hava iuput a error number!");
				
				break;
			}
			scanner.close();
		}
		
	}

	private static  int choice() {
		// TODO Auto-generated method stub
		System.out.println("Choice your plan !\n1、add\n2、subtract\n3、multiply\n4、divide\n5、break");
		Scanner scanner=new Scanner(System.in);
		int choice =scanner.nextInt();
		scanner.close();
		return choice;
	}
	
}