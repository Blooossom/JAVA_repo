package online.chapter2.ch08;

public class OrderTest {
    public static void main(String[] args) {
        Order order= new Order();
        order.orderPhone = 12345678;
        order.orderNumber=2022092301;
        order.orderAddress = "서울시 강남구";
        order.orderDate=20220922;
        order.orderTime=1604;
        order.menuNum=1234;
        order.orderPrice=15000;

        order.showOrderInfo();
    }
}
