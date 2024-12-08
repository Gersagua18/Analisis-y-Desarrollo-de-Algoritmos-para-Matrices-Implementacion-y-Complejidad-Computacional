package ejercicios_bidimencionales;
//Transpuesta de una matriz
import java.util.Random;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        System.out.print("Ingrese la cantidad de filas: ");
        int filas=sc.nextInt();
        System.out.print("Ingrese la cantidad de columnas: ");
        int columnas=sc.nextInt();
        int [][] matriz=new int [filas][columnas];
        for(int i=0;i<filas;i++){
            for(int j=0;j<columnas;j++){
                matriz[i][j]=rd.nextInt(-100,100);
            }
        }
        System.out.println("Matriz Original: ");
        imprimir(matriz);
        int[][] trpmatriz=transpuestamatriz(matriz);
        System.out.println("Matriz Transpuesta: ");
        imprimir(trpmatriz);
        
    }
    public static int [][] transpuestamatriz(int[][] matriz){
        int [][] transpuesta=new int [matriz[0].length][matriz.length];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                transpuesta[j][i]=matriz[i][j];
            }
        }
        return transpuesta;
    }
    public static void imprimir(int [][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
