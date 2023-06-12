/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luizh
 */
public class DAOFuncionario {
    
    DAOCidade objDAOCidade = new DAOCidade();
    
    public List<Funcionario> getLista() {
        String sql = "SELECT * FROM FUNCIONARIO";
        List<Funcionario> listaFuncionario = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                Funcionario objFuncionario = new Funcionario();
                
                java.sql.Date dt = rs.getDate("nascimento");
                Calendar c = Calendar.getInstance();
                c.setTime(dt);
                
                
                
                objFuncionario.setCodFuncionario(rs.getInt("codfuncionario"));
                objFuncionario.setNascimentoFuncionario(c);
                objFuncionario.setNomeFuncionario(rs.getString("nome"));
                objFuncionario.setObjCidade(objDAOCidade.localizar(rs.getInt("codcidade")));
                objFuncionario.setSalarioFuncionario(rs.getDouble("salario"));
                listaFuncionario.add(objFuncionario);
            }
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
        }
        return listaFuncionario;
        
    }
    
    public boolean incluir(Cidade obj) throws SQLException {
        String sql = "insert into cidade (nome,uf) values(?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeCidade());
            pst.setString(2, obj.getUfCidade());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade incluida");
                return true;
            }else {
                JOptionPane.showMessageDialog(null, "Cidade não incluida");
                return false;
            } 
        }catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
            }
            return false;
    }
    
    public boolean alterar(Cidade obj) throws SQLException {
        String sql = "update cidade set nome=?, uf=? where codCidade=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeCidade());
            pst.setString(2, obj.getUfCidade());
            pst.setInt(3, obj.getCodCidade());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade alterada!");
                return true;
            }else {
                JOptionPane.showMessageDialog(null, "Cidade não alterada!");
                return false;
            } 
        }catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
            }
            return false;
    }
    
    public boolean remover(Cidade obj) throws SQLException {
        String sql = "delete from cidade where codCidade=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodCidade());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cidade excluida!");
                return true;
            }else {
                JOptionPane.showMessageDialog(null, "Cidade não excluida!");
                return false;
            } 
        }catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
            }
            return false;
    }
    
    public boolean salvar(Cidade obj) throws SQLException {
        if (obj.getCodCidade()== null) {
            return incluir(obj);
        } else {
            return alterar(obj);
        }
    }
}
