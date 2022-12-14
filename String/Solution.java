// import java.util.Arrays;

// public class  Solution{
//     public static void main(String args[]){
//         String str1 = "earth";
//         String str2 = "heast";

//         ///Convert Strings to lowercase. Why? so that we don't have to check
//         //separately for lower & uppercase.

//         str1=str1.toLowerCase();
//         str2=str2.toLowerCase();

//         // First check - if the lengths are the same
//         if(str1.length() ==str2.length())  {
//             // convert strings into char array
//             char[]str1charArray=str1.toCharArray();
//             char[]str2charArray=str2.toCharArray();

//             // sort the char array
//             Arrays.sort(str1charArray);
//             Arrays.sort(str2charArray);

//             // if the sorted char arrays are sameor identical then the strings are
//             // anagram

//             boolean result=Arrays.equals(str1charArray,str2charArray);

//  if(result) {System.out.println(str1+" and "+str2+" are anagrams of each other");
//         }
//         else{
//             System.out.println(str1+" and "+str2+" are not anagrams ");
//             }
//         }
//         else{
//             // case when lengths are not equal
//             System.out.println(str1+" and "+str2+" are not anagrams of each other");
//         }
// }
// }

import java.util.*;
public class Solution{
    public static void main(String[]args){

  Scanner sc = new Scanner(System.in);
    String str = sc.next(); 
     
    int count=0;

    for(int i=0;i<str.length();i++){ 
       char ch=str.charAt(i);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
         count++;
        }
        }
        
        System.out.println("count of vowels is :"+count);}
    }