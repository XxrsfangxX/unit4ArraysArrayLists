public class Array_operations{
    public static void main(String [] args){
        double [] x = {8,4, 5, 21,7, 9, 18,2,100};
        System.out.println("Number of items in array "+x.length);
        System.out.println("The first array item "+ x[0]);
        System.out.println("The last array item"+ x[8]);
       System.out.println("The last array item"+ x[x.length-1]);
       for(int i=0; i<x.length; i++){
           System.out.println(x[i]);
       
    }
       for(int i=0; i<x.length; i++){
           System.out.println("Array item "+ i+ " is "+ x[i]);
        }
       for(int i=x.length-1; i>=0; i--){
           System.out.println("Array item "+ i+ " is " + x[i]);
    }
    for ( double value:x){
        System.out.println(value);
    }
    
}
}
