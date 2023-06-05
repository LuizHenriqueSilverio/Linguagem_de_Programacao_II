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
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luizh
 */

//Data Acess Object, um padrão de desenvolvimento
public class DAOCidade { 
    
    public List<Cidade> getLista() {
        String sql = "SELECT * FROM CIDADE";
        List<Cidade> listaCidade = new ArrayList<>();
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                Cidade objCidade = new Cidade();
                objCidade.setCodCidade(rs.getInt("codCidade"));
                objCidade.setNomeCidade(rs.getString("nome"));
                objCidade.setUfCidade(rs.getString("uf"));
                listaCidade.add(objCidade);
            }
        }catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro de SQL: " + ex.getMessage());
        }
        return listaCidade;
        
    }
    
    public boolean salvar(Cidade obj) {
        if(obj.getCodCidade() ==  null){
            Integer codigo = Dados.listaCidade.size() + 1;
            obj.setCodCidade(codigo);
            Dados.listaCidade.add(obj);
        }
        return true;
    }
    
    public boolean remover(Cidade obj) {
        Dados.listaCidade.remove(obj);
        return true;
    }
}
