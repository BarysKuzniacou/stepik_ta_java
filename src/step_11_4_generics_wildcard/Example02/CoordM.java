package step_11_4_generics_wildcard.Example02;

public class CoordM <T extends Coord2> {
    T[] space;
    CoordM(T[]  array)  {
        space = array;
    }
}
