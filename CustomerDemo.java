package minor1;

public class CustomerDemo {

	public static void main(String[] args) {
	  int i;
	  Customer[]c=new RegularCustomer[5];
	  Customer[]p=new Privilegedcustomer[5];
	  c[0]=new RegularCustomer(1,"spoo",9738340335l,1000d);
	  c[1]=new RegularCustomer(2,"chaitu",9738340336l,2000d);
	  c[2]=new RegularCustomer(3,"dee",9738340337l,3000d);
	  c[3]=new RegularCustomer(4,"bala",9738340338l,4000d);
	  c[4]=new RegularCustomer(5,"gayu",9738340339l,5000d);
       for(i=0;i<c.length;i++)
       {
    	   System.out.println("the billamount of"+c[i].CustomerName+"is"+c[i].ComputBillamount()+"\n");
    	   
       }
       
       p[0]=new Privilegedcustomer(1,"AAA",9638340335l,1000d,"Privileged");
       p[1]=new Privilegedcustomer(1,"BBB",9638340336l,2000d,"PRIVILEGED");
       p[2]=new Privilegedcustomer(1,"CCC",9638340337l,3000d,"PRIVILEGED");
       p[3]=new Privilegedcustomer(1,"DDD",9638340338l,4000d,"Privileged");
       p[4]=new Privilegedcustomer(1,"EEE",9638340339l,5000d,"Privileged");
         for(i=0;i<p.length;i++)
         {
        	 System.out.println("the billamount of"+p[i].CustomerName+"is"+p[i].ComputBillamount()+"\n");
         }

}
}