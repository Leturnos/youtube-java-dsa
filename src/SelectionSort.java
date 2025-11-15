// divide o array em dois, parte ordenada e outra não. A cada iteração ele move o menor elemento para a parte ordenada
// bom quando a troca é "cara" como gravações em disco

public class SelectionSort {

    public static void selectionSort(int[] arr) {
        for (int i = 0;i < arr.length-1; i++) {
            int min = i;

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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
        selectionSort(numeros);
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
