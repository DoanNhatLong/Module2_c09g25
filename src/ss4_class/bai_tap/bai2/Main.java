package ss4_class.bai_tap.bai2;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        StopWatch test=new StopWatch();
        test.start();
        Thread.sleep(2500);
        test.end();
        System.out.println( "Thời gian chờ là:" + test.getTime());
    }
}
