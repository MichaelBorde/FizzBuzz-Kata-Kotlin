public class FizzBuzz {

    public fun enumere(): Array<String> {
        return Array<String>(100, { element -> versFizzBuzz(element + 1) })
    }

    private fun versFizzBuzz(entier: Int): String {
        if(multiple(entier, 15)) {
            return "FizzBuzz"
        }
        if (entier % 3 == 0) {
            return "Fizz"
        }
        if(entier % 5 == 0) {
            return "Buzz"
        }
        return "$entier"
    }

    private fun multiple(multiple: Int, diviseur: Int): Boolean {
        return multiple % diviseur == 0
    }
}