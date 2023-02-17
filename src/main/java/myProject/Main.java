package myProject;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
           TreeMap<Integer,String>a=new TreeMap<>();
           a.put(1,"aa");
           a.put(2,"bb");
           a.put(3,"cc");
           a.put(6,"vv");
           AtomicInteger max= new AtomicInteger();
           System.out.println( a.entrySet().size());
          /*for(int i=1;i<a.size();i++){
           System.out.println(a.get(i));
       }*/
    }
    public static void setRowBellow(int row,HashMap<Integer,String> test){
        if(test.get(row+1)==null){
            test.put(row+1,"new");
        }
        else{
            int index=row+1;
            while(test.get(index)!=null){
                index++;
            }
            while(index>row){
                test.put(index,test.get(--index));
                test.put(index--,null);
            }
        }
}}
