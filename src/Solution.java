/*   Created by IntelliJ IDEA.
 *   Author: Ompal Singh (Ompal-Singh)
 *   Date: 10/7/2021
 *   Time: 2:11 PM
 *   File: Solution.java
 */
import java.io.*;
import java.util.*;
import java.math.*;
import java.text.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int sum = 0;
        for ( int i = 0; i<length; i++) {
            sum += input.nextInt();
        }
        System.out.println(sum);
    }
}

