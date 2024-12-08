# Analisis-y-Desarrollo-de-Algoritmos-para-Matrices-Implementacion-y-Complejidad-Computacional

## Tabla de Contenidos
1. [Introducción](#introducción)
2. [Ejercicios](#ejercicios)
   - [Ejercicio 1: Suma de las diagonales de una matriz](#ejercicio-1-suma-de-las-diagonales-de-una-matriz)
   - [Ejercicio 2: Rotación de una matriz 90°](#ejercicio-2-rotación-de-una-matriz-90)
   - [Ejercicio 3: Suma del perímetro de una matriz](#ejercicio-3-suma-del-perímetro-de-una-matriz)
   - [Ejercicio 4: Transpuesta de una matriz](#ejercicio-4-transpuesta-de-una-matriz)
   - [Ejercicio 5: Verificar simetría de una matriz](#ejercicio-5-verificar-simetría-de-una-matriz)
   - [Ejercicio 6: Recorrer una matriz en espiral](#ejercicio-6-recorrer-una-matriz-en-espiral)
3. [Resultados](#resultados)
4. [Conclusiones](#conclusiones)

---

## Introducción
Este proyecto contiene una serie de algoritmos para trabajar con matrices en Java. Cada ejercicio incluye una breve descripción, el análisis de complejidad, y el código fuente.

---

## Ejercicios

### Ejercicio 1: Suma de las diagonales de una matriz

**Descripción:** Calcula la suma de los elementos de la diagonal principal y secundaria de una matriz cuadrada.

```java
public static void sumarDiagonales(int[][] matriz, int d) {
    int sumaPrincipal = 0, sumaSecundaria = 0;
    for (int i = 0; i < d; i++) {
        sumaPrincipal += matriz[i][i];
        sumaSecundaria += matriz[i][d - 1 - i];
    }
    System.out.println("Suma diagonal principal: " + sumaPrincipal);
    System.out.println("Suma diagonal secundaria: " + sumaSecundaria);
}

### Ejercicio 2: Rotación de una matriz 90°

**Descripción:** Dada una matriz cuadrada m de dimensión d, escribe un algoritmo que permita rotar la matriz 90° en el sentido de las agujas del reloj.

```java
public static int [][] RotarMatriz(int [][] matriz,int d){
        int [][]matriz2=new int[d][d];
        for(int i=0;i<d;i++){
            for(int j=0;j<d;j++){
                matriz2[j][d-i-1]=matriz[i][j];
            }
        }
        return matriz2;
}
```
### Ejercicio 3: Perímetro de la matriz

**Descripción:** Dada una matriz m de números enteros y dimensión d, escribe un algoritmo que calcule la suma de los elementos en el "perímetro" de la matriz (es decir, los elementos que están en los bordes).

```java
public static int sumarperimetro(int[][]matriz,int d){
        if(d==1) return matriz[0][0];
        int sum=0;
        for(int i=0;i<d;i++){
            sum+=matriz[0][i]+matriz[d-1][i]+matriz[i][0]+matriz[i][d-1];
        }
        sum-=matriz[0][0]+matriz[0][d-1]+matriz[d-1][0]+matriz[d-1][d-1];
        return sum;
}
```

### Ejercicio 4: Transpuesta de una matriz

**Descripción:** Dada una matriz mmm de n×mn \times mn×m, escribe un algoritmo que genere la matriz transpuesta.

```java
public static int [][] transpuestamatriz(int[][] matriz){
        int [][] transpuesta=new int [matriz[0].length][matriz.length];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[0].length;j++){
                transpuesta[j][i]=matriz[i][j];
            }
        }
        return transpuesta;
}
```

### Ejercicio 5: Verificar simetría de una matriz

**Descripción:** Escribe un algoritmo que determine si una matriz cuadrada m y m es simétrica (es decir, si m[i][j]=m[j][i] para todos i,j).

```java
public static boolean verificarsimetria(int [][] matriz,int d){
        for(int i=0;i<d;i++){
            for(int j=i+1;j<d;j++){
                if(matriz[i][j]!=matriz[j][i]) return false;
            }
        }
        return true;
}
```
### Ejercicio 6: Verificar simetría de una matriz

**Descripción:** Escribe un algoritmo que recorra una matriz cuadrada o rectangular M en forma de espiral, comenzando desde la esquina superior izquierda y moviéndose en sentido horario. El algoritmo debe devolver los elementos en el orden en que son visitados.

```java
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
```

