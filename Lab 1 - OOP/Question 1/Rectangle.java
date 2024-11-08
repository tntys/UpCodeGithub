public class Rectangle {
    private int height;
    private int width;

    public Rectangle( int height, int width) {
        if (width < 0) {
            System.out.println(" Width can not be negative. ");
            this.width = 1; 
        } else {
            this.width = width;
        }

        if (height < 0) {
            System.out.println(" Height can not be negative. ");
            this.height = 1;
        } else {
            this.height = height;
        }
    }


    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void visualize(){
        for(int i=0; i<width; i++) {
            for( int j=0; j<height; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}
