package mapashash;

import java.util.HashMap;

public class MapasHash {
    
    public static void main(String[] args) {
        
        int x = 3;
        
        HashMap map = new HashMap();
        
        map.put(0,"zero");
        map.put(1,"um");
        map.put(2,"dois");
        map.put(3,"três");
        
        boolean b = map.containsKey(1);
        System.out.println("1 é uma KEY em map: " + b);
       
        //Verifica por chave
        System.out.println(map.containsKey(x)?"yes":"no");
        
        //verifica por valor
        System.out.println(map.containsValue("dois"));
        
        //obter o tamanho do HashMap
        System.out.println("Tamanho do HashMap: " + map.size());
        
        //limpa o HashMap
        System.out.println("Limpando o HashMap...");
        map.clear();
        
        //mostra o HashMap
        System.out.print("O HashMap está vazio? ");
        System.out.println(map.isEmpty());
        
        //System.out.println(map.size());
        
    }
}
