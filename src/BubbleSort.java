// percorre varias vezes a lista comparando pares e os trocando se preciso
// bom para listas pequenas

public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numeros = {5,3, 9, 6,1,7,8,4,2};

        System.out.println("pré:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.println("pós:");
        bubbleSort(numeros);
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
