package com.gaozhaoxi.entity;

import org.apache.ibatis.annotations.Param;

/**
 * @author Leon
 */
public class Province {
    private Long id;
    private String name;
    private Alias alias;

    public Province(){

    }
    public Province(Long id,String name,Alias alias){
        this.id=id;
        this.name=name;
        this.alias=alias;
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
}
