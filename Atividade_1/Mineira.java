package Atividade_1;

import java.io.Serializable;

public class Mineira extends Cozinha implements Serializable {
    String tipo = "Mineira";

    public Mineira (int horaAbertura, int horaFechamento, String pratoPrincipal) {
        super(horaAbertura, horaFechamento, pratoPrincipal);
    }

    @Override
    public String toString() {
        return "*****Cozinha Mineira*****<br><br>" + super.toString();
    }
}
