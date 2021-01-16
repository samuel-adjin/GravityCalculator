



public class GravityCalculator {

    public static void main(String[] args) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;

//        The object's position after 10.0 seconds is 0.0 m.
        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");



        gravityCalculator();  // The object's position after 10.0 seconds is -490.5 m

    }

//    modified code method created
    public static void gravityCalculator(){

        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition;


//        time (t) square is calculated using  Math.pow
        double squareTime = Math.pow(fallingTime,2);

//        acceleration is multiplied by t square and divided by 2
        double sqAccel_X_Time = (gravity * squareTime)/2;

//        initialVelocity (v) is multiplied by time (t)
        double velo_X_Time = initialVelocity * fallingTime;

        finalPosition = sqAccel_X_Time + velo_X_Time + initialPosition;

        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");




    }



}


