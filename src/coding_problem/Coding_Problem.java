
package coding_problem;

import java.util.Scanner;


public class Coding_Problem {
    Scanner s = new Scanner(System.in);
    public String[] getDetails()
    {
        
        
        System.out.println("Enter the size");
        int size1= s.nextInt();
        String[] pattern=new String[size1];
        System.out.println("Enter the elements");
        for(int i=0;i<size1;i++)
        {
            pattern[i] = s.next();
            
        }
        return pattern;
    }
    
    public String convert(String[] pattern)
    {
        int j;
        String str="";
        for(int i=0;i<pattern.length;i++)
        {
            if(i%2!=0)
            {
                j=Integer.parseInt(pattern[i]);
                while(j!=0)
                {
                    str =str+pattern[i-1];
                    j--;
                }
            }
        }
        return str;
    }
    
    public String check(String str1,String str2)
    {
        if(str1.length()==str2.length())
        {
            if((str1.substring(str1.length()-3,str1.length())).equals(str2.substring(0,3)))
            {
                return "True";
            }
        }    
        return "False"; 
    }

   
    public static void main(String[] args) 
    {
        Coding_Problem obj1=new Coding_Problem();
        Coding_Problem obj2=new Coding_Problem();
        String[] pattern1=obj1.getDetails();
        String[] pattern2=obj2.getDetails();
        String str1=obj1.convert(pattern1);
        String str2=obj2.convert(pattern2);
        Coding_Problem obj=new Coding_Problem();
        System.out.println(obj.check(str1, str2));
        
    }
    
}
