class SharedResource {
    synchronized void display(String message) {
        System.out.print("[");
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(message + "]");
    }
}

class MyThread extends Thread {
    SharedResource resource;
    String message;

    MyThread(SharedResource resource, String message) {
        this.resource = resource;
        this.message = message;
    }

    public void run() {
        resource.display(message);
    }
}

public class Synchronized_Method {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        MyThread t1 = new MyThread(resource, "Thread1");
        MyThread t2 = new MyThread(resource, "Thread2");
        t1.start();
        t2.start();
    }
}
