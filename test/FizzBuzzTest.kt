import org.fest.assertions.Assertions.*
import org.junit.Test

public class FizzBuzzTest {

    Test
    public fun peutDonner100Reponses() {
        val valeurs = FizzBuzz().enumere()

        assertThat(valeurs.size)?.isEqualTo(100);
    }

    Test
    public fun peutDonner1() {
        val valeurs = FizzBuzz().enumere()

        verifie(1, "1", valeurs)
    }

    Test
    public fun peutDonnerFizz() {
        val valeurs = FizzBuzz().enumere()

        verifie(3, "Fizz", valeurs)
    }

    Test
    public fun peutDonnerFizzPourUnAutreNombre() {
        val valeurs = FizzBuzz().enumere()

        verifie(6, "Fizz", valeurs)
    }

    Test
    public fun peutDonnerBuzz() {
        val valeurs = FizzBuzz().enumere()

        verifie(5, "Buzz", valeurs)
    }

    Test
    public fun peutDonnerFizzBuzz() {
        val valeurs = FizzBuzz().enumere()

        verifie(15, "FizzBuzz", valeurs)
    }

    private fun verifie(entier: Int, attendu: String, valeurs: Array<String>): Unit {
        assertThat(valeurs[entier - 1])?.isEqualTo(attendu)
    }
}