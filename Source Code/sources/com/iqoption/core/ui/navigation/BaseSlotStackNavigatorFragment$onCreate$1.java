package com.iqoption.core.ui.navigation;

import kotlin.i;

@i(aXC = {1, 1, 11}, aXD = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, aXE = {"com/iqoption/core/ui/navigation/BaseSlotStackNavigatorFragment$onCreate$1", "Lcom/iqoption/core/ui/navigation/LifecycleBackListener;", "onBackPressed", "", "core_release"})
/* compiled from: BaseSlotStackNavigatorFragment.kt */
public final class BaseSlotStackNavigatorFragment$onCreate$1 extends LifecycleBackListener {
    final /* synthetic */ d bbJ;

    BaseSlotStackNavigatorFragment$onCreate$1(d dVar, a aVar) {
        this.bbJ = dVar;
        super(aVar);
    }

    public boolean onBackPressed() {
        return this.bbJ.YP().pop();
    }
}
