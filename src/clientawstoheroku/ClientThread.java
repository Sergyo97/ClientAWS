/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientawstoheroku;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author estudiante
 */
public class ClientThread extends Thread {

    private URL url;

    public ClientThread(URL url) {
        this.url = url;
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(url.openStream()))) {
                String inputLine = null;
                while ((inputLine = reader.readLine()) != null) {
                }
            } catch (IOException x) {
                System.err.println(x);
            }

        }
    }
}
