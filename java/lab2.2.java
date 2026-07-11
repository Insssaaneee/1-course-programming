public class Main {
    public static void main(String[] args) {
        double b = 4;
        double c = 3;
        double x = 2;
        double z;
        
        if (x > 1) {
            z = Math.sqrt(b * b + c * c);
        } 
         if (x < 0) {
            z = Math.min(Math.sqrt(b), Math.min(x * x, x + c));
        } if (x>0&& x<1)  {
            z = Math.max(Math.log(b), x + c);
        }
        
        System.out.println(z);
    }
}