package com.Printer;

public class MyPrinter extends Printer {

    public MyPrinter() { }

    @Override
    public void printByFormat(String c1Name,String c2Name,double accuracyC1, double accuracyC2,String testDesc1, String testDesc2) {


        System.out.println("Calculator "+ c1Name+ ":");
        System.out.println(testDesc1);

        System.out.println("Calculator "+ c2Name +":");
        System.out.println(testDesc2);


        System.out.println(c1Name+ " Success rate: "+ accuracyC1);
        System.out.println(c2Name + " Success rate: "+ accuracyC2);

        if (accuracyC1>accuracyC2)
            System.out.println(c1Name + " is better");
        else if (accuracyC1< accuracyC2)
            System.out.println(c2Name+ " is better");
        else
            System.out.println(c1Name+ " and "+ c2Name +" have the same accuracy");
    }
}
