package knock;

public class ticket extends Thread {
    // 静态共享
    static int num = 0;
    // 大锁对象，唯一锁
    static Object o = new Object();

    public ticket(String string) {
        super(string);
    }

    @Override
    public void run() {
        
            while (true) {
                // 唯一对象加锁 o
                // 字节码对象加锁
                synchronized (ticket.class) {
                if (num < 1000) {
                    try {
                        ticket.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    num++;
                    System.out.println(getName() + "正在售出第" + num + "张票!!!");
                } else {
                    break;
                }
            }

        }
    }

    public static void main(String[] args) {
        ticket t1 = new ticket("窗口1");
        ticket t2 = new ticket("窗口2");
        t1.start();
        t2.start();

    }
}
