package forloop;

public class ProgramJ {
    public static void main(String[] args){

        int data[][] = new int[3][3];
        data[0][0]=2;
        data[0][1]=4;
        data[0][2]=6;

        data[1][0]=8;
        data[1][1]=10;
        data[1][2]=12;

        data[2][0]=14;
        data[2][1]=16;
        data[2][2]=18;

        for(int i=0; i<data.length; i++){
            for(int j=0; j<data.length; j++){
                System.out.print(data[i][j]);
            }
        }
    }
}
