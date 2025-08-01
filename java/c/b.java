package c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filter.FilterResults;
import android.widget.Filterable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public class b extends BaseAdapter implements Filterable {
    private final Filter codeFilter = new a();
    private final int codeViewLayoutId;
    private final int codeViewTextViewId;
    private List<a> currentSuggestions;
    private final LayoutInflater layoutInflater;
    private List<a> originalCodes;

    public class a extends Filter {
        public final CharSequence convertResultToString(Object obj) {
            return ((a) obj).getCodeBody();
        }

        public final FilterResults performFiltering(CharSequence charSequence) {
            int size;
            FilterResults filterResults = new FilterResults();
            ArrayList arrayList = new ArrayList();
            if (charSequence == null || charSequence.length() == 0) {
                filterResults.values = b.this.originalCodes;
                size = b.this.originalCodes.size();
            } else {
                charSequence = charSequence.toString().toLowerCase().trim();
                for (a aVar : b.this.originalCodes) {
                    if (aVar.getCodePrefix().toLowerCase().contains(charSequence)) {
                        arrayList.add(aVar);
                    }
                }
                filterResults.values = arrayList;
                size = arrayList.size();
            }
            filterResults.count = size;
            return filterResults;
        }

        public final void publishResults(CharSequence charSequence, FilterResults filterResults) {
            b.this.currentSuggestions = (List) filterResults.values;
            b.this.notifyDataSetChanged();
        }
    }

    public b(@NonNull Context context, int i, int i2, @NonNull List<a> list) {
        this.originalCodes = list;
        this.currentSuggestions = new ArrayList();
        this.layoutInflater = LayoutInflater.from(context);
        this.codeViewLayoutId = i;
        this.codeViewTextViewId = i2;
    }

    public void clearCodes() {
        this.originalCodes.clear();
        this.currentSuggestions.clear();
        notifyDataSetChanged();
    }

    public int getCount() {
        return this.currentSuggestions.size();
    }

    public Filter getFilter() {
        return this.codeFilter;
    }

    public Object getItem(int i) {
        return this.currentSuggestions.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.layoutInflater.inflate(this.codeViewLayoutId, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(this.codeViewTextViewId);
        a aVar = (a) this.currentSuggestions.get(i);
        if (aVar != null) {
            textView.setText(aVar.getCodeTitle());
        }
        return view;
    }

    public void updateCodes(List<a> list) {
        this.currentSuggestions.clear();
        this.originalCodes.clear();
        this.originalCodes.addAll(list);
        notifyDataSetChanged();
    }
}
