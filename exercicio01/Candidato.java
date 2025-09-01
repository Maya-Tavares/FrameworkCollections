package exercicio01;

public class Candidato {
    private String nome;
    private Double notaTecnica;
    private int anosExp;

    public Candidato(String nome, double notaTecnica, int anosExp) {
        this.nome = nome;
        this.notaTecnica = notaTecnica;
        this.anosExp = anosExp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNotaTecnica() {
        return notaTecnica;
    }

    public void setNotaTecnica(Double notaTecnica) {
        this.notaTecnica = notaTecnica;
    }

    public int getAnosExp() {
        return anosExp;
    }

    public void setAnosExp(int anosExp) {
        this.anosExp = anosExp;
    }

    @Override
    public String toString() {
        return "Candidato %s, nota Técnica: ?nota, Anos de XP: ?anosExp " + nome + notaTecnica + anosExp;
    }
}
