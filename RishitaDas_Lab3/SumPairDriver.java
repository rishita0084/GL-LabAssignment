package com.GreatLearning.GradedAssignment3;
import com.GreatLearning.GradedAssignment3.SumPair.Node;

import java.util.Scanner;

public class SumPairDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Node root = null;
        SumPair findSP = new SumPair();
        root=findSP.insert(root,40);
        root=findSP.insert(root,20);
        root=findSP.insert(root,60);
        root=findSP.insert(root,10);
        root=findSP.insert(root,30);
        root=findSP.insert(root,50);
        root=findSP.insert(root,110);

        System.out.println("Enter the sum- ");
        int sum = sc.nextInt();
        findSP.findPairWithGivenSum(root, sum);

    }
}
