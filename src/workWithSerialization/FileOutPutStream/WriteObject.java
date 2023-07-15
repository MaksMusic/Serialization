package workWithSerialization.FileOutPutStream;

import entity.User;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Calendar;

public class WriteObject {
    public static void main(String[] args) {
        User user1 = new User("����",19, Calendar.getInstance().getTime().toString());
        User user2 = new User("Tima",22, Calendar.getInstance().getTime().toString());



        try (FileOutputStream fileOutputStream = new FileOutputStream("user.bin");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        ){
            objectOutputStream.writeObject(user1);
            objectOutputStream.writeObject(user2);


        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
