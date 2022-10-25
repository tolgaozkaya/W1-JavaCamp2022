public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product(1,"Mouse",10);
        productManager.add(product);

        DatabaseHelper.Crud.Delete();

        DatabaseHelper.Connection.createConnection();
    }
}