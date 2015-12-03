/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author cuonic
 */
public class User {
    
    private String username;
    private String password;
    
    private String firstName;
    private String lastName;
    
    private float money;
    
    private Sex sex;
    private Country country;
      
    
    public User(String username, String password, String firstName, String lastName, Sex sex, Country country) throws Exception {
        setUsername(username);
        setPassword(password);
        
        setFirstName(firstName);
        setLastName(lastName);
        
        setSex(sex);
        setCountry(country);
        
        setMoney(1000);
    }
    
    private void setFirstName(String firstName) throws Exception {
        if(validateName(firstName)) {
            this.firstName = firstName;
        }
    }
    
    private void setLastName(String lastName) throws Exception {
        if(validateName(lastName)) {
            this.lastName = lastName;
        }
    }
    
    private void setPassword(String password) throws Exception {
        if(validatePassword(password)) {
            this.password = password;
        }
    }
    
    private void setUsername(String username) throws Exception {
        if(validateUsername(username)) {
            this.username = username;
        }
    }
    
    private void setMoney(float money) {
        this.money = money;
    }
    
    private void setSex(Sex sex) {
        this.sex = sex;
    }
    
    private void setCountry(Country country) {
        this.country = country;
    }
    
    private Boolean validatePassword(String password) throws Exception {
        if(password.length() < 6) {
            throw new Exception("Mot de passe trop court.");
        }
        
        return true;
    }
    
    private Boolean validateUsername(String username) throws Exception {
        if(username.length() < 3) {
            throw new Exception("Nom d'utilisateur trop court.");
        }
        
        if(username.length() > 30) {
            throw new Exception("Nom d'utilisateur trop long.");
        }
        
        return true;
    }
    
    private Boolean validateName(String name) throws Exception {
        if(name.length() < 3) {
            throw new Exception("Nom trop court.");
        }
        
        if(name.length() > 30) {
            throw new Exception("Nom trop long.");
        }
        
        return true;
    }
    
    public String getUsername() {
        return this.username;
    }
    
    public float getMoney() {
        return this.money;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public Sex getSex() {
        return this.sex;
    }
    
    public Country getCountry() {
        return this.country;
    }
    
    public Boolean verifyPassword(String password) throws Exception {
        if(validatePassword(password) && password == this.password) {
            return true;
        }
        
        return false;
    }
}
