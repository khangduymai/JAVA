import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int count = 1;
        int sumNum = 0, num;

        Scanner input = new Scanner(System.in);

        while (count <= 10) {
            System.out.println("Enter number #" + count);

            if (input.hasNextInt()) {
                num = input.nextInt();
                sumNum += num;
                count++;
            } else {
                input.nextLine();
                System.out.println("Invalid Number");
                continue;
            }

            input.nextLine();
        }

        System.out.println("Total = " + sumNum);
    }
}
/*        while(true){
            int order = count+1;
            System.out.println("Print count #" + order);
            boolean hasNextInt = input.hasNextInt();

            if(hasNextInt){
                num = input.nextInt();
                //count++;
                sumNum += num;
                count++;
                if(count == 10)
                    break;
            }
            else{
                System.out.println("Invalid Number");
            }

            input.nextLine();

        }*/



