/**
 * 
Crea una biblioteca de funciones para arrays bidimensionales (de dos dimensiones) de números enteros que contenga las siguientes funciones:
1. generaArrayBiInt: Genera un array de tamaño n x m con números
    aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como
    parámetro.
3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se
    pasa como parámetro.
4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array
    con dos elementos) de la primera ocurrencia de un número dentro de un
    array bidimensional. Si el número no se encuentra en el array, la función
    devuelve el array {-1, -1}.
5. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir,
    mínimo en su fila y máximo en su columna.
6. diagonal: Devuelve un array que contiene una de las diagonales del array
    bidimensional que se pasa como parámetro. Se pasan como parámetros
    fila, columna y dirección. La fila y la columna determinan el número que
    marcará las dos posibles diagonales dentro del array. La dirección es
    una cadena de caracteres que puede ser “nose” o “neso”. La cadena
    “nose” indica que se elige la diagonal que va del noroeste hacia el sureste,
    mientras que la cadena “neso” indica que se elige la diagonal que va del
    noreste hacia el suroeste.
 *
 * @author: Adrián Perogil Fernández    
 */
package matematicas;
public class ArraysBi {

    /*************************************************
     * @param n Tamaño filas                         *
     * @param m Tamaño columnas                      * 
     * @param x Valor mínimo del intervalo           *
     * @param y Valor máximo del intervalo           *
     * @return  Genera un array bidismensional       *
     *************************************************/
    public static int[][] generaArrayBiInt(int n, int m, int x, int y){
        if(n<=0 || m<=0){
            return null;
        }
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                array[i][j] = (int)(Math.random()*(y-x+1)+x);
        }
        return array;
    }

    /*************************************************
     * @param array Introduce un array bidimensional *
     * @return  Muestra un array bidimensional       *
     *************************************************/
    public static void muestraArrayBiInt(int[][] array){
        int digitosMax = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                int digitos = Funciones.digitos(array[i][j]);
                if (digitos > digitosMax) {
                    digitosMax = digitos;
                }
            }
        }
        String format = "%"+digitosMax+"d ";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(format, array[i][j]);
            }
            System.out.println();
        }
    }

    /*************************************************
     * @param array Introduce un array bidimensional *
     * @param i Indica que fila quieres              *
     * @return  Devuelve la fila i-ésima             *
     *************************************************/
    public static int[] filaDeArrayBiInt(int[][] array, int i){
        if(array == null || array.length == 0 || i < 0 || i >= array.length){
            return null;
        }
        return array[i].clone();
    }

    /*************************************************
     * @param array Introduce un array bidimensional *
     * @param j Indica que columna quieres           *
     * @return  Devuelve la columna j-ésima          *
     *************************************************/
    public static int[] columnaDeArrayBiInt(int[][] array, int j){
        if (array == null || array.length==0 || j < 0 || j >= array[0].length){
            return null;
        }
        int [] a = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            a[i] = array[i][j];
        }
        return a;
    }

    /** coordenadasEnArrayBiInt
     * Devuelve la fila y columna de la primera ocurrencia del valor v suministrado
     * Se busca el valor desde arriba hacia abajo y desde izquierda a derecha
     * @param a Matriz donde buscar el valor
     * @param v Valor a buscar
     * @return Devuelve la fila y columna de la primera ocurrencia del valor v suministrado
     *         Se usca el valor desde arriba hacia abajo desde izquierda a derecha
     */
    public static int[] coordenadasEnArrayBiInt(int[][] a, int v) {
        int[] ret = {-1, -1};
        if (a!=null && a.length > 0)
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if (a[i][j] == v) {
                        ret[0]=i;
                        ret[1]=j;
                        return ret;
                    }
                }
            }
        return ret;
    }

    /** esPuntoDeSilla
     * Devuelve si el elemento que está en la posición fila, columna de una matriz
     * dada es un punto de silla o no
     * <p>
     * Un elemento de una matriz es punto de silla si es el mínimo de la fila y el
     * máximo de la columna
     * @param a Matriz de entrada
     * @param fila Posición en la fila
     * @param col Posición en la columna
     * @return True si es punto de silla, False en caso contrario
     */
    public static boolean esPuntoDeSilla(int[][] a, int fil, int col){
        if(a == null || a[0].length>0 || fil < 0 || fil >= a.length || col<0 || col>=a[0].length)
            return false;
        return Arrays.minimoArrayInt(filaDeArrayBiInt(a, fil)) == a[fil][col] && Arrays.maximoArrayInt(columnaDeArrayBiInt(a, col)) == a[fil][col];
    }

    public static int[] diagonal(int[][] a, int fil, int col, String ori){
        int[] aux = new int[1000];
        int elementos = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if ( (((col - j) == (fil - i)) && (ori.equals("nose"))) || (((col - j) == (i - fil)) && (ori.equals("neso"))) ) {
                    aux[elementos++] = a[i][j];
                }
            }
        }
        int[] res = new int[elementos];
        for (int i = 0; i < elementos; i++) {
            res[i] = aux[i];
        }
        return res;
    }
}
