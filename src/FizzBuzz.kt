public class FizzBuzz {

    public fun enumere(): Array<String> {
        return Array<String>(100, { element -> versFizzBuzz(element + 1) })
    }

    private fun versFizzBuzz(entier: Int): String {
        if(multiple(entier, 15)) {
            return "FizzBuzz"
        }
        if(multiple(entier, 3)) {
            return "Fizz"
        }
        if(multiple(entier, 5)) {
            return "Buzz"
        }
        return "$entier"
    }

    private fun multiple(multiple: Int, diviseur: Int) = multiple % diviseur == 0
}