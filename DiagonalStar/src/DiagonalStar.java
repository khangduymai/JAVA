public class DiagonalStar {

    public static void main(String[] args){
            printSquareStar(8);  printSquareStar(8);  printSquareStar(8);
    }

    public static void printSquareStar(int num){


        if(num < 5)
            System.out.println("Invalid Value");
        else{
            int totalRow = num;
            int totalColumn= num;
            for(int currentRow = 1; currentRow <= totalRow; currentRow++){
                if(currentRow==1 || currentRow== totalRow){
                    for(int currentColumn = 1; currentColumn <= totalColumn; currentColumn++){
                        System.out.print("*");
                    }
                }

                if(currentRow >= 2 && currentRow < totalRow){
                    for(int currentColumn = 1; currentColumn <= totalColumn; currentColumn++){
                        if(currentColumn == 1){
                            System.out.print("*");
                        }
                        else if(currentColumn == totalColumn){
                            System.out.print("*");
                        }
                        else if(currentColumn == currentRow){
                            System.out.print("*");
                        }
                        else if(currentColumn == totalRow - currentRow + 1){
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
