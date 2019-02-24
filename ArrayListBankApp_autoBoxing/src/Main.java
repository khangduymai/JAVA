public class Main {

    public static void main(String args[]){

/*        Customer cus1 = new Customer("Khang", 10.10);

        System.out.println("The name of the customer is: " + cus1.getName());
        System.out.println("The total amount of money for all transactions: " + cus1.getTransaction());

        cus1.addTransaction(50.5);
        System.out.println("The total amount of money for all transactions: " + cus1.getTransaction());*/


        Branch SouthVN = new Branch("SouthernVietNam");

        System.out.println("List of all the customers in " + SouthVN.getBranchName() + " branch:");
        SouthVN.addNewCustomer("Khang",100);
        SouthVN.addNewCustomer("Khai", 200);

        SouthVN.showCustomer();

        System.out.println();
        SouthVN.addNewCustomer("Khang", 20);

    }
}
