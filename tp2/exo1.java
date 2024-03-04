package tp2;
class counter extends Thread {
    protected int count, inc, x, Nit;
    public counter(int init, int inc, int x, int Nit){
        this.count=init;
        this.inc=inc;
        this.x=x;
        this.Nit = Nit;
    }
    public void run(){
        try{
            for(int i=0; (i < Nit); i++){
            System.out.println(count + " ");
            count += inc;
            sleep(x);
        }
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class exo1 {
    public static void main(String[] args) {
        new counter(0,1,3000,10).start();
        new counter(0,-1,3000,10).start();
    }
}
