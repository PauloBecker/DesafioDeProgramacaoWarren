import java.util.Scanner;

public class Desafio_02 {

    public static void main(String[] args) {

        Scanner tc = new Scanner(System.in);
        int[] horaEntrada = new int[10];
        int contAtraso = 0;

        System.out.println("===== O horário de início da aula é 8 horas ======");
        for (int i = 0; i < horaEntrada.length ; i++) {
            System.out.print("Digite o horário de entrada do aluno " + (i+1) + ": " );
            horaEntrada[i] = tc.nextInt();
            if (horaEntrada[i] > 8){
                contAtraso++;
            }
        }
        if (contAtraso >= 3){
            System.out.println("!!!!! Aula cancelada !!!!!!");
        }else {
            System.out.println("=== Aula normal ===");
        }

    }
}
