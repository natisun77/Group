package homework.homeworks.myhashmap;

public class Application {

    static class TestKey {
        int value;

        TestKey(int value) {
            this.value = value;
        }

        @Override
        public int hashCode() {
            return 5;
        }
    }


    public static void main(String[] args) {
        MyHashMap<Integer, String> myHashMap = new MyHashMap<>();
        myHashMap.put(1, "1");
        myHashMap.put(2, "2");
        myHashMap.put(3, "3");

        System.out.println(myHashMap.get(1));
        System.out.println(myHashMap.get(4));
        myHashMap.remove(1);
        myHashMap.remove(3);
        System.out.println(myHashMap);
        myHashMap.put(4, "4");
        myHashMap.put(5, "5");
        myHashMap.put(6, "6");
        System.out.println(myHashMap);
        System.out.println(myHashMap.size());
        myHashMap.clear();
        System.out.println(myHashMap.size());
        System.out.println(myHashMap);


        MyHashMap<TestKey, String> testMap = new MyHashMap<>();
        TestKey testKey = new TestKey(1);
        TestKey testKey2 = new TestKey(2);
        TestKey testKey3 = new TestKey(5);
        testMap.put(testKey, "nata");
        testMap.put(testKey2, "alex");
        testMap.put(testKey3, "alika");
        testMap.put(new TestKey(3), "roma");
        testMap.put(new TestKey(4), "julia");
        System.out.println(testMap);
        testMap.put(testKey, "nataliia");
        System.out.println(testMap);
        System.out.println(testMap.get(testKey));
        System.out.println(testMap.get(testKey2));
        testMap.remove(testKey3);
        System.out.println(testMap);
        testMap.clear();
        System.out.println(testMap);

    }
}
