package test.java;

import main.java.org.example.User;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test111111 {

    @Test
    public void test() throws FileNotFoundException {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("a.txt");
            int len = 0 ;
            byte[] bys = new byte[1024];
            while ((len = inputStream.read(bys)) != -1) {
                System.out.println((char) len);
                System.out.println("-----------");
                System.out.println(Arrays.toString(bys));
                System.out.println("-----------");
                System.out.println(new String(bys,0,len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Test
    public void  test1(){
        int[] a = {10, 2, 1, 5, 3, 7, 4, 9, 0};
        int length = a.length;

        int i,j;

        for( i= length -1; i > 0; i-- ){
            for(j=0;j<i;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));

    }
//    public static void bubbleSort1(int[] a, int n) {
//        int i,j;
//
//        for (i=n-1; i>0; i--) {
//            // 将a[0...i]中最大的数据放在末尾
//            for (j=0; j<i; j++) {
//
//                if (a[j] > a[j+1]) {
//                    // 交换a[j]和a[j+1]
//                    int tmp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = tmp;
//                }
//            }
//        }
//    }

    @Test
    public void test12(){
        List<Integer> userId =  Arrays.asList(1,2,3,4,5,6);
        Iterator<Integer> iterator = userId.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public List<String> test22(){
        String str = "aaa";
        String[] array = str.split(",");
        List<String> list = new ArrayList<>(Arrays.asList(array));
        return list;

    }


}
