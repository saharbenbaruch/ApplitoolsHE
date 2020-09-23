package com.EvaluationFormula;

public class EvaluationFormula implements IEvaluationFormula {
    @Override
    public double evaluate(int success, int fails) {
        if (success+fails!=0)
        return success/(double)(success+fails);

        return 0;
    }
}
