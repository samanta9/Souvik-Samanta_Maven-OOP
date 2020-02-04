package epam.com.maven_demo;


import java.util.Scanner;
abstract class gift
  {
	
	abstract void sort();
  }

interface calculate
  {
	
	 void  cal_weight();
  }
class sweet extends gift
{
	Scanner sc=new Scanner(System.in);
	
	   String st[]=new String [5];
	   int amount[]=new int[5];
	

      void input()
	    {
		   
		   System.out.println("enter 5 sweet name :");
		   
	           for(int i=0;i<5;i++)
	            {
		            
					st[i]=sc.nextLine();
	            }
				
	       System.out.println("enter 5 sweet corrospond amount :");
		   
	            for(int i=0;i<5;i++)
	            {
					 
		           amount[i]=sc.nextInt();
	            }
	   
		
	    }
	
    void sort()
     {
		 
		 
		  for(int i=0;i<4;i++)
	       {
		       for(int j=0;j<4-i;j++)
	            {
		           if(amount[j+1]>amount[j])
		           {
			         int temp=amount[j];
			         amount[j]=amount[j+1];
			            amount[j+1]=temp;
			  
			   
			             String g=st[j];
			               st[j]=st[j+1];
			                st[j+1]=g;
		            }      
	           }
		   }
		   
		   
      }
	void display()
	   {
		
			System.out.println("the hierarchy of  sweet by amount are :");
			for(int i=0;i<5;i++)
			  {
				  System.out.println( st[i]);
		
			  }
		
		
	   }
	
	

 }
class chocolate extends gift
 {
	  Scanner sc=new Scanner(System.in);
	  
	   String s[]=new String[5];
	    int a[]=new int[5];

	void input()
	    {
		            System.out.println("enter 5 chololate name :");
	                          for(int i=0;i<5;i++)
	                            {
		                             s[i]=sc.nextLine();
	                            }
	             	System.out.println("enter 5 chololate corrospond amount :");
	                         for(int i=0;i<5;i++)
	                          {
		                          a[i]=sc.nextInt();
	                          }
	   
		
	    }
	
	
   void sort()
       {
		     for(int i=0;i<4;i++)
	            {
		             for(int j=0;j<4-i;j++)
	                   {
		                        if(a[j+1]>a[j])
		                        {
			                            
 										   int temp=a[j];
			                               a[j]=a[j+1];
			                               a[j+1]=temp;
			   
			   
			                                String g=s[j];
			                                 s[j]=s[j+1];
			                                   s[j+1]=g;
		                        }
	                    }
				 
				}
			
			
        }
		
		
	void display()
	    {
			
			   System.out.println("the hierarchy of chocolate by amount are :");
			         
					 for(int i=0;i<5;i++)
			           {
						    System.out.println( s[i]   );
			           } 
				
		
		
	     }
	
	   
	   
		
  }
	


class collect extends gift implements calculate
 {
	
	 Scanner sc=new Scanner(System.in);
	 
		float w[]=new float[5];
	    float total=0,low,high,range;
		
		
	 void weight()
	    {
		  
		  System.out.println("enter 5 weights( in gm)  of  collected children's gift :");
	           for(int i=0;i<5;i++)
	                {
		                w[i]=sc.nextFloat();
	                }
	    }
		
		
	 public void   cal_weight()
	    {
		    for(int i=0;i<5;i++)
		        {
			        total=total+w[i]; 
		        } 
		 
	    }
	
	
	 void sort()
        {
		          for(int i=0;i<4;i++)
	                {
		                 for(int j=0;j<4-i;j++)
	                        {
		                          if(w[j+1]>w[j])
		                            {
			                            float temp=w[j];
			                              w[j]=w[j+1];
			                              w[j+1]=temp;
			  
			   
			                        }
	                        }
							
	                }
        }
		
		
      void dis()
            { 
                  System.out.println("\n"+"Sorted chocolates in a gift by weights are:");
                      for (int i=0;i<5;i++)
		                {
	                               System.out.print(w[i]+" ");
		                }
            }
   
      void findout ()
        {
			   
	          System.out.println("\n enter the lower limit  weight to find the candies :");
	           low=sc.nextFloat();
			    System.out.println("\n enter the  upper  limit  weight to find the candies :");
	                high =sc.nextFloat();
					
					 System.out.println("enter the   weight to find the candies :");
	                     range=sc.nextFloat();
						 if(range>=low && range<=high)
						 {
							 
							 System.out.println("the candies are available ");
							 
						 }
						 else
						 {
							 
							 System.out.println("sorry the candies are not available now !!!!!!");
						 }
						 
						 
			   
			   
	               
	   
	   
	   
	   
	   
        }
   
   
		
  }	

public class App
    {

	      public static void main(String[] args)
 		    {
		
		                 chocolate c=new chocolate();
						   
		                       c.input();
		                       c.sort();
		                       c.display();
						   
						   
		                sweet sw=new sweet();
						
		                      sw.input();
		                      sw.sort();
		                      sw.display();
		
		
		                collect f=new collect();
						
		                       f.weight();
		                       f.cal_weight();
		                       f.sort();
		                       f.dis();
							 
		                          System.out.println("\n"+"\n"+"total weight is:"+f.total);
								  
		                       f.findout();
		
		    }

    }
