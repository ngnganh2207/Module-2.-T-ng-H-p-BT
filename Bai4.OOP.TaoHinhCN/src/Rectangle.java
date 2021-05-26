public class Rectangle {
    double width;
    double height;

    public Rectangle(){

    }

    public Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    public double getWidth(){
        return  this.width;
    }
    public double getHeight(){
        return this.height;
    }
    //Phương thức không trả về thì phải void
    public void setWidth(double width){
        this.width=width;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPerimeter(){
        return (this.width +this.height)*2;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + getWidth() +
                ", height=" + getHeight() +
                ", area="+getArea()+
                ", perimeter="+getPerimeter()+
                '}';
    }

    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle(15,10);
        rectangle.setWidth(150);
        rectangle.setHeight(100);
        System.out.println(rectangle.getWidth());
        System.out.println(rectangle.getHeight());
        System.out.println(rectangle);
    }
}

