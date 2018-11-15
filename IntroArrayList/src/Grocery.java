import java.util.ArrayList;

public class Grocery {

    private ArrayList<String> grocery = new ArrayList<>();

    public void addGrocery(String item){
        grocery.add(item);
    }

    public void printGrocery(){
        System.out.println("You have " + grocery.size() + " items in your grocery list");
        for(int i = 0; i < grocery.size(); i++){
            System.out.println((i+1) + ". " + grocery.get(i));
        }
    }

    public void modifyItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyItem(position, newItem);
        }

    }

    private void modifyItem(int position, String newItem){
        grocery.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position){
        //String theItem = grocery.get(position);
        grocery.remove(position);
    }

/*    public String findItem(String searchItem){
        int position = grocery.indexOf(searchItem);
        if(position >= 0){
            return grocery.get(position);
        }

        return null;
    }*/

    private int findItem(String searchItem){
        return grocery.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }

        return false;
    }
}
