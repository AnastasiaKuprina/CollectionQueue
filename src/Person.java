public class Person {
    private String name;
    private int quantity;

    Person(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity1) {
        this.quantity = quantity1;
    }

}
