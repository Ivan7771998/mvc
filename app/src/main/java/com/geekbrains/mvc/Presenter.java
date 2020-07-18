package com.geekbrains.mvc;

public class Presenter {

    private final Model mModel;
    private final MainView mView;

    public Presenter(MainView mainView) {
        mModel = new Model();
        mView = mainView;
    }

    private int calcNewModelValue(int modelElementIndex) {
        int currentValue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentValue + 1;
    }

    public void buttonClick(int index) {
        int newModelValue = calcNewModelValue(index);
        mModel.setElementValueAtIndex(index, newModelValue);
        mView.setButtonText(index, newModelValue);
    }
}
