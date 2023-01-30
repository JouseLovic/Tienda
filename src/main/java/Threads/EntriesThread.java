package Threads;

import ViewFormulary.PanelEntrada;

public class EntriesThread extends Thread{


    @Override
    public void run() {
        try{
            while(true) {
                Thread.sleep(250);
                if(!PanelEntrada.isIsVisibleEntries()) {
                    PanelEntrada.chargeEntries();
                }
            }
        }catch (Exception ex){
            ex.getCause();
        }
    }

    @Override
    public void interrupt() {
        this.interrupt();
    }


}
