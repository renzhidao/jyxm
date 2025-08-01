package a0;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import z.a;
import z.a.b;

public final class d {
    public a a;
    public Context b;
    public Class<? extends a.a> c = y.a.class;
    public b d;

    public d(Context context, a aVar) {
        this.a = aVar;
        this.b = context;
    }

    public final void a(a aVar) {
        aVar.setExpanded(false);
        a.a c = c(aVar);
        c.getNodeItemsView().setVisibility(8);
        c.toggle(false);
    }

    public final void b(a aVar) {
        aVar.setExpanded(true);
        a.a c = c(aVar);
        c.getNodeItemsView().removeAllViews();
        c.toggle(true);
        for (a aVar2 : aVar.getChildren()) {
            ViewGroup nodeItemsView = c.getNodeItemsView();
            View view = c(aVar2).getView();
            nodeItemsView.addView(view);
            view.setOnClickListener(new b(this, aVar2));
            view.setOnLongClickListener(new c(this, aVar2));
            if (aVar2.isExpanded()) {
                b(aVar2);
            }
        }
        c.getNodeItemsView().setVisibility(0);
    }

    public final a.a c(a aVar) {
        a.a viewHolder = aVar.getViewHolder();
        if (viewHolder == null) {
            try {
                viewHolder = (a.a) this.c.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{this.b});
                aVar.setViewHolder(viewHolder);
            } catch (Exception unused) {
                StringBuilder l = androidx.activity.a.l("Could not instantiate class ");
                l.append(this.c);
                throw new RuntimeException(l.toString());
            }
        }
        if (viewHolder.getContainerStyle() <= 0) {
            viewHolder.setContainerStyle(0);
        }
        if (viewHolder.getTreeView() == null) {
            viewHolder.setTreeViev(this);
        }
        return viewHolder;
    }
}
