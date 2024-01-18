package datas;

import java.util.Calendar;

public class Datas {

    public static void main(String[] args) {
        
        
        Calendar agora = Calendar.getInstance();
        
        System.out.print(agora.get(Calendar.DATE) + " / ");
        System.out.print(agora.get(Calendar.MONTH)+ 1 + " / ");
        System.out.println(agora.get(Calendar.YEAR));
        
        System.out.print(agora.get(Calendar.HOUR_OF_DAY) + ":");
        System.out.print(agora.get(Calendar.MINUTE)+ ":");
        System.out.println(agora.get(Calendar.SECOND));
        System.out.println(agora.getTime());
        
        
        /*
        if (agora.get(Calendar.HOUR_OF_DAY) < 12) {
            System.out.println("São " + agora.get(Calendar.HOUR_OF_DAY)+" horas ainda é manhã");
        } else {
            System.out.println("Já não é manhã");
        }
        */
        
        if (agora.get(Calendar.HOUR_OF_DAY) < 12){
            System.out.println("Ainda não é hora do almoço!");
        
        } else if(agora.get(Calendar.HOUR_OF_DAY) == 12) {
            System.out.println("Já é hora do almoço!");
            
        }else if(agora.get(Calendar.HOUR_OF_DAY) > 12){
            System.out.println("Já passou da hora do almoço!");
            if (agora.get(Calendar.HOUR_OF_DAY) == 15) {
                System.out.println("Hora do lanche!");
                
            }else if((
                    agora.get(Calendar.HOUR_OF_DAY) > 17)&& ((agora.get(Calendar.HOUR_OF_DAY) <= 18) && (agora.get(Calendar.MINUTE) <= 30))){
                System.out.println("Já pode ir banhar!");
            }
            
        }
        
        int dia = agora.get(Calendar.DATE);
        int mes = agora.get(Calendar.MONTH) + 1;
        int ano = agora.get(Calendar.YEAR);
        
        int nasc = 2000;
        
        System.out.println(dia + " " + mes + " " + ano);
        if ((dia == 8) && (mes == 8)) {
            System.out.println("Feliz aniversário Cleiton!!!!!!");
            System.out.println("Parabéns pelos seus " + (ano - nasc) + " anos.");
        }
    }
}
