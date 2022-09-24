package online.chapter2.ch08;

public class Buyer {
    String buyerName;
    String buyerGen;
    int buyerHeight;
    int buyerWeight;
    int buyerOld;

    public void showBuyerInfo(){
        System.out.println("고객의 이름은 "+buyerName+"님이고 나이는 "+buyerOld+"세이며, 키는 "+buyerHeight+"이고, 몸무게는 "+buyerWeight+"이신 "+buyerGen+"입니다.");
    }
    public void setBuyerName(String name){
        buyerName = name;
    }

}
