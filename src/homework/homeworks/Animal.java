package homework.homeworks;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        try (ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
             ObjectInputStream inputReader = new ObjectInputStream(byteArrayInputStream);) {

            int sizeOfArray = inputReader.readInt();
            Animal[] animals = new Animal[sizeOfArray];
            for (int i = 0; i < sizeOfArray; i++) {
                Object obj = inputReader.readObject();
                if (obj instanceof Animal) {
                    animals[i] = (Animal) obj;
                } else {
                    throw new IllegalArgumentException("Byte array does not contains Animal class");
                }
            }
            return animals;
        } catch (IOException | ClassNotFoundException e) {
            throw new IllegalArgumentException("Byte array does not contains Animal class", e);
        }
    }

    public static byte[] serializeAnimals(Animal[] animals) {
        try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream outputWriter = new ObjectOutputStream(byteArrayOutputStream);) {

            outputWriter.writeInt(animals.length);
            for (int i = 0; i < animals.length; i++) {
                outputWriter.writeObject(animals[i]);
            }

            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new byte[0];
    }

    public static void main(String[] args) {
        Animal Dog = new Animal("Dog");
        Animal Cat = new Animal("Cat");
        Animal Horse = new Animal("Horse");
        Animal Zebra = new Animal("Zebra");
        Animal[] animals = new Animal[]{Dog, Cat, Horse, Zebra};

        byte[] arrayOfBytes = serializeAnimals(animals);
        String result = Arrays.toString(deserializeAnimalArray(arrayOfBytes));
        System.out.println(result);
    }
}
