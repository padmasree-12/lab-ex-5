/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author padma
 */
public class methodoverdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        bankA obj=new bankA();
        System.out.println("BankA balance:"+obj.getBalance());
        bankB obj1=new bankB();
        System.out.println("BankB balance:"+obj1.getBalance());
        bankC obj2=new bankC();
        System.out.println("BankC balance:"+obj2.getBalance());
        
    }
 
}
class bank
{
    int getBalance()
    {
        return 0;
    }
}
class bankA extends bank
{
    @Override
    int getBalance()
    {
        return 1000;
        
    }
}
class bankB extends bank
{
    @Override
    int getBalance()
    {
        return 1500;
    }
}
class bankC extends bank
{
    @Override
    int getBalance()
    {
        return 2000;
    }
}
