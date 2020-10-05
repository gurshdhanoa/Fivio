import java.util.ArrayList;

public class Restaurant {

    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<menuItem> menu =  new ArrayList<menuItem>();

    public Restaurant(String businessName, String restaurantAddress, String number){
        name = businessName;
        address = restaurantAddress;
        phoneNumber = number;
    }

    String getName(){
        return name;
    }

    String getAddress(){
        return address;
    }

    String getPhoneNumber(){
        return phoneNumber;
    }

    void addMenuItem(menuItem item){
        menu.add(item);
    }

    ArrayList getMenu(){
        return menu;
    }
}
