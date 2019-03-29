/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.Scanner;

/**
 *
 * @author salma
 */
public class TestDictionary {
        public static void main(String[] args) {
        System.out.println("Insert key: ");
        Scanner input=new Scanner(System.in);
        Character key= input.next().charAt(0);
        Dictionary dictionary=new Dictionary();
        dictionary.createDictionary();
        dictionary.printDictionary();
        dictionary.SearchDictionary(key);
        
    }
}
