package ejercicios_bidimencionales;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[][] matriz= {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };
        System.out.println("Matriz:");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Espiral: "+recorrerMatrizEnEspiral(matriz));
    }
    public static List<Integer> recorrerMatrizEnEspiral(int[][] matriz) {
        List<Integer> resultado = new ArrayList<>();
        
        if (matriz==null || matriz.length==0) {
            return resultado;
        }

        int finicio=0,ffin=matriz.length-1;
        int cinicio=0,cfin=matriz[0].length-1;

        while (finicio<=ffin && cinicio<=cfin) {
            for (int i=cinicio;i<=cfin;i++) {
                resultado.add(matriz[finicio][i]);
            }
            finicio++;
            for (int i=finicio;i<=ffin;i++) {
                resultado.add(matriz[i][cfin]);
            }
            cfin--;
            if (finicio<=ffin) {
                for (int i=cfin;i>=cinicio;i--) {
                    resultado.add(matriz[ffin][i]);
                }
                ffin--;
            }
            if (cinicio<=cfin) {
                for (int i=ffin;i>=finicio;i--) {
                    resultado.add(matriz[i][cinicio]);
                }
                cinicio++;
            }
        }
        return resultado;
    }
}
