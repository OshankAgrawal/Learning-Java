class static_v {
    static int a = 10;
    void fun()
    {
        int b = 10;
        System.out.println(a+" "+b);
        ++a;  ++b;
    }
    public static void main(String args[])
    {
        static_v r=new static_v();
        r.fun();
        r.fun();
    }
}
