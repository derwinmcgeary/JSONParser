/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonparser;

import com.google.gson.stream.JsonReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 *
 * @author derwin
 */
public class JSONParser {

    public JsonReader getReader(String fn) throws FileNotFoundException {
        JsonReader reader = new JsonReader(
                new InputStreamReader(
                        new FileInputStream("data.json")));
        return reader;
    }
}
