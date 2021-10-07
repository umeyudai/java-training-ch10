package com.umeyudai;

public class Sum extends Calculation {
    public Sum(double[] dt) {
        super(dt);
    }
    public double calculate(){
        double sum = 0;
        for(double x : getDt()){
            sum += x;
        }
        return sum;
    }

    public double average(){
        return calculate()/getDt().length;
    }

}
