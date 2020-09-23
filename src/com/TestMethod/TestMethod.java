package com.TestMethod;
import com.Calculator.Calculator;
import com.Printer.*;
public abstract class TestMethod {
    int success =0;
    int fails=0;
    TestMethodPrinter testMethodPrinter;
    Calculator calculator;
    StringBuilder testsPrint=new StringBuilder();

    public TestMethod(Calculator calculator, TestMethodPrinter printer) {
        this.calculator=calculator;
        this.testMethodPrinter=printer;
    }
    public abstract void runTest();
    public int getSuccess() {return success; }
    public int getFails() {
        return fails;
    }
    public StringBuilder getTestsPrint() { return testsPrint; }
}
