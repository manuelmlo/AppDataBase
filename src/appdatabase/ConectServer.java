
package appdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectServer {
    private String server="jdbc:mysql://localhost/";
    private String database="";
    private String client="root";
    private String password="";
    Connection conect=null;
    
    public ConectServer(){
        this.database="Test";
    }
    
    public ConectServer(String database){
        this.database= database;
    }
    public ConectServer(String server, String database, String client, String password){
       this.server=server;
       this.database= database;
       this.client=client;
       this.password=password;
    }
    public ConectServer(Connection connection){
        
    }
    
    public Connection getConect(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conect=DriverManager.getConnection(server+database,client,password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e.getMessage());
        }
        return conect;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConectar(Connection conectar) {
        this.conect = conectar;
    }
    public boolean isConect(){
        try {
            return conect.isValid(5);
        } catch (SQLException ex) {
            Logger.getLogger(ConectServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
