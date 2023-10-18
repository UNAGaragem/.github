/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author sudar
 */
public class Login {
    
    public String AtualizarCampoData(){
     
     String formatodDate = "";
     Date date = new Date();
     DateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm");
     formatodDate = formato.format(date);
     return formatodDate;
    
    }
}
