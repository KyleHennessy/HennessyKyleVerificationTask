package cm;

import java.math.BigDecimal;

public class VisitorRate implements ICarParkKindRates{

    @Override
    public BigDecimal reduction(BigDecimal cost) {
        BigDecimal amountNotCharged = new BigDecimal(8);
        BigDecimal amountReduced = new BigDecimal(0.5);
        //if cost less than 8 then return 0
        if(cost.compareTo(amountNotCharged) == -1){
            return BigDecimal.ZERO;
        }
        else {
            BigDecimal result = cost.subtract(amountNotCharged).multiply(amountReduced);
            return result;
        }
    }
}
