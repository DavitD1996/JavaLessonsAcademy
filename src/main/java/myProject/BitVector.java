package myProject;

public class BitVector {
    private int[] data;
    public BitVector(int data){
        if(data%32==0){
            this.data=new int[data/32];
        }
       this.data=new int[(data/32)+1];
    }
    public void setOne(int index){
           int finIndex=setIndex(index);
          data[finIndex]=(data[finIndex]|(1<<(index-1)));
    }
   public void setZero(int index){
       int finIndex=setIndex(index);
       data[finIndex]=(data[finIndex]^(1<<(index-1)));
   }
   private int setIndex(int index){
        int result=0;
        if(result<=32){
            return  result;
        }
        result=index/32;
        return  result;
   }
}
