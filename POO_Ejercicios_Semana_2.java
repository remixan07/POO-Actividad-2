import java.util.Scanner;

public class POO_Ejercicios_Semana_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Aquiles Esquivel Madrazo";

        System.out.println("Bienvenid@");
        System.out.println("Por favor, ingrese su nombre ");
        String inserted_name = sc.nextLine();

        if (inserted_name.trim().isEmpty()) {
            System.out.println("El nombre no es válido :|");
        } else if (inserted_name.equalsIgnoreCase(name)) {
            System.err.println("Hola Hola, Pirinola");
            System.out.println("¿Cómo le va " + name + "?");
            System.out.println("Usted cuenta con acceso al Sistema :)");
        } else {
            System.out.println("Amiguito");
            System.out.println("El nombre " + inserted_name + " no se encuentra en el sistema :(");
            System.out.println("Para la próxima, elija un nombre que aplique");
        }

        sc.close();
    }
}
