package com.iqoption.deposit.light.constructor;

import android.view.View;
import android.widget.EditText;
import com.iqoption.deposit.a.c;
import com.iqoption.deposit.constructor.e;
import com.iqoption.deposit.light.a;
import kotlin.i;
import kotlin.jvm.internal.h;

@i(aXC = {1, 1, 11}, aXD = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0012\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, aXE = {"Lcom/iqoption/deposit/light/constructor/SelectStringLightFieldHolder;", "Lcom/iqoption/deposit/constructor/BaseSelectStringFieldHolder;", "binding", "Lcom/iqoption/deposit/databinding/ConstructorSpinnerFieldLightBinding;", "property", "Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamSelectProperty;", "name", "", "isRequired", "", "(Lcom/iqoption/deposit/databinding/ConstructorSpinnerFieldLightBinding;Lcom/iqoption/core/microservices/billing/response/extraparams/ExtraParamSelectProperty;Ljava/lang/String;Z)V", "getBinding", "()Lcom/iqoption/deposit/databinding/ConstructorSpinnerFieldLightBinding;", "editText", "Landroid/widget/EditText;", "setHint", "", "hint", "showError", "message", "value", "view", "Landroid/view/View;", "deposit_release"})
/* compiled from: FieldHoldersLight.kt */
public final class d extends e {
    private final c caJ;

    public d(c cVar, com.iqoption.core.microservices.billing.response.extraparams.c cVar2, String str, boolean z) {
        h.e(cVar, "binding");
        h.e(cVar2, "property");
        h.e(str, "name");
        super(cVar2, str, z);
        this.caJ = cVar;
    }

    /* renamed from: abX */
    public com.iqoption.core.microservices.billing.response.extraparams.c abT() {
        return abY();
    }

    public View abZ() {
        return this.caJ.getRoot();
    }

    public String value() {
        String value = getValue();
        return value != null ? value : "";
    }

    public EditText aca() {
        return this.caJ.bYv;
    }

    public void hg(String str) {
        EditText editText = this.caJ.bYv;
        h.d(editText, "binding.constructorSpinnerEdit");
        editText.setHint(str);
    }

    public void hh(String str) {
        EditText editText = this.caJ.bYv;
        h.d(editText, "binding.constructorSpinnerEdit");
        a.b(editText, str);
    }
}
