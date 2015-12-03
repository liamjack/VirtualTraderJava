/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author cuonic
 */
public class Article {
    private String title;
    private String content;
    private Date publicationDate;
    
    public Article(String title, String content, Date publicationDate) {
        setTitle(title);
        setContent(content);
        setPublicationDate(publicationDate);
    }
    
    private void setTitle(String title) {
        this.title = title;
    }
    
    private void setContent(String content) {
        this.content = content;
    }
    
    private void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public String getContent() {
        return this.content;
    }
    
    public Date getPublicationDate() {
        return this.publicationDate;
    }
}
