package com.geekbrains.mvc;

public class Presenter {

    private final Model mModel;

    public Presenter() {
        mModel = new Model();
    }

    private int calcNewModelValue(int modelElementIndex) {
        int currentValue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentValue + 1;
    }

    public int buttonClick(int index) {
        int newModelValue = calcNewModelValue(index);
        mModel.setElementValueAtIndex(index, newModelValue);
        return newModelValue;
    }
}
