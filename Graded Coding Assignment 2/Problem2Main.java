package com.GreatLearning.GradedAssignment2;

import java.util.*;

public class Problem2Main {
    public static void main(String []args){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter the size of currency denominations: ");
        int n = sc.nextInt();

        System.out.println("Enter the currency denominations value: ");
        int[] currencies = new int[n];
        for(int i=0; i<n; i++){
            currencies[i] = sc.nextInt();
        }

        sort sorting = new sort();

        sorting.mergeSort(currencies,0,currencies.length-1);
        System.out.println("The denominations in decreasing order are: " +Arrays.toString(currencies));

        System.out.println("Enter the amount you want to pay: ");
        int amountToPay = sc.nextInt();

        notesCount count = new notesCount();
        count.countDenominations(currencies,amountToPay);

    }
}
