import java.util.LinkedList;
import java.util.Queue;

public class FilaImparPar {
    public static void contarImparPar(Queue<Integer> fila){
        int impares = 0;
        int pares = 0;

        for(Integer num : fila){
            if (num % 2 == 0) {
                pares++;
            }else{
                impares++;
            }
        }

        System.out.println("Quantidade de números impares :" + impares);
        System.out.println("Quantidade de números pares :" + pares);
    }


    public static void main(String[] args){
        Queue<Integer> fila = new LinkedList<>();
        fila.offer(1);
        fila.offer(2);
        fila.offer(3);
        fila.offer(4);
        fila.offer(5);
        contarImparPar(fila);
    }
}
