/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ines aguilar
 */
import java.util.Calendar;
public class TimeCount {
    private long tinicial=0;
    private long tfinal=0;
    
    public void inicia(){
        tinicial= Calendar.getInstance().getTime().getTime();
    }
    public void termina(){
        tfinal = Calendar.getInstance().getTime().getTime();
    }
    
    public void muestraDiferencia(){
        long diferencia=tinicial-tfinal;
        System.out.format("tiempo total: %d horas %d minutos %d segundos %d milisegundos", (diferencia/(60*60*1000))%60,(diferencia/(60*1000))%60,diferencia/1000%60,diferencia%1000);
    }
    
}
