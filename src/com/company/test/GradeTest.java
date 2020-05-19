package com.company.test;


import com.company.practise.Grade2;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import static com.company.practise.Grade2.determineClassAverage;

public class GradeTest {
    @Before
    public void setUp() {
        System.out.println("Test starting");
    }

    @Test
    public void TestDisplayMessage() {
        String name = "ogechi";
        int age = 14;
        String validMsg = "\n\nName = ogechi" + "\nAge = 14" + "\nBalance = 1000";
        Grade2 grade2 = new Grade2(name, age);
        Assert.assertEquals(validMsg, grade2.getDisplayMessage());
    }

    @Test
    public void TestNotEqualDisplayMessage() {
        String name = "Beastie";
        int age = 14;
        String validMsg = "\n\nName = ogechi" + "\nAge = five" + "\nBalance = 1000";
        Grade2 grade2 = new Grade2(name, age);
        Assert.assertNotEquals(validMsg, grade2.getDisplayMessage());
    }

    @Test
    public void TestFailedDisplayMessage() {
        String name = "Beastie";
        int age = 14;
        String validMsg = "\n\nName = ?Beastie" + "\nAge = five" + "\nBalance = 1000";
        Grade2 grade2 = new Grade2(name, age);
        Assert.assertNotEquals(validMsg, grade2.getDisplayMessage());
    }

    @Test
    public void DetermineClassAverageTest() {
        double[] scores = {10, 20, 24, 34, 52, 9};
        double validResult = 24.833333333333332;
        Assert.assertEquals(validResult, determineClassAverage(scores), 0.0);
    }

    @Test
    public void DetermineClassAverageTestDouble() {
        double[] scores = {2.3, 2.5, 3.0, 2.8, 4.56, 10.7};
        double validResult = 4.31;
        Assert.assertEquals(validResult, determineClassAverage(scores), 0.0);

    }

    @Test
    public void DetermineClassAverageTestFailed() {
        double[] scores = {6,7,01.3};
        double validResult = 4.7666666667;
        Assert.assertNotEquals(validResult, determineClassAverage(scores), 0.0);

    }
}
