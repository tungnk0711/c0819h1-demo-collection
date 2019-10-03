package com.codegym;

import java.util.*;

public class ObjectManager {

    private Set listObj;

    public ObjectManager(){
        listObj = new HashSet();
    }

    public void addObj(Object object){
        listObj.add(object);
    }

    public Set<Object> getObjects(){
        return listObj;
    }

    public void removeObject(Object object){
        listObj.remove(object);
    }


    /*private LinkedList listObj;

    public ObjectManager(){
        listObj = new LinkedList();
    }

    public void addObj(Object object){
        listObj.add(object);
    }

    public List<Object> getObjects(){
        return listObj;
    }

    public void removeObject(Object object){
        listObj.remove(object);
    }*/

    /*private ArrayList listObj;

    public ObjectManager() {
        listObj = new ArrayList();
    }

    public void addObj(Object object){
        listObj.add(object);
    }

    public List<Object> getObjects(){
        return listObj;
    }

    public void removeObject(Object object){
        listObj.remove(object);
    }*/
}
