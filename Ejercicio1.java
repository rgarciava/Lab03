package Lab03;

public class Ejercicio1 {
    public static void main(String[] args) {

        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] array3 = { 1, 2, 3, 9, 5, 6, 7, 8 };
        System.out.println("La igualdad entre el array1 y el array 2 es: "
                + igualdadArrayDyV(0, array1.length - 1, array1, array2));
        System.out.println("La igualdad entre el array1 y el array 3 es: "
                + igualdadArrayDyV(0, array1.length - 1, array1, array3));

    }

    public static boolean igualdadArrayDyV(int inicio, int fin, int[] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        if (inicio == fin) {
            return array1[inicio] == array2[fin];
        }

        else {
            int mitad = (inicio + fin) / 2;
            boolean x = igualdadArrayDyV(inicio, mitad, array1, array2);
            boolean y = igualdadArrayDyV(mitad + 1, fin, array1, array2);
            return x && y;
        }
    }
}
