import java.util.Scanner;

class Guesser{
    int GuesserNum;
    public int Guessernumber(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guesser kindly guess the number: ");
        GuesserNum = sc.nextInt();
        return GuesserNum;
    }
}
class Player{
    int PlayerNum;
    public int Playernumber(){
        Scanner sc = new Scanner(System.in);
        PlayerNum= sc.nextInt();
        return  PlayerNum;
    }
}
class Umpair{
    int Guessernum;
    int playernum1;
    int playernum2;
    int playernum3;
    public void CollectNumberFromGuesser(){
        Guesser Gu = new Guesser();
        Guessernum = Gu.Guessernumber();
    }

    public void CollectNumberFromPlayer(){
        System.out.print("player1 guess number: ");
        Player p1 = new Player();
        playernum1 = p1.Playernumber();

        System.out.print("Player2 guess number: ");
        Player p2 = new Player();
        playernum2 = p2.Playernumber();

        System.out.print("player3 guess number: ");
        Player p3 = new Player();
        playernum3 = p3.Playernumber();


    }
    public void compare(){
        if(Guessernum==playernum1){
            if(Guessernum==playernum2 && Guessernum==playernum3){
                System.out.println("all player are win the game");
            }
            else if(Guessernum==playernum2){
                System.out.println("player1 and player2 are win the game");
            }
            else if(Guessernum==playernum3){
                System.out.println("player1 and player3 are win the game");
            }
            else{
                System.out.println("only player1 win");
            }
        } else if (Guessernum==playernum2) {
            if(Guessernum==playernum3){
                System.out.println("player2 and player3 win the game");
            }
            else {
                System.out.println("player2 only win");
            }
        } else if (Guessernum==playernum3) {
            System.out.println("only player3 win the game");

        }
        else{
            System.out.println("all player are lost the game");
        }
    }
}


public class MyGuessergame {
    public static void main(String[] args) {
        System.out.println(".....game started.....");
        Umpair um = new Umpair();
        um.CollectNumberFromGuesser();
        um.CollectNumberFromPlayer();
        um.compare();
        System.out.println(".....Game over.....");
    }
}
