public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect1=new Rectangle();
        rect1.length=10;
        rect1.width=20;
        System.out.println("Rectangle1: "+rect1.length+" "+rect1.width);
        rect1.area();
        rect1.perimeter();
    }
}
