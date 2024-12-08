package ejercicios_bidimencionales;
//Perímetro de la matriz
import java.util.Random;
import java.util.Scanner;
public class Ejercicio3 {
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
        imprimir(matriz, dimencion);
        System.out.println("La suma del perimetro es: "+sumarperimetro(matriz, dimencion));
    }
    public static int sumarperimetro(int[][]matriz,int d){
        if(d==1) return matriz[0][0];
        int sum=0;
        for(int i=0;i<d;i++){
            sum+=matriz[0][i]+matriz[d-1][i]+matriz[i][0]+matriz[i][d-1];
        }
        sum-=matriz[0][0]+matriz[0][d-1]+matriz[d-1][0]+matriz[d-1][d-1];
        return sum;
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
