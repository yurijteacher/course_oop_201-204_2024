package ua.com.kneu.lecture3.behavioral.stategy;

public class Main {

    public static void main(String[] args) {

        StrategyAdd add = new StrategyAdd();

        ContextStrategy context = new ContextStrategy(add);
        System.out.println(context.execute(5, 6));

        StrategyDiv div = new StrategyDiv();
        context.setStrategy(div);
        System.out.println(context.execute(6, 5));

        StrategySub sub = new StrategySub();
        context.setStrategy(sub);
        System.out.println(context.execute(6, 5));

        StrategyMul mul = new StrategyMul();
        context.setStrategy(mul);
        System.out.println(context.execute(5, 5));

    }

}
