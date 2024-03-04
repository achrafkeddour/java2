package tp2;
public class exo2 { // wakil kayn haja na9ssa
    
    public static void main(String[] args) {
        Nombre N = new Nombre();
        Thcalcul th1 = new Thcalcul(N);
        Thaffiche th2 = new Thaffiche(N);
        th1.start();
        th2.start();
}
}

class Nombre {
    int n,square; 
    public synchronized void calcul() {
        n++;
        square = n*n;
    }
    public synchronized void affiche() {
        System.out.println("la valeur "+ n+ "square" + square); 
    }
}

class Thcalcul extends Thread {
    Nombre n;
    public Thcalcul (Nombre n){
        this.n=n;
    }
    public void run(){
        while(!interrupted()){
            n.calcul();
            // kon nzid sleep(200) hna lazem nzid try w catch 
        }
    }
}

class Thaffiche extends Thread {
    Nombre n;
    public Thaffiche(Nombre n) {
        this.n=n;
    }
    public void run() {
        while (!interrupted()) {
            n.affiche();
             // kon nzid sleep(400) hna lazem nzid try w catch 
        }
    }


}
