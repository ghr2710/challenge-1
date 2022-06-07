import java.util.Random;
import java.lang.Math;

/* 
Given an alphanumeric string made up of digits and lower case Latin characters only, find the sum of all the digit characters in the string.

Input
The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow.
Each test case is described with a single line containing a string S, the alphanumeric string.
Output
For each test case, output a single line containing the sum of all the digit characters in that string.
Constraints
1 ≤ T ≤ 1000
1 ≤ |S| ≤ 1000, where |S| is the length of the string S.
Example
Input:
1
ab1231da
Output:
7

Explanation
The digits in this string are 1, 2, 3 and 1. Hence, the sum of all of them is 7.
*/

public class Digits {

    public static void digs(int n, String[] input) {
        int c = 0;
        while(c < n){
            String word = input[c];
            int tot = 0;
            for (char ch: word.toCharArray()) {
                try{
                    String val = Character.toString(ch);
                    tot = tot + Integer.parseInt(val);
                }
                catch(Exception e){
                }
            }
            System.out.println(tot);
            c++;
        }
    }

    public static void main(String[] args) {
        String [] input = {"1plus1plus1", "thereare3ways2win5games", "ab1231da"};
        System.out.println("INPUT");
        System.out.println("3");
        System.out.println("1plus1plus1");
        System.out.println("thereare3ways2win5games");
        System.out.println("ab1231da\n");
        System.out.println("OUTPUT");
        digs(3, input);
    }

}