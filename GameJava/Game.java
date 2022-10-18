import java.util.Scanner;

public class Game{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        boolean vezPlayer1 = true;
        
        System.out.println("Bem vindo ao JOGO");

        System.out.println("Digite o nome do player 1:");
        String nomePlayer1 = scan.nextLine();
        Personagens player1 = new Personagens ();
        player1.nome = nomePlayer1;

        System.out.println("Digite o nome do player 2:");
        String nomePlayer2 = scan.nextLine();
        Personagens player2 = new Personagens ();
        player2.nome = nomePlayer2;

        System.out.println("O primeiro player é o(a) " + player1.nome);
        System.out.println("O segundo player é o(a) " + player2.nome);
        System.out.println("Que comece a batalha");

        while(player1.vivo && player2.vivo){
            if (vezPlayer1){
                System.out.println(player1.nome+" digite o comando: 1-atacar 2-treinar xp 3-recuperar hp");
                int comando = scan.nextInt();

                if (comando == 1){
                    player1.atacar(player2);
                }
                    else if(comando == 2){
                        player1.treinar();
                    }
                    else if (comando == 3){
                        player1.recuperar();
                    }
                    else {
                        System.out.println("Perdeu a vez");
                    }
                }
                else {

                System.out.println(player2.nome+" digite o comando: 1-atacar 2-treinar xp 3-recuperar hp");
                int comando = scan.nextInt();
                
                if (comando == 1){
                    player2.atacar(player1);
                }
                    else if(comando == 2){
                        player2.treinar();
                    }
                    else if (comando == 3){
                        player2.recuperar();
                    }
                    else {
                        System.out.println("Perdeu a vez");
                    }
                }
                vezPlayer1 = !vezPlayer1;
            }
            scan.close();
        }

        // Personagens player1 = new Personagens();

}