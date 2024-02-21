package tarea;

import java.security.PublicKey;

public class Practico {
    public static void main(String[] args) {
        ejer4(6);
    }

    // 1--> F = 1 + 4 + 5 + 9 + 14 + 23+…
    public static void ejer1(int numero) {
        int a = 1;
        int b = 4;
        for (int i = 0; i < numero; i++) {
            System.out.print(a + " ");
            int suma = a + b;
            a = b;
            b = suma;
        }
    }

    //2--> F = 1 + 4 + 9 + 16 + 25 +…
    public static void ejer2(int numero) {
        for (int i = 1; i <= numero; i++) {
            System.out.print((int) Math.pow(i, 2) + " ");
        }
    }

    //3--> F = 1 x 2 + 3 x 4 + 5 x 6 +…
    public static void ejer3(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero; i += 2) {
            int producto = i * (i + 1);
            suma += producto;
            System.out.print(producto + " ");
        }
    }

    //4--> 4, 5, 9, 14, 23, 37 ……………………………
    public static void ejer4(int numero) {
        int a = 4, b = 5;
        for (int i = 1; i <= numero; i++) {
            System.out.print(a + " ");
            int suma = a + b;
            a = b;
            b = suma;
        }
    }

    //5--> 60, 1, 58, 3, 56, 5, 54, 7, 52, 9, 50, 11 ………
    public static void ejer5(int numero) {
        for (int i = 0; i < numero; i++) {
            if (i % 2 == 0) {
                System.out.print((60 - i) + " ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

    //6-->1, 1, 2, 3, 5, 8, 13…
    public static void ejer6(int numero) {
        int a = 1, b = 1;
        for (int i = 1; i <= numero; i++) {
            System.out.print(a + " ");
            int suma = a + b;
            a = b;
            b = suma;
        }
    }

    //7-->0, 2, 6, 12, 20 …
    public static void ejer7(int numero) {
        for (int i = 0; i <= numero; i++) {
            System.out.print((i * 2) + " ");
        }
    }

    //8--> Encontrar el mayor de tres números.
    public static int ejer8(int n1, int n2, int n3) {
        int mayor = 0;
        if (n1 > n2 && n1 > n3) {
            mayor = n1;
        } else if (n2 > n1 && n2 > n3) {
            mayor = n2;
        } else if (n3 > n1 && n3 > n2) {
            mayor = n3;
        }
        return mayor;
    }

    //9-->Verificar si un número es capicúa (palíndromo numérico).
    //funcion auxiliar para invertir un numero
    public static int invertirNumero(int numero) { // numero = 23
        int numeroInvertido = 0;
        while (numero > 0) {
            int modulo = numero % 10;   // 3
            numero = numero / 10;  // 2
            numeroInvertido = numeroInvertido * 10 + modulo;
        }
        return numeroInvertido;
    }

    //metodo oficial del ejercicio que hace lo que pide el enunciado
    public static boolean ejer9(int numero) {
        return invertirNumero(numero) == numero;
    }

    //10--> Calcular el factorial de un número.
    public static int ejer10(int numero) {
        int fac = 1;
        if (numero != 0) {
            for (int i = 1; i <= numero; i++) {
                fac = fac * i;
            }
        } else {
            fac = 1;
        }
        return fac;
    }

    //11-->Generar la serie Fibonacci hasta un número N
    public static void ejer11(int numero) {
        int a = 0, b = 1;
        for (int i = 1; i <= numero; i++) {
            System.out.print(a + " ");
            int suma = a + b;
            a = b;
            b = suma;
        }
    }

    //12--> Contar el numero de vocales en un string
    //funcion auxiliar para saber si es vocal
    public static boolean esVocal(char vocal) {
        final String vocales = "aeiouAEIOU";
        return vocales.contains(Character.toString(Character.toLowerCase(vocal)));
    }

    public static int ejer12(String cadena) {
        int contadorVocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (esVocal(cadena.charAt(i))) {
                contadorVocales++;
            }
        }
        return contadorVocales;
    }

    //13--> Invertir un string sin usar funciones integradas.
    public static void ejer13(String cadena) { //Opcion 1
        String cadAux = "";
        char[] vecCharCadena = cadena.toCharArray();
        for (int i = vecCharCadena.length - 1; i >= 0; i--) {
            cadAux = cadAux + vecCharCadena[i];
        }
        System.out.println(cadAux);
    }

    public static void ejer13_2(String cadena) { //Opcion 2
        String cadAux = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadAux = cadAux + cadena.toCharArray()[i];
        }
        System.out.println(cadAux);
    }

    //14--> Escribe un programa que invierta los elementos de un vector.Before:[1,2,3,4,5]
    // After : [5,4,3,2,1].
    public static void invertirVector(int[] vector) {
        int inicio = 0;
        int fin = vector.length - 1;
        while (inicio < fin) {
            int temp = vector[inicio];
            vector[inicio] = vector[fin];
            vector[fin] = temp;
            inicio++;
            fin--;
        }
    }

    //15--> Encontrar el segundo elemento más grande:
    /*
    * Desarrolla un algoritmo que encuentre el segundo elemento más grande dentro de un vector. Asegúrate de considerar vectores con elementos duplicados. Por ejemplo, en el vector
      [7,5,6,8,9]
      [7,5,6,8,9], el segundo elemento más grande es
        8
        8.
    * */
    public static int ejer15(int[] vector) {
        int mayor = Integer.MIN_VALUE;
        int segundoMayor = Integer.MIN_VALUE;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > mayor) {
                segundoMayor = mayor;
                mayor = vector[i];
            } else if (vector[i] > segundoMayor && vector[i] < mayor) {
                segundoMayor = vector[i];
            }
        }
        return segundoMayor;
    }
}
