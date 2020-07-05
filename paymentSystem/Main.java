package main.java.com.akhmialkova.homework19.paymentSystem;

public class Main {
    public static void main(String[] args) throws EcseptionWrongAmount {

        CreditCard client1 = new CreditCard("Jon Smit", 0);
        client1.addToCard(-500);
        System.out.println(client1.showBalanceInDollar());
        client1.withdrawFromCard(400);
        System.out.println(client1.getBalance());
        client1.withdrawFromCard(200);
        client1.addToCard(100);

        DebitCard client2 = new DebitCard("Jon Smit", 0);
        client2.addToCard(500);
        System.out.println(client2.showBalanceInDollar());
        client2.withdrawFromCard(400);
        System.out.println(client2.getBalance());
        client2.withdrawFromCard(200);
        client2.addToCard(-100);

        CreditCard client3 = new CreditCard("Jon Smit", 0);
        client3.addToCard(-500);
        System.out.println(client3.showBalanceInDollar());
        client3.withdrawFromCard(400);
        System.out.println(client3.getBalance());
        client3.withdrawFromCard(200);
        client3.addToCard(100);

        System.out.println(client3.equals(client1));
        System.out.println(client1.hashCode());
        System.out.println(client3.hashCode());
        System.out.println(client1.hashCode());

        Atm atm1 = new Atm(client3);
        atm1.addToCard(500);
        System.out.println(atm1.showBalanceInDollar());
        atm1.withdrawFromCard(400);
        System.out.println(atm1.getBalance());
        atm1.withdrawFromCard(200);
        atm1.addToCard(-100100);

    }
}
