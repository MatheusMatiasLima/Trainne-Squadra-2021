package Atividade_1;
public class Chinesa extends Cozinha {
    String tipo = "Chinesa";

    public Chinesa (int horaAbertura, int horaFechamento, String pratoPrincipal) {
        super(horaAbertura, horaFechamento, pratoPrincipal);
    }

    @Override
    public String toString() {
        return "*****Cozinha Chinesa*****<br><br>" + super.toString();
    }
}