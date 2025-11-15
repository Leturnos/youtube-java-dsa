// procura o valor dividindo o array ao mesmo por iteração
// mais rapido que o linear, porém precisa estar ordenado

public class BuscaBinaria {
    public static void main(String[] args) {
        int[] lista = {1,2,3,4,6,8,10};
        int result = buscar(lista, 8);
        if (result == -1){
            System.out.println("Elemento não encontrado");
        } else{
            System.out.println("O elemento está no índice: " + result);
        }
    }

    public static int buscar(int arr[], int valor) {
        int inicio = 0;
        int fim = arr.length -1;

        while (inicio <= fim) {
            int meio = (inicio+fim)/2;
            if (arr[meio] == valor) {
                return meio;
            }
            if (arr[meio] < valor) {
                inicio = meio + 1;
            }
            else {
                fim = meio -1;
            }
        }
        return -1;
    }
}
