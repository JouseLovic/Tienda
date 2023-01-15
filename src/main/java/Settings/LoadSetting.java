package Settings;

import java.io.*;

import javax.annotation.processing.SupportedOptions;

public class LoadSetting {
    
    String[] array = null;
    private FileInputStream fileIn = null;
    private ObjectInputStream objIn = null;

    public LoadSetting(){
        array = new String[4];
    }

    public String[] loadSetting(){

        try{
          
          fileIn = new FileInputStream("C:\\KOULIN\\Settings\\Config.dat");
          objIn = new ObjectInputStream(fileIn); 
          
                while(fileIn.available() > 0){
                    array = (String[]) objIn.readObject();
                    return array;
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
        return array;
    }
}
