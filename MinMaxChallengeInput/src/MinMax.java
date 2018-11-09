import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {

        int min = 0, max = 0, num, temp;
        int prevNum =0, currentNum = 0;

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter number: ");
            if (input.hasNextInt()) {
                num = input.nextInt();

                temp = num;

                if (temp > max && temp >= 0) {
                    max = temp;
                }
                else if(temp < 0){
                    currentNum = temp;
                    if (currentNum < prevNum){
                        min = currentNum;
                        max = prevNum;
                        prevNum = currentNum;
                    }
                }
                else {
                    min = temp;
                }

            } else {
                input.nextLine();
                System.out.println("max =" + max + " and min = " + min);
                break;
            }

            input.nextLine();
        }

        input.close();
    }

}
