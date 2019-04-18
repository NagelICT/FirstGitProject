public class Main {

    public static void main (String[] args)
    {
        showMessage("This is a shorter version of system.out.println");
        Product product = new Product("Fictief",1);
        Product product2 = new Product("Fictief 2",2);
        Product product2_2 = new Product("Fictief 2",2);

        System.out.println(product);
        System.out.println(product.equals(product2));
        System.out.println(product2.equals(product2_2));
    }

    private static void showMessage(String string) {
        System.out.println(string);
    }
}
