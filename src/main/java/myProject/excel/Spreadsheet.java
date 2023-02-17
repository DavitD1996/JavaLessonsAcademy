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
        if(excelsheet.get(row+1)==null){
            excelsheet.put(row+1, new HashMap<>());
        }
        else{
            int index=row+1;
            while(excelsheet.get(index)!=null){
                index++;
            }
            while(index>row){
               excelsheet.put(index,excelsheet.get(index--));
               excelsheet.put(index--,null);
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
