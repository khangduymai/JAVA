import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName){
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addNewCustomer(String customerName, double initAmount){
        if(findCustomer(customerName) == null){
            this.customers.add(new Customer(customerName, initAmount));
            return true;
        }

        System.out.println("Customer "+ customerName + " is already in the database, and cannot add transaction.");
        return false;
    }


    public boolean addCustomerTransaction(String customerName, double amount){
        if(findCustomer(customerName) != null){
            Customer existingCustomer = findCustomer(customerName);
            existingCustomer.addTransaction(amount);
            return true;
        }

        System.out.println("Customer "+ customerName + " is not in the database. Please add the customer.");
        return false;
    }

    private Customer findCustomer(String name){
        for(int i = 0; i < this.customers.size(); i++){
            if(this.customers.get(i).getName().equals(name)){
                return this.customers.get(i);
            }
        }
        return null;
    }


    public void showCustomer(){
        for(int i = 0; i < this.customers.size(); i++ ){
            System.out.println(customers.get(i).getName());
            for(int j = 0; j < this.customers.size(); j++){
                System.out.println("Transaction amounts: " + customers.get(j).getTransaction());
            }
        }
    }

}
