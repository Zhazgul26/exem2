public class Circle {
    private static double PI;

    public static void setPI(double PI) {
        Circle.PI = PI;
    }
    public void  area( int radius1,int radius2){
        double num = PI*(radius1 * radius2);
        System.out.printf("%f*(%d*%d)=%f",PI,radius1,radius2,num);
    }
    public void circumference(int m){
        double num = 2*PI*m;
        System.out.println(2+"*"+PI+ "*"+m+"="+num);
    }
}
