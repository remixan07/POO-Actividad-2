import java.util.Scanner;
public class POO_Ejercicios_Semana_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = "Aquiles Esquivel Madrazo";
        System.out.println("Bienvenid@");
        System.out.println("Por favor, ingrese su nombre ");
        String inserted_name = sc.nextLine();

    if (inserted_name == name) {
        System.out.println("Hola Hola, Pirinola");
        System.out.println("¿Cómo te va", name, "?");
    }
    else {
        System.out.println("Amiguito, no estás registrado");
        System.out.println("Intenta con otro nombre");
        }
    }
}