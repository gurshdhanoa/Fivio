import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        Restaurant harrys_charbroiled = new Restaurant("59 Bankview Cir", "Harry's Charbroiled Burgers",
                "647-888-7946");
        ArrayList<menuItem> harrys_menu = new ArrayList<menuItem>();

        String name = harrys_charbroiled.getName();
        String address = harrys_charbroiled.getAddress();
        String phoneNumber = harrys_charbroiled.getPhoneNumber();

        menuItem cheeseburger = new menuItem("Cheeseburger", "8.44");
        menuItem french_fries = new menuItem("French Fries", "4.00");

        harrys_charbroiled.addMenuItem(french_fries);
        harrys_charbroiled.addMenuItem(cheeseburger);

        harrys_menu = harrys_charbroiled.getMenu();

        menuItem first_menu_item = harrys_menu.get(1);

        System.out.println(name + "\n" + address + "\n" + phoneNumber);

        System.out.print((first_menu_item.getDishName() + " " + first_menu_item.getPrice()));
    }
}
