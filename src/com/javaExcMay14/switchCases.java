package com.javaExcMay14;

import java.util.Scanner;

public class switchCases {
    public static void main(String[] args) {
        Scanner charObj = new Scanner(System.in);
        System.out.println("Enter a character between A - Z. ");
        char userChar = Character.toUpperCase(charObj.next().charAt(0));

        switch (userChar){
            case 'A':
                System.out.println("Apple");
                break;
            case 'B':
                System.out.println("Banana");
                break;
            case 'C':
                System.out.println("Cherries");
                break;
            case 'D':
                System.out.println("Dragon Fruit");
                break;
            case 'E':
                System.out.println("Elder Berry");
                break;
            default:
                System.out.println("Not in Fruit Basket");
        }

    }
}




