package Atividade_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Manipuladora {
   
    public static Restaurante lerArquivoBinario(String nomeArq){
        Restaurante meuRestaurante = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArq))){
            meuRestaurante = (Restaurante)ois.readObject();
        }
        catch(FileNotFoundException e){
           System.out.println("Arquivo " + nomeArq + " nao encontrado!");  
        }
        catch(Exception e){
           System.out.println("Erro na leitura do arquivo " + nomeArq);
        }
        return meuRestaurante;
    }
   
   
    public static void gerarArquivoBinario(Restaurante meuRestaurante, String nomeArq){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArq))){
            oos.writeObject(meuRestaurante);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}