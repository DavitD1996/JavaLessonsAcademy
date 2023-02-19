package myProject;

import com.sun.source.tree.Tree;
import myProject.excel.CellBase;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

    }
    public static void setRowBellow(int row,HashMap<Integer,String> test){
        Integer lastIndex=(Integer) test.keySet().toArray()[test.size()-1];
        while(lastIndex>row){
            test.put(++lastIndex,test.get(--lastIndex));
            test.put(lastIndex,null);
            --lastIndex;
        }
}
public  static void removeRow(int row,HashMap<Integer,String> test){
    Integer lastIndex=(Integer) test.keySet().toArray()[test.size()-1];
    while(row<=lastIndex){
        test.put(row,test.get(++row));
    }
}
public static void addColumn(int column, HashMap<Integer,HashMap<Integer,String>>data){
    Object[]keys=data.keySet().toArray();
    for(int i=0;i<keys.length;i++){
        HashMap<Integer, String>temp=data.get((Integer)keys[i]);
        Integer lastIndex=(Integer) temp.keySet().toArray()[temp.size()-1];
        while(lastIndex>=column){
            temp.put(++lastIndex,temp.get(--lastIndex));
            temp.put(lastIndex,null);
            --lastIndex;
        }
    }
}
public static void swapRows(int row1, int row2,HashMap<Integer,HashMap<Integer,String>>data){
         if(data.get(row1)==null&&data.get(row2)==null){
             System.out.println("no sense to swap the empty rows");
             return;
         }
         HashMap<Integer,String>temp=data.get(row1);
         data.put(row1,data.get(row2));
         data.put(row2,temp);
}
}
