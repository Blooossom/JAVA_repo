package online.chapter2.ch08;

public class Order {
    int orderNumber;
    int orderPhone;
    String orderAddress;
    int orderDate;
    int orderTime;
    int menuNum;
    int orderPrice;

    public void showOrderInfo(){
        System.out.println("주문 접수 번호 : "+orderNumber);
        System.out.println("주문 핸드폰 번호 : "+orderPhone);
        System.out.println("주문 집 주소 : "+orderAddress);
        System.out.println("주문 날짜 : "+orderDate);
        System.out.println("주문 시간 : "+orderTime);
        System.out.println("주문 가격 : "+orderPrice);
        System.out.println("메뉴 번호 : "+menuNum);
    }
}
