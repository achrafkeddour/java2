class thread1 extends Thread {
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("Bonjour !");
            try {
                sleep(1000);
            }
            catch(InterruptedException e) {
                e.printStackTrace(); //afficher le type d'exception
            }
        }
    }
}
class thread2 extends Thread {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Salut !");
            try {
                sleep(2000);
            }
            catch(InterruptedException e) {
                e.printStackTrace(); //afficher le type d'exception
            }
        }
    }
}

public class exo1 {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start(); //pour bonjour
        Thread e = new Thread(t2);
        e.start(); //pour salut
    }
    
}
