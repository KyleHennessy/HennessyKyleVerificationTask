package cm;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class HennessyKyleTestTask3 {
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

        BigDecimal normalRate = new BigDecimal(26);
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
    //reducedPeriods = null
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase20() throws IllegalArgumentException{
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

        reducedPeriods = null;

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }
    //reducedPeriods = null
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void rateTestCase21() throws IllegalArgumentException{
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

        normalPeriods = null;

        r = new Rate(c, normalRate, reducedRate, normalPeriods, reducedPeriods);
    }

    //Periods overlap
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
        r.calculate(reducedPeriod1);
    }
    //Null car park kind
    @Test
    public void calculateTestCase3() throws IllegalArgumentException{
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
    }
    //Periods not valid individually
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void calculateTestCase4() throws IllegalArgumentException{
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
    }
    //rates = 0
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void calculateTestCase5() throws IllegalArgumentException{
        CarParkKind park = CarParkKind.STUDENT;

        BigDecimal normalRate = new BigDecimal(0);
        BigDecimal reducedRate = new BigDecimal(0);

        ArrayList<Period> normalPeriod = new ArrayList<>();
        normalPeriod.add(new Period(4,7));
        ArrayList<Period> reducedPeriod = new ArrayList<>();
        reducedPeriod.add(new Period(7,23));
        Rate r = new Rate(park,normalRate,reducedRate,normalPeriod,reducedPeriod);
        Period p = new Period(5,9);
        r.calculate(p);
    }
    //rates = negative number
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void calculateTestCase6() throws IllegalArgumentException{
        CarParkKind park = CarParkKind.STUDENT;

        BigDecimal normalRate = new BigDecimal(-5);
        BigDecimal reducedRate = new BigDecimal(-2);

        ArrayList<Period> normalPeriod = new ArrayList<>();
        normalPeriod.add(new Period(2,5));
        ArrayList<Period> reducedPeriod = new ArrayList<>();
        reducedPeriod.add(new Period(5,23));
        Rate r = new Rate(park,normalRate,reducedRate,normalPeriod,reducedPeriod);
        Period p = new Period(1,6);
        r.calculate(p);
    }
    //Period out of range
    @org.junit.Test(expected = IllegalArgumentException.class)
    public void calculateTestCase7() throws IllegalArgumentException{
        CarParkKind park = CarParkKind.STUDENT;

        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> normalPeriod = new ArrayList<>();
        normalPeriod.add(new Period(2,5));
        ArrayList<Period> reducedPeriod = new ArrayList<>();
        reducedPeriod.add(new Period(5,29));
        Rate r = new Rate(park,normalRate,reducedRate,normalPeriod,reducedPeriod);
        Period p = new Period(18,25);
        r.calculate(p);
    }

    //Task 2
    //Rates the same
    @Test
    public void RatesSameTestCase(){
        CarParkKind park = CarParkKind.STUDENT;

        BigDecimal normalRate = new BigDecimal(1);
        BigDecimal reducedRate = new BigDecimal(1);

        ArrayList<Period> normalPeriod = new ArrayList<>();
        normalPeriod.add(new Period(10,14));
        ArrayList<Period> reducedPeriod = new ArrayList<>();
        reducedPeriod.add(new Period(18,20));
        Rate r = new Rate(park,normalRate,reducedRate,normalPeriod,reducedPeriod); //Not allowed even though its mentioned on spec that it is
    }

    //Valid input, normal rate = 2
    @Test
    public void calculateTestCaseValidInput2() {
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(8,10);
        normalPeriods.add(normalPeriod1);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        assertEquals(r.calculate(normalPeriod1), BigDecimal.valueOf(4)); //Calculate = 2 as normalRate is 1 and normalPeriod is 2 hours long
    }
    //Valid input, normal rate = 2
    @Test
    public void calculateTestCaseValidInput3() {
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(8,10);
        normalPeriods.add(normalPeriod1);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        assertEquals(BigDecimal.valueOf(4), r.calculate(normalPeriod1)); //Calculate = 4 as normalRate is 2 and reducedPeriod is 2 hours long
    }
    //Valid input, reduced rate = 2
    @Test
    public void calculateTestCaseValidInput4() {
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(5);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period reducedPeriod1 = new Period(8,10);
        reducedPeriods.add(reducedPeriod1);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        assertEquals(BigDecimal.valueOf(4), r.calculate(reducedPeriod1)); //Calculate = 4 as normalRate is 2 and reducedPeriod is 2 hours long
    }
    //Valid input, normalPeriod normal rate = 10
    @Test
    public void calculateTestCaseValidInput5() {
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(10);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(8,10);
        normalPeriods.add(normalPeriod1);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        assertEquals(BigDecimal.valueOf(20), r.calculate(normalPeriod1)); //Calculate = 4 as normalRate is 2 and reducedPeriod is 2 hours long
    }
    //Valid input, free hours outside normalPeriod
    @Test
    public void calculateTestCaseValidInput6() {
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(0,7);
        normalPeriods.add(normalPeriod1);

        Period freePeriod = new Period(11,14);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        assertEquals( BigDecimal.valueOf(0), r.calculate(freePeriod)); //Calculate = 0 as parking in free times (11-14 is free)
    }

    //Valid input, free hours outside reducedPeriod
    @Test
    public void calculateTestCaseValidInput8() {
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period reducedPeriod1 = new Period(0,7);
        reducedPeriods.add(reducedPeriod1);

        Period freePeriod = new Period(10,14);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        assertEquals(BigDecimal.valueOf(0), r.calculate(freePeriod)); //Calculate = 0 as parking during free hours
    }

    //Valid input, free hours 0-10 + 3 hours paid reducedPeriod
    @Test
    public void calculateTestCaseValidInput9() {
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period reducedPeriod1 = new Period(0,10);
        reducedPeriods.add(reducedPeriod1);

        Period freePeriod = new Period(7,13);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        assertEquals(BigDecimal.valueOf(6), r.calculate(freePeriod)); //Calculate = 6 as parking during free hours + 3 hours parked in reduced time
    }

    //Valid input, 2 periods in each list testing normalPeriod
    @Test
    public void calculateTestCaseValidInput10(){
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(0,4);
        Period normalPeriod2 = new Period(5,9);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(12,17);
        Period reducedPeriod2 = new Period(18,20);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        assertEquals(BigDecimal.valueOf(8), r.calculate(normalPeriod1)); //Calculate = 8 as 4 hours at 2 euro per hour is 8
    }
    //Valid input, 2 periods in each testing normalPeriod
    @Test
    public void calculateTestCaseValidInput11(){
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(2);
        BigDecimal reducedRate = new BigDecimal(1);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(0,4);
        Period normalPeriod2 = new Period(5,9);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(12,17);
        Period reducedPeriod2 = new Period(18,20);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
        assertEquals(BigDecimal.valueOf(2), r.calculate(reducedPeriod2)); //Calculate = 8 as 4 hours at 2 euro per hour is 8
    }

    //Duration test case
    @Test
    public void durationTestCase(){
        Period normalPeriod = new Period(3,4);
        assertEquals(1, normalPeriod.duration()); //1 hour long
    }

    //Valid input 2 normal periods and 2 reduced periods
    @Test
    public void RateTestCaseValidInput1(){
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(9,11);
        Period normalPeriod2 = new Period(15,18);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(0,3);
        Period reducedPeriod2 = new Period(5,8);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //Valid input 2 normal periods and 1 reduced periods
    @Test
    public void RateTestCaseValidInput2(){
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(9,11);
        Period normalPeriod2 = new Period(15,18);
        normalPeriods.add(normalPeriod1);
        normalPeriods.add(normalPeriod2);

        Period reducedPeriod1 = new Period(0,3);
        reducedPeriods.add(reducedPeriod1);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //Valid input 1 normal periods and 2 reduced periods
    @Test
    public void RateTestCaseValidInput3(){
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(9,11);
        normalPeriods.add(normalPeriod1);


        Period reducedPeriod1 = new Period(0,3);
        Period reducedPeriod2 = new Period(5,8);
        reducedPeriods.add(reducedPeriod1);
        reducedPeriods.add(reducedPeriod2);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

    //Valid input 1 normal periods and 1 reduced periods
    @Test
    public void RateTestCaseValidInput4(){
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(9,11);
        normalPeriods.add(normalPeriod1);

        Period reducedPeriod1 = new Period(0,3);
        reducedPeriods.add(reducedPeriod1);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
    //Valid input 1 normal periods and null reduced periods
    @Test
    public void RateTestCaseValidInput5(){
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period normalPeriod1 = new Period(9,11);
        normalPeriods.add(normalPeriod1);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
    //Valid input null normal periods and 1 reduced periods
    @Test
    public void RateTestCaseValidInput6(){
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        Period reducedPeriod1 = new Period(9,11);
        reducedPeriods.add(reducedPeriod1);

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }
    //Valid input null normal periods and null reduced periods
    @Test
    public void RateTestCaseValidInput7(){
        Rate r ;

        CarParkKind park = CarParkKind.STAFF;

        BigDecimal normalRate = new BigDecimal(4);
        BigDecimal reducedRate = new BigDecimal(2);

        ArrayList<Period> normalPeriods = new ArrayList<Period>();
        ArrayList<Period> reducedPeriods = new ArrayList<Period>();

        r = new Rate(park, normalRate, reducedRate, reducedPeriods, normalPeriods);
    }

}
