public class Sample2Functions3 {

    public static int f(double x) {
        return (int) (Math.sin(x) + (Math.sqrt((Math.log(3*x)/Math.log(4)))) + (Math.ceil(3 * Math.exp(x))));
    }
    public static void main(String[] args) {
        System.out.println(f(7.123456));
    }
}
