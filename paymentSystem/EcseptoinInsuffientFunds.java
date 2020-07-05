package main.java.com.akhmialkova.homework19.paymentSystem;

public class EcseptoinInsuffientFunds extends RuntimeException {
    public EcseptoinInsuffientFunds() {
        System.out.println("Insuffient Funds");
    }
}