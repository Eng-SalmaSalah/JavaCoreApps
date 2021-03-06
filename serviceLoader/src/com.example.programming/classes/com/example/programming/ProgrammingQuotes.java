/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.programming;

import com.example.quote.Quote;
import java.util.Random;

/**
 *
 * @author salma
 */
public class ProgrammingQuotes implements Quote {
    private String[] quotes= new String[]
    { "\"To iterate is human, to recursedivine.\"\n"
    + "-L. Peter Deutsch",
    "\"Don't worry if it doesn't work right. "
    + "If everything did, you'd be out of a job.\"\n"
    + "-Mosher's Law of Software Engineering",
    "\"Good design adds value faster than it adds cost.\"\n"
    + "-Thomas C. Gale","\"Talk is cheap. Show me the code.\"\n"
    + "-Linus Torvalds",
    "\"I don't care if it works on your machine! We are not shipping your machine!\"\n"
    + "-VidiuPlaton", };
    private Random rand = new Random();
    private int getRandomIndex() {
    return rand.nextInt(quotes.length);
    }
    @Override
    public  String getQuote() {
    return  quotes[getRandomIndex()];
}
}
