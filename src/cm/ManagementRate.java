package cm;

import java.math.BigDecimal;

public class ManagementRate implements ICarParkKindRates{

    @Override
    public BigDecimal reduction(BigDecimal cost) {
        BigDecimal minimumPayment = new BigDecimal(3);
        //if cost is less than 3 then return 3
        if (cost.compareTo(minimumPayment) == -1){
            return minimumPayment;
        }
        else{
            return cost;
        }
    }
}
