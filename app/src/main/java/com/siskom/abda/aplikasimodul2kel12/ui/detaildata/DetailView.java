package com.siskom.abda.aplikasimodul2kel12.ui.detaildata;

import com.siskom.abda.aplikasimodul2kel12.data.model.DataCar;

import java.util.List;

public interface DetailView {
    void showErrorCarById(String message);

    void showSuccessCarById(List<DataCar> dataCar);
}