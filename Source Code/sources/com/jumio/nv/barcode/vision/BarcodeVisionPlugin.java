package com.jumio.nv.barcode.vision;

import android.content.Context;
import android.os.Bundle;
import com.jumio.core.overlay.Overlay;
import com.jumio.core.plugins.Plugin;
import com.jumio.nv.barcode.overlay.BarcodeOverlay;
import com.jumio.sdk.extraction.ExtractionClient;
import jumio.nv.barcode-vision.a;

public class BarcodeVisionPlugin implements Plugin {
    public <T> void populateData(Context context, T t) {
    }

    public ExtractionClient getExtractionClient(Context context) {
        return new a(context);
    }

    public Overlay getOverlay(Context context, Bundle bundle) {
        return new BarcodeOverlay(context);
    }
}
