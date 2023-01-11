package Settings;

import java.io.*;

import javax.swing.JOptionPane;

public class SaveSetting implements Serializable{

        private String newTheme;
        private FileOutputStream fileOut;
        private ObjectOutputStream objOut;

        public SaveSetting(String theme){
            this.newTheme = theme;  
        }

        public String getSave(){
            return newTheme;
        }


        public void saveSetting(){
            
            Configuration Setting = new Configuration(getSave());

                if(Setting.getSetting()==null){
                    JOptionPane.showMessageDialog(null, "La cadena esta vacia");
                }
                else{
                    try {
                        fileOut = new FileOutputStream(new File("src\\main\\java\\Settings\\Configuration.dat"));
                        objOut = new ObjectOutputStream(fileOut);
                   
                        objOut.writeObject(Setting);
                     
                        System.out.println("Objeto guardado");
                        fileOut.close();
                        objOut.close();
     
                    } catch (FileNotFoundException ex) {
                        System.err.println(ex.getMessage());
                    } catch (IOException ex) {
                        System.err.println(ex.getMessage());
                    }
            }
        }
    }