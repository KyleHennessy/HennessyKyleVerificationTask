package cm;

import java.math.BigDecimal;

public class StaffRate implements ICarParkKindRates{
    @Override
    public BigDecimal reduction(BigDecimal cost) {
        BigDecimal maximumAmount = new BigDecimal(16);
        if(cost.compareTo(maximumAmount) >= 0){
            return maximumAmount;
        }
        else{
            return cost;
        }
    }
}
