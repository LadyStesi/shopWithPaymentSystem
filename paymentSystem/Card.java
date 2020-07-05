package main.java.com.akhmialkova.homework19.paymentSystem;

public abstract class Card {
    protected String ownerName;
    protected int balance = 0;


    public Card(String ownerName) {
        this.ownerName = ownerName;
    }

    public Card(String ownerName, int balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }


    public int getBalance() {
        return balance;
    }


    public String getOwnerName() {
        return ownerName;
    }

    public abstract void withdrawFromCard(int sum) throws EcseptionWrongAmount;


    public void addToCard(int sum) throws EcseptionWrongAmount {
        try {
            if (sum < 0) {
                throw new EcseptionWrongAmount();
            }
            balance += sum;
        } catch (EcseptionWrongAmount a) {
            a.getMessage();
        }


    }

    public double showBalanceInDollar() {
        double exchengeRate = 2.4;
        return balance / exchengeRate;
    }

    public double showBalanceInDollarsEvro() {
        double exchengeRate = 2.68;
        return balance / exchengeRate;
    }

    public double showBalanceInDollarsRubRF() {
        double exchengeRate = 3.42;
        return balance * exchengeRate / 100;
    }

    public String transferFromCardToCard(int sum, Card fromCard, Card toCard) throws EcseptionWrongAmount {
        fromCard.withdrawFromCard(sum);
        toCard.addToCard(sum);
        return "Операция прошла успешно";
    }

    @Override
    public boolean equals(Object card) {
        if (this == card) {
            return true;
        }
        if (!(card instanceof Card)) {
            return false;
        }
        if (balance != ((Card) card).balance) {
            return false;
        }
        return ownerName.equals(((Card) card).ownerName);
    }

    @Override
    public int hashCode() {
        int result;
        result = balance;
        result = result * 31 + ownerName.hashCode();
        return result;
    }
}
