package Settings;

import java.io.*;
import javax.swing.*;

public class SaveSetting {
    
    private FileOutputStream fileOut;
    private ObjectOutputStream objOut;
    

        public void saveSetting(String[] array){

                try {
                    fileOut = new FileOutputStream(new File("src\\main\\java\\Settings\\Config.dat"));
                    objOut = new ObjectOutputStream(fileOut);
                   
                    objOut.writeObject(array);
                        
                    System.out.println("Array guardado");
                    fileOut.close();
                    objOut.close();
                } catch (FileNotFoundException ex) {
                    System.err.println(ex.getMessage());
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
        }
}
