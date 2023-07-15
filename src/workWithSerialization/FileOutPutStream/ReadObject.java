package workWithSerialization.FileOutPutStream;

import entity.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadObject {
    public static void main(String[] args) {
            try(FileInputStream fileInputStream = new FileInputStream("user.bin");
                ObjectInputStream objectInputStream =new ObjectInputStream(fileInputStream);
            ){
                User user1 =(User) objectInputStream.readObject();
                User user2 = (User) objectInputStream.readObject();

                System.out.println(user1.getName());
                System.out.println(user2.getName());

            }catch (Exception e){

            }
    }
}
