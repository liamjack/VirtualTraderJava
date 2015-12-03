/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author lijack
 */
public class Composant {
    private final StringProperty name = new SimpleStringProperty();

    public String getName() {
        return name.get();
    }

    public void setName(String value) {
        name.set(value);
    }

    public StringProperty nameProperty() {
        return name;
    }
    private final FloatProperty currentPrice = new SimpleFloatProperty();

    public float getCurrentPrice() {
        return currentPrice.get();
    }

    public void setCurrentPrice(float value) {
        currentPrice.set(value);
    }

    public FloatProperty actualPriceProperty() {
        return currentPrice;
    }
    private final StringProperty code = new SimpleStringProperty();

    public String getCode() {
        return code.get();
    }

    public void setCode(String value) {
        code.set(value);
    }

    public StringProperty codeProperty() {
        return code;
    }

    
    public Composant (String name, String code, Float currentPrice){
        setName(name);
        setCode(code);
        setCurrentPrice(currentPrice);
    }
}
