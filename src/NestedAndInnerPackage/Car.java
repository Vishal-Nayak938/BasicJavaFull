package NestedAndInnerPackage;

public class Car {
    public int noOfDoors=9;

    public class Tire {
        //supports all four modifier
//        to access inner class we use an another function in this function we create instance of the class
//        and call the function and in main method we create instance of outer class
//        organization of similar type of class,convenience easily access outer class member,encapsulation
//        hides implementation of object

        private int radius;
        private int pressure;
        private String material;

        public Tire(int radius, int pressure, String material) {
            this.radius = radius;
            this.pressure = pressure;
            this.material = material;
        }

        public void getTire() {
            System.out.printf("radius=%d, pressure=%d, material=%s", radius, pressure, material);
        }
          void check() {
            noOfDoors = 4;
        }
          void getNoOfDoors()
        {
            System.out.println("no of doors "+noOfDoors);
        }
    }
            public void print()
            {
                Tire t1 = new Tire(5,3,"Iron");
       t1.getTire();
       t1.check();
                System.out.println();
       t1.getNoOfDoors();
            }
    }