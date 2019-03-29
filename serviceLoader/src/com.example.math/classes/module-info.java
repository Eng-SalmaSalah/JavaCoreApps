/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
module com.example.math {
    requires com.example.quote;
    provides com.example.quote.Quote
    with com.example.math.MathQuotes;
}
