
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//Ruben Dario Durango Gomez

public class CompaniaDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Compania p = new Compania();
    
    
    public List listar(){
        
        List<Compania> datos = new ArrayList<>();
        try{
            con = conectar.getConnection();
            ps = con.prepareStatement("select * from compania");
            rs = ps.executeQuery();
            while(rs.next()){
                Compania p = new Compania();
                p.setIdCompania(rs.getInt(1));
                p.setNombreCompania(rs.getString(2));
                p.setDireccion(rs.getString(3));
                datos.add(p);
            }
        }catch(Exception e){
        }
        return datos;
    }
    
    
    
    public int agregar(Compania per){
        int r=0;
        String sql = "insert into compania (idCompania, nombreCompania, direccion)values(?,?,?)";
        try{
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1,per.getIdCompania());
            ps.setString(2, per.getNombreCompania());
            ps.setString(3, per.getDireccion());
            r=ps.executeUpdate();
            if (r==1) {
                return 1;
            }else{
                return 0;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return r;
    }
    
    
    public int Actualizar (Compania per){
        int r=0;
        String sql ="update compania set nombreCompania=?,direccion=? where idCompania=? ";
        try{
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, per.getNombreCompania());
            ps.setString(2, per.getDireccion());
            ps.setInt(3,per.getIdCompania());
            r=ps.executeUpdate();
            if (r==1) {
                return 1;
            }else{
                return 0;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return r;
    }
    
    public int Delete(int idCompania){
        int r=0;
        String sql = "delete from compania where idCompania="+idCompania;
        try {
           con = conectar.getConnection();
           ps= con.prepareStatement (sql);
           r = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
        return r;
    }


}
