import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branch;

    public Bank(String bankName){
        this.bankName = bankName;
        this.branch = new ArrayList<>();
    }

    public String getBankName() {
        return bankName;
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            branch.add(new Branch(branchName));
            return true;
        }

        System.out.println("Branch is existed. Cannot add");
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initAmount){
        Branch branch = findBranch(branchName);

        if(branch != null){
            return branch.addNewCustomer(customerName,initAmount);
        }

        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double Amount){
        Branch branch = findBranch(branchName);

        if(branch != null){
            return branch.addCustomerTransaction(customerName,Amount);
        }

        return false;
    }

    private Branch findBranch(String branchName){
        for(int i = 0; i < branch.size(); i++){
            Branch checkBranch = this.branch.get(i);
            if(checkBranch.equals(branchName)){
                return checkBranch;
            }
        }
        return null;
    }

    public boolean listAllCustomerInBranch (String branchName, boolean showTransaction) {
        Branch existingBranch = findBranch(branchName);
        if (existingBranch != null) {
            System.out.println("Customers details for " + existingBranch.getBranchName() + ":");
            ArrayList<Customer> branchCustomers = existingBranch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                System.out.println("Customer name is: " + branchCustomers.get(i).getName());
                for (int j = 0; j < branchCustomers.size(); j++) {
                    System.out.println("Transaction amounts: " + branchCustomers.get(j).getTransaction());
                }
            }
            return true;
        }
        return false;
    }



}
