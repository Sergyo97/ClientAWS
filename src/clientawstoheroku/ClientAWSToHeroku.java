/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientawstoheroku;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class ClientAWSToHeroku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL(args[0]);
        ArrayList<ClientThread> t = new ArrayList<ClientThread>();
        for (int i = 0; i < 10; i++) {
            ClientThread temp = new ClientThread(url);
            t.add(temp);
            temp.start();
        }
    }
    
}
