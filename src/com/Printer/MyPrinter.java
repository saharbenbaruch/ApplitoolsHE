package com.Printer;
import java.util.List;


public class MyPrinter extends Printer {

    public MyPrinter() { }

    @Override
    public void printByFormat(List<Object[]> info) {


        for (int i=0;i<info.size();i++){
            System.out.println("Calculator "+ info.get(i)[0]+ ":");
            System.out.println(info.get(i)[2]);
        }

        double best=0.0;
        for (int i=0;i<info.size();i++) {
            double rate=(double)info.get(i)[1];
            System.out.println(info.get(i)[0] + " Success rate: " + rate);
            if (rate>best) best=rate;

        }
        System.out.printf("Best: ");
        for (int i=0;i<info.size();i++){
            if((double)info.get(i)[1]==best)
                System.out.printf(info.get(i)[0]+ " ");
        }
    }
}
