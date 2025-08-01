package a0;

import android.view.View;
import android.view.View.OnLongClickListener;
import java.util.Objects;
import z.a;

public final class c implements OnLongClickListener {
    public final /* synthetic */ a a;
    public final /* synthetic */ d b;

    public c(d dVar, a aVar) {
        this.b = dVar;
        this.a = aVar;
    }

    public final boolean onLongClick(View view) {
        if (this.a.getLongClickListener() != null) {
            z.a.c longClickListener = this.a.getLongClickListener();
            this.a.getValue();
            return longClickListener.a();
        }
        Objects.requireNonNull(this.b);
        Objects.requireNonNull(this.b);
        d dVar = this.b;
        a aVar = this.a;
        Objects.requireNonNull(dVar);
        if (aVar.isExpanded()) {
            dVar.a(aVar);
        } else {
            dVar.b(aVar);
        }
        return false;
    }
}
