import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int horas;
        int minutos;
        int segundos;
        int conversaohoras;
        int conversaominutos;
        int totalSegundos;
        int tempoMeiaNoite;

        System.out.println("Olá, este programa testa quantos segundos faltam para acabar o dia \n ou a quantos segundos ele começou");

        System.out.println("qual é a hora agora?");
        horas = scan.nextInt();
        conversaohoras = horas * 3600;

        System.out.println("quantos minutos são agora?");
        minutos = scan.nextInt();
        conversaominutos = minutos * 60;

        System.out.println("e segundos?");
        segundos = scan.nextInt();
        totalSegundos = conversaohoras + conversaominutos + segundos;

        System.out.println("Agora já se passaram " + totalSegundos + " segundos");
        tempoMeiaNoite = 86400 - totalSegundos;

        if (tempoMeiaNoite >= 0) {
            System.out.println("E faltam " + tempoMeiaNoite + " segundos para a meia-noite!!");
        } else {
            System.out.println("\n Achou que iria aparecer número negativo né!? kkkkkkk! já passou muito tempo das 24 horas iniciais.");
        }


    }
}