package com.TestMethod;
import com.Calculator.Calculator;
import com.Printer.TestMethodPrinter;
public interface ISampleTest {
Object[] test(Calculator calculator, int success, StringBuilder testsPrint, TestMethodPrinter testMethodPrinter, int fails, double x, double y);
}
