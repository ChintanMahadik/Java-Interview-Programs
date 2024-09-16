package com.chinz.category.generic;

public class TaxRateProblem {
    public static void main(String[] args) {
        double input1[] = new double[]{0, 1000, 2000};
        double input2[] = new double[]{0.1, 0.5, 0.7};
        int income = 2700;
        System.out.println("Calculating Tax on Income");

        System.out.println(calculateTax(input1, input2, income));
    }

    private static double calculateTax(double[] arr, double[] input2, int income) {
        double rate = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (income > arr[i] && income < arr[i + 1]) {
                rate += (income - arr[i]) * input2[i];
            }

            if (income > arr[i] && income > arr[i + 1]) {
                rate += (arr[i + 1] - arr[i]) * input2[i];
            }
        }

        if (income > arr[arr.length - 1]) {
            rate += (income - arr[arr.length - 1]) * input2[input2.length - 1];
        }

        return rate;
    }
}
