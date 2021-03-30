package Atividade_1;
public class Italiana extends Cozinha {
    String tipo = "Italiana";

    public Italiana (int horaAbertura, int horaFechamento, String pratoPrincipal) {
        super(horaAbertura, horaFechamento, pratoPrincipal);
    }

    @Override
    public String toString() {
        return "*****Cozinha Italiana*****\n\n" + super.toString();
    }    
}
