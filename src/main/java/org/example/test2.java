package org.example;

import org.testng.annotations.Test;

public class test2 {



    @Test
    public void test2_1()
    {

        System.out.println("test2_1");
    }
    @Test(enabled=false)
    public void test2_2()
    {

        System.out.println("test2_2");
    }
    @Test
    public void test2_3()
    {

        System.out.println("test2_3");
    }
    @Test
    public void test2_4()
    {

        System.out.println("test2_4");
    }

    @Test
    public void sest2_5()
    {

        System.out.println("sest2_5");
    }
    @Test(dependsOnMethods={"test2_1"})
    public void quest2_5()
    {

        System.out.println("quest2_5");
    }
}
