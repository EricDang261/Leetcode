class Solution {
   public String intToRoman(int num) {
      int numbers[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
      String roman[] = {"I", "IV", "V","IX" ,"X", "XL" ,"L", "XC","C", "CD","D", "CM","M"};

       String res = "";
       while(num > 0)
       {
           int romanindex = 0;
           for(int i = 0; i < numbers.length; i++)
           {
               if(numbers[i] > num)
               {
                   romanindex = i - 1;
                   break;
               }
               romanindex = numbers.length-1;
           }
           res = res.concat(roman[romanindex]);
           num -= numbers[romanindex];
       }
       
       return res;
    }
}