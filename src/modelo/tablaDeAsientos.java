/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arman
 */
public class tablaDeAsientos {
    
    
    public void crearTabla(){
    Object[][] tabladeAsientos = {       
            {"H", "H1", "H2", "H3", "H4", "H5", "H6", "H7", "H8", "H9", "H10","H11", "H12", "H13", "H14", "H15", "H16", "H17", "H18", "H19", "H20"},
            {"G", "G1", "G2", "G3", "G4", "G5", "G6", "G7", "G8", "G9", "G10","G11", "G12", "G13", "G14", "G15", "G16", "G17", "G18", "G19", "G20"},
            {"F", "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10","F11", "F12", "F13", "F14", "F15", "F16", "F17", "F18", "F19", "F20"},
            {"E",  "E1", "E2", "E3", "E4", "E5", "E6", "E7", "E8", "E9", "E10","E11", "E12", "E13", "E14", "E15", "E16", "E17", "E18", "E19", "E20"},
            {"D",  "D1", "D2", "D3", "D4", "D5", "D6", "D7", "D8", "D9", "D10","D11", "D12", "D13", "D14", "D15", "D16", "D17", "D18", "D19", "D20"},
            {"C", "C1", "C2", "C3", "C4", "C5", "C6", "C7", "C8", "C9", "C10","C11", "C12", "C13", "C14", "C15", "C16", "C17", "C18", "C19", "C20"},
            {"B", "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10","B11", "B12", "B13", "B14", "B15", "B16", "B17", "B18", "B19", "B20"},
            {"A", "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10","A11", "A12", "A13", "A14", "A15", "A16", "A17", "A18", "A19", "A20"}
};
    
    String[] encabezados = {
        "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"  
    };
    
    DefaultTableModel tablaAsientos = new DefaultTableModel(tabladeAsientos, encabezados);
    
    final JTable tabla = new JTable(tablaAsientos);
    
    
    }
}
