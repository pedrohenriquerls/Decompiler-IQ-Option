package com.iqoption.dialog.a;

import com.google.common.primitives.Longs;
import com.iqoption.mobbtech.connect.response.options.e;
import java.util.Comparator;

final /* synthetic */ class t implements Comparator {
    static final Comparator $instance = new t();

    private t() {
    }

    public int compare(Object obj, Object obj2) {
        return Longs.compare(((e) obj).getCreated().longValue(), ((e) obj2).getCreated().longValue());
    }
}
