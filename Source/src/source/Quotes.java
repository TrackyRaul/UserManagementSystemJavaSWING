package source;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul Farkas
 */
public class Quotes {

    private ArrayList<String> quotes = new ArrayList<String>();

    /**
     * Quotes constructor
     *
     * Check if there is any serialized data, if not load from CSV.
     *
     * @throws IOException
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     */
    public Quotes() throws IOException, FileNotFoundException, ClassNotFoundException {
        try{
            deserialize();
        
        }catch(Exception e){
            loadFromCsv();
            serialize();
        }
        if (quotes.size() == 0) {
            loadFromCsv();
            serialize();

        }

    }
    
    /**
     * Serialize quotes list
     *
     */
    private void serialize() throws FileNotFoundException, IOException {
        FileOutputStream fileOut
                = new FileOutputStream("/tmp/quotes.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(this.quotes);
        out.close();
        fileOut.close();
    }

    /**
     * Deserialize quotes list
     *
     */
    private void deserialize() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileIn = new FileInputStream("/tmp/quotes.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        this.quotes = (ArrayList<String>) in.readObject();
        in.close();
        fileIn.close();

    }

    /**
     * Return a random quote from a specific category
     *
     * @return random quote
     */
    public String random() {
        int rand = (int) (Math.random() * this.quotes.size());
        String quote = this.quotes.get(rand);
        if (quote.length() > 150) {
            return random();
        }

        return quote;
    }

    /**
     * Load quotes from csv
     *
     */
    private void loadFromCsv() throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Quotes.csv"));
            String line;

            while ((line = br.readLine()) != null) {
                String temp;
                if (line.split(";")[2].contains("inspirational")) {
                    temp = line.split(";")[0] + " ~by " + line.split(";")[1];
                    this.quotes.add(temp);
                }

            }
            System.out.println(this.quotes.toString());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Quotes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
