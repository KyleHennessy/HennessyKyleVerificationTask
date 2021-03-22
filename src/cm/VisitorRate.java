package cm;

import java.math.BigDecimal;

public class VisitorRate implements ICarParkKindRates{

    @Override
    public BigDecimal reduction(BigDecimal cost) {
        BigDecimal amountNotCharged = new BigDecimal(8);
        BigDecimal amountReduced = new BigDecimal(0.5);
        BigDecimal result = cost.subtract(amountNotCharged).multiply(amountReduced);
        return result;
    }
}
