package factura;


import java.awt.Toolkit;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

// End of variables declaration                   

    // --- PEGAR LA CLASE NumericDocumentFilter AQUÍ ---
    class NumericDocumentFilter extends DocumentFilter {

        @Override
        public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
            if (string == null) {
                return;
            }
            String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
            String newText = currentText.substring(0, offset) + string + currentText.substring(offset);

            if (isValidNumeric(newText)) {
                super.insertString(fb, offset, string, attr);
            } else {
                Toolkit.getDefaultToolkit().beep(); // Sonido de error
            }
        }

        @Override
        public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
            if (text == null) {
                return;
            }
            String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
            String before = currentText.substring(0, offset);
            String after = currentText.substring(offset + length);
            String newText = before + text + after;

            if (isValidNumeric(newText)) {
                super.replace(fb, offset, length, text, attrs);
            } else {
                Toolkit.getDefaultToolkit().beep(); // Sonido de error
            }
        }

        @Override
        public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
            String currentText = fb.getDocument().getText(0, fb.getDocument().getLength());
            String before = currentText.substring(0, offset);
            String after = currentText.substring(offset + length);
            String newText = before + after;

            // Permitir el borrado si el campo quedará vacío o con un número válido
            if (newText.isEmpty() || isValidNumeric(newText)) {
                super.remove(fb, offset, length);
            } else {
                Toolkit.getDefaultToolkit().beep(); // Sonido de error
            }
        }

        // Método de validación para números (enteros o decimales, con signo opcional)
        private boolean isValidNumeric(String str) {
            if (str == null || str.isEmpty()) {
                return true; // Permitir cadena vacía
            }
            // Expresión regular para números decimales o enteros, con signo negativo opcional al principio
            return str.matches("^-?\\d*\\.?\\d*$");
        }
    }
