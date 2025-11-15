import java.util.Stack;

public class BalanceadorParenteses {
    public static void main(String[] args) {
        String[] expressoes = {
                "(a+c)",
                "(a+b+c) * 2",
                "(a+d" // ele precisa achar esse erro
        };
        for (String exp: expressoes) {
            System.out.println(estaBalanceado(exp));
        }
    }

    public static boolean estaBalanceado(String expressao) {
        Stack<Character> pilha = new Stack<>();

        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c);
            }
            else if (c == ')') {
                if (pilha.isEmpty()) return false;
                pilha.pop();
            }
        }
        return pilha.isEmpty();
    }
}
