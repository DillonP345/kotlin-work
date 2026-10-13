// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(phrase: String, rPhrase: String, z: Char = 'X'): String {
    phrase.replace(rPhrase, z)
}