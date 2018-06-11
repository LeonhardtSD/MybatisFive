package com.gaozhaoxi.entity;

import sun.util.resources.cldr.pt.CalendarData_pt_GW;

/**
 * @author Leon
 */
public class Rice extends Food{
    private String way;

    public Rice(){
        super();
    }
    public Rice(String way){
        super();
        this.way=way;
    }
    public Rice(Long id,String name,String way){
        super(id,name);
        this.way=way;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }
}
