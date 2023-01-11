package Settings;

import java.io.*;
import java.io.Serializable;

public class LoadSetting implements Serializable{
    
    private FileInputStream fileIn;
    private ObjectInputStream objIn;
    private Configuration settings;

    public String loadSetting(){
          
        settings = null;
        String Sett = "";
        try{
          
          fileIn = new FileInputStream("src\\main\\java\\Settings\\Configuration.dat");
          objIn = new ObjectInputStream(fileIn); 
          
                while(fileIn.available() > 0){
                    settings = (Configuration) objIn.readObject();
                    Sett = settings.getSetting();
                }
          
                    fileIn.close();
                    objIn.close();
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
           System.err.println(ex.getMessage());
        }
        return Sett;
    }

}
