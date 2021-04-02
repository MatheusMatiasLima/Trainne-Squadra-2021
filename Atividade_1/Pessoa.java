package Atividade_1;

import java.io.Serializable;

public class Pessoa implements Serializable{
    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return nome;
    }
    
}