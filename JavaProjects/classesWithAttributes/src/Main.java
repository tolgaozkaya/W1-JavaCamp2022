public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);

        Product product1 = new Product(2,"Laptop","Lenovo",10000,300,"mavi");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.Add(product1);
        System.out.println(product.getKod());
        System.out.println(product1.getKod());
    }
}
