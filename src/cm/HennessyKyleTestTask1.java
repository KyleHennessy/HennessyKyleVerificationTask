package cm;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class HennessyKyleTestTask1 {

    //Normal & Reduced Rate tests
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase1() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(-3);
        BigDecimal reducedRate = new BigDecimal(-4);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(5,6);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase2() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(3);
        BigDecimal reducedRate = new BigDecimal(-2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(5,6);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase3() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(3);
        BigDecimal reducedRate = new BigDecimal(5);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(5,6);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase4() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(25);
        BigDecimal reducedRate = new BigDecimal(10);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(5,6);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase5() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = null;
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(5,6);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase6() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = null;

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(5,6);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase7() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal("string");
        BigDecimal reducedRate = new BigDecimal(8);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(5,6);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase8() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(8);
        BigDecimal reducedRate = new BigDecimal("string");

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(5,6);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //Normal & Reduced Periods tests
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase9() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(5);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(2,5);
        Period normalPeriod2 = new Period(3,7);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase10() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(5);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(7,9);
        Period normalPeriod2 = new Period(11,5);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(2,5);
        Period reducedPeriod2 = new Period(3,7);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase11() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(5);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(7,9);
        Period normalPeriod2 = new Period(11,5);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(5,9);
        Period reducedPeriod2 = new Period(10,18);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase14() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(5);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(5,6);
        Period normalPeriod2 = null;


        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase15() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(5);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(5,6);
        Period normalPeriod2 = new Period(1,4);


        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = null;
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase16() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(5);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase17() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(5);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(5,6);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase18() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(5);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = null;
        Period normalPeriod2 = new Period(5,6);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase19() throws IllegalArgumentException{
        Rate r;

        CarParkKind c = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(12);
        BigDecimal reducedRate = new BigDecimal(5);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(5,6);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = null;
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void calculateTestCase1() throws IllegalArgumentException{
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(4);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(5,6);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);


        BigDecimal expectedOutcome = new BigDecimal(3);
        assertNotEquals(expectedOutcome, r.calculate(new Period(8,10)));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void calculateTestCase2() throws IllegalArgumentException{
        Rate r ;

        CarParkKind park = CarParkKind.VISITOR;

        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(4);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(8,10);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);


        BigDecimal expectedOutcome = new BigDecimal(20);
        assertNotEquals(expectedOutcome, r.calculate(normalPeriod1));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void calculateTestCase3() throws IllegalArgumentException{
        Rate r ;

        CarParkKind park = CarParkKind.STUDENT;

        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(4);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(8,14);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);


        BigDecimal expectedOutcome = new BigDecimal(29);
        assertNotEquals(expectedOutcome, r.calculate(normalPeriod1));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void calculateTestCase4() throws IllegalArgumentException{
        Rate r ;

        CarParkKind park = CarParkKind.MANAGEMENT;

        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(4);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(6,14);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);


        BigDecimal expectedOutcome = new BigDecimal(20);
        assertNotEquals(expectedOutcome, r.calculate(normalPeriod1));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void calculateTestCase5() throws IllegalArgumentException{
        Rate r ;

        CarParkKind park = null;

        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(4);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(5,6);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);


        BigDecimal expectedOutcome = new BigDecimal(10);
        assertNotEquals(expectedOutcome, r.calculate(normalPeriod1));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void calculateTestCase6() throws IllegalArgumentException{
        Rate r ;

        CarParkKind park = CarParkKind.VISITOR;

        BigDecimal normalRate = new BigDecimal(9);
        BigDecimal reducedRate = new BigDecimal(4);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(2,3);
        Period normalPeriod2 = new Period(1,4);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(7,9);
        Period reducedPeriod2 = new Period(11,15);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);

        BigDecimal expectedOutcome = new BigDecimal(10);
        assertNotEquals(expectedOutcome, r.calculate(normalPeriod1));
    }
}