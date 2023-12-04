package test.java;

import java.io.File;

public class Test {
    public static void main(String args[]) {
//        String Str = new String("    www.runoob.com    ");
//        System.out.print("原始值 :" );
//        System.out.println( Str );
//
//        System.out.print("删除头尾空白 :" );
//        System.out.println( Str.trim() );
        String dirname = "/tmp/user/java/bin";
        File d = new File(dirname);
//        // 现在创建目录
//        d.mkdirs();

        deleteFolder(d);
    }
    // 删除文件及目录
    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }

}