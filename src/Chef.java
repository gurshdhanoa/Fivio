import java.util.ArrayList;

public class Chef {

    private String first_name;
    private String last_name;
    private ArrayList<Restaurant> restaurant_suggestions = new ArrayList<Restaurant>();

    public Chef(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }

    String getFirstName(){
        return first_name;
    }
    
    String getLastName(){
        return last_name;
    }
    
    void addRestaurant(Restaurant resto){
        restaurant_suggestions.add(resto);
    }
    
    ArrayList getRestaurantList(){
        return restaurant_suggestions;
    }

}
