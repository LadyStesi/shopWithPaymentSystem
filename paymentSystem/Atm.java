package main.java.com.akhmialkova.homework19.paymentSystem;

public class Atm {
    protected Card card;

    public Atm(Card card) {
        this.card= card;
    }

    public void withdrawFromCard(int sum) throws EcseptionWrongAmount {
        card.withdrawFromCard(sum);

    }

    public void addToCard(int sum) throws EcseptionWrongAmount {
        card.addToCard(sum);

    }

    public int getBalance() {
        return card.getBalance();
    }

    public double showBalanceInDollar() {
      return card.showBalanceInDollar();
    }
    public double showBalanceInDollarsEvro() {
       return card.showBalanceInDollarsEvro();
    }

    public double showBalanceInDollarsRubRF() {
       return card.showBalanceInDollarsRubRF();
    }
}
