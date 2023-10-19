package main.java.org.example;

/**
 * 家装公司，值需要告诉他精装还是简装
 */
public class HouseDirector {

    public House builder(HouseBuilder houseBuilder){
        houseBuilder.doDiBan();
        houseBuilder.doJiadian();
        houseBuilder.doYouqi();
        return houseBuilder.getHouse();
    }
}