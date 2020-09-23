package com.Tester;
import com.Calculator.Calculator;
import com.Printer.Printer;
import com.TestMethod.TestMethod;
import com.EvaluationFormula.*;

/**
 * keep modularity- its possible change score formula, printing ,add actions
 */
public class Tester {
    String name;
    Calculator c1;
    Calculator c2;
    Printer printer;
    TestMethod testMethod1;
    TestMethod testMethod2;
    IEvaluationFormula formula;

    public Tester(String name, Calculator c1, Calculator c2, Printer printer, TestMethod testMethod1,TestMethod testMethod2, IEvaluationFormula formula) {
        this.name = name;
        this.c1 = c1;
        this.c2 = c2;
        this.printer = printer;
        this.testMethod1 = testMethod1;
        this.testMethod2 = testMethod2;
        this.formula = formula;
    }

    /**
     * run tests for two calculators
     * calculate accuracy by formula
     * print to console
     */
    public void runTest() throws InterruptedException {
        Thread t1= new Thread(new Runnable() {
            @Override
            public void run() {
                testMethod1.runTest();

            }
        });

        Thread t2= new Thread(new Runnable() {
            @Override
            public void run() {
                testMethod2.runTest();

            }
        });

        t1.run();
        t2.run();

        t1.join();
        t2.join();

        double accuracyC1=formula.evaluate(testMethod1.getSuccess(),testMethod1.getFails());
        double accuracyC2=formula.evaluate(testMethod2.getSuccess(),testMethod2.getFails());

        printer.printByFormat(c1.getName(),c2.getName(),accuracyC1,accuracyC2,testMethod1.getTestsPrint().toString(),testMethod2.getTestsPrint().toString());

    }

}