package com.tw.bootcamp.p3;
import java.util.Objects;

public class Length {
    private final Double value;


    private Length(Double value) {
        this.value = value;

    }

    public static Length createLength(Double value, LengthUnit unit) {
        return new Length(unit.convertToBase(value));
    }

    public Length add(Length length){
        Double total = this.value +length.value;
        return createLength(total,LengthUnit.METER);
    }

//    public Double toType(LengthUnit unit){
//        return unit.convertFromBase(this.value);
//    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;

        return Math.abs(this.value - length.value) < 0.001;
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return "Length{" +
                "value=" + value +
                '}';
    }
}
