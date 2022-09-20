package Online.Chapter1.ch11;

public class TypeConversion {
    public static void main(String[] args) {
        int inum = 255;
        byte bnum = (byte)inum;
        System.out.println(bnum);

        double dnum = 3.14;
        int inum1 = (int)dnum;

        System.out.println(inum1);

        double dnum1 = 1.2;
        float fnum = 0.9f;

        int inum2 = (int)dnum1 + (int)fnum;
        int inum3 = (int)(dnum1+fnum);

        System.out.println(inum2);
        System.out.println(inum3);
    }
}
