/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.print;

import com.example.quote.Quote;
import java.util.ServiceLoader;

/**
 *
 * @author salma
 */
public class PrintQuotes {
 public static void main (String args [])
{
    ServiceLoader.load(Quote.class).forEach(service -> System.out.println(service.getQuote()));
}  
}
