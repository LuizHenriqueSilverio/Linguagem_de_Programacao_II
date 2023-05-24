/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author luizh
 */
public class ConverteData extends Converter<Object, Object>{

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    @Override
    public Object convertForward(Object value) { // objeto para tela
        Calendar c = (Calendar) value;
        return sdf.format(c.getTime());
    }

    @Override
    public Object convertReverse(Object value) { // tela para o objeto
        String str = (String) value;
        Calendar c = Calendar.getInstance();
        try {
            c.setTime(sdf.parse(str));
            return c;
        }catch(Exception e) {
            return null;
        }
    }
    
}
