import java.util.ArrayList;

public class Restaurant {

    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<menuItem> menu =  new ArrayList<menuItem>();

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setAddress(String address){
        this.address = address;
    }

    String getAddress(){
        return address;
    }

    void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    String getPhoneNumber(){
        return phoneNumber;
    }

    void addMenuItem(menuItem item){
        menu.add(item);
    }
}
