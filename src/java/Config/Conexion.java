/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author JAGS2412
 */
public class Conexion {
    Connection con;
    
    String user="root";
    String pass= "apolonir2412";
    String url="jdbc:mysql://localhost:3306/bd_registro";
    public Connection Conexion(){
        try{
           Class.forName("com.mysql.jdbc.Driver"); 
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_registro","root","apolonir2412");
            System.out.println("conectado");
           
        }catch (Exception e){
            System.out.println("no ");
        }
        return con;
    }
}
