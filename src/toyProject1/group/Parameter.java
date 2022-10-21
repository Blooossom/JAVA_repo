package toyProject1.group;

import java.util.Objects;

public class Parameter {
    private int minimumSpentTime;
    private int minimumTotalPay;

    //Constructor
    public Parameter(){
    }
    public Parameter(int minimumSpentTime, int minimumTotalPay) {
        this.minimumSpentTime = minimumSpentTime;
        this.minimumTotalPay = minimumTotalPay;
    }

    //Getter&Setter

    public int getMinimumSpentTime() {
        return minimumSpentTime;
    }

    public void setMinimumSpentTime(int minimumSpentTime) {
        this.minimumSpentTime = minimumSpentTime;
    }

    public int getMinimumTotalPay() {
        return minimumTotalPay;
    }

    public void setMinimumTotalPay(int minimumTotalPay) {
        this.minimumTotalPay = minimumTotalPay;
    }

    //equals()&hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parameter parameter = (Parameter) o;
        return minimumSpentTime == parameter.minimumSpentTime && minimumTotalPay == parameter.minimumTotalPay;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minimumSpentTime, minimumTotalPay);
    }

    //toString
    @Override
    public String toString() {
        return "Parameter{" +
                "minimumSpentTime=" + minimumSpentTime +
                ", minimumTotalPay=" + minimumTotalPay +
                '}';
    }
}
