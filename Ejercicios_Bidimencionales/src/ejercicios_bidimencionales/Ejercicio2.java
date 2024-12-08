package ejercicios_bidimencionales;
//Rotación de una matriz 90°
import java.util.Random;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        System.out.print("Ingrese la dimencion de la matriz: ");
        int dimencion=sc.nextInt();
        int [][] matriz=new int [dimencion][dimencion];
        for(int i=0;i<dimencion;i++){
            for(int j=0;j<dimencion;j++){
                matriz[i][j]=rd.nextInt(-100,100);
            }
        }
        System.out.println("Matriz Original: ");
        imprimir(matriz,dimencion);
        int[][] matrizrotada=RotarMatriz(matriz, dimencion);
        System.out.println("Matriz rotada: ");
        imprimir(matrizrotada,dimencion);
        
    }
    public static int [][] RotarMatriz(int [][] matriz,int d){
        int [][]matriz2=new int[d][d];
        for(int i=0;i<d;i++){
            for(int j=0;j<d;j++){
                matriz2[j][d-i-1]=matriz[i][j];
            }
        }
        return matriz2;
    }
    public static void imprimir(int [][] matriz,int d){
        for(int i=0;i<d;i++){
            for(int j=0;j<d;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
