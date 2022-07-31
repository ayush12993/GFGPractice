package com.doSelect;

class test {
public static void main(String[] args) {
        String text = "Cut";
        display(text);
        text += "Short!";
        display(text);
}
static void display(String text){
        System.out.print(text);
        text += " ";
}
}