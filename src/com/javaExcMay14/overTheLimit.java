package com.javaExcMay14;

public class overTheLimit {
    public static void main(String[] args) {
        double firstNumber = 20d;
        double secondNumber = 80d;
        System.out.println("Sum of two double values, multiplied with 25 is : "+ (firstNumber+secondNumber)*25);

        if ((((firstNumber+secondNumber)*25)%40)<=20){
            System.out.println("Total is under the limit");
        }
        else{
            System.out.println("Total is over the limit");
        }
    }
}
