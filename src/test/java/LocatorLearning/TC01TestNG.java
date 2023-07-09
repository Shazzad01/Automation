package LocatorLearning;

import org.testng.annotations.*;

public class TC01TestNG {
    @Test(priority = 1)
    public void testcase1(){
        System.out.println("test case 1");
    }
    @Test(priority = 0)
    public void testcase2(){
        System.out.println("test case 2");
    }
    @BeforeMethod
    public void beforeMathod(){
        System.out.println("execute before every mathod");
    }
    @AfterMethod
    public void afterMathod(){
        System.out.println("execute after every mathod");
    }
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("execute before every suit");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("execute before every test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("execute before every class");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("execute before every group");
    }

}
