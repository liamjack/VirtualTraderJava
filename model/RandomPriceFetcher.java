/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author cuonic
 */
public class RandomPriceFetcher implements PriceFetcher {
    public float getLatestPrice(Composant c) {
        Random random = new Random();
        
        return random.nextFloat() * 1000;
    }
}
