package myProject.excel;

import java.time.LocalDateTime;

public class DateCell extends CellBase{

    public DateCell(){};
    public DateCell(LocalDateTime data){
        this.data=data;
        this.color= Color.white;
    }
    public DateCell(LocalDateTime data, Color color){
        this.color=color;
        this.data=data;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public LocalDateTime getData() {
        return (LocalDateTime) data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public void Reset(){
        this.data=null;
        this.color= Color.white;
    }

    @Override
    public Object getStringData() {
        return data.toString();
    }
}
