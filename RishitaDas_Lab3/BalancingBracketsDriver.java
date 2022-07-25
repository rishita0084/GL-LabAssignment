package com.GreatLearning.GradedAssignment3;
import java.util.*;
public class BalancingBracketsDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string of brackets- ");
        String brackets =sc.nextLine();
        boolean isBalanced=BalancingBrackets.checkBalancingBracktes(brackets);
        if(isBalanced) {
            System.out.println("Balanced bracktes");
        }
        else {
            System.out.println("Unbalanced brackets");
        }
    }
}
