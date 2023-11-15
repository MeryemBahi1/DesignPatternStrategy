package com.example.patternstrategy;

public class DefaultStrategyImpl implements Strategy{
    @Override
    public void OperationStrategy() {
        System.out.println("--------Strategy par défault ------------");
    }
}
