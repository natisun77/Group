package homework.second;
//Anonymous class
interface AbleToRead {
    public void read();
}

public class AnonymousClass implements AbleToRead {

    public void read() {
        System.out.println("Classtype is reading");
    }

    public void write() {
        System.out.println("I do not want to write");
    }


    public static void main(String[] args) {
        AnonymousClass newClassType = new AnonymousClass();
        newClassType.write();

        AnonymousClass newClassType1 = new AnonymousClass() {
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