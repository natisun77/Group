package homework.second;
// 2.2 Inner Class and Local Class
public class ParentForInnerClass {
    private Inerclass in;
    private int i;
    private String st;

    public ParentForInnerClass(){
        i = 7;
        in = this.new Inerclass();
        st = "I am a string";
    }

    private int getI(){
        return i;
    }

    public void localClassTry() {
        class MyLocalClass {
            int i = 5;
        }
        MyLocalClass myLocalClass = new MyLocalClass();
    }

    class Inerclass{
        private int k = 15;

        private void result(){
            System.out.println("Result is " + (getI()+k) );
        }
    }

    public static void main(String[] args) {
        ParentForInnerClass parent = new ParentForInnerClass();
        Inerclass inner = parent.new Inerclass();
        inner.result();
        Inerclass inner2 = new ParentForInnerClass().new Inerclass();
    }
}
