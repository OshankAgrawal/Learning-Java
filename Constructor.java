class my{
    int a;
    String b;
    // my(){
    //     a=20;
    //     b="Agrawal";
    // }
    void Show(){
        System.out.println(a+" "+b);
    }
}

public class Constructor {
    public static void main(String args[]){
        my ref;
        ref=new my();
        ref.Show();
    }
}
