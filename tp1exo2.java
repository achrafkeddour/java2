
import java.util.Random;

class compteur extends Thread{
    int numb;
   compteur(int numb){
    this.numb = numb;
   }
    @Override
    public void run() {
        Random rnd = new Random();
        int x = rnd.nextInt(5000);
        for (int i = 0; i <=20; i++) {
            System.out.println(i);
            try {
                sleep(x);
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }
        } System.out.println("thread "+numb+" a fini l'execution");
    }
}
public class exo2 {
    public static void main(String[] args) {
     for (int i = 1; i <= 3; i++) {
        new compteur(i).start();
     }
    }
}
