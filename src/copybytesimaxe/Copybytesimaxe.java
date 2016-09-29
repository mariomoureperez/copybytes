package copybytesimaxe;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 *
 * @author oracle
 */
public class Copybytesimaxe {

    public static void main(String[] args) {
        File destino= new File("foto2.jpeg");
        try {
            destino.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            //Abriendo flujos con Buffer
            BufferedInputStream foto1= new BufferedInputStream(new FileInputStream("foto.jpeg"));
            BufferedOutputStream foto2= new BufferedOutputStream(new FileOutputStream(destino,true));
            int b;
            
            try {
                while((b=foto1.read())!=-1)
                    foto2.write(b);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
