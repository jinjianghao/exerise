//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class Stream {
//    @Test
//    public void test1() {
//        List<Integer> list = Arrays.asList(1, 2, 5, 7, 9);
//        List<Integer> collect = list.stream().filter(l -> l > 5).collect(Collectors.toList());
//        System.out.println("大于五" + collect);
//    }
//
//    @Test
//    public void test2() {
//        List<Integer> list = Arrays.asList(1, 2, 5, 7, 9);
//        List<Integer> collect = list.stream().map(l ->
//        {
//            l = l * 2;
//            return l;
//        }).collect(Collectors.toList());
//        System.out.println("两倍输出" + collect);
//    }
//
//    @Test
//    public void test3() {
//        List<Integer> list = Arrays.asList(1, 2, 5, 7, 9);
//        List<Integer> collect = list.stream().map(l -> l = l * 2).collect(Collectors.toList());
////        System.out.println("两倍输出" + collect);
//        for (Integer integer : collect) {
//            System.out.println("两倍输出" + integer);
//        }
//
//    }
//
//
//    @Test
//    public void test4() {
//
//        Dog dog1 = new Dog("a", 5);
//        Dog dog2 = new Dog("b", 8);
//        List<Dog> dogs = Arrays.asList();
//        ArrayList<Dog> dogArrayList = new ArrayList<>(dogs);
//        dogArrayList.add(dog1);
//        dogArrayList.add(dog2);
//        List<Integer> collect = dogArrayList.stream().map(d -> d.getAge() * 2).collect(Collectors.toList());
////        List<Dog> collect = dogArrayList.stream().filter(d -> d.getAge()>5).collect(Collectors.toList());
////        System.out.println("两倍输出" + collect);
//        for (Integer integer : collect) {
//            System.out.println("输出" + integer);
//        }
//    }
////    public class ListTest {
////        public static void main(String[] args) {
////            String[] array = {"1","2","3","4","5"};
////            List<String> list = Arrays.asList(array);
////            List arrList = new ArrayList(list);
////            arrList.add("6");
////        }
////    }
//
//    @Data
//    @AllArgsConstructor
//    @NoArgsConstructor
//    public class Dog{
//
//        private String name;
//        private int    age;
//
//    }
//
//
//
//    @Test
//    public void test5() {
//        String s = new String("一二三四");
//        String a = new String("1234");
//
//        System.out.println(s.length());
//        System.out.println(a.length());
//
//    }
//
//}