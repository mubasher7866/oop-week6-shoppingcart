


import java.util.Scanner;

public class ShoppingCart {


    public static void main(String[] args) {

        Orders order = new Orders();

        while (true) {
            int count = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nCase does not matter");
            System.out.println("Please enter A for Apple, O for Orange, C for checkout or Q to exit");
            String input = scanner.next();

            if (input == null) {
                continue;
            }
            input = input.trim();
            char ch = input.charAt(0);

            String actual = String.valueOf(ch).toUpperCase();

            if (actual.equals("Q")){
                System.exit(0);
            }

            if (actual.equals("A") || actual.equals("O")) {
                while(true) {
                    try {
                        System.out.println("Please enter the count, or CONTL- to exit");
                        count = scanner.nextInt();
                        break;


            }

            switch (actual) {
                case "A":
                    addProduct(order, ProductTypes.APPLE, count);
                    printOrder(order);
                    break;
                case "O":
                    addProduct(order, ProductTypes.ORANGE, count);
                    printOrder(order);
                    break;
                case "C":
                    printOrder(order);

                    break;
                case "Q":
                    System.exit(0);
            }
        }

    }

    private static void printOrder(Orders order) {
        System.out.println(order);
    }

    private static void addProduct(Orders order, ProductTypes productType, int count) {
        Products product = new Products();
        Products.setProductTypes(productType);
        product.setPrice(Constant.PRICES.get(productType));
        OrderItems orderItem = new OrderItems();
        orderItem.setProducts(product);
        orderItem.setCount(count);
        order.addOrderItems(orderItem);
    }
}





