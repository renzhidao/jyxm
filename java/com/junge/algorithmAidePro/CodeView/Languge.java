package com.junge.algorithmAidePro.CodeView;

import android.content.Context;
import c.a;
import com.amrdeveloper.codeview.CodeView;
import java.util.List;
import java.util.Set;

public interface Languge {
    void applyMonokaiTheme(Context context, CodeView codeView);

    void applyNoctisWhiteTheme(Context context, CodeView codeView);

    List<a> getCodeList(Context context);

    String getCommentEnd();

    String getCommentStart();

    Set<Character> getIndentationEnds();

    Set<Character> getIndentationStarts();

    String[] getKeywords(Context context);
}
