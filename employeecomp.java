/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class employeecomp {
    public static void main(String[] args){        
        employee emp[]=new employee[20];
        ArrayList<employee> list=new ArrayList<>();
        for(int i=0;i<5;i++)
        {
            emp[i]=new employee();
            emp[i].getinfo();            
        }           
        for(int i=0;i<5;i++)
            list.add(emp[i]);
        System.out.println(list);
        Collections.sort(list,new sort());
         System.out.println(list);
    }
    
}
class employee
{
    String name;
    int salary;
    Scanner obj=new Scanner (System.in);
    void getinfo()
    {
        System.out.println("enter employee name:");
        name=obj.next();
        System.out.println("enter salary:");
        salary=obj.nextInt();
    }
    @Override
    public String toString()
    {
        return "Employee name:"+name+"\nSalary:"+salary;
    }
}
class sort implements Comparator<employee>
{
    @Override
    public int compare(employee a,employee b)
    {
        return b.name.compareTo(a.name);
    }
}
