public class Garfo {
    private int id;
    private boolean emUso;

    public Garfo(int id) {
        this.id = id;
        this.emUso = false;
    }

    public synchronized void pegar() throws InterruptedException {
        while (emUso) {
            wait();
        }
        emUso = true;
    }

    public synchronized void liberar() {
        emUso = false;
        notifyAll();
    }
    
}