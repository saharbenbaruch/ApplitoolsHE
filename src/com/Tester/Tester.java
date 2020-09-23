package com.Tester;
import com.Calculator.Calculator;
import com.Printer.Printer;
import com.TestMethod.TestMethod;
import com.EvaluationFormula.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * keep modularity- its possible change score formula, printing ,add actions
 */
public class Tester {
    String name;
    List<Calculator> calculatorList;
    Printer printer;
    List<TestMethod> testMethodList;
    IEvaluationFormula formula;

    public Tester(String name, List<Calculator> calculatorList, Printer printer, List<TestMethod> testMethodList, IEvaluationFormula formula) {
        this.name = name;
        this.calculatorList=calculatorList;
        this.printer = printer;
        this.testMethodList=testMethodList;
        this.formula = formula;
    }
    /**
     * run tests for two calculators
     * calculate accuracy by formula
     * print to console
     */
    public void runTest() throws InterruptedException {
        //Run Tests using Threads
        List<Thread> threads= new LinkedList<>();

        for (int i=0;i<calculatorList.size();i++){
            Thread t= new MyThread(i) {
                @Override
                public void run() {
                    testMethodList.get(getK()).runTest();
                }
            };
            threads.add(t);
        }

        for (Thread t: threads){
            t.run();
        }
        for (Thread t: threads){
            t.join();
        }
        //Calculate Accuracy
        // - String Calculator Name,
        // - accuracy rate
        //- tests print
        List<Object[]> info=new ArrayList<>();
        for (int i=0;i<calculatorList.size();i++){
            Object[] calculatorInfo=new Object[3];
            calculatorInfo[0]=calculatorList.get(i).getName();
            TestMethod testMethod= testMethodList.get(i);
            calculatorInfo[1]=formula.evaluate(testMethod.getSuccess(),testMethod.getFails());
            calculatorInfo[2]=testMethod.getTestsPrint().toString();
            info.add(calculatorInfo);
        }
        printer.printByFormat(info);
    }
}


