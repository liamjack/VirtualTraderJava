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
    
    public User(String username, String password) throws Exception {
        setUsername(username);
        setPassword(password);
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
    
    public String getUsername() {
        return this.username;
    }
    
    public Boolean verifyPassword(String password) throws Exception {
        if(validatePassword(password) && password == this.password) {
            return true;
        }
        
        return false;
    }
}
