package workWithSerialization.FileOutPutStreamImpl;

import entity.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("user.bin");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);) {
            User user1 = (User) objectInputStream.readObject();
            User user2 = (User) objectInputStream.readObject();
            User[] users = (User[]) objectInputStream.readObject();

            System.out.println(user1);
            System.out.println(user2);

            for (User user : users) {
                System.out.println("for " + user);
            }

        } catch (Exception e) {

        }
    }
}
