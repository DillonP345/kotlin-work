// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
import kotlin.text.replace
fun redact(phrase: String, rPhrase: String, z: Char ='X'): String {
        return phrase.replace(rPhrase, z.toString().repeat(rPhrase.length))
}