package com.gaozhaoxi.entity;

/**
 * @author Leon
 */
public class Noodle extends Food {
    private int price;

    public Noodle(){
        super();
    }
    public Noodle(int price){
        super();
        this.price=price;
    }
    public Noodle(Long id,String name,int price){
        super(id,name);
        this.price=price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
