package sample.model;

import java.util.Random;

public class Dado {

    //Atributos
    private int face;


    //Construtor inicializando com 0
    public Dado(){
        face = 0;
    }

    //Lançar e gerar número randomicamente
    public void lancar(){
        Random random = new Random();
        while (face == 0) face = random.nextInt(7);
    }

    //get e set
    public int getFace(){
        return face;
    }

    //To String
    public String toString(){
        return String.valueOf(this.face);
    }

}