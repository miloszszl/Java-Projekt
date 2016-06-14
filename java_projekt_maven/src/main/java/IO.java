
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Miłosz
 */
public class IO {
    
    String fileName = "scores.txt";
    BufferedReader br;
    int lineNumber=0;

    String read() throws IOException {
        String text = "";
        try {
            br = new BufferedReader(new FileReader(fileName));

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            text = sb.toString();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return text;
    }

    
    
    
    void write(String s1) throws IOException {
        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("scores2.txt"), "utf-8"));
            writer.write(s1);
        } catch (IOException ex) {
        } finally {
            writer.close();
        }

    }

    
}
