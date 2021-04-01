package Atividade_1;
import java.util.Date;
import java.util.Calendar;
//Usada no toString
import java.text.DateFormat;

public class Ingrediente {
    private String nome;
    //Documentação da classe Date https://docs.oracle.com/javase/8/docs/api/java/util/Date.html
    //**IMPORTANTE** o mes é de 0 a 11
    private Date data;
    //DateFormat é para formatar a data (utilizo ela no toString)
    private DateFormat formataData;
    
    public Ingrediente (String nome, int dia, int mes, int ano) {
        this.nome = nome;
        //getInstance = do mesmo jeito que esta no seu computador (calendario gregoriano).
        Calendar c = Calendar.getInstance();
        //os tres 0 no final siginifica respectivamente horas, minutos, segundos.
        //Coloquei os 0 para não precisar pegar a hora do computardor já que não irá precisar
        c.set(ano,mes,dia,0,0,0);
        data = c.getTime();
        formataData = DateFormat.getDateInstance();
    }


    //sobrescrevendo o metodo toString para escrever do meu jeito
    @Override
    public String toString() {
        return "Nome do Ingrediente: " + nome + "<br>" + 
               "Data de Validade: " + formataData.format(data) + "<br><br>";
    }

}
