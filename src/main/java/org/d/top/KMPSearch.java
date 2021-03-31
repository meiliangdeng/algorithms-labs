package org.d.top;

import java.util.Arrays;

public class KMPSearch {

    public static void main(String[] args) {

        String s= "ababababca";
        String p="abababca";
        int result = kmp(s,p);
        System.out.println("result ==:"+result);
    }

    static int  kmp(String s,String p){
        int i = 0;
        int j = 0;
        int [] next = new int[p.length()];
        getNext(p,next);
        System.out.println("next="+ Arrays.toString(next));
        while(i < s.length() && j < p.length()){
            if(j == -1 ||s.charAt(i) == p.charAt(j)){
                i++;
                j++;
            }else{
                j = next[j];
            }
        }

        if(j == p.length()){
            return i-j;
        }else {
            return  -1;
        }
    }

    static void getNext(String p,int [] next){
        int i = 0;
        int j = -1;
        next[i] = j;
        for(;i<p.length()-1;){
            if(j==-1 || p.charAt(i) == p.charAt(j)){
                i ++;
                j ++;
                next[i] = j;
            }else{
                j = next[j];
            }
        }

    }


}
