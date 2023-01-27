package Controlador.Settings;

import java.io.*;

public class LoadSetting {
    
    private final String uri = "src\\main\\java\\Settings\\Config.dat";
    String[] array = null;
    private FileInputStream fileIn = null;
    private ObjectInputStream objIn = null;

    public LoadSetting(){
        array = new String[4];
    }

    public String[] loadSetting(){

        try{
          
        existDirectoryAndSetting();
          fileIn = new FileInputStream(uri);
          objIn = new ObjectInputStream(fileIn); 
          
                while(fileIn.available() > 0){
                    array = (String[]) objIn.readObject();
                    return array;
                }
                fileIn.close();
                objIn.close();
        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }catch(IOException ex){
            System.err.println(ex.getMessage());
        }
        return array;
    }

    public void existDirectoryAndSetting(){

        File directorio = new File("src\\main\\java\\Settings");
        File fileSetting = new File(uri);
        
        if (!directorio.exists()) {
             if(directorio.mkdirs()) {
                 System.out.println("Directorio creado");
             }
             else{
                 System.out.println("Error al crear el directorio");
             }
        }
        if(!fileSetting.exists()){
            String[] nArray = {"Light",
                    "Arial", "Plain", "22",
                    "True", "Mi Empresa", "Gestion de inventario",
                    "Entradas de productos", "Facturas de entrada", "Proveedores", "", "", ""};
            SaveSetting save = new SaveSetting();
            save.saveSetting(nArray);
            System.out.println("Configuraciones por defecto creadas");
        }
    }


}
