/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bw.hashmaps;

import java.util.HashMap;

/**
 *
 * @author Ishmael
 */
public class Maps {
    public static void main(String[] args){                //To map  a KEY to a VALUE eg to map employees names to their Ids
        HashMap<String, Integer>  empIds = new HashMap<>();//use valid Objects eg Integer and not primitve e.g. int
        empIds.put("John", 887586); //add new key, if already exisiing then replace it with he new value
        empIds.put("Erik", 56786);
        empIds.put("Carl", 112177);
        empIds.put("Carlton", 99787);
        
        System.out.println(empIds); //print all in the map
        System.out.println(empIds.get("Erik")); //print one
        System.out.println(empIds.containsKey("Carl")); // true or false  has to exist for true ... has to be exact match
        empIds.replace("Erik",8877677); //replace the value for Erik
        empIds.putIfAbsent("Aron",122776); //add new if absent  ELSE dont replace exisiting key                                
         System.out.println(empIds); //print all in the map
    }
}
