public class Product {

    private int price;
    private String name;

    Product(String name, int price) {
        this.price = price;
        this.name = name;
    }

    public Product() {
        this.price = 0;
        this.name = "";
    }

    public String getName() {
        return this.name;
    }

    public String setName(String string) {
        if(name.length() > 0) {
            name = string;
        } else {
            System.out.println("Cant set to nothing!");
            System.exit(1);
        }
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int setPrice(int price) {
        if(price >= 0) {
            this.price = price;
        } else {
            System.out.println("Can't be negative!");
            System.exit(1);
        }
        return this.price;
    }

    public String toString() {
        return this.name + ": " + this.price;
    }

    boolean equals(Product product) {
        return ((product.price == this.price) && (product.name.equals(this.name)));
    }
}
