package main.java.org.example;

/**
 * 抽象建造者
 */
public interface HouseBuilder {
    // 买家电
    void doJiadian();
    // 买地板
    void doDiBan();
    // 买油漆
    void doYouqi();

    House getHouse();
}