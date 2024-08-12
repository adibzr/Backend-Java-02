import java.util.InputMismatchException;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        System.out.println("HW02 - Métodos estáticos y excepciones");
        Scanner lectura = new Scanner(System.in);

        System.out.println("Ej 02 - Circulo");
        Circulo circulo = new Circulo();

        System.out.println("pi:"+ Circulo.PI);
        System.out.println("math.pi:" + Math.PI);

        System.out.println("Ingrese radio del circulo: ");

        try {
            int radio = lectura.nextInt();
            if (radio <= 0) {
                throw new NumberNotPositiveException("El radio debe ser mayor a 0.");
            }
            System.out.println("Superficie circulo: "+ circulo.area(radio));
            System.out.println("Circunferencia circulo: "+ circulo.circunferencia(radio));
        } catch (NumberNotPositiveException e) {
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("El argumento ingresado no es válido");
        }

   /*     System.out.println("Ej 02 - String");
        System.out.println("Ingrese una cadena: ");
        String cadena = lectura.nextLine();
        System.out.println("Caracteres:" + cadena.chars());
        System.out.println("Minúsculas:" + cadena.toLowerCase());
        System.out.println("Mayùsculas:" + cadena.toUpperCase());
        System.out.println("Primer palabra:" + cadena.substring(0,cadena.indexOf(' ')));

        if (cadena.indexOf("mundo") != -1) {
            System.out.println("La palabra 'mundo' está en la cadena.");
        } else {
            System.out.println("La palabra 'mundo' no está en la cadena.");
        }*/

        /*
        System.out.println("Ej 03 - Calculadora");
        try {
            System.out.println("Ingrese un número entero: ");
            Integer numero1 = lectura.nextInt();
            System.out.println("Ingrese otro número entero: ");
            Integer numero2 = lectura.nextInt();

            System.out.println("suma:" + Calculadora.suma(numero1,numero2));
            System.out.println("resta:" + Calculadora.resta(numero1,numero2));
            System.out.println("producto:" + Calculadora.producto(numero1,numero2));
            System.out.println("división:" + Calculadora.division(numero1,numero2));
        }
        catch (InputMismatchException e){
            System.out.println("Debe ingresar un número entero: " + e.getMessage());
        }

*/
        lectura.close();
    }
}
