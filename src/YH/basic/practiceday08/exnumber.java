package YH.basic.practiceday08;

public class exnumber {
    public static void main(String[] args) {

        Fan f1 = new Fan();
        System.out.println(f1.speed);
        System.out.println(f1.on);
        System.out.println(f1.radius);
        System.out.println(f1.color);

        Fan f2 = new Fan();
        System.out.println(f1.speed);
        System.out.println(f1.on);
        System.out.println(f1.radius);
        System.out.println(f1.color);



    }
    //73번
    static class Fan{

        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;


        private int speed;
        private boolean on;
        private double radius;
        private String color;

        public Fan(){
            speed = SLOW;
            on = false;
            radius = 5.0;
            color = "blue";
        }

        public Fan(int speed, boolean on, double radius, String color) {
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }
    }

        //74번
        class Account{

        private int aid;
        private int balance;
        private int interestRate;
        private String dateCreated;

            public Account(int aid, int balance, int interestRate,
                           String dateCreated) {
                this.aid = aid;
                this.balance = balance;
                this.interestRate = interestRate;
                this.dateCreated = dateCreated;
            }
        }





   }