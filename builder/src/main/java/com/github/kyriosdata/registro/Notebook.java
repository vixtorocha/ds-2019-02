package com.github.kyriosdata.registro;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Notebook {

    @Id
    private String id;

    Notebook() {
    }

    public Notebook(String id) {
        super();

        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Notebook: " + id;
    }

}