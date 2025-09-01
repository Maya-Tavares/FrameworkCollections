package exercicio02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Aluno> turmaBD = new HashSet<>();

        turmaBD.add(new Aluno(559031, "maya", "Estrutura de Dados"));
        turmaBD.add(new Aluno(559031, "ayam", "Estrutura de Dados"));
        turmaBD.add(new Aluno(559032, "pereira", "Estrutura de Dados"));
        turmaBD.add(new Aluno(559033, "santos", "Banco de Dados"));
        turmaBD.add(new Aluno(559034, "pereira", "Banco de Dados"));
        turmaBD.add(new Aluno(55001, "tavares", "Banco de Dados"));

        Set<Aluno> turmaED = new HashSet<>();
        turmaED.add(new Aluno(01, "A", "B"));
        turmaED.add(new Aluno(01, "A", "B"));
        turmaED.add(new Aluno(01, "A", "B"));
        turmaED.add(new Aluno(01, "A", "B"));
        turmaED.add(new Aluno(01, "A", "B"));

        //uniao
        Set<Aluno> uniao = new HashSet<>(turmaED);
        uniao.addAll(turmaED);
        uniao.forEach(aluno -> {System.out.println(aluno););
        // intersecção
        Set<Aluno> intersec = new HashSet<>(turmaED);
        uniao.retainAll(turmaED);

//        turmaBD.forEach(aluno -> {
//            System.out.println(aluno);
//        });
//
//        turmaBD.forEach(aluno -> {
//            System.out.println(aluno);
//        });
    }
}
