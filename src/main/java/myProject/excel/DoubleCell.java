package myProject.excel;

public class DoubleCell extends CellBase{
    private Double data;
    public DoubleCell(){};
    public DoubleCell(Double data){
        this.data=data;
        this.color= Color.white;
    }
    public DoubleCell(Double data, Color color){
        this.color=color;
        this.data=data;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public Double getData() {
        return data;
    }

    public void setData(Double data) {
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
