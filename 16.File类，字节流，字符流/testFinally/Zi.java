package com.hqyj.cl.day14.testFinally;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Zi extends Fu{

    @Override
    public void show1() throws NullPointerException{

    }

    @Override
    public void show2()  {

        try {
            new SimpleDateFormat("").parse("");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
