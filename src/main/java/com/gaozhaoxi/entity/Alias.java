package com.gaozhaoxi.entity;

/**
 * @author Leon
 */
public class Alias {
    private Long id;
    private String name;


    public Alias(){

    }
    public Alias(Long id ,String name){
        this.id=id;
        this.name=name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
        String s="id:"+id+",name:"+name;
        return s;
    }
}
