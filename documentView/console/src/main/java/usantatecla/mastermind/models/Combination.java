package usantatecla.mastermind.models;

import usantatecla.utils.views.ColorCode;

import java.util.ArrayList;
import java.util.List;

abstract class Combination {

    protected List<ColorCode> colorCodes; // TODO Factoria de color + colorView

    protected Combination() {
        this.colorCodes = new ArrayList<>();
    }

}
