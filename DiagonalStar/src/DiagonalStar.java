public class DiagonalStar {

    public static void main(String[] args){
            printSquareStar(8);
    }

    public static void printSquareStar(int num){


        if(num < 5)
            System.out.println("Invalid Value");
        else{
            int row = num;
            int column= num;
            for(int i = 1; i <= row; i++){
                if(i==1 || i== row){
                    for(int j = 1; j <= column; j++){
                        System.out.print("*");
                    }
                }
                if(i >= 2 && i < row){
                    //int temp = i;
                    for(int j = 1; j <= column; j++){
/*                        if(j == 1 || j == column || j == i){
                            System.out.print("*");
                        }*/
                        if(i + j == num +1){
                            System.out.print("*");
                        }
                        else
                            System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }
    }
}
