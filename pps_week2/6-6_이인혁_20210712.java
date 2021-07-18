package week2;

import java.util.*;
import java.io.*;
 
 
public class SerialNumber {    
    public static void main6_6(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String [] arr = new String[size];
        
        for(int i=0; i<size; i++) {
            arr[i] = br.readLine();
        }
        
        Arrays.sort(arr,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()<o2.length()) {
                    return -1;
                }
                else if(o1.length()==o2.length()) {
                    if(add(o1)==add(o2)) 
                        return o1.compareTo(o2);
                    else 
                        return Integer.compare(add(o1), add(o2));
                }
                else 
                    return 1;
             }
        });
        for(String i: arr) {
            System.out.println(i);
        }
        
        
    }
    public static int add(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sum += s.charAt(i) - '0';
            }
        }
        return sum;
    }
}


