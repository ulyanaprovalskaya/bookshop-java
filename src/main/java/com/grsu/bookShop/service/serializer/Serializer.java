package com.grsu.bookShop.service.serializer;

import java.io.*;

public class Serializer {

    public static <T> void serialize(T object, String filename){
        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(filename))) {
            ous.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> T deserialize(String filename) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
            return (T)ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
