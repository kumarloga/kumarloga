/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasics;



/**
 *
 * @author kumar
 */
public class splitsentence {
    public static void main(String [] arg){
    String sentence="the search engine google got its name form the word googal whic refers tho the number one with a hunder zeros ofter it";
    String words[]=sentence.split(" ");
    for(int i=0;i<words.length;i++){
        for(int j=0;j<words.length;j++){
            int flag=0;
          if((j!=0)&&(words[i].equals(words[j])))
              flag=1;
          if(flag==1)sentence.toUpperCase();

              }
    }
        System.out.println();
    
    
    
    }
    
}
