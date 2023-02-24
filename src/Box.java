public class Box <A,B> {
    private A length;
    private B width;

    public A getLength() {
        return length;
    }

    public void setLength(A length) {
        this.length = length;
    }

    public B getWidth() {
        return width;
    }

    public void setWidth(B width) {
        this.width = width;
    }

    public Box(A length, B width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Box{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
    public static< A > A methodBox(A length){
        return length;
    }





}
