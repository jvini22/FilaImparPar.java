import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class FilaReversa {
    public static void reverso(Queue<Integer> fila) {
        Stack<Integer> pilha = new Stack<>();
        
        // Esvazia a fila para a pilha, invertendo a ordem dos elementos
        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }
        
        // Esvazia a pilha de volta para a fila, invertendo novamente a ordem dos elementos
        while (!pilha.isEmpty()) {
            fila.offer(pilha.pop());
        }
    }
    
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        fila.offer(1);
        fila.offer(2);
        fila.offer(3);
        fila.offer(4);
        fila.offer(5);
        System.out.println("Fila original: " + fila);
        reverso(fila);
        System.out.println("Fila reversa: " + fila);
    }
}
