package com.thymeleaf.model;

public class Employee {

    private  String FirsName;
    private  String LastName;
    private String Conuntry;
    private String favoritLaunguage;
    private String favoriteSystem;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "FirsName='" + FirsName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Conuntry='" + Conuntry + '\'' +
                ", favoritLaunguage='" + favoritLaunguage + '\'' +
                ", favoriteSystem='" + favoriteSystem + '\'' +
                '}';
    }

    public String getConuntry() {
        return Conuntry;
    }

    public void setConuntry(String conuntry) {
        Conuntry = conuntry;
    }

    public Employee(String firsName, String lastName, String conuntry, String favoritLaunguage, String favoriteSystem) {
        FirsName = firsName;
        LastName = lastName;
        Conuntry = conuntry;
        this.favoritLaunguage = favoritLaunguage;
        this.favoriteSystem = favoriteSystem;
    }

    public String getFavoriteSystem() {
        return favoriteSystem;
    }

    public void setFavoriteSystem(String favoriteSystem) {
        this.favoriteSystem = favoriteSystem;
    }

    public String getFavoritLaunguage() {
        return favoritLaunguage;
    }

    public void setFavoritLaunguage(String favoritLaunguage) {
        this.favoritLaunguage = favoritLaunguage;
    }

    public String getFirsName() {
        return FirsName;
    }

    public void setFirsName(String firsName) {
        FirsName = firsName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
