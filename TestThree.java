class Test{
    public static void main(String[]args){
        long a=10;
        int b=20;
        int c=a+b;
        // possible lossy conversion from long to int
        //max (int, long, int)
        System.out.println(c);
    }
}