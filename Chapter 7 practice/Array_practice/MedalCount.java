
public class MedalCount
{
    final int COUNTIES= 7;
    final int MEDALS= 3;
    int[][] counts= {
            {1,0,1},
            {1,1,0},
            {0,0,1},
            {1,0,0},
            {0,1,1},
            { 0,1,1},
            {1,1,0}
        };
    public MedalCount()
    {
        //alternative way to initialize 2Darray
        // counts- new int [COUNTRIWS][MEDALS]}
        
    }
    
    
    public String ToString(){
        String str= "";
        // good: for (int i=0)
        //better
        for(int i= 0; i<counts.length; i++){
            for (int j=0; j< counts[i].length; j++){
                str+= counts[i][j]+ "\t";
                
                
            }
            str+="\n";
        }
        //good for( int j=0
        System.out.println(str);
        return str;
        }
        
    public int medalCount( int countryIndex){
        
        int total= 0;
        for(int j=0; j< counts[countryIndex].length; j++){
            total+= counts[countryIndex][j];
            
        }
        System.out.println(total);
        return total;
       
       
    }
    
    public int counterMedal( int medalIndex){
        int total=0;
        for (int i=0; i<counts.length; i++){
            total+= counts[i][medalIndex];
        }
        
        return total;
        
    }
        
        
    }
    

