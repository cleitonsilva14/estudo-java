package listas;
import java.util.Scanner;
import java.util.ArrayList;
public class Listas {

    public static void main(String[] args) {
        
        Scanner i = new Scanner(System.in);
        ArrayList <String> itens = new ArrayList<>();
        
        itens.add("Vermelho"); //Adiciona um elemento a lista
        itens.add(1, "Azul"); // Adiciona o elemento na posição 1 da lista
        itens.add("Branco"); // Adiciona mais um elemento na lista
        itens.add("Rosa"); 
        itens.add("Roxo");
        itens.add("Azul ardósia");
        itens.add("Laranja");
        itens.add("Verde mar");
        itens.add("Cinza");
        itens.add("Roxo");
        System.out.println("==================================");
        System.out.println("         LISTA INICIAL            ");
        System.out.println("==================================");
        System.out.printf("%s%20s%n","Índice","Conteúdo");
        for (int j = 0; j < itens.size(); j++) {
            System.out.printf("%d %25s%n",j,itens.get(j));
        }
        System.out.println("==================================");
        System.out.printf("Branco está na lista? %s%n", itens.contains("Branco") ? "sim":"não");
        System.out.printf("Turquesa está na lista? %s%n", itens.contains("Turquesa") ? "sim":"não");
        System.out.printf("Verde Limão está na lista? %s%n",itens.contains("Verde Limão") ? "Yes":"No");
        System.out.println("==================================");
        System.out.println("Adicionei VERDE e AMARELO OURO" );
        itens.add("Verde"); 
        itens.add("Amarelo Ouro");
        
        System.out.println("Removi o item no indíce [1] #Azul");
        itens.remove(1);
        System.out.println("Removi a cor ROXO");
        itens.remove("Roxo"); /* remove o iten da lista ROXO 
                               que tiver primera ocorrência*/
        System.out.println("==================================");
        System.out.printf("%20s%n","Lista Final");
         System.out.println("==================================");
        for (int j = 0; j < itens.size(); j++) {
            System.out.println(j + " " + itens.get(j));
        }
        System.out.println("\nTamanho da lista ITENS: " + itens.size());
        
    }
}
