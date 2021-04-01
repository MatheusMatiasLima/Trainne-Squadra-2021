package Atividade_1;
import java.util.ArrayList;
// O tipo da cozinha vai ser definido na subclasse.
// Sera melhor assim porque se no futuro quiser adicionar alguma coisa em uma cozinha especifica vai ser mais facil
public class Cozinha {
    //Armazena a hora que a cozinha abre
    private int horaAbertura;
    //Armazena a hora que a cozinha fecha
    private int horaFechamento;
    //O prato principal da cozinha
    private String pratoPrincipal;
    //Uma lista de ingredientes
    private ArrayList<Ingrediente> ingredientes;
    //Uma lista de funcionarios
    private ArrayList<Funcionario> funcionarios;

    public Cozinha (int horaAbertura, int horaFechamento, String pratoPrincipal) {
        this.horaAbertura = horaAbertura;
        this.horaFechamento = horaFechamento;
        this.pratoPrincipal = pratoPrincipal;
        ingredientes = new ArrayList<Ingrediente>();
        funcionarios = new ArrayList<Funcionario>();
    }

    //Estou declarando os metodos como privado, ja que o unico lugar que vamos usar é no metodo toString da propria classe.
    //Se for utilizar em outro lugar é so mudar.

    private int getHoraAber() {
        return horaAbertura;
    }

    private int getHoraFech() {
        return horaFechamento;
    }

    private String getPratoPrincipal() {
        return pratoPrincipal;
    }
    //Os dois proximos precisam ser publicos, ja que esta sendo chamado na classe Restaurante
    public void adicionarIngrediente(Ingrediente ingr) {
        ingredientes.add(ingr);
    }

    public void adicionarFuncionario(Funcionario func) {
        funcionarios.add(func);
    }

    private String listaDeIngredientes() {
        //uma string vazia
        String lista = "";
        //percorre toda a lista de ingredientes
        for (Ingrediente i : ingredientes) {
            lista += i.toString();
        }
        //retorna a string preenchida com toda a lista de ingredientes 
        return lista;
    }

    private String listaDeFuncionarios() {
        //uma string vazia
        String lista = "";
        //percorre toda a lista de funcionarios
        for (Funcionario f : funcionarios) {
            lista += f.toString();
        }
        //retorna a string preenchida com toda a lista de ingredientes 
        return lista;
    }

    //sobrescrevendo o metodo toString para escrever do meu jeito
    @Override
    public String toString() {
        return "Prato principal: " + getPratoPrincipal() + "<br>" +
               "Hora da abertura: " + getHoraAber() + "h<br>" +
               "Hora do fechamento: " + getHoraFech() + "h<br><br>" +

               "***Lista de ingredientes***<br><br>"+
               listaDeIngredientes() +
               "***Lista de funcionarios***<br><br>" + 
               listaDeFuncionarios();
    }
}