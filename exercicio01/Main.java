package exercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        List<Candidato> lista = new ArrayList<>();
        lista.add(new Candidato("Maya", 10.5, 3));
        lista.add(new Candidato("Selmo", 0.5, 13));
        lista.add(new Candidato("Lucy", 1, 3));

        Comparator<Candidato> cmp =
                Comparator.comparing(Candidato::getNotaTecnica).reversed()
                        .thenComparing(Candidato::getAnosExp)
                        .thenComparing(Candidato::getNome);

        lista.sort(cmp);
        AtomicInteger cont = new AtomicInteger(1);
        lista.forEach(candidato -> {
            System.out.println(cont.getAndIncrement() + " " + candidato);
        });

    }
}
