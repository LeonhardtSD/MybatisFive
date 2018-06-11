package com.gaozhaoxi.entity;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Leon
 */
public class Province {
    private Long id;
    private String name;
    private Alias alias;
    private List<City> cities;
    private List<Food> foods;

    public Province(){

    }
    public Province(Long id,String name,Alias alias,List<City> cities,List<Food> foods){
        this.id=id;
        this.name=name;
        this.alias=alias;
        this.cities=cities;
        this.foods=foods;
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

    public Alias getAlias() {
        return alias;
    }

    public void setAlias(Alias alias) {
        this.alias = alias;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public List<City> getCities() {
        return cities;
    }
}
