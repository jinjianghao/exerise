package main.java.org.example;

/**
 * 简装创建者
 */
public class JianzhuangBuilder implements HouseBuilder {

    private House house = new House();

    @Override
    public void doJiadian() {
        house.setJiadian("简单家电就好");
    }

    @Override
    public void doDiBan() {
        house.setDiban("普通地板");
    }

    @Override
    public void doYouqi() {
        house.setYouqi("污染较小的油漆就行");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
