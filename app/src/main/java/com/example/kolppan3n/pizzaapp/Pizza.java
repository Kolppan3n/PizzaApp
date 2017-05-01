package com.example.kolppan3n.pizzaapp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kolppan3n on 01/05/2017.
 */

public class Pizza {
    String Name;
    String Size;
    String Dough;
    double Price;
    List<String> Toppings;

    public List<String> getToppings() {
        return Toppings;
    }

    public void setToppings(List<String> toppings) {
        Toppings = toppings;
    }

    public Pizza(){
        Toppings = new ArrayList<String>();
    }

    public Pizza(String n, String s, String d, double p){
        Name = n; Size = s; Dough = d; Price = p;
        Toppings = new ArrayList<String>();
    }

    public Pizza(String n, String s, String d, double p, List<String> t){
        Name = n; Size = s; Dough = d; Price = p;
        Toppings = t;
    }

    public String getName() {
        return Name;
    }

    public void setName(String n) {
        Name = n;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String s) {
        Size = s;
    }

    public String getDough() {
        return Dough;
    }

    public void setDough(String d) {
        Dough = d;
    }

    public void SetToppings(List<String> t){
        Toppings = t;
    }

    public List<String> GetToppings(){
        return (Toppings.size() > 0) ? Toppings : null;
    }
}
