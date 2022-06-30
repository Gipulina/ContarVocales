import java.util.Locale;
import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        String cad;
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        char letra;
        System.out.println("Hola, por favor ingresar una cadena de texto");
        cad = sc.nextLine();
        cad= cad.toLowerCase();
        for(int i = 0; i<cad.length(); i++){
            letra = cad.charAt(i);
            switch (letra){
                case 'a':
                case 'd':
                case 'i':
                case 'o':
                case 'u':
                    contador ++;
            }
        }
        System.out.println("Total de vocales:" +contador);
    }
}