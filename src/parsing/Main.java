/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package parsing;

/**
 *
 * @author Ivan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "$GPGGA,072143.923,,,,,2,03,,9.5,M,0.0,M,,0000*5D\r\n$GPRMC,125504.049,A,5542.2389,N,03741.6063,E,0.06,25.82,200906,,,*17";
        boolean resultOfParsing = Parsing.parsingData(str);
    }
}
