package com.GreatLearning.LabAssingmnent2;

public class notesCount {
    void countDenominations(int arr[], int amount) {
        int[] countArray = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] <= amount) {
                countArray[i] = amount/arr[i];
                amount = amount%arr[i];
                if(amount == 0) {
                    break;
                }
            }
        }
        if(amount != 0) {
            System.out.println("Exact payment cannot be made!");
        } else {
            for(int i=0; i<countArray.length; i++) {
                if(countArray[i] != 0)
                    System.out.println("Denomination of "+arr[i] +" by a count of: "+countArray[i]);
            }
        }
    }
}
