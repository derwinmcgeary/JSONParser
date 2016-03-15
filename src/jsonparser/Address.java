/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonparser;

/**
 *
 * @author derwin
 */
public class Address {

    String streetAddress;
    String city;
    String state;
    int postalCode;
    
    @Override
    public String toString() {
        String out = String.join("\n", streetAddress, city, state, Integer.toString(postalCode));
        return out;
    }
}
