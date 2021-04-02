package Atividade_1;

import java.io.Serializable;

public class Italiana extends Cozinha implements Serializable {
    String tipo = "Italiana";

    public Italiana (int horaAbertura, int horaFechamento, String pratoPrincipal) {
        super(horaAbertura, horaFechamento, pratoPrincipal);
    }

    @Override
    public String toString() {
        return "*****Cozinha Italiana*****<br><br>" + super.toString();
    }    
}
