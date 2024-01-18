package conversordebasesnumericas;

public class ConversorDeBasesNumericas {

    public static void main(String[] args) {

        System.out.println("Conversor de Base Numérica");
       
        String bin = "1001";
        System.out.println("Valor Binário: " + bin);
        System.out.println("Valor Decimal: " + Integer.parseInt(bin,2));
        
        System.out.println("---------------------------------------\n");
        
        String hexa = "ABC";
        System.out.println("Valor Hexadecimal: " + hexa);
        System.out.println("Valor Decimal: " + Integer.parseInt(hexa,16));
        
        System.out.println("---------------------------------------\n");
        
        String octa = "5123";
        System.out.println("Valor Octal: " + octa);
        System.out.println("Valor Decimal: " + Integer.parseInt(octa, 8));
        
        System.out.println("---------------------------------------\n");
        
        int decimal = 10;
        System.out.println("Valor Decimal: " + decimal);
        System.out.println("Valor Binário: " + Integer.toBinaryString(decimal));
        System.out.println("Valor Octal: " + Integer.toOctalString(decimal));
        System.out.println("Valor Hexadecimal: " + Integer.toHexString(decimal).toUpperCase());
        
        
        
    }
}
