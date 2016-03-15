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
public class PhoneNumber {
        String type;
        String number;
        
        @Override
        public String toString(){
        return type + ": " + number;
        }
}
