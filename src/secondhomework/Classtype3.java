package secondhomework;
//Anonymous class
interface AbleToRead {
    public void read();
}

public class Classtype3 implements AbleToRead {

    public void read() {
        System.out.println("Classtype is reading");
    }

    public void write() {
        System.out.println("I do not want to write");
    }


    public static void main(String[] args) {
        Classtype3 newClassType = new Classtype3();
        newClassType.write();

        Classtype3 newClassType1 = new Classtype3() {
            public void write() {
                System.out.println("I am writing");
            }
        };
        newClassType1.write();

        AbleToRead reader = new AbleToRead() {
            @Override
            public void read() {
                System.out.println(" Reader is reading");
            }
        };
        reader.read();
    }
}