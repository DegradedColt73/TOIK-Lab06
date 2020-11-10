package com.company;

class QuizImpl  implements Quiz {

    private int digit;

    public QuizImpl() {
        this.digit = 254;    // zmienna moze ulegac zmianie!
    }

    @Override
    public void isCorrectValue(int value) throws ParamTooLarge, ParamTooSmall {
        if(value < this.digit){
            throw new ParamTooSmall();
        }
        else if(value > this.digit){
            throw new ParamTooLarge();
        }
        else return;
    }
}