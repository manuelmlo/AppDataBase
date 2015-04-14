/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdatabase;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Manuel
 */
public class FileConnections {

    private String HEAD = "FILE OF CONECCTION \n";
    private File file = new File("connections.ctn");
    private ArrayList<Connection> conections = new ArrayList<>();
    BufferedReader bufferedReader;
    BufferedWriter bufferedWriter;

    public FileConnections() {
        if (file.exists() && file != null) {
            String tmp ;
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                tmp = bufferedReader.readLine();
                if (tmp != null) {
                    if (tmp == HEAD) {
                        bufferedReader.readLine();
                        while (tmp != null) {
                            String[] aux = tmp.split(";");
                            conections.add(new Connection(aux[0], aux[1], aux[2], aux[3], aux[4]));
                            bufferedReader.read();
                        }
                        bufferedReader.close();
                    } else {
                        bufferedWriter = new BufferedWriter(new FileWriter(file));
                        bufferedWriter.write(HEAD);
                    }

                } else {

                    bufferedReader.close();
                    bufferedWriter = new BufferedWriter(new FileWriter(file, true));
                    bufferedWriter.write(HEAD);
                }

            } catch (FileNotFoundException ex) {
                Logger.getLogger(FileConnections.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(FileConnections.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {

                bufferedWriter = new BufferedWriter(new FileWriter(file));

            } catch (IOException ex) {
                Logger.getLogger(FileConnections.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {

                    bufferedReader.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileConnections.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public Connection getConnection(int num) {

        return conections.get(num-1);

    }

    public void setConnection(Connection connection) {

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file,true));
            bufferedWriter.write(connection.getName() + ';' + connection.getServer()
                    + connection.getDatabase() + ';' + connection.getUsername() + ';' + connection.getPassword() + "\n");

        } catch (IOException ex) {
            Logger.getLogger(FileConnections.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            try {
                bufferedWriter.close();
                conections.add(connection);
            } catch (IOException ex) {
                Logger.getLogger(FileConnections.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void deleteConnection(int num){
        
        try {
            bufferedWriter= new BufferedWriter(new FileWriter(file));
            
            if(conections!=null){
                bufferedWriter.write(HEAD);
                conections.remove(num-1);
                Connection tmp;
                for (Connection conection : conections) {
                    tmp = conection;
                    bufferedWriter.write(tmp.getName() + ';' + tmp.getServer()
                            + tmp.getDatabase() + ';' + tmp.getUsername() + ';' + tmp.getPassword() + "\n");
                }
            }

        } catch (IOException ex) {
            Logger.getLogger(FileConnections.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                bufferedWriter.close();
                
            } catch (IOException ex) {
                Logger.getLogger(FileConnections.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    
    }
    public DefaultListModel getModel() {
        DefaultListModel model = new DefaultListModel();
        conections.stream().forEach((connection1) -> {
            model.addElement(connection1.getName());
        });
        return model;
    }
    
    
}
