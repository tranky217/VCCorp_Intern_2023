package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello world!");

        Person a = new Person(1, "a", "da");
        Person b = new Person(2, "b", "de");
        Person c = new Person(3, "c", "ds");

        List<Person> pList = new ArrayList<>();
        pList.addAll(Arrays.asList(a, b, c));

        String currentDir = System.getProperty("user.dir");
        String path = currentDir + "/" + "UsingMaven" + "/" + "src" + "/" + "main/java/output.json";
        System.out.println(path);

        Gson gson = new Gson();
        String json = gson.toJson(pList);
        try (PrintWriter out = new PrintWriter(new FileWriter(path))){

            out.write(json);
            out.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // read object from json file
        JsonParser jsonParser = new JsonParser();
        try(FileReader reader = new FileReader(path)){
            Object obj = jsonParser.parse(reader);

            JsonArray personList = (JsonArray) obj;

            personList.forEach(p -> {
                JsonObject pObj = (JsonObject) p;
                Person parsedPerson = new Person();

                parsedPerson.setId(pObj.get("id").getAsInt());
                parsedPerson.setName(pObj.get("name").getAsString());
                parsedPerson.setJob(pObj.get("job").getAsString());

                System.out.println("after parsing from json file: " + parsedPerson.toString());
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}