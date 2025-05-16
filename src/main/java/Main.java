package main.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to LLBank , you can get loan at anytime ]");

        System.out.println(getLoan(10 , 5 , 2));

    }



  static  int getLoan(int p , int n , int r) throws ParseException {
        NumberFormat format = NumberFormat.getNumberInstance(Locale.UK);
        int amount = p *(r * n);
        String finalAmount= NumberFormat.getInstance().format(amount);


        return (int ) format.parse(finalAmount);


  }
}
