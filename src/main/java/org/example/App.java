package org.example;

import org.example.util.StringUtils;
import java.io.InputStream;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        // Esempio di utilizzo della utility class
        String testString = "ciao mondo";
        System.out.println("Stringa originale: " + testString);
        System.out.println("Stringa capitalizzata: " + StringUtils.capitalize(testString));
        
        // Esempio di lettura da file di configurazione
        loadProperties();
    }
    
    private static void loadProperties() {
        try {
            InputStream input = App.class.getClassLoader().getResourceAsStream("application.properties");
            if (input != null) {
                Properties props = new Properties();
                props.load(input);
                System.out.println("Nome applicazione: " + props.getProperty("app.name"));
                System.out.println("Versione: " + props.getProperty("app.version"));
                input.close();
            }
        } catch (Exception e) {
            System.out.println("Errore nella lettura del file di configurazione: " + e.getMessage());
        }
    }
}
// Commento per fare il push e verificare che il workflow di github action funzioni.
//last comment per github actions