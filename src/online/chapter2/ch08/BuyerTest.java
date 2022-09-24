package online.chapter2.ch08;

public class BuyerTest {
    public static void main(String[] args) {
        Buyer BuyerTom= new Buyer();
        BuyerTom.setBuyerName("Tomas");
        BuyerTom.buyerGen = "남성";
        BuyerTom.buyerWeight = 78;
        BuyerTom.buyerHeight = 180;
        BuyerTom.buyerOld = 37;

        BuyerTom.showBuyerInfo();
    }
}
