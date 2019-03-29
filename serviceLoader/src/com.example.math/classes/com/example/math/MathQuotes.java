/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.math;

import com.example.quote.Quote;
import java.util.Random;

/**
 *
 * @author salma
 */
public class MathQuotes implements Quote {
    private String[] quotes= new String[]
    { "\"Mathematics is the music of reason.\n" 
    + "James Joseph Sylvester\n" ,
    "\"Without mathematics, there's nothing you can do. Everything around you is mathematics. Everything around you is numbers.\n" 
    };
    private Random rand = new Random();
    private int getRandomIndex() {
    return rand.nextInt(quotes.length);
    }

    @Override
    public String getQuote() {
        return  quotes[getRandomIndex()];  
    }
}
    

