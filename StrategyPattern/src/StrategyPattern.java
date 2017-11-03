public class StrategyPattern {
    public static void main(String[] args){
        Context context1=new Context(new OperationAdd());
        System.out.println("2 + 5 = "+context1.executeStrategy(2,5));

        Context context2=new Context(new OperationMultiply());
        System.out.println("2 * 5 = "+context2.executeStrategy(2,5));

        Context context3=new Context(new OperationSubstract());
        System.out.println("2 - 5 = "+context3.executeStrategy(2,5));
    }
}
