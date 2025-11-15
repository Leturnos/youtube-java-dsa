// percorre a lista do início ao fim até achar o elemento
// pode usar quando é um array pequeno e os dados estao desordenados

public class BuscaLinear {
    public static void main(String[] args) {
        int[] lista = {1,6,2,7,10};
        int result = buscar(lista, 7);
        if (result == -1){
            System.out.println("Elemento não encontrado");
        } else{
            System.out.println("O elemento está no índice: " + result);
        }
    }

    public static int buscar(int arr[], int valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
