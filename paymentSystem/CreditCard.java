package main.java.com.akhmialkova.homework19.paymentSystem;

public class CreditCard extends Card {
    public CreditCard(String ownerName) {
        super(ownerName);
    }

    public CreditCard(String ownerName, int balance) {
        super(ownerName, balance);
    }

    @Override
    public void withdrawFromCard(int sum) throws EcseptionWrongAmount {
       try {
           if (sum < 0) {
               throw new EcseptionWrongAmount();
           } else {
               balance -= sum;
           }
       }catch (EcseptionWrongAmount a){
           a.getMessage();
       }
    }
}
