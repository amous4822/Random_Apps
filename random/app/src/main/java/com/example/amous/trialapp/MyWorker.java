package com.example.amous.trialapp;

public class MyWorker {
    public static String doubleValue(String value){

        int carry=0,num;
        String ans="";

        for(int a=value.length()-1; a>=0; a--){

            num= Integer.parseInt(value.charAt(a)+"")*2 + carry;
            carry = num/10;
            num=num%10;

            ans = String.valueOf(num) + ans;
        }

        if(carry!=0)
            ans=String.valueOf(carry) + ans;

        return ans;
    }
}
