public class Product {
    String name;
    int price;
    String desc;
    public Product(String name,int price, String desc){
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                '}';
    }
}
