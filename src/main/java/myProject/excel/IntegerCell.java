package myProject.excel;

public class IntegerCell extends CellBase {
    private Integer data;
    private Color color;
    public IntegerCell(){};
    public IntegerCell(Integer data){
        this.data=data;
        this.color= Color.white;
    }
    public IntegerCell(Integer data, Color color){
        this.color=color;
        this.data=data;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
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
