package util;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversoes {
    
    public static String getDateFormatedToString(Date date) {
        Format formatter = new SimpleDateFormat("dd/MM/yyyy");
        String s = formatter.format(date);
        return s;
    }
   
    public static int getDaysBetween(Date inicio, Date fim) {
        int result;
        long dt = (inicio.getTime() - fim.getTime()) + 360000;
        long n =  dt/ 86400000L;
        try {
            result = (int) n; 
            return (int) n;
        } catch(Exception e) {
         
            throw new Error("Erro na conversão de Long para int:\n>> getDaysBetween(dataInicio, dataFim)");
        }
    }
    public static String getStringOfTime(Date horario){
        String hora = new SimpleDateFormat("HH:mm:ss").format(horario);
        return hora;
    }
    public static Date getDateOfTime(String param) {
        SimpleDateFormat sdFormat = new SimpleDateFormat("HH:mm:ss");
        Date date;
        try {
            date = sdFormat.parse(param);
        } catch (ParseException ex) {
            date = new Date();
           
        }
        return date;
    }
    public static Date getDateOfString(String param) {
        SimpleDateFormat sdFormat = new SimpleDateFormat("dd/MM/yyyyy");
        Date date;
        try {
            date = sdFormat.parse(param);
        } catch (ParseException ex) {
            date = new Date();
           
        }
        return date;
    }
   
    
}