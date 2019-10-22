/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.hq.swingmaterialdesign.materialdesign.MPasswordField;

/**
 *
 * @author bianca
 */
public class LimitPassword extends MPasswordField {

    private int limite = 0;

    public LimitPassword(int l) {
        this.limite = l;
    }

    public void insertString() {
        if (limite <getPassword().length+1) {
            String texto = getText();
            setText(texto.substring(0, texto.length() - 1));
        }
    }
}
