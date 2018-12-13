package stringpattern;


public class StringPattern {

    public static void main(String[] args) {
       int i, j, k, l = 1;
       int num = 4;
       
      
           for(j=0; j<3; j++){
              for(k=l; k<num; k++){
               System.out.print(" "+k);
               
           }System.out.println("");
              l = k;
              num = num + 3;
          
           }
           
           
           
       
    }
}
