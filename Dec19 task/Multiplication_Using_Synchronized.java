class Multiplication {
    
    synchronized void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + number + " x " + i + " = " + (number * i));
            try {
                Thread.sleep(50); 
            } catch (InterruptedException e) {
               System.out.println(e);
            }
        }
    }
}

class MultiplicationThread extends Thread {
    Multiplication multiplication;
    int number;

    MultiplicationThread(Multiplication multiplication, int number) {
        this.multiplication = multiplication;
        this.number = number;
    }

    public void run() {
        multiplication.printTable(number);
    }
}

public class Multiplication_Using_Synchronized {
    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();

        
        MultiplicationThread thread1 = new MultiplicationThread(multiplication, 5);
        MultiplicationThread thread2 = new MultiplicationThread(multiplication, 7);

        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        thread1.start();
        thread2.start();
    }
}
