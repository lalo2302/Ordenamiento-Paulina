package ProyectoFinal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int opc;
        do{
            int cant = 500,i,j;
            int[] numeros = new int[cant];
            //Llenas el arreglo con numeros no repetidos
            for (i = 0; i < cant; i++){
                while (true){
                    int temp = (int)Math.floor(Math.random() * cant);
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

            DistSimple dist = new DistSimple();
            dist.Ordenar(numeros,cant);
            System.out.println("\nQuieres volver a hacerlo?\n1.-Si\n0.-No");
            opc = scan.nextInt();
        }while(opc != 0);
    }
}
