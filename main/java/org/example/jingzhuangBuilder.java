package main.java.org.example;

/**
 * 精装创建者
 */
public class jingzhuangBuilder implements HouseBuilder {

    private House house = new House();

    @Override
    public void doJiadian() {
        house.setJiadian("二话不说，最好的");
    }

    @Override
    public void doDiBan() {
        house.setDiban("二话不说，实木地板");
    }

    @Override
    public void doYouqi() {
        house.setYouqi("二话不说，给我来0污染的");
    }

    @Override
    public House getHouse() {
        return house;
    }
}