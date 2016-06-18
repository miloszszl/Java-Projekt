
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Miłosz
 */
public class HighscoresData {

    public ArrayList<String> s;
    public String[][] tab;

    public void readData() {
        int size = s.size();
        tab = new String[size][2];
        for (int i = 0; i < size; i++) {
            String[] parts = s.get(i).split(" ", 2);
            //System.out.println(parts[0]);
            //System.out.println(parts[1]);
            tab[i][0] = parts[0];
            tab[i][1] = parts[1];
        }

    }

    public void sortData() {
        
       Arrays.sort(tab, new Comparator<String[]>() {
            public int compare(String[] a, String[] b) {
                if(Integer.parseInt(a[1])>Integer.parseInt(b[1]))
                {
                    return -1;
                }
                else
                {
                    return 1;
                }
                
                //return a[1]<b[1];
                //a[1].compareTo(b[1]);
            }
        }) ;
       
       
       s.clear();
       for(int i=0;i<tab.length;i++)
       {
           s.add(String.format("%1$10s%2$20s",tab[i][0],tab[i][1]));
           //System.out.println(a.get(i));
       }
        
    }
        
    }
