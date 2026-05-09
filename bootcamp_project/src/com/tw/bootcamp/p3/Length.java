package com.tw.bootcamp.p3;

public class Length extends MeasurementUnit {

    private Length(Double value) {
        super(value);

    }
    public static Length createLength(Double value, LengthUnit unit) {
        return new Length(unit.convertToBase(value));
    }

    public Length add(Length length){
        Double total = this.value +length.value;
        return createLength(total,LengthUnit.STANDARD);
    }

}
