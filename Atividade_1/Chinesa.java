package Atividade_1;

import java.io.Serializable;

public class Chinesa extends Cozinha implements Serializable {
    String tipo = "Chinesa";

    public Chinesa (int horaAbertura, int horaFechamento, String pratoPrincipal) {
        super(horaAbertura, horaFechamento, pratoPrincipal);
    }

    @Override
    public String toString() {
        return "*****Cozinha Chinesa*****<br><br>" + super.toString();
    }
}