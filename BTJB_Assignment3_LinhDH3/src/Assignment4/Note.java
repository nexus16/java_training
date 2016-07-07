/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;
import java.util.*;
/**
 *
 * @author lynk
 */
public class Note {
    public static void main(String[] args){
        HashMap hm = new HashMap();
        hm.put("joy", 34543);
        hm.put("jack", 56765);
        hm.put("tina",34567);
        
        if(hm.containsValue(3443))
            System.out.println("so 3443 co ton tai");
        else 
            System.out.println("So 3443 khong ton tai");
        
        if(hm.containsKey("jack"))
            System.out.println("JAck co hien huu");
        else 
            System.out.println("Jack khong hien huu");
        
        System.out.println("So dien thoai cua Tina :"+hm.get("tina"));
        System.out.println(hm.remove("joy"));
        Set set = hm.entrySet();
        Iterator i = set.iterator();
    }
}
