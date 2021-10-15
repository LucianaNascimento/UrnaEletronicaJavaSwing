package DAO;


import Conexao.Conexao;
import classesModelo.Candidato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class CandidatoDAO {
    private Connection con = null;
    private String sSql;
    private PreparedStatement pstmt;
     
     
public static Candidato consultaCandidatoPorNumero(int numero) {
    ResultSet rs;
    Candidato can;
    can = new Candidato();
    Connection con = null;
    String sSql;
    PreparedStatement pstmt;
    
    sSql = "SELECT * FROM candidato WHERE can_numero = ?";
    
    try{
                con = Conexao.getConexao();
         
                 pstmt = con.prepareStatement(sSql);
                 pstmt.setInt(1, numero);
                 rs = pstmt.executeQuery();
                 if (rs.next()) {
                     can.setNumero(numero);
                     can.setNome(rs.getString("can_nome"));
                     can.setVice(rs.getString("can_vice"));
                     can.setPartido(rs.getString("can_partido"));
                     can.setFoto(rs.getString("can_foto"));
                     can.setFotovice(rs.getString("can_fotovice"));
                     
                     
                 }
                 else{
                     can = null;
                 }
                 
                pstmt.close();
                rs.close();            
                con.close();
    }
    catch (SQLException erro){
        System.out.println("Erro ao consultar candidado");
    }
        return can;
    

}
   

      // ---------------------------------------------------------------------------------
      public List<Candidato> listarCandidatos() {
          List listadeCandidato = new ArrayList();
          ResultSet rs;
          Candidato can;
          sSql = "SELECT can_numero, can_nome, can_vice, can_partido, "
                  + "can_foto, can_fotovice, can_votos FROM candidato order by can_votos DESC";
          try {
              con = Conexao.getConexao();
              pstmt = con.prepareStatement(sSql);
              rs = pstmt.executeQuery();
              while (rs.next()) {
                  can = new Candidato();
                  can.setNumero(rs.getInt("can_numero"));
                  can.setNome(rs.getString("can_nome"));
                  can.setVice(rs.getString("can_vice"));
                  can.setPartido(rs.getString("can_partido"));
                  can.setFoto(rs.getString("can_foto"));
                  can.setFotovice(rs.getString("can_fotovice"));
                  can.setVotos(rs.getInt("can_votos"));
                  
                  listadeCandidato.add(can);                              
              }           
          } catch (SQLException erro) {
              listadeCandidato = null;
              
          }
          return listadeCandidato;
      }

    List<Candidato> listarCandidatos(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // ---------------------------------------------------------------------------------

    public void computarVoto(Candidato can){
        try{
            //1º abrir conexao
            //2º executar a instrucao SQL
            //3º setar parametros
            //4º executar a instrucao SQL
            //5º fechar conexao
            
            con = Conexao.getConexao();
            pstmt = con.prepareStatement("update candidato "
                    + "set can_votos = can_votos + 1 "
                    + "where can_numero = ? "
                    
                  );         
         
            
            pstmt.setInt(1, can.getNumero());   
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
                    
        }
        catch(SQLException erro){
            System.out.println("Erro ao gravar voto" + erro.getMessage());
        }
        
    }
    
    // ---------------------------------------------------------------------------------
    public void zerarVotos(Candidato can){
        try{
            //1º abrir conexao
            //2º executar a instrucao SQL
            //3º setar parametros
            //4º executar a instrucao SQL
            //5º fechar conexao
            
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(" UPDATE candidato SET can_votos = 0"
                    
                  );         
         
            
              
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
                    
        }
        catch(SQLException erro){
            System.out.println("Erro ao gravar voto" + erro.getMessage());
        }
        
    }
    
   



  
     
 }
    
    
    
