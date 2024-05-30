package Lab03;

public class Ejercicio2 {
    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };

        System.out.println("El mayor elemento del arreglo es: " + mayorArrayDyV(0, array.length - 1, array));

        System.out.println("El menor elemento del arreglo es: " + menorArrayDyV(0, array.length - 1, array));

    }

    public static int mayorArrayDyV(int inicio, int fin, int[] array) {

        if (inicio == fin) {
            return array[inicio];
        } else {
            int mitad = (inicio + fin) / 2;
            int x = mayorArrayDyV(inicio, mitad, array);
            int y = mayorArrayDyV(mitad + 1, fin, array);
            if (x > y) {
                return x;
            } else {
                return y;
            }
        }
    }

    public static int menorArrayDyV(int inicio, int fin, int[] array) {
        if (inicio == fin) {
            return array[inicio];
        } else {
            int mitad = (inicio + fin) / 2;
            int x = menorArrayDyV(inicio, mitad, array);
            int y = menorArrayDyV(mitad + 1, fin, array);
            if (x < y) {
                return x;
            } else {
                return y;
            }
        }
    }
}
