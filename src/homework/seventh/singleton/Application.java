package homework.seventh.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


public class Application {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance().getValue());
        try {
            Field valueField = Singleton.class.getDeclaredField("value");
            valueField.setAccessible(true);
            valueField.set(Singleton.getInstance(), "V25");

            Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);

            Singleton secondSingleton = constructor.newInstance();
            System.out.println(secondSingleton.getValue());

        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        System.out.println(Singleton.getInstance().getValue());
    }

}
