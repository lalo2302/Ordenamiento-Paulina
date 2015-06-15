package ProyectoFinal;

/*
 * Created by joevzq on 6/14/15.
 */
public class IntSimple {
    public void Ordenar(int[] numeros, int cantidad){
        long startTime = System.nanoTime(); //Iniciar primer timer
        int i,k,aux, count = 0;

        boolean flag;

        for (k = 1; k < cantidad; k++){
            aux = numeros[k];
            i = k-1;
            flag = false;
            while( i >= 0 && !flag ){
                if(aux < numeros[i]){
                    numeros[i+1] = numeros[i];
                    i--;
                }
                else
                    flag = true;
            }
            numeros[i+1] = aux;
            count++;
        }
        long stopTime = System.nanoTime(); //Iniciar segundo timer
        long elapsedTime = stopTime - startTime; //Calcular tiempo de algoritmo

        System.out.println("\n\nMétodo de intercalación simple");
        System.out.println("----------------------------------");
        System.out.println("Total de iteraciones: " + count);
        System.out.println("Tiempo de ejecucion: " + elapsedTime + " nanosegundos");
    }
}
