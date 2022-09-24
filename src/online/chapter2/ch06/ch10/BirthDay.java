package online.chapter2.ch06.ch10;

public class BirthDay {
    private int day;
    private int month;
    private int year;

    private boolean isValid; //기본 false
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            isValid = false;
        } else {
            isValid = true;
            this.month = month;
        }
    }
    public void showDate(){
        if(isValid){
            System.out.println(year+"년 "+month+"월 "+day+"일" );

        }else{
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }
}
