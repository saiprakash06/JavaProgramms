package com.qa.coding;



    public class ReverseAString {

        public static void main(String[] args) {
// TODO Auto-generated method stub
            String s1 = "Sai2Prakash3Nallapati";
            String[] sArray = s1.split("[0-9]");
            String rev = "";
            for (String s : sArray) {
                for (int i = s.length() - 1; i >= 0; i--) {
                    rev = rev + s.charAt(i);
                }
                if (rev.length() == s1.length()) {
                    break;
                }
                rev = rev + s1.substring(rev.length(), rev.length() + 1);
            }
            System.out.println(rev);

        }

    }

