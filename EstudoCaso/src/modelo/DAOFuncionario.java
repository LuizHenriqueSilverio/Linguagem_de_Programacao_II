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
    
    public boolean incluir(Funcionario obj) throws SQLException {
        String sql = "insert into funcionario (nome, salario, nascimento, cidade) values(?,?,?,?)";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeFuncionario());
            pst.setDouble(2, obj.getSalarioFuncionario());
            pst.setDate(3, new java.sql.Date(obj.getNascimentoFuncionario().getTimeInMillis()));
            pst.setInt(4, obj.getObjCidade().getCodCidade());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario incluido!");
                return true;
            }else {
                JOptionPane.showMessageDialog(null, "Funcionario não incluido!");
                return false;
            } 
        }catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
            }
            return false;
    }
    
    public boolean alterar(Funcionario obj) throws SQLException {
        String sql = "update funcionario set nome=?, salario=?, nascimento=?, cidade_codcidade=? where codfuncionario=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getNomeFuncionario());
            pst.setDouble(2, obj.getSalarioFuncionario());
            pst.setDate(3, new java.sql.Date(obj.getNascimentoFuncionario().getTimeInMillis()));
            pst.setInt(4, obj.getObjCidade().getCodCidade());
            pst.setInt(5, obj.getCodFuncionario());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario alterado!");
                return true;
            }else {
                JOptionPane.showMessageDialog(null, "Funcionario não alterado!");
                return false;
            } 
        }catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
            }
            return false;
    }
    
    public boolean remover(Funcionario obj) throws SQLException {
        String sql = "delete from funcionario where codfuncionario=?";
        try {
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, obj.getCodFuncionario());
            if (pst.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Funcionario excluido!");
                return true;
            }else {
                JOptionPane.showMessageDialog(null, "Funcionario não excluido!");
                return false;
            } 
        }catch(SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro de SQL: " + e.getMessage());
            }
            return false;
    }
    
    public boolean salvar(Funcionario obj) throws SQLException {
        if (obj.getCodFuncionario()== null) {
            return incluir(obj);
        } else {
            return alterar(obj);
        }
    }
}
