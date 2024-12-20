class SharedStatic {
    synchronized static void print(String msg) {
        System.out.print("[");
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            System.out.pritln(e);
        }
        System.out.println(msg + "]");
    }
}

class StaticThread extends Thread {
    String message;

    StaticThread(String message) {
        this.message = message;
    }

    public void run() {
        SharedStatic.print(message);
    }
}

public class SynchronizedStaticMethod {
    public static void main(String[] args) {
        StaticThread t1 = new StaticThread("Static1");
        StaticThread t2 = new StaticThread("Static2");

        t1.start();
        t2.start();
    }
}
