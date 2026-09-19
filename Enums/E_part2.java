//This is how the Compiler works for Enums

// Final class Direction extends Enum<Direction>
//public static final Direction NORTH=new Direction(120)
//public static final Direction SOUTH=new Direction(90)
//public static final Direction EAST=new Direction(270)
//public static final Direction WEST=new Direction(110)
//rest is the same.


package Enums;

enum Direction {
    NORTH(120),
    SOUTH(90),
    EAST(270),
    WEST(110);

    private int degree;

    Direction(int degree) {
        this.degree = degree;
    }

    public int show_deg() {
        return this.degree;
    }
}


public class E_part2 {
    public static void main(String[] args) {
        //Enums-> Enumerations (Enumerated type)
        // Enums-> Predefined set of constants


        Direction d = Direction.EAST;

        System.out.println(d.show_deg());

    }
}
