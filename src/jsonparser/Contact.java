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
public class Contact {
    // All these private fields will be populated...
    // by GSON through the magic of introspection!
    //  - so no constructors
    private String firstName;
    private String lastName;
    private int age;
    private Address address;
    private PhoneNumber[] phoneNumbers;

    @Override
    public String toString() {
        String numbers="";
        for (PhoneNumber number : phoneNumbers) {
            numbers = numbers.concat(number.toString()).concat("\n");
        }
    String out = String.join("\n", firstName + " " +lastName, 
            Integer.toString(age),"",
            address.toString(),"",
            numbers);
    return out;
    }
}
