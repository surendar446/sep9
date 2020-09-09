/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


/**
 *
 * @author Thiagarajan
 */
public class list {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a,avg=0,tot=0;
        System.out.println("enter number of elements:");
        int n=obj.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("enter array elements:");
        for(int i=0;i<n;i++)
        {
            a=obj.nextInt();
            tot=tot+a;
            avg=tot/n;
            list.add(a);
        }
        System.out.println("array list:"+list);
        System.out.println("average:"+avg);
        Collections.sort(list);
        System.out.println("lowest number:"+list.get(0));
        System.out.println("highest number:"+list.get(n-1));
        list.removeIf(s->s%2==0);      
        System.out.println("array list without even numbers:"+list);
    }
    
}
