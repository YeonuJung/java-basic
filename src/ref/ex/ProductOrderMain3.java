package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("입력할 주문의 개수를 입력하세요");
        int orderCount = sc.nextInt();

        ProductOrder[] orders = new ProductOrder[orderCount];

        for(int i = 0; i < orderCount; i++){
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = sc.next();
            System.out.print("가격: ");
            int productPrice = sc.nextInt();
            System.out.print("수량: ");
            int productQuantity = sc.nextInt();

            orders[i] = createOrder(productName, productPrice, productQuantity);
        }

        int totalAmount = getTotalAmount(orders);
        printOrders(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders){
        for(ProductOrder order : orders){
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for(ProductOrder order : orders){
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
