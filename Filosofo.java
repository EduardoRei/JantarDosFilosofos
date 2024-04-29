import java.util.concurrent.ThreadLocalRandom;

public class Filosofo extends Thread {
    private Prato prato;
    private Garfo garfoEsquerdo;
    private Garfo garfoDireito;
    
    public Filosofo(String name, Prato prato, Garfo garfoEsquerdo, Garfo garfoDireito) {
        super(name);
        this.prato = prato;
        this.garfoEsquerdo = garfoEsquerdo;
        this.garfoDireito = garfoDireito;
    }

    public void pensar() {
        System.out.println("O Filosofo " + getName() + " está pensando");
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void comer() {
        System.out.println("O Filosofo " + getName() + " está comendo");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                // Pensar
                pensar();
                
                // Pegar garfo esquerdo
                garfoEsquerdo.pegar();
                
                // Tentar pegar o garfo direito com timeout
                try {
                    garfoDireito.pegar();
                } catch (InterruptedException e) {
                    garfoEsquerdo.liberar(); // Libera o garfo esquerdo se houver timeout no direito
                    continue; // Continua para o próximo ciclo do loop
                }
                
                // Comer
                comer();
                
                // Liberar garfos
                garfoEsquerdo.liberar();
                garfoDireito.liberar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}