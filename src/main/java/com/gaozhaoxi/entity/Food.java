package com.gaozhaoxi.entity;

/**
 * @author Leon
 */
public class Food {
    protected  Long id;
    protected  String name;

    public Food(Long id,String name){
        this.id=id;
        this.name=name;
    }
    public Food(){

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

