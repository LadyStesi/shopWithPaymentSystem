package main.java.com.akhmialkova.homework19.paymentSystem;

public class DebitCard extends Card {

    public DebitCard(String ownerName) {
        super(ownerName);
    }

    public DebitCard(String ownerName, int balance) {
        super(ownerName, balance);
    }

    @Override
    public void withdrawFromCard(int sum) throws EcseptionWrongAmount {
       try {
           if (sum < 0) {
               throw new EcseptionWrongAmount();
           } else if (sum > balance) {
               throw new EcseptoinInsuffientFunds();
           } else {
               balance -= sum;
           }
       }catch (EcseptionWrongAmount a){
           a.getMessage();
       }
    }
}
