package epam_algos;

import java.util.Scanner;

public class CuttingRod {

static public int count = 0;
    
    public static void cuttingRod(int length){
                        
        if(length<=2){
            return;
        }        
        int minCutLength;
        
        minCutLength=(length-1)/2;
        
        count=count+1;        
        cuttingRod(minCutLength);
        
    }
    
    public static void main(String args[] ) throws Exception {
   Scanner sc=new Scanner(System.in);
        int inputLength = sc.nextInt();     
        int rodLength;
        for(int i=1;i<=inputLength;i++){
            rodLength = sc.nextInt();  
            cuttingRod(rodLength);
            System.out.println(count);
            count=0;
        }
    }
}
