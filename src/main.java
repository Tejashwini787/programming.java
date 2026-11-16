
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}


class rectangle implements Resizable {
    private int width;
    private int height;


    public rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to: " + this.width);
    }


    @Override
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to: " + this.height);
    }


    public void displayDimensions() {
        System.out.println("Current Rectangle Dimensions -> Width: " + width + ", Height: " + height);
    }
}


public class main {
    public static void main(String[] args) {

        rectangle rect = new rectangle(10, 20);
        rect.displayDimensions();


        rect.resizeWidth(30);
        rect.resizeHeight(40);


        rect.displayDimensions();
    }
}
