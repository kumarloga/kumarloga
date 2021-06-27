package javabasics;

class HDFC{
 int loanamount;
    HDFC(){
    loanamount=10000;
    }
}
class Customer1 extends HDFC{
    int loanamount;
    Customer1(){
        loanamount=5000;
        
    }
    void display(){
    System.out.println("Customer 1 loanamount="+(loanamount+super.loanamount));
    }

}
class customer2 extends HDFC{
    int loanamount;
    customer2(){
        loanamount=1000;
        
    }
    void display1(){
    System.out.println("Customer 2 loanamount="+(loanamount+super.loanamount));
    }

}
class customer3 extends HDFC{
     int loanamount;
     customer3(){
         loanamount=0;
        
     }
     void display2(){
      System.out.println("Customer 3 loanamount="+(loanamount+super.loanamount));
     }
}
public class loansuper {
    public static void main(String[] args) {
        customer3 obj= new customer3();
        obj.display2();
        customer2 c2=new customer2();
        c2.display1();
        Customer1 c1=new Customer1();
        c1.display();
        
    }
    
    
}
