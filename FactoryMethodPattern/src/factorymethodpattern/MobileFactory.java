/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethodpattern;

/**
 *
 * @author admin
 */
public class MobileFactory {
    public static Mobile getMobile(String CompanyName)  {
        
        switch (CompanyName) {
            case "realme":
               return new RealmePhone();
               
            case "iphone":
                return new Iphone();
                
            case "oneplus":
                return new OneplusPhone();
                
            default:
                throw new IllegalArgumentException("valid compny name " + CompanyName);
        }
    }
}






/**public static DatabaseConnection getDatabaseConnection(String dbType) {
    
         switch (dbType) {
            case "mysql":
                return new MySQLConnction();
            case "postgresql":
                return new PostgreSQLConnection();
            case "mongodb":
                return new MongoDBConnection();
            default:
                throw new IllegalArgumentException("Unsupported database type: " + dbType);
   **/   