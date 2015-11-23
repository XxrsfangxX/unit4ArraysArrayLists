

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
        //
    
        }
    public void insert(int pos, int value){
       if (this.currentsize< this.values.length){ 
           this.growArray(); 
        }
            this.currentsize++;
            for (int i= this.currentsize-1; i> pos; i--){
                this.values[i]= this.values[i-1];
            }
            this.values[pos]= value;

        
       
            
        }
    
    public void swap(int posA, int posB){
        int temp=this.values[posA];
       this.values[posA]= this.values[posB];
       this.values[posB]= this.values[temp];
        
    }
    private void growArray(){
        
        int [] newArray= new int [this.currentsize*2];
        
        for (int i=0; i<this.currentsize; i++){
            newArray[i]= this.values[i];
        }
        
        this.values= newArray;
        
        
        
        
    }
    
    public static void main(String[] args){
        PartialArray array= new PartialArray();
        array.remove(2);
        
        
    }
}
