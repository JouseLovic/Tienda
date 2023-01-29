package Controllers;

import Controllers.Settings.ReSettings;
import Controllers.Settings.SaveSetting;

import javax.swing.*;

public class ControllerSettings {

    private static ReSettings re;
    private SaveSetting save;
    private static String titleChange, labelTitleInventary, labelTitleCompany, labelTitleEntries, labelTitleBill, labelTitleVendor;
    private static String titlePrevious;
    private static String itemLanguagesSpa, itemLanguageEngli, itemThemeLight, itemThemeDark;
    private static String textCompany, textInvent, textEntri, textBill, textVendor;
    private static String themeSelected;

    public ControllerSettings(boolean state, JComboBox comboL, JComboBox comboT, String themeSelected){
        if(state){
            titleChange = "Titles";
            labelTitleInventary = "Title inventary";
            labelTitleCompany = "Title company";
            labelTitleEntries = "Title entries";
            labelTitleBill = "Title bill";
            labelTitleVendor = "Title vendors";
            itemLanguageEngli = "English";
            itemThemeDark = "Dark";
            itemThemeLight = "Light";
            itemLanguagesSpa = "Spanish";
            titlePrevious = "Previsualization of titles";
        }
        else{
            titleChange = "Titulos";
            itemLanguageEngli = "Inglés";
            itemLanguagesSpa = "Español";
            itemThemeDark = "Oscuro";
            itemThemeLight = "Default";
            labelTitleInventary = "Titulo del inventario";
            labelTitleCompany = "Titulo de la compañia";
            labelTitleBill = "Titulo de facturas";
            labelTitleEntries = "Titulo de entradas";
            labelTitleVendor = "Titulo de proveedor";
            titlePrevious = "Previsualización de titulos";
        }
        deleteAllItemts(comboL, comboT);
        showLanguageSelected(comboL, state);
        showThemeSelected(comboT, themeSelected);
    }

    public static void showLabels(JLabel title, JLabel titleC, JLabel titleI, JLabel titleE, JLabel titleB, JLabel titleV, JLabel titleP){
        title.setText(titleChange);
        titleC.setText(labelTitleCompany);
        titleI.setText(labelTitleInventary);
        titleE.setText(labelTitleEntries);
        titleB.setText(labelTitleBill);
        titleV.setText(labelTitleVendor);
        titleP.setText(titlePrevious);
    }

    public static void showLanguageSelected(JComboBox combo, boolean state){

            combo.addItem(itemLanguagesSpa);
            combo.addItem(itemLanguageEngli);

            if(state){//This is for English languages selected
                combo.setSelectedIndex(1);
            }
            else{//This for Spanish languages
                combo.setSelectedIndex(0);
            }
    }

    public static void deleteAllItemts(JComboBox comboL, JComboBox comboT){
        comboT.removeAllItems();
        comboL.removeAllItems();
    }

    public static void showThemeSelected(JComboBox combo, String themeSelected){

        combo.addItem(itemThemeLight);
        combo.addItem(itemThemeDark);

                if(themeSelected.equalsIgnoreCase("Dark") || themeSelected.equalsIgnoreCase("Oscuro")){
                    combo.setSelectedIndex(1);
                }
                else if(themeSelected.equalsIgnoreCase("Light") || themeSelected.equalsIgnoreCase("Default")) {
                    combo.setSelectedIndex(0);
                }

                themeSelected = (String.valueOf(combo.getSelectedItem()));
    }

    public static boolean changeLanguage(int selected){
        if(selected == 0){
            return false;
        }
        else{
            return true;
        }
    }

    public static void takeIndexComboTheme(JComboBox comboT){
        themeSelected = String.valueOf(comboT.getSelectedItem());
    }

    public static void takeTextForFields(String textCompanyes, String textInventary, String textEntries, String textBills, String textVendors){
        textCompany = textCompanyes;
        textInvent = textInventary;
        textEntri = textEntries;
        textBill = textBills;
        textVendor = textVendors;
    }

    public static void saveLanguage(boolean selectedLanguage){
        SaveSetting save = new SaveSetting();
        re = new ReSettings();
        String[] array = {themeSelected,
                re.getFont(),
                re.getStyle(),
                String.valueOf(re.getSize()),
                String.valueOf(selectedLanguage),
                textCompany,
                textInvent,
                textEntri,
                textBill,
                textVendor,
                ReSettings.getUser(), ReSettings.getRol()};
        save.saveSetting(array);
    }

    public static void changeLanguageLabels(JLabel title, JLabel titleC, JLabel titleI, JLabel titleE, JLabel titleB, JLabel titleV, JLabel titleP){
        title.setText(titleChange);
        titleC.setText(labelTitleCompany);
        titleI.setText(labelTitleInventary);
        titleE.setText(labelTitleEntries);
        titleB.setText(labelTitleBill);
        titleV.setText(labelTitleVendor);
        titleP.setText(titlePrevious);
    }

    //These are for apply we changes
    public static void resetDefaultSettings(){



    }

    public static void applyNewSettings(boolean selectedLanguage){
        SaveSetting save = new SaveSetting();
        re = new ReSettings();

        String[] array = {themeSelected,
                re.getFont(),
                re.getStyle(),
                String.valueOf(re.getSize()),
                String.valueOf(selectedLanguage),
                textCompany,
                textInvent,
                textEntri,
                textBill,
                textVendor,
                ReSettings.getUser(), ReSettings.getRol()};
        save.saveSetting(array);
    }

    public static void cancelChanges(){


    }

    //this controller lack of reset settings and more configurations. Anyway, i would like some threads charge the titles of another panels


}
