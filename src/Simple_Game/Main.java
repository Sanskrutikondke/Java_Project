package Simple_Game;

public class Main {
    public static void main(String[] args) {
        Player1 player1 = new Player1("Monty","sword",100);
//        System.out.println(player1.getName());
//        System.out.println(player1.getWeapon());
//        System.out.println(player1.getHealth());
        player1.damageByGun1();
        player1.damageByGun1();
        player1.damageByGun2();
        player1.heal();
        System.out.println();
//        Player2 player2 = new Player2("Rocky" , "machine gun",80 ,false);
//        player2.damageByGun1();

    }
}
