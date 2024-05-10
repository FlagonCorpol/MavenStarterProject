package com.flagon.maven;
import org.apache.commons.collections4.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Hello world!
 *
 */
@SpringBootApplication
@RestController
public class App implements Unmodifiable{

    public static void main(String[] args)
    {
		int x = 0;
        System.out.println( "Hello Maven World!" );
    	
    //SpringApplication.run(App.class, args);
    }
   /* 
    @GetMapping("/mavenhello")
    public String greeting() {
    	return "<!DOCTYPE html>"+
                "<html>" +
                "<head>" +
                "<title>Title of the document</title>"+
                "</head>" +
                "<body style=\"background-color:powderblue;\">"+
                "<h1>This is a heading</h1>" +
                "<p>" +
                "Hello maven brings you springboot world" +
                "</p>" +
                "</body>" +
                "</html>";
    	
    	}
		*/
    }
