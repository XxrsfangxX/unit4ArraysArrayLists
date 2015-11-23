

public class PartialArray
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[]values;
    private int currentsize;
    public PartialArray(){
        this.values= new int[100];
        for(this.currentsize=0; 
        this.currentsize<20;
        this.currentsize++){
            this.values[this.currentsize]= this.currentsize*this.currentsize;
        }
    }
    
    public void remove(int pos){
        for (int i=pos+1; i<this.currentsize; i++){
            this.values[i-1]= this.values[i];
        }
    this.currentsize--;
    
    }
    public void insert(int pos, int value){
        if ( this.currentsize< this.values.length){
            this.currentsize++;
            for (int i= this.currentsize-1; i> pos; i--){
                this.values[i]= this.values[i-1];
            }
            values[pos]= value;

        }
    }
}
