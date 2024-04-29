public class Garfo {
    private int id;
    private boolean emUso;

    public Garfo(int id) {
        this.id = id;
        this.emUso = false;
    }

    public synchronized void pegar() throws InterruptedException {
        long startTime = System.currentTimeMillis(); // Salva o tempo de início
        while (emUso) {
            wait(2000); // Aguarda até que o garfo esteja disponível

        }
        emUso = true;
    }


    public synchronized void liberar() {
        emUso = false;
        notifyAll();
    }
    
}