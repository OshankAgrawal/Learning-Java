import java.util.Scanner;

class Rooms{

    int Room_no;
    String RoomType;
    double RoomArea;
    boolean acMachine;
    
    void SetData(int A, String B, double C, boolean D){
        Room_no = A;
        RoomType = B;
        RoomArea = C;
        acMachine = D;
    }

    void DisplayData(){

        System.out.println("Room number is "+ Room_no);
        System.out.println("Room Type is "+RoomType);
        System.out.println("Room Area is "+RoomArea);
        System.out.println("Status of AC Machine "+acMachine);

    }

    public static void main(String[] args) {
        try (Scanner obj = new Scanner(System.in)) {
            System.out.print("Enter the Room Number.....");
            int Room_no=obj.nextInt();
            obj.nextLine(); 
            System.out.print("Enter the Room Type.....");
            String RoomType=obj.nextLine();
            System.out.print("Enter the Room Area......");
            double RoomArea=obj.nextDouble();
            System.out.print("Enter the Status of AC Machine is Ptesent Or not in Boolean Type....");
            boolean acMachine=obj.nextBoolean();
            
            Rooms objRooms=new Rooms();
            objRooms.SetData(Room_no, RoomType, RoomArea, acMachine);
            objRooms.DisplayData();
        }

    }
}