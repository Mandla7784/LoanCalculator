package main.java;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class Main {
    public static void main(String[] args) throws ParseException    {
        System.out.println("Welcome to LLBank , you can get loan at anytime ]");
        System.out.println(getLoan(10 , 5 , 2));
    }

    /**
     *
     * @param p
     * @param n
     * @param r
     * @return
     * @throws ParseException
     */
  static   String  getLoan(int p , int n , int r) throws ParseException {
        int interest = (p * r * n) / 100;
        int totalAmount = p + interest;
         NumberFormat format = NumberFormat.getCurrencyInstance(Locale.UK);
        return  format.format(totalAmount);

  }
}
