public class PlayingCat {

    public static void main(String[] args){

    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer){
            if(temperature  < 25 || temperature > 45){
                System.out.println("False");
                return false;
            }
            else
                System.out.println("True");
                return true;
        }
        else
            if(temperature < 25 || temperature > 35){
            System.out.println("False");
            return false;
            }
            else
                System.out.println("True");
                return true;
    }
}
