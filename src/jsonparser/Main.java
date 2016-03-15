/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonparser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;

/**
 *
 * @author derwin
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        JSONParser j = new JSONParser();
        JsonReader reader = j.getReader("data.json");

        Gson gson = new GsonBuilder().create();
        Contact c = gson.fromJson(reader, Contact.class);
        System.out.println(c);
    }
}
