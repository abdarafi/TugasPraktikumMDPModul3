package com.siskom.abda.aplikasimodul2kel12.ui.home;

import com.siskom.abda.aplikasimodul2kel12.data.model.DataCar;

import java.util.List;

public interface HomeView {
    void successShowCar(List<DataCar> dataCars);
    void failedShowCar(String message);
}
