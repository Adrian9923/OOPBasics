package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Pokemon> pokemons;
    private List<Parent> parents;
    private List<Children> children;
    private Car car;

    public Person(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }


    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void addPokemon(Pokemon pokemon) {
        this.pokemons.add(pokemon);
    }

    public void addParent(Parent parent) {
        this.parents.add(parent);
    }

    public void addChild(Children children) {
        this.children.add(children);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(System.lineSeparator());
        sb.append("Company:").append(System.lineSeparator());
        if (this.company != null) {
            sb.append(this.company).append(System.lineSeparator());
        }
        sb.append("Car:").append(System.lineSeparator());
        if (this.car != null) {
            sb.append(this.car).append(System.lineSeparator());
        }
        sb.append("Pokemon:").append(System.lineSeparator());
        for (Pokemon pokemon : this.pokemons) {
            sb.append(pokemon).append(System.lineSeparator());
        }
        sb.append("Parents:").append(System.lineSeparator());
        for (Parent parent : this.parents) {
            sb.append(parent).append(System.lineSeparator());
        }
        sb.append("Children:").append(System.lineSeparator());
        for (Children child : this.children) {
            sb.append(child).append(System.lineSeparator());
        }

        return sb.toString().trim();
    }
}
