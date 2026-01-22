import java.util.Scanner;
public class POO_Ejercicios_Semana_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String name = "Aquiles Esquivel Madrazo";
        System.out.println("Bienvenid@");
        System.out.print("Por favor, ingrese su nombre ");
        String inserted_name = sc.nextLine();
        
        if (inserted_name == ignoreCase(name)) {
            System.out.println("Hola Hola, Pirinola");
            System.out.println("¿Cómo le va" + name +"?");
        }
        
        else {
            System.out.println("Amiguito, no estás registrado");
            System.out.println("el nombre" + inserted_name + "no se encuentra en el sistema");
        }
        sc.close();
    }
}