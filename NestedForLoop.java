public class NestedForLoop {
    public static void main(String args[]){
        for(int i=0;i<20;i++){
            for(int j=0;j<i;j++){
                for(int k=0;k<j;k++){
                    System.out.print("*");
                }
                //System.out.println(" ");
            }
            System.out.println(" ");
        }
    }
}
