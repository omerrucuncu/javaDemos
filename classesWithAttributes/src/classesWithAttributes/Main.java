package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(1, "Laptop", "Asus", 7500, 3);

		product.setId(1);
		product.set_name("Laptop");
		product.set_description("Asus");
		product.set_price(7500);
		product.set_stockAmount(3);
		product.get_kod();

		System.out.println(product.get_kod());

		ProductManager productManager = new ProductManager();

		productManager.Add(product);

		productManager.Add2(1, "name", "descripton", 3, 1111, "yesil");

	}

}
