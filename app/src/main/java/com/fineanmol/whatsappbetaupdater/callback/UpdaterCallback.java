package com.fineanmol.whatsappbetaupdater.callback;

import com.fineanmol.whatsappbetaupdater.enums.UpdaterError;
import com.fineanmol.whatsappbetaupdater.models.Update;

public interface UpdaterCallback {

    void onFinished(Update update, boolean isUpdateAvailable);
    void onLoading();
    void onError(UpdaterError error);

}
