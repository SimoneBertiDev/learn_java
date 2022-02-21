package main.java.learn_java;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class SinglePerson {
    String id;
    String name;
    String gender;
    String age;
    String eye_color;
    String hair_color;
    ArrayList<String> films;
    String species;
    String url;

    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("gender")
    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @JsonProperty("age")
    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @JsonProperty("eye_color")
    public String getEye_color() {
        return this.eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    @JsonProperty("hair_color")
    public String getHair_color() {
        return this.hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    @JsonProperty("films")
    public ArrayList<String> getFilms() {
        return this.films;
    }

    public void setFilms(ArrayList<String> films) {
        this.films = films;
    }

    @JsonProperty("species")
    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
//        return super.toString("id:" + getId() + "\nname:" + name + "\ngender:" + gender + "\nage:" + age + "\neye_color:" +eye_color + "\nhair_color:" + hair_color + "\nfilms:" + films + "\nspecies:" + species + "\nurl:" + url);
        return super.toString();
    }
}

