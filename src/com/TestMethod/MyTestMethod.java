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
            ISampleTest sample= new AddSampleTest();
            Object[] info=sample.test(calculator,success,testsPrint,testMethodPrinter,fails,x,y);
            success=(int)info[0];
            fails=(int)info[1];
            testsPrint=(StringBuilder) info[2];
        }
    }
}
