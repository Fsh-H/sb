/**
 * @author FSH
 * version 1.0
 */
public class Test {
    @org.junit.Test
    public void A(){
        byte a=100,b=100,c;
        c=(byte)(a+b);
        System.out.println(c);

    }

    public static void a(){
          /*  Runnable runnable = new Runnable()
            {
                private int i;
                public void run() {
                    i++;

                System.out.println(Thread.currentThread().getName() + "执行完成"+i); }
            };
            Thread t1 = new Thread(runnable, "t1");
            Thread t2 = new Thread(runnable, "t2");
            Thread t3 = new Thread(runnable, "t3"); try
            { t1.start(); t1.join(); t2.start(); t2.join(); t3.start();
                t3.join();
            } catch (InterruptedException e)
            { e.printStackTrace();
            }*/


            final Thread t1 = new Thread(new Runnable() {

                @Override
                public void run() {
                    System.out.println("t1");
                }
            });
            final Thread t2 = new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        // 引用t1线程，等待t1线程执行完
                        t1.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("t2");
                }
            });
            Thread t3 = new Thread(new Runnable() {

                @Override
                public void run() {
                    try {
                        // 引用t2线程，等待t2线程执行完
                        t2.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("t3");
                }
            });
            t1.start();//这里三个线程的启动顺序可以任意，大家可以试下！
            t2.start();
            t3.start();
        }



    public static void main(String[] args) {
        a();

    }

}
