import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int scelta;
        Scanner in = new Scanner(System.in);
        Giocatore [] g = new Giocatore[10];
        do {
            System.out.println("Scegli una tra queste funzoni");
            System.out.println("1:aggiungere un giocatore alla squadra, controllando che non ci sia più di un capitano");
            System.out.println("2:modificare i dati di un giocatore a scelta");
            System.out.println("3:modificare i dati di un giocatore a scelta");
            System.out.println("4:cancellare un giocatore dalla squadra");
            System.out.println("5:visualizzare i giocatori che hanno realizzato più di 5 goal");
            System.out.println("6:visualizzare il nome del capitano");
            System.out.println("7:assegnare il ruolo di capitano in modo casuale se non ancora presente");
            System.out.println("0:fine");
            scelta = in.nextInt();
        }
        while(scelta !=0);
            switch (scelta) {
                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;
            }
        }
    }
