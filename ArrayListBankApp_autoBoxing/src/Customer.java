import java.util.ArrayList;

public class Customer {

    //Declare instance variables
    String name;
    ArrayList<Double> transaction;

    //Create constructor
    public Customer(String name, double initTransaction){
        this.name = name;
        this.transaction = new ArrayList<Double>();
        addTransaction(initTransaction);
    }

    //Create getter method
    public String getName() {
        return name;
    }
    public ArrayList<Double> getTransaction(){
        return transaction;
    }

    //create function to add transactions to each customer
    public void addTransaction(double money){
        transaction.add(money);
    }

}
