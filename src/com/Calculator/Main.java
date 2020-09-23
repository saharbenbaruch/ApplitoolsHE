package com.Calculator;
import com.EvaluationFormula.EvaluationFormula;
import com.EvaluationFormula.IEvaluationFormula;
import com.Printer.MyPrinter;
import com.Printer.MyTestMethodPrinter;
import com.Printer.Printer;
import com.Printer.TestMethodPrinter;
import com.TestMethod.*;
import com.Tester.Tester;
public class Main {

    public static void main(String[] args) throws InterruptedException {
	// create two calculators
        Calculator c1=new Calculator("Crystal 1");
        Calculator c2=new Calculator("Crystal 2");

        IEvaluationFormula formula=new EvaluationFormula();
        Printer printer=new MyPrinter();  //print Tester as you like - for example like MyPrinter
        TestMethodPrinter testMethodPrinter=new MyTestMethodPrinter();

        TestMethod testMethod1=new MyTestMethod(c1,testMethodPrinter);
        TestMethod testMethod2=new MyTestMethod(c2,testMethodPrinter);

        Tester tester=new Tester("Tester", c1,c2,printer,testMethod1,testMethod2,formula);
        tester.runTest();

    }
}
