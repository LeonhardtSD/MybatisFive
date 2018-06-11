package com.gaozhaoxi.entity;

/**
 * @author Leon
 */
public class City {
    private Long id ;
    private String name;
    private Long pid;

    public City(){

    }
    public City(Long id ,String name,Long pid){
        this.id=id;
        this.name=name;
        this.pid=pid;
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

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }
}
