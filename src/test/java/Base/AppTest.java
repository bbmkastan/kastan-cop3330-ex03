package Base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void ifQuoteIsCorrect() {
        App myApp = new App();

        String quote = "These aren't the droids you're looking for.";
        String author = "Obi-Wan Kenobi";

        String expectedQuote = "Obi-Wan Kenobi says, \"These aren't the droids you're looking for.\"";
        String actualQuote = myApp.createString(quote, author);

        assertEquals(expectedQuote, actualQuote);
    }

}