package com.Calculator;
import com.EvaluationFormula.EvaluationFormula;
import com.EvaluationFormula.IEvaluationFormula;
import com.Printer.MyPrinter;
import com.Printer.MyTestMethodPrinter;
import com.Printer.Printer;
import com.Printer.TestMethodPrinter;
import com.TestMethod.*;
import com.Tester.Tester;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// create two calculators
        runSimulation(2);
    }

    private static void runSimulation(int numOfCalculators) throws InterruptedException {
        TestMethodPrinter testMethodPrinter=new MyTestMethodPrinter();

        List<TestMethod> testMethodList= new LinkedList<>();
        List<Calculator> calculators= new LinkedList<>();

        for (int i=1;i<=numOfCalculators;i++){
            Calculator c=new Calculator("Crystal "+i);
            calculators.add(c);
            testMethodList.add(new MyTestMethod(c,testMethodPrinter));
        }


        IEvaluationFormula formula=new EvaluationFormula();
        Printer printer=new MyPrinter();  //print Tester as you like - for example like MyPrinter

        Tester tester=new Tester("Tester", calculators,printer,testMethodList,formula);
        tester.runTest();
    }
}
