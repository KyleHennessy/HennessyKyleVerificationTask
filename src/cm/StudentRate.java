package cm;

import java.math.BigDecimal;

public class StudentRate implements  ICarParkKindRates{
    @Override
    public BigDecimal reduction(BigDecimal cost) {
        BigDecimal amountNotCharged = new BigDecimal(5.50);
        BigDecimal amountReduced = new BigDecimal(0.25);
        //If cost is less than or equal to 5.50 return cost
        if(cost.compareTo(amountNotCharged) <= 0){
            return cost;
        }
        else {
            BigDecimal result = cost.subtract(amountNotCharged).multiply(amountReduced).add(amountNotCharged);
            return result;
        }
    }
}
