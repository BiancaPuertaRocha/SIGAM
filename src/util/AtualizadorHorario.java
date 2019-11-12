package util;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JMenu;

/**
 *
 * @author AJFILHO
 */
public class AtualizadorHorario extends Thread {

    private JLabel hr;
    private boolean mostrarData;
    private JLabel data;

    public AtualizadorHorario(JLabel hora, JLabel data) {
        this.hr = hora;
        this.data = data;
    }

    public void mostrarData(boolean mostrar) {
        if (mostrar) {
            this.mostrarData = true;
        } else {
            this.mostrarData = false;
        }
    }

    private void drawDate() {
        Calendar cal = Calendar.getInstance();

        int ds = cal.get(Calendar.DAY_OF_WEEK);
        String dia = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
        String ano = String.valueOf(cal.get(Calendar.YEAR));
        int mes = cal.get(Calendar.MONTH);
        String dss = null;
        switch (ds) {
            case 1:
                dss = "Domingo, ";
                break;
            case 2:
                dss = "Segunda, ";
                break;
            case 3:
                dss = "Terça, ";
                break;
            case 4:
                dss = "Quarta, ";
                break;
            case 5:
                dss = "Quinta, ";
                break;
            case 6:
                dss = "Sexta, ";
                break;
            case 7:
                dss = "Sábado, ";
                break;
        }
        String mess = "";
        String messs = "";
        switch (mes) {
            case 0:
                mess = " de Janeiro de ";
                messs = " JAN, ";
                break;
            case 1:
                mess = " de Fevereiro de ";
                messs = " FEV, ";
                break;
            case 2:
                mess = " de Março de ";
                messs = " MAR, ";
                break;
            case 3:
                mess = " de Abril de ";
                messs = " ABR, ";
                break;
            case 4:
                mess = " de Maio de ";
                messs = " MAI, ";
                break;
            case 5:
                mess = " de Junho de ";
                messs = " JUN, ";
                break;
            case 6:
                mess = " de Julho de ";
                messs = " JUL, ";
                break;
            case 7:
                mess = " de Agosto de ";
                messs = " AGO, ";
                break;
            case 8:
                mess = " de Setembro de ";
                messs = " SET, ";
                break;
            case 9:
                mess = " de Outubro de ";
                messs = " OUT, ";
                break;
            case 10:
                mess = " de Novembro de ";
                messs = " NOV, ";
                break;
            case 11:
                mess = " de Dezembro de ";
                messs = " DEZ, ";
                break;
        }
        data.setText(dss + dia + mess + ano);
    }

    @Override
    public void run() {
        try {
            while (true) {
                Date d = new Date();
                StringBuffer data = new StringBuffer();
                if (mostrarData) {
                    drawDate();
                    this.data.revalidate();
                }

                Calendar cal = Calendar.getInstance();
                hr.setText(String.format("%1$tH:%1$tM", cal));
                Thread.sleep(1000);
                this.hr.revalidate();
            }
        } catch (InterruptedException ex) {
            System.out.println("Problema na atualização da data/hora");
            ex.printStackTrace();
        }
    }
}
