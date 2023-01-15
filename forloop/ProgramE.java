package forloop;

public class ProgramE {
    public static void main(String[] args){

        int data[][] = new int[4][4];
        data[0][0]=4;
        data[0][1]=8;
        data[0][2]=12;

        data[1][0]=16;
        data[1][1]=20;
        data[1][2]=24;

        data[2][0]=28;
        data[2][1]=32;
        data[2][2]=36;

        data[3][0]=40;
        data[3][1]=44;
        data[3][2]=48;


        for(int i=0; i< data.length; i++){
            for(int j=0; j< data.length; j++){
                System.out.print(data[i][j]+" ");
            }
        }
    }
}
