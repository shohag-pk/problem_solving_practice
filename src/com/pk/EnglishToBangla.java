package com.pk;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EnglishToBangla {
    public static void main(String[] args) {
        String one = "12-JUN-2022";
        String replacedOne = one.replaceAll("0","০")
                .replaceAll("1","১")
                .replaceAll("2","২")
                .replaceAll("3","৩")
                .replaceAll("4","৪")
                .replaceAll("5","৫")
                .replaceAll("6","৬")
                .replaceAll("7","৭")
                .replaceAll("8","৮")
                .replaceAll("9","৯")
                .replaceAll("JAN","জানুয়ারি")
                .replaceAll("FEB","ফেব্রুয়ারী")
                .replaceAll("MAR","মার্চ")
                .replaceAll("APR","এপ্রিল")
                .replaceAll("MAY","মে")
                .replaceAll("JUN","জুন")
                .replaceAll("JUL","জুলাই")
                .replaceAll("AUG","আগষ্ট")
                .replaceAll("SEP","সেপ্টেম্বর")
                .replaceAll("OCT","অক্টোবর")
                .replaceAll("NOV","নভেম্বর")
                .replaceAll("DEC","ডিসেম্বর")
                .replaceAll("-"," ")
                ;
        String date1 = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")).toUpperCase();
        System.out.println(replacedOne.toString());
        System.out.println(date1.toString());

    }
}
