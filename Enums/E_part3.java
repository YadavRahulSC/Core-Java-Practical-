//Using predefined function in Enums

//Compiler generates functions
//Values()----We can iterate in this Enum.
// ValueOf(String)-----Convert a String into Enum

//Belongs to Enum class
//name()---It will fetch the values present in Enum and will return in a array.
//ordinal()----It will return the index of values present in Enums


package Enums;

enum Direction3 {
    NORTH,
    SOUTH,
    EAST,
    WEST;
}


public class E_part3 {

    public static void main(String[] args) {

        Direction3[] d3 = Direction3.values();

        for (Direction3 e : d3) {
            System.out.println(e.name());
        }


    }
}
