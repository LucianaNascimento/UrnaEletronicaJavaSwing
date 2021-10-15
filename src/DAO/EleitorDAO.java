package DAO;

import Conexao.Conexao;
import classesModelo.Candidato;
import classesModelo.Eleitor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EleitorDAO {
    
    String sSql;
    Connection con;
    PreparedStatement pstmt;
    
    public void adicionarEleitor(Eleitor ele){
        try{          
            con = Conexao.getConexao();
            pstmt = con.prepareStatement("INSERT INTO eleitor( ele_titulo, ele_rg, "
                    + "ele_nome, ele_dataNasc, ele_zona, ele_secao, "
               + " ele_votou, ele_foto, ele_cidade, ele_estado) "
               + " VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            
            pstmt.setString(1, ele.getTitulo());
            pstmt.setString(2, ele.getRg());
            pstmt.setString(3, ele.getNome());
            pstmt.setString(4, ele.getDataNasc());
            pstmt.setString(5, ele.getZona());
            pstmt.setString(6, ele.getSecao());
            pstmt.setString(7, ele.getVotou());
            pstmt.setString(8, ele.getFoto());
            pstmt.setString(9, ele.getCidade());
            pstmt.setString(10,ele.getEstado());
             
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
                    
        }
        catch(SQLException erro){
            System.out.println("Erro ao gravar eleitor" + erro.getMessage());
        }
        
    }
    
    // ---------------------------------------------------------------------------------
       
      public Eleitor consultaEleitorPorRG(String rg) {
           ResultSet rs;
           Eleitor ele;
           ele = new Eleitor();
           con = null;
  
           sSql = "SELECT ele_rg, ele_titulo, ele_nome, ele_dataNasc, ele_zona, ele_secao,"
               + " ele_votou, ele_foto, ele_cidade, ele_estado FROM eleitor "
               + "WHERE ele_rg = ? "; 
             //System.out.println(sSql);
            try {           
                 con = Conexao.getConexao();
                 pstmt = con.prepareStatement(sSql);
                 pstmt.setString(1, rg);
                 rs = pstmt.executeQuery();
                 if (rs.next()) {
                   // a = new Aluno();
                    ele.setRg(rs.getString("ele_rg"));
                    ele.setTitulo(rs.getString("ele_titulo"));
                    ele.setNome(rs.getString("ele_nome"));
                    ele.setDataNasc(rs.getString("ele_dataNasc"));
                    ele.setZona(rs.getString("ele_zona"));
                    ele.setSecao(rs.getString("ele_secao"));
                    ele.setVotou(rs.getString("ele_votou"));
                    ele.setFoto(rs.getString("ele_foto"));
                    ele.setCidade(rs.getString("ele_cidade"));
                    ele.setEstado(rs.getString("ele_estado"));

                    
                 }
               else {
                  
                  ele = null; 
               }  
               pstmt.close();
               rs.close();            
               con.close();
           } 
           catch (SQLException erro) {
               System.out.println("Erro ao consultar eleitor - " + erro.getMessage());
           }
           return ele;
       }
      
      // ---------------------------------------------------------------------------------
       
      public Eleitor consultaEleitorPorTitulo(String rg) {
           ResultSet rs;
           Eleitor ele;
           ele = new Eleitor();
           con = null;
  
           sSql = "SELECT ele_rg, ele_titulo, ele_nome, ele_dataNasc, ele_zona, ele_secao,"
               + " ele_votou, ele_foto, ele_cidade, ele_estado FROM eleitor "
               + "WHERE ele_titulo = ? "; 
             //System.out.println(sSql);
            try {           
                 con = Conexao.getConexao();
                 pstmt = con.prepareStatement(sSql);
                 pstmt.setString(1, rg);
                 rs = pstmt.executeQuery();
                 if (rs.next()) {
                   // a = new Aluno();
                    ele.setRg(rs.getString("ele_rg"));
                    ele.setTitulo(rs.getString("ele_titulo"));
                    ele.setNome(rs.getString("ele_nome"));
                    ele.setDataNasc(rs.getString("ele_dataNasc"));
                    ele.setZona(rs.getString("ele_zona"));
                    ele.setSecao(rs.getString("ele_secao"));
                    ele.setVotou(rs.getString("ele_votou"));
                    ele.setFoto(rs.getString("ele_foto"));
                    ele.setCidade(rs.getString("ele_cidade"));
                    ele.setEstado(rs.getString("ele_estado"));

                    
                 }
               else {
                  
                  ele = null; 
               }  
               pstmt.close();
               rs.close();            
               con.close();
           } 
           catch (SQLException erro) {
               System.out.println("Erro ao consultar eleitor - " + erro.getMessage());
           }
           return ele;
           
           
       }
   // ---------------------------------------------------------------------------------
      public List<Eleitor> listarEleitor() {
          List listadeEleitor = new ArrayList();
          ResultSet rs;
          Eleitor ele;
          sSql = "SELECT ele_rg, ele_titulo, ele_nome, ele_dataNasc, ele_zona, ele_secao,"
               + " ele_votou, ele_foto, ele_cidade, ele_estado FROM eleitor ";
          try {
              con = Conexao.getConexao();
              pstmt = con.prepareStatement(sSql);
              rs = pstmt.executeQuery();
              while (rs.next()) {
                  ele = new Eleitor();
                  ele.setTitulo(rs.getString("ele_titulo"));
                  ele.setRg(rs.getString("ele_rg"));
                  ele.setNome(rs.getString("ele_nome"));
                  ele.setDataNasc(rs.getString("ele_dataNasc"));
                  ele.setZona(rs.getString("ele_zona"));
                  ele.setSecao(rs.getString("ele_secao"));
                  ele.setVotou(rs.getString("ele_votou"));
                  ele.setFoto(rs.getString("ele_foto"));
                  ele.setCidade(rs.getString("ele_cidade"));
                  ele.setEstado(rs.getString("ele_estado"));
                  
                  listadeEleitor.add(ele);                              
              }           
          } catch (SQLException erro) {
              listadeEleitor = null;
              
          }
          return listadeEleitor;
      }
      
      

    
   // ---------------------------------------------------------------------------------
      public void computarVotoEleitor(Eleitor ele){
        try{
            //1º abrir conexao
            //2º executar a instrucao SQL
            //3º setar parametros
            //4º executar a instrucao SQL
            //5º fechar conexao
            
            con = Conexao.getConexao();
            pstmt = con.prepareStatement("update eleitor set "
                    + "ele_votou = ? where ele_titulo = ?"
                  );         
 
            pstmt.setString(1, "S");
            pstmt.setString(2, ele.getTitulo());
                    
                       
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
                    
        }
        catch(SQLException erro){
            System.out.println("Erro ao gravar voto" + erro.getMessage());
        }
        
    }

     // ---------------------------------------------------------------------------------
      public void zerarVotoEleitor(Eleitor ele){
        try{
            //1º abrir conexao
            //2º executar a instrucao SQL
            //3º setar parametros
            //4º executar a instrucao SQL
            //5º fechar conexao
            
            con = Conexao.getConexao();
            pstmt = con.prepareStatement("UPDATE eleitor SET ele_votou = ?"
                  );         
 
            pstmt.setString(1, "N");
                                
                       
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
                    
        }
        catch(SQLException erro){
            System.out.println("Erro ao gravar voto" + erro.getMessage());
        }
        
    }


   
      
      
}
