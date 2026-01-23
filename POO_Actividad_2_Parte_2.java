public class POO_Actividad_2_Parte_2 {
         public static void main(String[] args) {
        int[] numPar = new int[50];
        int indice = 0;
        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                numPar [indice] = i;
                indice ++;
            }
        }
        System.out.println("Números pares guardados:");
        for (int j = 0; j < numPar.length; j++) {
            System.out.println(numPar[j] + (j < numPar.length - 1 ? "," : ""));
            if ((j + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}