package sample.model;

public class Jogador {

    //Atributos
    private String nome;
    private boolean venceu;
    private int totalPontos;


    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isVenceu(){
        return this.venceu;
    }

    public void setVenceu(boolean venceu){
        this.venceu = venceu;
    }

    public int getTotalPontos(){
        return this.totalPontos;
    }

    public void setTotalPontos(int totalPontos){
        this.totalPontos = totalPontos;
    }

    //To String
    public String toString(){
        return "\nJogador: " + nome
                + ",  " + (venceu ? "Ganhou o jogo" : "Perdeu o jogo")
                + ", Pontos: " + totalPontos;
    }

}
