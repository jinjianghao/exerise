package main.java.org.two;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.RandomStringUtils;

public class jiami {
    public static void main(String[] args) {

//        String randomPassword = RandomStringUtils.randomAlphanumeric(16);
//        System.out.println(randomPassword);
//        String s = DigestUtils.md5Hex(randomPassword);
//        System.out.println(s);
//        System.out.println(encrypt(s));

//    public static String encrypt(String md5Hex) {
//        return new SimpleHash(Sha256Hash.ALGORITHM_NAME, md5Hex, credentialsSalt(md5Hex), HASH_INTERATIONS).toHex();
//    }





    String Str = new String("菜鸟教程:www.runoob.com");
    String SubStr1 = new String("runoob");
    String SubStr2 = new String("com");
        System.out.println(Str.substring(Str.lastIndexOf(".")+1));
        System.out.println(Str.substring(0,Str.lastIndexOf(".")).toLowerCase());
        System.out.println(Str.substring(0,Str.lastIndexOf(".")).toUpperCase());
        System.out.println("..........................");
        System.out.print("查找字符 o 最后出现的位置 :" );
        System.out.println(Str.lastIndexOf( 'o' ));
        System.out.print("从第14个位置查找字符 o 最后出现的位置 :" );
        System.out.println(Str.lastIndexOf( 'o', 14 ));
        System.out.print("子字符串 SubStr1 最后出现的位置:" );
        System.out.println( Str.lastIndexOf( SubStr1 ));
        System.out.print("从第十五个位置开始搜索子字符串 SubStr1最后出现的位置 :" );
        System.out.println( Str.lastIndexOf( SubStr1, 15 ));
        System.out.print("子字符串 SubStr2 最后出现的位置 :" );
        System.out.println(Str.lastIndexOf( SubStr2 ));
}
}
