//package main.java.org.example;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.*;
//import java.util.*;
//import java.util.stream.*;
//
//class SearchObject {
//    private String searchProperty;
//    // other properties...
//
//    public String getSearchProperty() {
//        return searchProperty;
//    }
//
//    // other getters...
//}
//
//public class SearchExample {
//    public static void main(String[] args) {
//        List<SearchObject> list = ...; // your list of SearchObject
//        String singleQuery = ...; // your single query string
//
//        // 使用Java 8的流API进行搜索
//        List<SearchObject> result = list.stream()
//                .filter(s -> s.getSearchProperty().contains(singleQuery)) // 过滤出包含singleQuery的SearchObject
//                .filter(s -> s.getSearchProperty().contains("some other condition")) // 你可以添加更多的过滤条件
//                .collect(Collectors.toList()); // 将结果收集到一个新的列表中
//
//        // result现在包含满足所有搜索条件的SearchObject
//    }
//}