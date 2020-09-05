public class app {
    public static void main(String[] args) {
        Restaurant harrys_charbroiled = new Restaurant();
        harrys_charbroiled.setAddress("59 Bankview Cir");
        harrys_charbroiled.setName("Harry's Charbroiled Burgers");
        harrys_charbroiled.setPhoneNumber("647-888-7946");

        String name = harrys_charbroiled.getName();
        String address = harrys_charbroiled.getAddress();
        String phoneNumber = harrys_charbroiled.getPhoneNumber();

        System.out.println(name + "\n" + address + "\n" + phoneNumber);
    }


}
