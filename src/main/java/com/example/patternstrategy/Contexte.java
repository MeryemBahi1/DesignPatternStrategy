package org.example;

public class Contexte {
    private Strategy strategy =new DefaultStrategyImpl();
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    void effectuerOperation(){
     System.out.println("***************************");
     strategy.OperationStrategy();
     System.out.println("***************************");
 }
}
