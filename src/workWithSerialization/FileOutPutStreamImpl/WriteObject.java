package workWithSerialization.FileOutPutStreamImpl;

import entity.User;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class WriteObject {
    public static void main(String[] args) {
        User user1 = new User("Анна",19, Calendar.getInstance().getTime().toString());
        User user2 = new User("Tima",22, Calendar.getInstance().getTime().toString());

        User [] users = {user1,user2};



        try (FileOutputStream fileOutputStream = new FileOutputStream("user.bin");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ){
            objectOutputStream.writeObject(user1);
            objectOutputStream.writeObject(user2);
            objectOutputStream.writeObject(users);
            System.out.println("serialization was successful");

        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
