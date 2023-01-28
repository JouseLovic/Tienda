package Controllers.Settings;

import java.io.*;

public class SaveSetting {
    
    private FileOutputStream fileOut;
    private ObjectOutputStream objOut;

        public void saveSetting(String[] array){

                try {
                    fileOut = new FileOutputStream(new File("src\\main\\java\\Settings\\Config.dat"));
                    objOut = new ObjectOutputStream(fileOut);
                   
                    objOut.writeObject(array);

                    fileOut.close();
                    objOut.close();
                } catch (FileNotFoundException ex) {
                    System.err.println(ex.getMessage());
                } catch (IOException ex) {
                    System.err.println(ex.getMessage());
                }
        }
}
