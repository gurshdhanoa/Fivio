public class menuItem {

    private String price;
    private String dishName;
    private String dishDesc;

    public menuItem(String dishTitle, String cost){
        dishName = dishTitle;
        price = cost;
    }

    String getPrice() {
        return price;
    }

    String getDishName() {
        return dishName;
    }

    void setDishDesc(String dishDescription) {
        dishDesc = dishDescription;
    }

}
