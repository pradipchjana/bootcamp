import com.tw.bootcamp.p1.Rectangle;

class Main{
    static void main() {
        Rectangle rectangle = Rectangle.createRectangle(2.0, 5.0);
        Double areaOfRect = rectangle.area();
        System.out.println(areaOfRect);

        Rectangle square = Rectangle.createSquare(2.0);
        Double areaOfSquare = square.area();
        System.out.println(areaOfSquare);
    }
}
