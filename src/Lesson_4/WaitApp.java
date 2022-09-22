package Lesson_4;

public class WaitApp {
    private final Object obj = new Object();
    private char current = 'A';

    public static void main(String[] args) {
        WaitApp waitApp = new WaitApp();
        new Thread(waitApp::printA).start();
        new Thread(waitApp::printB).start();
        new Thread(waitApp::printC).start();
    }

    public  void printA() {
        synchronized (obj) {
            try {
                for (int i = 0; i <= 5; i++) {
                    while (current != 'A') {
                        obj.wait();
                    }
                    System.out.println("A");
                    current = 'B';
                    obj.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printB() {
        synchronized (obj) {
            try {
                for (int i = 0; i <= 5; i++) {
                    while (current != 'B') {
                        obj.wait();
                    }
                    System.out.println("B");
                    current = 'C';
                    obj.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printC() {
        synchronized (obj) {
            try {
                for (int i = 0; i <= 5; i++) {
                    while (current != 'C') {
                        obj.wait();
                    }
                    System.out.println("C");
                    current = 'A';
                    obj.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
