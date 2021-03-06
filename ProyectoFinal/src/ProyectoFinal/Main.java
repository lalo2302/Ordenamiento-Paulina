package ProyectoFinal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opc;
        do{
            int cant = 500,i,j;
            int[] numeros = new int[cant];
            //Llenas el arreglo con numeros no repetidos
            for (i = 0; i < cant; i++){
                while (true){
                    int temp = (int)Math.floor(Math.random() * cant); //Generar número random

                    //Verificar si el número generado ya existe
                    boolean existe = false;
                    for (j = 0; j < numeros.length; j++){
                        if (numeros[j] == temp)
                            existe = true;
                            break;

                    }
                    if (!existe) {
                        numeros[i] = temp;
                        break;
                    }

                }
            }
            //Mandas a llamar el metodo de ordenacion
            DistSimple dist = new DistSimple();
            IntSimple inter = new IntSimple();

            dist.Ordenar(numeros,cant); //Distribución Simple
            inter.Ordenar(numeros, cant); // Intercalación Simple
            System.out.println("\nQuieres volver a hacerlo?\n1.-Si\n0.-No");
            opc = scan.nextInt();
        }while(opc != 0);
    }
}
