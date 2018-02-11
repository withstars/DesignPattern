public class Main {

    public static void main(String[] args) {

        //被观察对象
        Subject subject=new Subject();

        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(10);
        subject.setState(20);
    }
}
