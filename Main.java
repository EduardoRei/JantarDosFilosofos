import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Incializar
        Prato[] pratos = new Prato[5];
        ArrayList<Garfo> garfos = new ArrayList<Garfo>();
        for (int i = 0; i < 5; i++){
            pratos[i] = new Prato(i);
            garfos.add(new Garfo(i));
        }

        //Filosofos
        Filosofo plato = new Filosofo("Plato", pratos[0], garfos.get(0), garfos.get(1));
        Filosofo confucius = new Filosofo("Confucius", pratos[1],  garfos.get(1),  garfos.get(2));
        Filosofo socrates = new Filosofo("Socrates", pratos[2],  garfos.get(2),  garfos.get(3));
        Filosofo voltaire = new Filosofo("Voltaire", pratos[3],  garfos.get(3),  garfos.get(4));
        Filosofo descartes = new Filosofo("Descartes", pratos[4],  garfos.get(4), garfos.get(0));

        //Prioridade
        plato.setPriority(1);
        confucius.setPriority(1);
        socrates.setPriority(1);
        voltaire.setPriority(1);
        descartes.setPriority(1);

        //Start
        plato.start();
        confucius.start();
        socrates.start();
        voltaire.start();
        descartes.start();

        //Join
        try {
            plato.join();
            confucius.join();
            socrates.join();
            voltaire.join();
            descartes.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
