package com.TestMethod;
import com.Calculator.Calculator;
import com.Printer.TestMethodPrinter;
public class AddSampleTest implements ISampleTest {
    @Override
    public Object[] test(Calculator calculator, int success, StringBuilder testsPrint, TestMethodPrinter testMethodPrinter,int fails, double x, double y) {
        double result=calculator.add(x,y);
        if (result==x+y)
            success++;
        else
            fails++;
        testsPrint.append(testMethodPrinter.printTest(x,y,result,"+"));
        Object[] ans=new Object[3];
        ans[0]=success;
        ans[1]=fails;
        ans[2]=testsPrint;
        return ans;
    }
}
