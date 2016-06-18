
import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.util.ArrayList;
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

    String fileName ;
    BufferedReader br;
    int lineNumber = 0;
    ArrayList<String> lines = new ArrayList<String>();

    ArrayList<String> read(String addres) throws IOException {
        
        fileName = addres;
        
        //InputStreamReader isr=new InputStreamReader(getClass().getResourceAsStream(fileName));
        //BufferedReader br=new BufferedReader(isr);
        
        
        
        
        //String text = "";
        try {
            
            br = new BufferedReader(new FileReader(fileName));

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {

                lines.add(line);
                //sb.append(line);
                // sb.append(System.lineSeparator());
                line = br.readLine();
            }

            //text = sb.toString();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Files.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return lines;
    }

    void write(String name, int score) throws IOException {

        
        ArrayList<String> toWrite = new ArrayList<String>(read("scores.txt"));
        
        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("scores.txt"), "utf-8"));
            toWrite.add(name + " " + score);
            //toWrite.add(String.format("%1$10s%2$20s",name,score));
            ///////////////////////////////////////////////
            for (int i = 0; i < toWrite.size(); i++) {
                writer.write(toWrite.get(i)+"\n");
            }
        } catch (IOException ex) {
        } finally {
            writer.close();
        }
        

    }
    public ArrayList<String> readPasswords()
    {
        ArrayList<String> my = null;
        try {
            my=new ArrayList<String>(read("passwords.txt"));
        } catch (IOException ex) {
            Logger.getLogger(IO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int i=0;i<my.size();i++)
        {
            my.set(i,my.get(i).replaceAll(" ", "") );
            //System.out.println(my.get(i));
        }
        
        return my;
        
        
    }
    
}

