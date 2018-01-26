package com.multiple.maths;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class multipleNumber {

    private String printonweb;
 @RequestMapping ("/")

    public String mathimas() {
        int x;

        for (x = 1; x <= 100; x++) {
            /*System.out.println(x);*/
            if(x%3 ==0 && x %5 == 0){

                printonweb += String.valueOf(x) +"<br/>";
                System.out.println(x + " fizzbuzz");
            }
            else if (x % 3 ==0) {
                printonweb += String.valueOf(x) +"<br/>";
                System.out.println(x + " fizz");
            }
            else if (x % 5 ==0){
                printonweb += String.valueOf(x) +"<br/>";
                System.out.println(x +" Buzz");

            }
            else{
                printonweb += String.valueOf(x) +"<br/>";
                System.out.println(x );
            }

                    }

           /* printonweb += String.valueOf(x) +("<br/");
           *  printOnWeb += String.valueOf(x) +"<br/>";*/

           return printonweb;


 }


    }

