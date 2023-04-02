package com.greatlearning.iitr.dsa.labsession2;
import java.util.Scanner;

public class PayMoneyTransactions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of transaction array: ");
        int n = scanner.nextInt();
        int[] transactions = new int[n];
        System.out.print("Enter the values of array: ");
        for (int i = 0; i < n; i++) {
            transactions[i] = scanner.nextInt();
        }
        System.out.print("Enter the total number of targets that need to be achieved: ");
        int numTargets = scanner.nextInt();
        
        for (int i = 0; i < numTargets; i++) {
            System.out.print("Enter the value of target: ");
            int target = scanner.nextInt();
            int runningSum = 0;
            int j = 0;
            while (j < n) {
                runningSum += transactions[j];
                if (runningSum >= target) {
                    System.out.println("Target achieved after " + (j+1) + " transactions");
                    break;
                }
                j++;
            }
            if (j == n) {
                System.out.println("Target not achieved");
            }
        }
        
        scanner.close();
    }
}
