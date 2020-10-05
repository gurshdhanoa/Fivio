public class menuItem {

    private String price;
    private String dishName;
    private String dishDesc;

    public menuItem(String dishTitle){
        dishName = dishTitle;
    }

    String getPrice() {
        return price;
    }

    void setPrice(String price){
        this.price = price;
    }

    String getDishName() {
        return dishName;
    }

    void setDishDesc(String dishDescription) {
        dishDesc = dishDescription;
    }

}
