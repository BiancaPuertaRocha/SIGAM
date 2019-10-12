package util;

import com.hq.swingmaterialdesign.materialdesign.MTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitTextfield extends MTextField {

    private int limite = 0;

    public LimitTextfield(int l) {
        this.limite = l;
    }

    public void insertString() {
        if (limite <getText().length()+1) {
            String texto = getText();
            setText(texto.substring(0, texto.length() - 1));
        }
    }
}
