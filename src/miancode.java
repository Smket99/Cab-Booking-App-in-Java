import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Smiket
 */

public class miancode {
    static void finddriver(int[][]driver,int start,int end,int[][]distance)
    {
        int max=-1,r=0;
        for(int i=0;i<3;i++)
        {
            if(driver[start][end]>max)
            {
               
                max=driver[start][end];
                r=i;
            }
        }
        r=r+65;
        
        System.out.println("Your driver C is on the way");
    }
    public static void main(String[] args)
{
 int start,end;
 Scanner input=new Scanner(System.in);
 start=input.nextInt();
 end=input.nextInt();
 int[][] driver={{4,5,2},{1,3,4},{1,4,2}};
 int wal=500;
 int[][] distance={{0,12,34},{113,0,43},{67,54,0}};
 finddriver(driver,start,end,distance);
 if(distance[start][end]<20)
     wal=wal-100;
 else if(distance[start][end]>20)
     wal=wal-200;
 System.out.println(wal);
}  
}

