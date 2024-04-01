
    package lesson5;

    public class Circle2D {
        private Point2D center;
        private float radius;

        public Circle2D(Point2D center, float radius) {
            this.center = center;
            this.radius = radius;
        }
        public float area() {
            return (float) (Math.PI * Math.pow(radius, 2));
        }
        public float circumference() {
            return (float) (2 * Math.pow(radius, 2));
        }
        public void display()  {
            System.out.println("Circle properties: ");
            System.out.println("Center point: ");
            center.display();
            System.out.println("radius: " + radius);
            System.out.println("area: " + area());
            System.out.println("circumference: " + circumference());
        }
        public static void main(String[] args) {
            Point2D center = new Point2D (3,4);
            lesson5.Circle2D circle = new lesson5.Circle2D(center,5);
            System.out.println("Circle at the center with radius: ");
            circle.display();
        }

    }



