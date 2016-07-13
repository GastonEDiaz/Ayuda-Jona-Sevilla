package principal;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
public class DOS {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        System.out.println("Cuantos Codigos-Nombres-Promedios desea Ingresar?:");                
        lector.nextInt();
        String capturadorLector;
        capturadorLector = (lector).toString();
        int tamVectores = Integer.parseInt(capturadorLector);
        //Declaramos todos los Vectores
        int[] vecCodigo = new int[tamVectores];
        String[] vecNombre = new String[tamVectores];
        double[] vecPromedio = new double[tamVectores];
        int contador = 1;
        int codigoCapturado;
        String nombreCapturado;
        double promedioCapturado;
        for (int i = 0; i < tamVectores; i++) {
            System.out.println("Ingrese "+contador+"° Codigo:");
            capturadorLector=(lector.next()).toString();
            codigoCapturado = Integer.parseInt(capturadorLector);
            System.out.println("Ingrese "+contador+"° Nombre:");
            capturadorLector=(lector.next()).toString();
            nombreCapturado =  capturadorLector;
            System.out.println("Ingrese "+contador+"° Promedio:");
            capturadorLector=(lector.next()).toString();
            promedioCapturado = Double.parseDouble(capturadorLector);
            //Asignamos los valores a sus vectores
            vecCodigo[i]= codigoCapturado;
            vecNombre[i]=nombreCapturado;
            vecPromedio[i]=promedioCapturado;
            //incrementams contador
            contador++;
        }
        
        //Mostramos Datos desordenados
        System.out.println("Datos desordenados");
        contador =1;
        for (int i = 0; i < tamVectores; i++) {
            System.out.println(contador+"° Cod: "+vecCodigo[i]);
            System.out.println(contador+"° Nombre: "+vecNombre[i]);
            System.out.println(contador+"° Promedio: "+vecPromedio[i]);
        }
        
        //Ordenamos de Mayor a Menor los Datos por medio del Metodo Burbuja
        //Ordenamos el codigo:
        for (int i = 0; i < tamVectores-1; i++) {
            for (int j = 0; j < tamVectores-1; j++) {
                if (vecCodigo[j]<vecCodigo[j+1]) {
                    int temporal = vecCodigo[j+1];
                    vecCodigo[j+1] = vecCodigo[j];
                    vecCodigo[j] = temporal;
                }
            }
        }
        //Ordenamos por Nombre
        for (int i = 0; i < tamVectores-1; i++) {
            for (int j = 0; j < tamVectores-1; j++) {
                if(vecNombre[j].compareTo(vecNombre[j+1])>0){
                    String temporal = vecNombre[j];
                    vecNombre[j] = vecNombre[j+1];
                    vecNombre[j+1]= temporal;
                }
            }
        }
                
        //Ordenamos los promedio:
        for (int i = 0; i < tamVectores-1; i++) {
            for (int j = 0; j < tamVectores-1; j++) {
                if (vecPromedio[j]<vecPromedio[j+1]) {
                    double temporal = vecPromedio[j];
                    vecPromedio[j+1] = vecPromedio[j];
                    vecPromedio[j] = temporal;
                }
            }
        }
        
        //Mostrando Vectores Ordenados
        //Vector de Codigo Ordenado
        contador = 1;
        for (int i = 0; i < tamVectores; i++) {
            System.out.println(contador+"° Codigo: "+vecCodigo[i]);
        }
        //Vector de Nombres Ordenado
        contador = 1;
        for (int i = 0; i < tamVectores; i++) {
            System.out.println(contador+"° Nombre: "+vecNombre[i]);
        }
        //Vector de Promedio Ordenado
        contador = 1;
        for (int i = 0; i < tamVectores; i++) {
            System.out.println(contador+"° Promedio: "+vecPromedio[i]);
        }
        
        //Busqueda Binaria para mostrar un dato por Codigo
        System.out.println("Ingrese Codigo a Buscar: ");
        capturadorLector=(lector.next()).toString();
        codigoCapturado = Integer.parseInt(capturadorLector);        
        int posicion = Arrays.binarySearch(vecCodigo, codigoCapturado);
        
        System.out.println("Codigo: "+ vecCodigo[posicion]);
        System.out.println("Nombre: "+ vecNombre[posicion]);
        System.out.println("Promedio: "+vecPromedio[posicion]);
        
    }
    
}
