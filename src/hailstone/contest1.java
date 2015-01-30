package hailstone;
import java.io.*;

public class contest1 {

	public static void main(String[] args) {
	    int n=0;
	    int max=1;
	    int cnt=1;
	     try
	     {
	     BufferedReader reader = new BufferedReader(new FileReader("K.txt"));
	     String line = reader.readLine();
	     while((line=reader.readLine())!=null)
	     {
	      n = Integer.parseInt(line.split(" ")[1]);
	      max=n;
	      while(n!=1)
	      {
	          if((n % 2)==0)
	          {
	            n=n/2;
	          }
	          else
	           {n=3*n+1;}
	           if(n > max)
	           {
	            max=n;
	           }
	       }
	        System.out.println(cnt + " " + max);
	        cnt++;
	     }
	    }
	    
	     catch(Exception ex)
	     {
	       System.out.println("Exception occured");
	     }
	    }

	}


