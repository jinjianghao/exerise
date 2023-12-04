package test.java;

import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.stream.*;

class OriginalObject {
    private String name;
    // other fields and methods

    // constructor for conversion
    public OriginalObject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class ConvertedObject {
    private String convertedName;
    // other fields and methods

    // constructor for conversion
    public ConvertedObject(String convertedName) {
        this.convertedName = convertedName;
    }
}

public class FileUploadExample {
    public static void main(String[] args) {
        // 假设你有一个包含OriginalObject的List集合
        List<OriginalObject> originalObjects = Arrays.asList(new OriginalObject("original1"), new OriginalObject("original2"));

        // 使用map流操作将OriginalObject转换为ConvertedObject
        List<ConvertedObject> convertedObjects = originalObjects.stream()
                .map(original -> new ConvertedObject(original.getName().toUpperCase()))
                .collect(Collectors.toList());

        // 输出转换后的对象
        convertedObjects.forEach(System.out::println);
    }



}