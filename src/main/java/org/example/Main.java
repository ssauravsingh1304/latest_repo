package org.example;

import org.testng.annotations.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    @Test(groups={"Regression"})
    public void p1_1()
    {
        System.out.println("p1_1");
    }
@Parameters({"URL"})
    @Test
    public void p1_2(String urlname)
    {
        System.out.println("p1_2");
        System.out.println(urlname);
    }
    @Test
    public void p2_1()
    {
        System.out.println("p2_1");
    }

    @Test
    public void p2_2()
    {
        System.out.println("p2_2");
    }

    @Test
    public void p2_3()
    {
        System.out.println("p2_3");
    }


    @Test
    public void p2_4()
    {
        System.out.println("p2_4");
    }



}