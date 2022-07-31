package com.leetcode.romanInt;

class Solution {
    public static void main(String[] args) {
         Solution solution = new Solution();
        System.out.println(solution.romanToInt("IIIIV"));
    }
    public int romanToInt(String s) {
          int i=0,t=0;
          char j,k;
          do{
              int l=i+1;
              if (l==s.length()){
                  t = t + compare(getVal(s,i));
                  break;
              }
              switch (getVal(s,i)+""+getVal(s,l)) {
                  case "IV" -> {
                      t=t+4;
                      i++;
                  }
                  case "IX" -> {
                      t=t+9;
                      i++;
                  }
                  case "XL" -> {
                      t=t+40;
                      i++;
                  }
                  case "XC" -> {
                      t=t+90;
                      i++;
                  }
                  case "CD" -> {
                      t=t+400;
                      i++;
                  }
                  case "CM" -> {
                      t=t+900;
                      i++;
                  }
                  default -> {
                      t = t + compare(getVal(s,i));}
              };
             i++;
          }while (i<s.length());
          return t;
    }
    public int compare(char s){
        return switch (s) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public char getVal(String s,int i){
        return s.charAt(i);
    }

    /*

     second solution
     public int romanToInt(String s) {

        LinkedHashMap<Character,Integer> map1= new LinkedHashMap<>();

        map1.put('I',1);
        map1.put('V',5);
        map1.put('X',10);
        map1.put('L',50);
        map1.put('C',100);
        map1.put('D',500);
        map1.put('M',1000);

        // trick is to traverse from the back side
        int n = s.length();
        int result =map1.get(s.charAt(n-1));

        for(int i=n-2;i>=0;i--)
        {
            if(map1.get(s.charAt(i)) < map1.get( s.charAt(i+1) ) )
                result-=map1.get(s.charAt(i));
            else
            {result+=map1.get(s.charAt(i));}
        }

        return result;

    }
    * */
}