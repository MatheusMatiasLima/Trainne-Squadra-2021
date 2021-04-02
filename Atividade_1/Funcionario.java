package Atividade_1;

import java.io.Serializable;

//Todo funcionario é uma pessoa
public class Funcionario extends Pessoa implements Serializable{
    // A funcao so pode ser cozinheiro, ajutante ou outro.
    public enum Atividade {Cozinheiro, Ajudante, Outro}
    private Atividade atividade;
    
    public Funcionario (String nome, Atividade atividade) {
        super(nome);
        this.atividade = atividade;
    }

    private Atividade getAtividade() {
        return atividade;
    }

    //sobrescrevendo o metodo toString para escrever do meu jeito
    @Override
    public String toString() {
        return "Nome do funcionario: " + getNome() + "<br>" + 
               "Atividade do funcionario: " + getAtividade() + "<br><br>";
    }
}
