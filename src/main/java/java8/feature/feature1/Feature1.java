package java8.feature.feature1;

/**
 * @author Vekaco
 * @comment using lambda expression to be the replacement of anonymous inner class.
 */
public class Feature1 {
    public static void main(String[] args) {
        //traditional code before java1.8
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread print from traditional runnable anonymous inner class...");
            }
        }).start();

        // traditional type2
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("thread print from traditional type2...");
            }
        };
        runnable.run();

        //with lambda expression 1
        new Thread(()-> System.out.println("thread print from lambda expression1")).start();

        //with lambda expression 2
        Runnable runnable2 = ()-> System.out.println("thread print from lambda expression2");
        runnable2.run();
    }
}
