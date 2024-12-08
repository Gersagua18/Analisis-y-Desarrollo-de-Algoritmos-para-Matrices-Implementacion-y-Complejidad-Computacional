package ejercicios_bidimencionales;
//Verificar simetría de una matriz
import java.util.Random;
import java.util.Scanner;
public class Ejercicio5 {
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
        
        System.out.println("Matriz: ");
        imprimir(matriz, dimencion);
        if(verificarsimetria(matriz,dimencion)){
            System.out.println("Es simetrica"); 
        }else{
            System.out.println("No es simetrica");
        }
    }
    public static boolean verificarsimetria(int [][] matriz,int d){
        for(int i=0;i<d;i++){
            for(int j=i+1;j<d;j++){
                if(matriz[i][j]!=matriz[j][i]) return false;
            }
        }
        return true;
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
