package com.cai.database;

import java.util.ArrayList;

/**
* Created by bchen on 9/27/14.
* Edited and maintained by Joomin "Cai" Yeo since 9/30/2014
*/
public class Period {
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
