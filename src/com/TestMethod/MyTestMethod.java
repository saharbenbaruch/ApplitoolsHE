package com.TestMethod;

import com.Calculator.Calculator;
import com.Printer.TestMethodPrinter;

public class MyTestMethod extends TestMethod {


    public MyTestMethod(Calculator calculator, TestMethodPrinter printer) {
        super(calculator, printer);
    }

    @Override
    public void runTest() {
        for (int i=0;i<10;i++){
            double x= Math.random();
            double y=Math.random();
            double result=calculator.add(x,y);
            if (result==x+y)
                success++;

            else
                fails++;

            testsPrint.append(testMethodPrinter.printTest(x,y,result,"+"));
        }
    }
}
