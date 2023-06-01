package ru.mirea.komaristaya.yandexmaps;

import androidx.annotation.NonNull;

import com.yandex.mapkit.layers.ObjectEvent;
import com.yandex.mapkit.user_location.UserLocationView;

public interface UserLocationObjectListener {
    void onObjectAdded(@NonNull UserLocationView userLocationView);
    void onObjectRemoved(@NonNull UserLocationView userLocationView);
    void onObjectUpdated(@NonNull UserLocationView userLocationView, ObjectEvent objectEvent);
}
