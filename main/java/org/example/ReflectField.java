package main.java.org.example;

import lombok.Data;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ReflectField {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName("main.java.org.example.Student");
        //获取指定字段名称的Field类,注意字段修饰符必须为public而且存在该字段,
        // 否则抛NoSuchFieldException
        Object o = clazz.newInstance();
        Field ageField = clazz.getField("age");
        ageField.set(o,18);
        System.out.println("o:"+o);

        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.size());
        list.ensureCapacity(30);
        System.out.println(list.size());
//        //获取所有修饰符为public的字段,包含父类字段,注意修饰符为public才会获取
//        Field fields[] = clazz.getFields();
//        for (Field f:fields) {
//            System.out.println("f:"+f.getDeclaringClass());
//        }
//
//        System.out.println("================getDeclaredFields====================");
//        //获取当前类所字段(包含private字段),注意不包含父类的字段
//        Field fields2[] = clazz.getDeclaredFields();
//        for (Field f:fields2) {
//            System.out.println("f2:"+f.getDeclaringClass());
//        }
//        //获取指定字段名称的Field类,可以是任意修饰符的自动,注意不包含父类的字段
//        Field field2 = clazz.getDeclaredField("desc");
//        System.out.println("field2:"+field2);
    }
    /**
      输出结果: 
     field:public int main.java.org.example.Person.age
     f:class main.java.org.example.Student
     f:class main.java.org.example.Person
     f:class main.java.org.example.Person
     ================getDeclaredFields====================
     f2:class main.java.org.example.Student
     f2:class main.java.org.example.Student
     field2:public java.lang.String main.java.org.example.Student.desc
     */
}
@Data
class Person{
    public int age;
    public String name;
    //省略set和get方法
}
@Data
class Student extends Person{
    public String desc;
    private int score;
    //省略set和get方法
}