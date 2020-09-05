public class menuItem {

    private float price;
    private String dishName;
    private String dishDesc;

    float getPrice() {
        return price;
    }

    void setPrice(float price){
        this.price = price;
    }

    String getDishName() {
        return dishName;
    }

    void setDishName(String dishName) {
        this.dishName = dishName;
    }

    void setDishDesc(String dishDescription) {
        dishDesc = dishDescription;
    }

}
