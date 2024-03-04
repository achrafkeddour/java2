package tp2;
public class exo3 {
    public static void main(String[] args) {
        jobclient jc = new jobclient();
        Thread c1 = new Thread(jc);
        Thread c2 = new Thread(jc);
        c1.setName("client1");
        c2.setName("client2");
        c1.start();
        c2.start();
    }
}

class jobclient implements Runnable {
    Compte compte = new Compte(); // Création d'une instance de la classe Compte
    public synchronized void effectuerRetrait(int montant) {
        String nom = Thread.currentThread().getName();
        synchronized(compte) {
            if(compte.getSolde() >= montant) {
                try {
                    Thread.sleep(500);
                } catch(Exception e) {
                    e.printStackTrace();
                }
                System.out.println("Le client a effectué le retrait "+nom );
                compte.retirer(montant);
            } else {
                System.out.println("Impossible de retirer");
            }
        }
    }

    public void run() {
        for(int i = 0; i < 10; i++) {
            effectuerRetrait(100);
        }
    }
}

class Compte {
    private int solde = 10000;
    public int getSolde() {
        return solde;
    }
    public void retirer(int montant) {
        solde = solde - montant;
    }
}
