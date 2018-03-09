package com.londonappbrewery.destini;

/**
 * Created by HackDX2 on 3/8/2018.
 */

public class ChooseTheWay {
    int mstrBodyText, mstrTopText, mstrButtonText;
    int mblchoice;

    public ChooseTheWay(int mstrBodyText, int mstrTopText, int mstrButtonText, int choice){
        this.mstrBodyText = mstrBodyText;
        this.mstrTopText = mstrTopText;
        this.mstrButtonText = mstrButtonText;
        this.mblchoice = choice;
    }

    public int getMstrBodyText() {
        return mstrBodyText;
    }

    public void setMstrBodyText(int mstrBodyText) {
        this.mstrBodyText = mstrBodyText;
    }

    public int getMstrTopText() {
        return mstrTopText;
    }

    public void setMstrTopText(int mstrTopText) {
        this.mstrTopText = mstrTopText;
    }

    public int getMstrButtonText() {
        return mstrButtonText;
    }

    public void setMstrButtonText(int mstrButtonText) {
        this.mstrButtonText = mstrButtonText;
    }

    public int isMblchoice() {
        return mblchoice;
    }

    public void setMblchoice(int mblchoice) {
        this.mblchoice = mblchoice;
    }
}
