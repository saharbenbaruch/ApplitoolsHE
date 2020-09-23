package com.Printer;

public class MyTestMethodPrinter extends TestMethodPrinter {

    @Override
    public String printTest(double x, double y,double result, String action) {
        String isCorrect="(correct)";
        if (x+y!=result)
            isCorrect="(error)";
       return (x+" "+action+" "+y+" = "+result+"      "+isCorrect+"\n");
}
}
