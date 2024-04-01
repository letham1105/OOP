package lesson5;

public class Rectangle2D {
        private Point2D topLeft;
        private float width;
        private float height;

        public Rectangle2D(Point2D topLeft, float width, float height) {
            this.topLeft = topLeft;
            this.height = height;
            this.width = width;
        }

        public float area() {
            return width*height;
        }

        public float perimeter() {
            return 2*(width + height);
        }

        public void display() {
            System.out.println("Rectangle Properties: ");
            System.out.println("Top_left Corner");
            topLeft.display();
            System.out.println("width: " + width);
            System.out.println("height: " + height);
            System.out.println("area: " + area());
            System.out.println("perimeter: " + perimeter());
        }
        public static void main(String[] args) {
            Point2D A = new Point2D(3,4);
            lesson5.Rectangle2D rect = new lesson5.Rectangle2D(A,5,6);

            System.out.println("Rectangle at A with dimension: ");
            rect.display();

        }

    }

