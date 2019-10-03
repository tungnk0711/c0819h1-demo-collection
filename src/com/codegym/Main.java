package com.codegym;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ObjectManager objectManager = new ObjectManager();

        Employee employee1 = new Employee(1,"Khanh",20d,"Ha Noi");
        objectManager.addObj(employee1);
        objectManager.addObj(employee1);
        Employee employee2 = new Employee(2,"Hung",22d,"Hai Phong");
        objectManager.addObj(employee2);
        Customer customer1 = new Customer(3,"Kien",21d,"Quang Ninh");
        objectManager.addObj(customer1);
        objectManager.addObj(new Double(20d));
        objectManager.addObj(new Integer(12));


        for (Object s: objectManager.getObjects()) {
            if(s instanceof Employee){
                System.out.println(((Employee) s).getName());
            }
        }

        /*System.out.println("Before:");

        List<Object> listObject = objectManager.getObjects();

        for (int i=0; i< listObject.size(); i++){
            if(listObject.get(i) instanceof Employee){
                System.out.println(((Employee) listObject.get(i)).getName());
            }
            if(listObject.get(i) instanceof Customer){
                System.out.println(((Customer) listObject.get(i)).getName());
            }
        }


        System.out.println("After:");

        objectManager.removeObject(employee1);
        for (int i=0; i< listObject.size(); i++){
            if(listObject.get(i) instanceof Employee){
                System.out.println(((Employee) listObject.get(i)).getName());
            }
            if(listObject.get(i) instanceof Customer){
                System.out.println(((Customer) listObject.get(i)).getName());
            }
        }*/


    }
}
