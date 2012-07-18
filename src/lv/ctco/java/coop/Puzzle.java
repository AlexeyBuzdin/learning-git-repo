package lv.ctco.java.coop;

public class Puzzle {

	private static Box blackBox;

	public static void main(String... args) {
		try{
			Class c = Class.forName("lv.ctco.java.coop.BlackBox");
			blackBox = (Box) c.newInstance();	  
		} catch (ClassNotFoundException e){
			System.out.println("Could not find the desirable class");
		} catch (InstantiationException e) {
			System.out.println("An error has occured");
		} catch (IllegalAccessException e) {
			System.out.println("An error has occured");
		}
		
		puzzleNo1();
		puzzleNo2();
		puzzleNo3();
		puzzleNo4();
		puzzleNo5();
		puzzleNo6();
		puzzleNo7();
		puzzleNo8();
		puzzleNo9();		
		/*
		 * If all puzzles are solved black box will uncover a secret information about GIT technology 
		 */
		System.out.println(blackBox.depuzzle());
	}
	
	/*
	 * Puzzle 1 is to find ninth number in Fibbonaci sequence
	 */
	private static void puzzleNo1() {
		int result = 0;

		blackBox.puzzleNo1(result);
	}

	
	/*
	 * Puzzle 2 asks you to find sixth number that counts both as fizz and buzz
	 * in Fizz Buzz exercise.
	 * 
	 * ?---Fizz Buzz exercise in short ---?
	 * Write a program that prints the numbers from 1 to 100. But for multiples
	 * of three print “Fizz” instead of the number and for the multiples of five
	 * print “Buzz.” For numbers which are multiples of both three and five print “FizzBuzz.”
	 * ----------------------------------- 
	 */
	private static void puzzleNo2() {
		int result = 0;
		/*
		 * Your code goes here
		 */
		blackBox.puzzleNo2(result);
	}

	/*
	 * Puzzle 3 is to find a factorial of five
	 */
	private static void puzzleNo3() {
		int result = 0;
		/*
		 * Your code goes here
		 */
		blackBox.puzzleNo3(result);
	}

	/*
	 * Puzzle 4 requires an array with all numbers from 13 to 53 
	 * that have 7 as their rightmost digit. (eg. 7, 17, 27 ...)
	 */
	private static void puzzleNo4() {
		int result [] = {};
		/*
		 * Your code goes here
		 */
		blackBox.puzzleNo4(result);
	}
	
	/*
	 * Puzzle 5 requires a sum of all squares from 1 to 5
	 */
	private static void puzzleNo5() {
		int result = 0;
		/*
		 * Your code goes here
		 */
		blackBox.puzzleNo5(result);
	}

	/*
	 * Puzzle 6 requires you to convert decimal number 15 to binary number,
	 * and save it to String variable
	 */
	private static void puzzleNo6() {
		String result = "";
		/*
		 * Your code goes here
		 */
		blackBox.puzzleNo6(result);
	}

	/*
	 * Puzzle 7 requires you to convert decimal number 9 to octal number,
	 * and save it to String variable
	 */
	private static void puzzleNo7() {
		String result = "";
		int decimal = 9;
        int octal = 0;
        while(decimal != 0){
            octal *= 10;
            octal += decimal%8;
            decimal /= 8;
        }
        result += octal;
		blackBox.puzzleNo7(result);
	}

	/*
	 * Puzzle 8 requires you to convert decimal number 31 to hex number,
	 * and save it to String variable
	 */
	private static void puzzleNo8() {
		String result = "";
		/*
		 * Your code goes here
		 */
		blackBox.puzzleNo8(result);
	}

	/*
	 * Puzzle 9 requires you to find the sum of all digits that aren't 0
	 * in number 34052 and divide it by its quantity
	 */
	private static void puzzleNo9() {
		double result = 0;
		/*
		 * Your code goes here
		 */
		blackBox.puzzleNo9(result);
	}

}
