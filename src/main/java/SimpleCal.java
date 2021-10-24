class cal{
    public int add(int a, int b)
    {
        return a + b;
    }
    public int sub(int a, int b)
    {
        return a - b;
    }
    public int mul(int a, int b)
    {
        return a * b;
    }
    public int div(int a, int b)
    {
        return a / b;
    }

}
public class SimpleCal {
    public static void main(String[] args) {
        cal cal1 =new cal();
        System.out.println("======Simple calculator======");
        System.out.println("Addition: 10 + 5 =" + cal1.add(10,5));
        System.out.println("Subtraction: 10 - 5 =" + cal1.sub(10,5));
        System.out.println("Multiplication: 10 * 5 =" + cal1.mul(10,5));
        System.out.println("Divison: 10 / 5 =" + cal1.div(10,5));
    }



}
