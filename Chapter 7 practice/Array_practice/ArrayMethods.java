

/**
 * Write a description of class ArrayMethods here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayMethods
{
    private int[] values;
    public ArrayMethods(int[] initialValues){
        values= initialValues;
    }
    public void swapFirstAndLast(){
        int temp= values[0];
        values[0]= values[(values.length)-1];
        values[(values.length)-1]= temp;
    }
    public void shiftRight(){
        int last=  values[(values.length)-1];
        for (int i=0; i<values.length; i++){
            values[i+1] = values[i];
        }
        values[0]= last;
    
    }
    public void evensToZero(){
        for( int i=0; i<values.length; i++){
            if (values[i]%2== 0){
                values[i]=0;
            }
        }
    }
    
    public void bigReplace(){
        
        for (int i=1; i<values.length-1; i++){
            if( values[i-1]>values[i+1]){
                values[i]= values[i-1];
            }
            else{
                values[i]= values[i+1];
            }
        }
    }
    public void removeMiddle(){
        
       
            if( (values.length)%2==0){
                // checks odd or even
           int [] newArray= new int[values.length-2];
           for(int i=0;i <=(values.length/2)-1; i++){
               newArray[i]= values[i];
            }
                for(int x=(values.length/2)-1; x<= values.length-3; x++){ 
                
                    newArray[x]= values[x+2];
           }
          
           values= newArray;
           
           
        }
        else{
            int[] newArray= new int[values.length-1];
                     for(int i=0;i <=(values.length/2)-2; i++){
               newArray[i]= values[i];
            }
                for(int x=values.length/2-1; x< values.length-1; x++){ 
                
                    newArray[x]= values[x+1];
           }
           
           values= newArray;
           
           
        }
    }
}

