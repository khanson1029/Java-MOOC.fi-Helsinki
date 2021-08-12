
import java.awt.BorderLayout;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khanson1029
 */
public class Book {
    private String title;
    private int pages;
    private String pubYear;
    
    public Book(String title, int pages, String publishingYear){
        this.title = title;
        this.pages = pages;
        this.pubYear = publishingYear;
    }
    
    // returns the title of the book
    public String getTitle(){
        return this.title;
    }
    
    //returns the number of pages in the book
    public int getPages(){
        return this.pages;
    }
    
    //returns the year the book was published
    public String publishingYear(){
        return this.pubYear;
    }
    
    public String toString(){
        return this.title + ", " + this.pages + " pages, " + this.pubYear;
    }
}
