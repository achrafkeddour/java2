public class exo3 {
    public static void main(String[] args) {
        tthread1 th1 = new tthread1();
        tthread2 th2 = new tthread2();
        th1.start();
        Thread t = new Thread(th2);
        t.start();
    }
}
class tthread1 extends Thread { //ndirou tthread bach maytkhaletch m3a li 9blou
    public void run() {
        for (char c = 'a'; c <='z'; c++) {
            System.out.println("thread#1"+c);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        }
    }
}

class tthread2 implements Runnable {
    public void run() {
        for (int i = 1; i <=26; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {    
                e.printStackTrace();
            }
        }
    }
}
