package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //get input
        System.out.println("Input n and k respectively separated by a space");
        String num = sc.nextLine();
        String[] splitnum = num.split("\\s+");

        int n = Integer.parseInt(splitnum[0]);
        int k = Integer.parseInt(splitnum[1]);

        System.out.println("Enter the array elements separated by space");
        String arrayInput = sc.nextLine();
        String[] splitString = arrayInput.split("\\s+");
        int[] arrayElements = new int[splitString.length];


        for (int i = 0; i < splitString.length; i++) {
            arrayElements[i] = Integer.parseInt(splitString[i]);
        }

        Arrays.sort(arrayElements);

        int leastCost = 0;
        int totalArticles = n * 2;

        for (int j = 1; j < arrayElements.length; j++) {
            leastCost += arrayElements[j];
        }


        leastCost += (arrayElements[0] * (totalArticles - (arrayElements.length)));


        System.out.println(leastCost);
    }

}
