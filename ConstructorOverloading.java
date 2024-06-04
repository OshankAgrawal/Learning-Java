public class ConstructorOverloading {
    int a; double b,d; String c;
    ConstructorOverloading(){
        a=100; b=23.54; c="Oshank";
    }
    ConstructorOverloading(int x){
        a=x;
    }
    ConstructorOverloading(double y, String z){
        b=y; c=z;
    }
    private ConstructorOverloading(int x, double y){
        a=x; d=y;
    }
    ConstructorOverloading(String z, double y){
        c=z; b=y;
    }
    public static void main (String args[]){
        ConstructorOverloading2 r=new ConstructorOverloading2();
        ConstructorOverloading2 r2=new ConstructorOverloading2(10);
        ConstructorOverloading2 r3=new ConstructorOverloading2(232.23,"Agrawal");
        ConstructorOverloading2 r4=new ConstructorOverloading2(5645,896.25);
        ConstructorOverloading2 r5=new ConstructorOverloading2("Oshank Agrawal",48.165);
    System.out.println(r.a+" "+r.b+" "+r.c);
    System.out.println(r2.a);
    System.out.println(r3.b+" "+r3.c);
    System.out.println(r4.a+" "+r4.d);
    System.out.println(r5.c+" "+r5.b);
    }
}
