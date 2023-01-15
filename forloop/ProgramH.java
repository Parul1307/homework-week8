package forloop;

public class ProgramH {
    public static void main(String[] args){

        int data[][] = new int[3][3];
        data[0][0]=3;
        data[0][1]=6;
        data[0][2]=9;

        data[1][0]=12;
        data[1][1]=15;
        data[1][2]=18;

        data[2][0]=21;
        data[2][1]=24;
        data[2][2]=27;


        for(int i=0; i< data.length; i++){
            for(int j=0; j< data.length; j++){
                System.out.println(data[i][j]);
            }
        }
    }
}
