package org.example.util;

/**
 * Utility class per operazioni su stringhe
 */
public class StringUtils {
    
    /**
     * Verifica se una stringa è vuota o null
     * @param str la stringa da verificare
     * @return true se la stringa è vuota o null
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
    
    /**
     * Capitalizza la prima lettera di una stringa
     * @param str la stringa da capitalizzare
     * @return la stringa con la prima lettera maiuscola
     */
    public static String capitalize(String str) {
        if (isEmpty(str)) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }
}