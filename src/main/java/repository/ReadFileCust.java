package repository;

/**
 * Класс для получения данных клиентов из файла
 */

import model.Customer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.InvalidPathException;
import java.util.HashMap;
import java.util.UUID;

public class ReadFileCust {

    public static HashMap<Integer, Customer> cust = new HashMap<>();

    public static Customer rFileCust(UUID id, String filePath){
        int count;
        char c[] = new char[150];
        try(FileReader f = new FileReader(filePath)){
            ByteBuffer buffer = ByteBuffer.allocate(150);
            do{
                count = f.read(c);
            }while (count != -1);
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (InvalidPathException e){
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        String str = new String(c);
        String st1[] = str.split(", ");
        cust.put(Integer.parseInt(st1[0]), new Customer(st1[1], st1[2], st1[3], 123458));
        return cust.get(id);
    }
}

// C:\Users\Владимир\Desktop\NamesForBankAccounts\1.txt