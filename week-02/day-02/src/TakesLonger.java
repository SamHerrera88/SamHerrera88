public class TakesLonger {
    // When saving this quote a disk error has occured. Please fix it.
    // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
    // Using pieces of the quote variable (instead of just redefining the string)
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        String missingPart = " always takes longer than";

        String [] quoteParts = quote.split("(?<=It)");

        quote = quoteParts [0] + missingPart + quoteParts[1];

        System.out.println(quote);
    }
}
