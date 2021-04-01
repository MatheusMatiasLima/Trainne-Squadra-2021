package Atividade_1;
public class Mineira extends Cozinha {
    String tipo = "Mineira";

    public Mineira (int horaAbertura, int horaFechamento, String pratoPrincipal) {
        super(horaAbertura, horaFechamento, pratoPrincipal);
    }

    @Override
    public String toString() {
        return "*****Cozinha Mineira*****<br><br>" + super.toString();
    }
}
