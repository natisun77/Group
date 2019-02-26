package secondhomework;
// 2.2 Nested Class
public class Classtypes2 {

    static int i = 7;
    static String st = "I am a string";

    public static int showI(){
        return i;
    }

     static class Nested{
        private static int k = 15;

        private void result(){
            System.out.println("Result is " + (showI()+k) );
        }

         private static void showK(){
             System.out.println("K = " + k);
         }
    }

    public static void main(String[] args) {
        Classtypes2 parent = new Classtypes2();
        System.out.println(showI());
        Nested inner = new Nested();
        inner.result();
        inner.showK();



    }

}
