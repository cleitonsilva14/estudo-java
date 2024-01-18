package manipulacaodearquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManipulacaoDeArquivos {

    public static void main(String[] args) {

        //File arquivo = new File("C:/Users/CLEITON/Desktop/PastaCriadaComJava");
        //arquivo.mkdir(); // cria pasta
        //arquivo.delete(); // apaga pasta
        
        //--------------------Criar arquivos
        //File f = new File("C:/Users/CLEITON/Desktop/ArquivoCriadoComJava.txt");
        
        //try {
        //    f.createNewFile();
            
        //} catch (IOException ex) {
        //    System.out.println("Erro: " + ex);
        //}
        
        //------------------ Ler arquivo
        /*
        File f = new File("C:/Users/CLEITON/Desktop/ArquivoCriadoComJava.txt");
        
        try {
            
            FileReader ler = new FileReader(f);
            BufferedReader lerBuffer = new BufferedReader(ler);
            String linha = lerBuffer.readLine();
            
            while(linha != null){
                System.out.println(linha);
                linha = lerBuffer.readLine();
            }
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("Erro: " +ex);
            
        } catch (IOException ex) {
            System.out.println("Erro: " +ex);
        }
        */
        
        File arquivo = new File("C:/Users/CLEITON/Desktop/ArquivoCriadoComJava.txt");
        
        try {
            
            FileReader lerArquivo = new FileReader(arquivo);
            FileWriter escreverArquivo = new FileWriter(arquivo);
            BufferedWriter escrever = new BufferedWriter(escreverArquivo);
            escrever.write("Escrevendo no arquivo!");
                
            escrever.close();
            escreverArquivo.close();
        } catch (IOException e) {
        
        }
    }
}
