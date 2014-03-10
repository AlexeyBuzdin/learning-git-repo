package lv.ctco.java.coop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Puzzle {

    private static Box blackBox;

    public static void main(String... args) {
        precook();

        puzzleNo1();
        puzzleNo2();
        puzzleNo3();
        puzzleNo4();
        puzzleNo5();
        puzzleNo6();
        puzzleNo7();
        puzzleNo8();
        puzzleNo9();
        puzzleNo10();


        /*
         * If all puzzles are solved black box will uncover a secret information about GIT technology
         */
        printResults();

    }

    /*
     * Puzzle 1 is to find ninth number in Fibbonaci sequence
     */
    private static void puzzleNo1() {
        int result = 0;
        int counter = 1;
        int first = 0;
        int second = 1;
        while (counter < 9) {
            int x = second;
            second = first+second;
            first = x;
            counter++;
        }

        blackBox.puzzleNo1(second);
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
        int n = 100;
        int count = 0;
        int end = 6;
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                count++;
                //System.out.print("FizzBuzz!");
                if(count == end) result = i;
            }
            else if(i % 3 == 0) ;//System.out.print("Fizz ");
            else if(i % 5 == 0) ;//stem.out.print("Buzz ");
            //else System.out.print(" " + i + " ");
        }

        //System.out.println("\n" + result);
        blackBox.puzzleNo2(result);
    }

    /*
     * Puzzle 3 is to find a factorial of five
     */
    private static void puzzleNo3() {
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        int result = fact;

        blackBox.puzzleNo3(result);
    }

    /*
     * Puzzle 4 requires an array with all numbers from 13 to 53
     * that have 7 as their rightmost digit. (eg. 7, 17, 27 ...)
     */
    private static void puzzleNo4() {
        int result [] = {};
        List<Integer> res=new ArrayList<Integer>();
        for(int i=13; i<54; i++)
            if(i-i/10*10==7)
                res.add(i);
        int size=res.size();
        result=new int[size];
        for(int i=0;i<size;i++){
            result[i]=res.get(i);
        }
        blackBox.puzzleNo4(result);
    }

    /*
     * Puzzle 5 requires a sum of all squares from 1 to 5
     */
    private static void puzzleNo5() {
        int result = 0;

        for (int i : Arrays.asList(1, 2, 3, 4, 5) ) {
            result += i*i;
        }

        blackBox.puzzleNo5(result);
    }

    /*
     * Puzzle 6 requires you to convert decimal number 15 to binary number,
     * and save it to String variable
     */
    private static void puzzleNo6() {
        String result = "1111";

        blackBox.puzzleNo6(result);
    }

    /*
     * Puzzle 7 requires you to convert decimal number 9 to octal number,
     * and save it to String variable
     */
    private static void puzzleNo7() {
        String result = "11";

        blackBox.puzzleNo7(result);
    }

    /*
     * Puzzle 8 requires you to convert decimal number 31 to hex number,
     * and save it to String variable
     */
    private static void puzzleNo8() {
        String result = "1F";

        blackBox.puzzleNo8(result);
    }

    /*
     * Puzzle 9 requires you to find the sum of all digits that aren't 0
     * in number 34052 and divide it by its quantity
     */
    private static void puzzleNo9() {
        double result = (3+4+5+2)/4.0;

        blackBox.puzzleNo9(result);
    }

    /*
     * Puzzle 9 requires you to find the sum of all digits that aren't 0
     * in number 34052 and divide it by its quantity
     */
    private static void puzzleNo10() {
        double result = (3+4+5+2)/4.0;

        blackBox.puzzleNo9(result);
    }










    private static void precook() {
        try{
            Class c = lv.ctco.java.coop.BlackBox.class;
            blackBox = (Box) c.newInstance();
        } catch (Exception e){
            throw new RuntimeException("Could not find the desirable class");
        }
    }

    private static void printResults() {

        System.out.println(blackBox.depuzzle());
    }

}
