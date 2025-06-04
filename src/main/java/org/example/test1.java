package org.example;

import org.junit.runners.Parameterized;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {


    @Test(groups={"Regression"})
    public void test1_1()
    {

        System.out.println("test1_1");
    }
    @Test
    public void test1_2()
    {

        System.out.println("test1_2");
    }
    @Parameters({"URL"})
    @Test
    public void test1_3(String urlname)
    {

        System.out.println("test1_3");
        System.out.println(urlname);
    }
    @Test
    public void test1_4()
    {

        System.out.println("test1_4");
    }
}
