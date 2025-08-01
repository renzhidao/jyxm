package c;

import android.widget.MultiAutoCompleteTextView.Tokenizer;

public final class d implements Tokenizer {
    public final int findTokenEnd(CharSequence charSequence, int i) {
        return charSequence.length();
    }

    public final int findTokenStart(CharSequence charSequence, int i) {
        String substring = charSequence.toString().substring(0, i);
        for (i--; i >= 0; i--) {
            char charAt = substring.charAt(i);
            if (charAt == ' ' || charAt == 10 || charAt == '(') {
                return i + 1;
            }
        }
        return 0;
    }

    public final CharSequence terminateToken(CharSequence charSequence) {
        return charSequence;
    }
}
