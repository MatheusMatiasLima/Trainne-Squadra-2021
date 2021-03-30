package Atividade_1;
public class Restaurante {
    public static void main(String[] args) {

        //Poderia criar um objeto para cada cozinha mas usar polimorfismo é mais elegante :)
        //Declarando...
        Cozinha cozinha;
        int horaAbertura;
        int horaFechamento;
        String pratoPrincipal;

        /**Cozinha mineira**/
        //Instanciando...
        horaAbertura = 14;
        horaFechamento = 20;
        pratoPrincipal = "Feijoada";
        cozinha = new Mineira(horaAbertura, horaFechamento, pratoPrincipal);
        //adicionando ingredientes...
        cozinha.adicionarIngrediente(new Ingrediente("Feijao", 12, 6, 2021));
        cozinha.adicionarIngrediente(new Ingrediente("Arroz", 23, 11, 2021));
        cozinha.adicionarIngrediente(new Ingrediente("Carne de Porco", 19, 3, 2021));
        cozinha.adicionarIngrediente(new Ingrediente("Farinha", 29, 4, 2021));
        cozinha.adicionarIngrediente(new Ingrediente("Linguica", 27, 3, 2021));
        //adicionando funcionarios...
        cozinha.adicionarFuncionario(new Funcionario("Maria", Funcionario.Atividade.Cozinheiro));
        cozinha.adicionarFuncionario(new Funcionario("Joao", Funcionario.Atividade.Ajudante));
        cozinha.adicionarFuncionario(new Funcionario("Carla", Funcionario.Atividade.Ajudante));
        cozinha.adicionarFuncionario(new Funcionario("Lucas", Funcionario.Atividade.Outro));
        //imprimindo...
        System.out.println(cozinha);

        
        /**Cozinha Chinesa*/
        //a mesma coisa da Mineira, so muda os atributos do construtor.
        horaAbertura = 10;
        horaFechamento = 21;
        pratoPrincipal = "Yakissoba Chines";

        cozinha = new Chinesa(horaAbertura, horaFechamento, pratoPrincipal);

        cozinha.adicionarIngrediente(new Ingrediente("Champignon", 2, 5, 2021));
        cozinha.adicionarIngrediente(new Ingrediente("Brócolis", 29, 4, 2021));
        cozinha.adicionarIngrediente(new Ingrediente("Macarrão", 10, 9, 2021));
        cozinha.adicionarIngrediente(new Ingrediente("Carne", 12, 5, 2021));

        cozinha.adicionarFuncionario(new Funcionario("Li", Funcionario.Atividade.Cozinheiro));
        cozinha.adicionarFuncionario(new Funcionario("Wang", Funcionario.Atividade.Ajudante));
        cozinha.adicionarFuncionario(new Funcionario("Zhang", Funcionario.Atividade.Outro));

        System.out.println(cozinha);
        
        /**Cozinha Italiana*/
        //Repedindo. Agora pra italiana...
        horaAbertura = 13;
        horaFechamento = 22;
        pratoPrincipal = "Yakissoba Italiano";

        cozinha = new Italiana(horaAbertura, horaFechamento, pratoPrincipal);

        cozinha.adicionarIngrediente(new Ingrediente("Molho", 5, 7, 2021));
        cozinha.adicionarIngrediente(new Ingrediente("Macarrão", 9, 1, 2022));
        cozinha.adicionarIngrediente(new Ingrediente("Carne", 6, 5, 2021));

        cozinha.adicionarFuncionario(new Funcionario("Andrea", Funcionario.Atividade.Cozinheiro));
        cozinha.adicionarFuncionario(new Funcionario("Giulia", Funcionario.Atividade.Ajudante));

        System.out.println(cozinha);

    }
}