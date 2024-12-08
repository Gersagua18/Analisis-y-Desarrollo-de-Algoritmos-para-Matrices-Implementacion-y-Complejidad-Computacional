package ejercicios_bidimencionales;
//Suma de la diagonal principal y secundaria
import java.util.Random;
import java.util.Scanner;
public class Ejercicio1 {
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
        for(int i=0;i<dimencion;i++){
            for(int j=0;j<dimencion;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        sumardiagonal(matriz, dimencion);         
    }
    public static void sumardiagonal(int [][] matriz,int d){
        int sum=0,sum2=0;
        for(int i=0;i<d;i++){
            sum+=matriz[i][i];
            sum2+=matriz[i][d-1-i];
        }
        System.out.println("La suma de la diagonal principal: "+sum);
        System.out.println("La suma de la diagonal secundaria: "+sum2);
    }

}
