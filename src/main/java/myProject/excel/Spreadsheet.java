package myProject.excel;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Spreadsheet {
    private HashMap<Integer,HashMap<Integer, CellBase>>excelsheet;
    public Spreadsheet(){
            excelsheet=new HashMap<>();
    }
    public void setCellAt(Object data, int row, int column){
       if (excelsheet.get(row)==null){
        excelsheet.put(row,new HashMap<>()).put(column,cellDataDefiner(data));
        }
       else{
           excelsheet.get(row).put(column,cellDataDefiner(data));
       }
    }
    public CellBase getCellAt(int row, int column){
        if(excelsheet.get(row)==null||excelsheet.get(row).get(column)==null){
            System.out.println("the cell is empty");
            return null;
        }
        else{
            return excelsheet.get(row).get(column);
        }
    }
    public void setRowBellow(int row){
            Integer lastIndex=(Integer) excelsheet.keySet().toArray()[excelsheet.size()-1];
            while(lastIndex>row){
                excelsheet.put(++lastIndex,excelsheet.get(--lastIndex));
                excelsheet.put(lastIndex,null);
                lastIndex--;
            }
    }
    public void removeRow(int row){
        Integer lastIndex=(Integer) excelsheet.keySet().toArray()[excelsheet.size()-1];
        while(row<=lastIndex){
            excelsheet.put(row,excelsheet.get(++row));
        }
    }
    public void addColumnFromRight(int column){
        Object[]keys=excelsheet.keySet().toArray();
        for(int i=0;i<keys.length;i++){
            HashMap<Integer, CellBase>temp=excelsheet.get((Integer)keys[i]);
            Integer lastIndex=(Integer) temp.keySet().toArray()[temp.size()-1];
            while(lastIndex>=column){
                temp.put(++lastIndex,temp.get(--lastIndex));
                temp.put(lastIndex,null);
                --lastIndex;
            }
        }
    }
    public  void swapRows(int row1, int row2){
            if(excelsheet.get(row1)==null&&excelsheet.get(row2)==null){
                System.out.println("no sense to swap the empty rows");
                return;
            }
           else if(excelsheet.get(row1)==null){
                excelsheet.put(row1,new HashMap<>());
            }
           else if(excelsheet.get(row2)==null){
                excelsheet.put(row2,new HashMap<>());
            }
            HashMap<Integer,CellBase>temp=excelsheet.get(row1);
            excelsheet.put(row1,excelsheet.get(row2));
            excelsheet.put(row2,temp);
    }
    public void swapColumns(int col1, int col2){
        Object[]keys=excelsheet.keySet().toArray();
        for(int i=0;i<keys.length;i++){
            CellBase temporary=excelsheet.get((Integer)keys[i]).get(col1);
            excelsheet.get((Integer)keys[i]).put(col1,excelsheet.get((Integer)keys[i]).get(col2));
            excelsheet.get((Integer)keys[i]).put(col2,temporary);
        }
    }
    public void removeColumn(int column){
        Object[]keys=excelsheet.keySet().toArray();
        Integer lastIndex=(Integer) excelsheet.keySet().toArray()[excelsheet.size()-1];
        for(int i=0;i<keys.length;i++){
            while(column<=lastIndex){
                excelsheet.put(column,excelsheet.get(++column));
            }
        }
    }

    public CellBase cellDataDefiner(Object data){
        if(data instanceof Integer){
            return new IntegerCell((Integer)data);
        }
        else if(data instanceof Double){
            return new DoubleCell((Double)data );
        }
        else if(data instanceof LocalDateTime){
            return new DateCell((LocalDateTime)data);
        }
        else{
            System.out.println("Incorrect data");
            return null;
        }
    }
}
