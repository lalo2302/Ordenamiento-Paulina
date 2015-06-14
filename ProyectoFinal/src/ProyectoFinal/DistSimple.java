package ProyectoFinal;

/**
 * Created by laloa_000 on 10/06/2015.
 */
public class DistSimple {
    public void Ordenar(int[] numeros,int cant){
        System.out.println("Metodo de distribucion simple");
        System.out.println("----------------------------------");
        //Obtienes el numero mayor del arreglo
        long startTime = System.nanoTime();
        int maxNum = 0, i, j, itDS = 0;
        for (i = 0; i < cant; i++){
            if(numeros[i] > maxNum)
                maxNum = numeros[i];
        }
        //Ingresas el numero en la posicion acorde a su valor
        int[] DS = new int[maxNum + 1];
        for (i = 0; i < cant; i++){
            DS[numeros[i]] = numeros[i];
            itDS++;
        }
        long stopTime = System.nanoTime();
        long elapsedTime = stopTime - startTime;
        //Imprimir los arreglos
        System.out.println("Arreglo desordenado:");
        for (i = 0; i < cant; i++)
            System.out.print(numeros[i] + " ");
        System.out.println("\nArreglo ordenado");
        for (i = 0; i < maxNum; i++){
            if (DS[i] != 0)
                System.out.print(DS[i] + " ");
        }
        System.out.println("\nTotal de iteraciones: " + itDS);
        System.out.println("Tiempo de ejecucion: " + elapsedTime + " nanosegundos");
    }
}
