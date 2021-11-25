import java.util.List;
import java.util.function.BiFunction;

public class HigherOrderUtils {

    public static interface NamedBiFunction extends BiFunction {
        String name();
    }

    public static void main(String[] args){
        NamedBiFunction add; //Perform addition of two doubles
        NamedBiFunction diff; //Perform subtraction of one Double from another.
        NamedBiFunction mult; //Perform multiplication of two Doubles.
        NamedBiFunction div; //Divides one Double from another. (Throws ArithmeticException if there is a division by zero being attempted.)
    }

    /**
     * Applies a given list of bifunctions -- functions that take two arguments of a certain type
     * and produce a single instance of that type -- to a list of arguments of that type. The
     * functions are applied in an iterative manner, and the result of each function is stored in
     * the list in an iterative manner as well, to be used by the next bifunction in the next
     * iteration. For example, given
     * List<Double> args = Arrays.asList(1d, 1d, 3d, 0d, 4d), and
     * List<NamedBiFunction<Double, Double, Double>> bfs = [add, multiply, add, divide],
     * <code>zip(args, bfs)</code> will proceed iteratively as follows:
     * - index 0: the result of add(1,1) is stored in args[1] to yield args = [1,2,3,0,4]
     * - index 1: the result of multiply(2,3) is stored in args[2] to yield args = [1,2,6,0,4]
     * - index 2: the result of add(6,0) is stored in args[3] to yield args = [1,2,6,6,4]
     * - index 3: the result of divide(6,4) is stored in args[4] to yield args = [1,2,6,6,1.5]
     *
     * @param args: the arguments over which <code>bifunctions</code> will be applied.
     * @param bifunctions: the list of bifunctions that will be applied on <code>args</code>.
     * @param <T>: the type parameter of the arguments (e.g., Integer, Double)
     * @return the item in the last index of <code>args</code>, which has the final
     * result of all the bifunctions being applied in sequence.
     */
    //public static <T> T zip(List<T> args, List<NamedBiFunction<T, T, T>> bifunctions) {

    //}


    /**
     8. Based on the above zip function, think about what a function composition would look like. Write a (12)
     static inner class called FunctionComposition that is parameterized by three type parameters. This
     class should have no methods, and no constructor. It should only have a single BiFunction called
     composition, which takes in two functions and provides their composition as the output function.
     Function composition should be consistent with the types – if there is a function f: char -> String,
     and another function g: String -> int, the output of composition should be a function h: char ->
     int. For example, if f concatenates a char some number of times (say, ‘b’ yields “bb”, ‘c’ yields “ccc”,
     ‘d’ yields “dddd”, etc.), and g converts a string to its length, then composition(f, g) should output a
     function that maps ‘z’ to 26.
     **/

}
