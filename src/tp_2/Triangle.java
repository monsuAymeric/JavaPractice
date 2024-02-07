package tp_2;

    public class Triangle {
        int FirstSide;
        int SecondeSide;
        int ThirdSide;

        //Constructor
        public Triangle(int FirstSide, int SecondeSide, int ThirdSide) {
            if (FirstSide + SecondeSide > ThirdSide && 
                FirstSide + ThirdSide > SecondeSide &&
                SecondeSide + ThirdSide > FirstSide) {
                    this.FirstSide = FirstSide;
                    this.SecondeSide = SecondeSide;
                    this.ThirdSide = ThirdSide;
            } else {
                throw new IllegalArgumentException("Les cotés données ne forment pas un triangle valide");
            }
        }

        //Methods
        public int CalculPerimetre() {
            return FirstSide + SecondeSide + ThirdSide;
        }

        public void CalculAire() {
            double s = CalculPerimetre() / 2;
            System.out.println("Aire = " + Math.sqrt(s * ( s - FirstSide) * (s - SecondeSide) * (s - ThirdSide)) + "cm");
        }

        public void MoveTriangle(int AxeX, int AxeY, int AxeZ) {
            System.out.println("Moving triangle to : " 
                                + " Axe X = " + AxeX + "cm "
                                + "| Axe Y = " + AxeY + "cm "
                                + "| Axe Z = " + AxeZ + "cm ");
        }

        public static void main (String[] args) {
            //Create objects
            Triangle triangle1 = new Triangle(5, 4, 7);

            //Display Perimetre
            System.out.println("Perimetre = " + triangle1.CalculPerimetre() + "cm");
        
            //Display Aire
            triangle1.CalculAire();
        
            //Display Aire
            triangle1.MoveTriangle(2, 3, 6);
        }
        
    }