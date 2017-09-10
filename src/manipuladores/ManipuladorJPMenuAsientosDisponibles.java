/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipuladores;

import administradores.AdministrarAsientos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import vista.vistaMenuPrincipal;

/**
 *
 * @author b1796
 */
public class ManipuladorJPMenuAsientosDisponibles implements ActionListener {

    private final vistaMenuPrincipal view;
    private final int idFuncion;
    private JLabel jl;

    public ManipuladorJPMenuAsientosDisponibles(vistaMenuPrincipal view, int idFuncion) throws SQLException {
        this.idFuncion = idFuncion;
        this.view = view;
        initButtons();
        colocandoImagenes();
        agregandoEventos();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String comando = ae.getActionCommand();
        try {
            switch (comando) {
                case "REGRESAR_ASIENTOS_DISPONIBLES":
                    new AdministrarAsientos(this.idFuncion).borrarAsientoBD("Comprado", false);
                    this.view.getjPAsientosDisponibles().setVisible(false);
                    this.view.getjPFunciones().setVisible(true);
                    this.view.getjBRegresar().setVisible(true);
                    break;
                case "COMPRAR_ASIENTO":
                    int reply = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea comprar estos asientos?", "Comprar Asiento", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (reply == JOptionPane.YES_OPTION) {
                        new AdministrarAsientos(this.idFuncion).actualizarAsientoBD("Comprado", true);
                        JOptionPane.showMessageDialog(null, "Se ha guardado correctamente", "", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManipuladorJPMenuAsientosDisponibles.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initButtons() {
        this.view.getjBRegresarAsientosDisponibles().addActionListener(this);
        this.view.getjBRegresarAsientosDisponibles().setActionCommand("REGRESAR_ASIENTOS_DISPONIBLES");

        this.view.getjBComprarAsiento().addActionListener(this);
        this.view.getjBComprarAsiento().setActionCommand("COMPRAR_ASIENTO");
    }

    private MouseAdapter asientoAdapter(JLabel jl, String coordenada) {
        return new AdministrarAsientos(this.idFuncion, jl, coordenada);
    }

    private void colocandoImagenes() throws SQLException {
        AdministrarAsientos adminAsientos = new AdministrarAsientos(this.idFuncion);
        //Imagenes de la fila A
        this.view.getA1().setIcon(adminAsientos.colocarImagen("A1"));
        this.view.getA2().setIcon(adminAsientos.colocarImagen("A2"));
        this.view.getA3().setIcon(adminAsientos.colocarImagen("A3"));
        this.view.getA4().setIcon(adminAsientos.colocarImagen("A4"));
        this.view.getA5().setIcon(adminAsientos.colocarImagen("A5"));
        this.view.getA6().setIcon(adminAsientos.colocarImagen("A6"));
        this.view.getA7().setIcon(adminAsientos.colocarImagen("A7"));
        this.view.getA8().setIcon(adminAsientos.colocarImagen("A8"));
        this.view.getA9().setIcon(adminAsientos.colocarImagen("A9"));
        this.view.getA10().setIcon(adminAsientos.colocarImagen("A10"));
        this.view.getA11().setIcon(adminAsientos.colocarImagen("A11"));
        this.view.getA12().setIcon(adminAsientos.colocarImagen("A12"));
        this.view.getA13().setIcon(adminAsientos.colocarImagen("A13"));
        this.view.getA14().setIcon(adminAsientos.colocarImagen("A14"));
        this.view.getA15().setIcon(adminAsientos.colocarImagen("A15"));
        this.view.getA16().setIcon(adminAsientos.colocarImagen("A16"));
        this.view.getA17().setIcon(adminAsientos.colocarImagen("A17"));
        this.view.getA18().setIcon(adminAsientos.colocarImagen("A18"));
        this.view.getA19().setIcon(adminAsientos.colocarImagen("A19"));
        this.view.getA20().setIcon(adminAsientos.colocarImagen("A20"));

        //Imagenes de la fila B
        this.view.getB1().setIcon(adminAsientos.colocarImagen("B1"));
        this.view.getB2().setIcon(adminAsientos.colocarImagen("B2"));
        this.view.getB3().setIcon(adminAsientos.colocarImagen("B3"));
        this.view.getB4().setIcon(adminAsientos.colocarImagen("B4"));
        this.view.getB5().setIcon(adminAsientos.colocarImagen("B5"));
        this.view.getB6().setIcon(adminAsientos.colocarImagen("B6"));
        this.view.getB7().setIcon(adminAsientos.colocarImagen("B7"));
        this.view.getB8().setIcon(adminAsientos.colocarImagen("B8"));
        this.view.getB9().setIcon(adminAsientos.colocarImagen("B9"));
        this.view.getB10().setIcon(adminAsientos.colocarImagen("B10"));
        this.view.getB11().setIcon(adminAsientos.colocarImagen("B11"));
        this.view.getB12().setIcon(adminAsientos.colocarImagen("B12"));
        this.view.getB13().setIcon(adminAsientos.colocarImagen("B13"));
        this.view.getB14().setIcon(adminAsientos.colocarImagen("B14"));
        this.view.getB15().setIcon(adminAsientos.colocarImagen("B15"));
        this.view.getB16().setIcon(adminAsientos.colocarImagen("B16"));
        this.view.getB17().setIcon(adminAsientos.colocarImagen("B17"));
        this.view.getB18().setIcon(adminAsientos.colocarImagen("B18"));
        this.view.getB19().setIcon(adminAsientos.colocarImagen("B19"));
        this.view.getB20().setIcon(adminAsientos.colocarImagen("B20"));

        //Imagenes de la fila C
        this.view.getC1().setIcon(adminAsientos.colocarImagen("C1"));
        this.view.getC2().setIcon(adminAsientos.colocarImagen("C2"));
        this.view.getC3().setIcon(adminAsientos.colocarImagen("C3"));
        this.view.getC4().setIcon(adminAsientos.colocarImagen("C4"));
        this.view.getC5().setIcon(adminAsientos.colocarImagen("C5"));
        this.view.getC6().setIcon(adminAsientos.colocarImagen("C6"));
        this.view.getC7().setIcon(adminAsientos.colocarImagen("C7"));
        this.view.getC8().setIcon(adminAsientos.colocarImagen("C8"));
        this.view.getC9().setIcon(adminAsientos.colocarImagen("C9"));
        this.view.getC10().setIcon(adminAsientos.colocarImagen("C10"));
        this.view.getC11().setIcon(adminAsientos.colocarImagen("C11"));
        this.view.getC12().setIcon(adminAsientos.colocarImagen("C12"));
        this.view.getC13().setIcon(adminAsientos.colocarImagen("C13"));
        this.view.getC14().setIcon(adminAsientos.colocarImagen("C14"));
        this.view.getC15().setIcon(adminAsientos.colocarImagen("C15"));
        this.view.getC16().setIcon(adminAsientos.colocarImagen("C16"));
        this.view.getC17().setIcon(adminAsientos.colocarImagen("C17"));
        this.view.getC18().setIcon(adminAsientos.colocarImagen("C18"));
        this.view.getC19().setIcon(adminAsientos.colocarImagen("C19"));
        this.view.getC20().setIcon(adminAsientos.colocarImagen("C20"));

        //Imagenes de la fila D
        this.view.getD1().setIcon(adminAsientos.colocarImagen("D1"));
        this.view.getD2().setIcon(adminAsientos.colocarImagen("D2"));
        this.view.getD3().setIcon(adminAsientos.colocarImagen("D3"));
        this.view.getD4().setIcon(adminAsientos.colocarImagen("D4"));
        this.view.getD5().setIcon(adminAsientos.colocarImagen("D5"));
        this.view.getD6().setIcon(adminAsientos.colocarImagen("D6"));
        this.view.getD7().setIcon(adminAsientos.colocarImagen("D7"));
        this.view.getD8().setIcon(adminAsientos.colocarImagen("D8"));
        this.view.getD9().setIcon(adminAsientos.colocarImagen("D9"));
        this.view.getD10().setIcon(adminAsientos.colocarImagen("D10"));
        this.view.getD11().setIcon(adminAsientos.colocarImagen("D11"));
        this.view.getD12().setIcon(adminAsientos.colocarImagen("D12"));
        this.view.getD13().setIcon(adminAsientos.colocarImagen("D13"));
        this.view.getD14().setIcon(adminAsientos.colocarImagen("D14"));
        this.view.getD15().setIcon(adminAsientos.colocarImagen("D15"));
        this.view.getD16().setIcon(adminAsientos.colocarImagen("D16"));
        this.view.getD17().setIcon(adminAsientos.colocarImagen("D17"));
        this.view.getD18().setIcon(adminAsientos.colocarImagen("D18"));
        this.view.getD19().setIcon(adminAsientos.colocarImagen("D19"));
        this.view.getD20().setIcon(adminAsientos.colocarImagen("D20"));

        //Imagenes de la fila E
        this.view.getE1().setIcon(adminAsientos.colocarImagen("E1"));
        this.view.getE2().setIcon(adminAsientos.colocarImagen("E2"));
        this.view.getE3().setIcon(adminAsientos.colocarImagen("E3"));
        this.view.getE4().setIcon(adminAsientos.colocarImagen("E4"));
        this.view.getE5().setIcon(adminAsientos.colocarImagen("E5"));
        this.view.getE6().setIcon(adminAsientos.colocarImagen("E6"));
        this.view.getE7().setIcon(adminAsientos.colocarImagen("E7"));
        this.view.getE8().setIcon(adminAsientos.colocarImagen("E8"));
        this.view.getE9().setIcon(adminAsientos.colocarImagen("E9"));
        this.view.getE10().setIcon(adminAsientos.colocarImagen("E10"));
        this.view.getE11().setIcon(adminAsientos.colocarImagen("E11"));
        this.view.getE12().setIcon(adminAsientos.colocarImagen("E12"));
        this.view.getE13().setIcon(adminAsientos.colocarImagen("E13"));
        this.view.getE14().setIcon(adminAsientos.colocarImagen("E14"));
        this.view.getE15().setIcon(adminAsientos.colocarImagen("E15"));
        this.view.getE16().setIcon(adminAsientos.colocarImagen("E16"));
        this.view.getE17().setIcon(adminAsientos.colocarImagen("E17"));
        this.view.getE18().setIcon(adminAsientos.colocarImagen("E18"));
        this.view.getE19().setIcon(adminAsientos.colocarImagen("E19"));
        this.view.getE20().setIcon(adminAsientos.colocarImagen("E20"));

        //Imagenes de la fila F
        this.view.getF1().setIcon(adminAsientos.colocarImagen("F1"));
        this.view.getF2().setIcon(adminAsientos.colocarImagen("F2"));
        this.view.getF3().setIcon(adminAsientos.colocarImagen("F3"));
        this.view.getF4().setIcon(adminAsientos.colocarImagen("F4"));
        this.view.getF5().setIcon(adminAsientos.colocarImagen("F5"));
        this.view.getF6().setIcon(adminAsientos.colocarImagen("F6"));
        this.view.getF7().setIcon(adminAsientos.colocarImagen("F7"));
        this.view.getF8().setIcon(adminAsientos.colocarImagen("F8"));
        this.view.getF9().setIcon(adminAsientos.colocarImagen("F9"));
        this.view.getF10().setIcon(adminAsientos.colocarImagen("F10"));
        this.view.getF11().setIcon(adminAsientos.colocarImagen("F11"));
        this.view.getF12().setIcon(adminAsientos.colocarImagen("F12"));
        this.view.getF13().setIcon(adminAsientos.colocarImagen("F13"));
        this.view.getF14().setIcon(adminAsientos.colocarImagen("F14"));
        this.view.getF15().setIcon(adminAsientos.colocarImagen("F15"));
        this.view.getF16().setIcon(adminAsientos.colocarImagen("F16"));
        this.view.getF17().setIcon(adminAsientos.colocarImagen("F17"));
        this.view.getF18().setIcon(adminAsientos.colocarImagen("F18"));
        this.view.getF19().setIcon(adminAsientos.colocarImagen("F19"));
        this.view.getF20().setIcon(adminAsientos.colocarImagen("F20"));

        //Imagenes de la fila G
        this.view.getG1().setIcon(adminAsientos.colocarImagen("G1"));
        this.view.getG2().setIcon(adminAsientos.colocarImagen("G2"));
        this.view.getG3().setIcon(adminAsientos.colocarImagen("G3"));
        this.view.getG4().setIcon(adminAsientos.colocarImagen("G4"));
        this.view.getG5().setIcon(adminAsientos.colocarImagen("G5"));
        this.view.getG6().setIcon(adminAsientos.colocarImagen("G6"));
        this.view.getG7().setIcon(adminAsientos.colocarImagen("G7"));
        this.view.getG8().setIcon(adminAsientos.colocarImagen("G8"));
        this.view.getG9().setIcon(adminAsientos.colocarImagen("G9"));
        this.view.getG10().setIcon(adminAsientos.colocarImagen("G10"));
        this.view.getG11().setIcon(adminAsientos.colocarImagen("G11"));
        this.view.getG12().setIcon(adminAsientos.colocarImagen("G12"));
        this.view.getG13().setIcon(adminAsientos.colocarImagen("G13"));
        this.view.getG14().setIcon(adminAsientos.colocarImagen("G14"));
        this.view.getG15().setIcon(adminAsientos.colocarImagen("G15"));
        this.view.getG16().setIcon(adminAsientos.colocarImagen("G16"));
        this.view.getG17().setIcon(adminAsientos.colocarImagen("G17"));
        this.view.getG18().setIcon(adminAsientos.colocarImagen("G18"));
        this.view.getG19().setIcon(adminAsientos.colocarImagen("G19"));
        this.view.getG20().setIcon(adminAsientos.colocarImagen("G20"));

        //Imagenes de la fila H
        this.view.getH1().setIcon(adminAsientos.colocarImagen("H1"));
        this.view.getH2().setIcon(adminAsientos.colocarImagen("H2"));
        this.view.getH3().setIcon(adminAsientos.colocarImagen("H3"));
        this.view.getH4().setIcon(adminAsientos.colocarImagen("H4"));
        this.view.getH5().setIcon(adminAsientos.colocarImagen("H5"));
        this.view.getH6().setIcon(adminAsientos.colocarImagen("H6"));
        this.view.getH7().setIcon(adminAsientos.colocarImagen("H7"));
        this.view.getH8().setIcon(adminAsientos.colocarImagen("H8"));
        this.view.getH9().setIcon(adminAsientos.colocarImagen("H9"));
        this.view.getH10().setIcon(adminAsientos.colocarImagen("H10"));
        this.view.getH11().setIcon(adminAsientos.colocarImagen("H11"));
        this.view.getH12().setIcon(adminAsientos.colocarImagen("H12"));
        this.view.getH13().setIcon(adminAsientos.colocarImagen("H13"));
        this.view.getH14().setIcon(adminAsientos.colocarImagen("H14"));
        this.view.getH15().setIcon(adminAsientos.colocarImagen("H15"));
        this.view.getH16().setIcon(adminAsientos.colocarImagen("H16"));
        this.view.getH17().setIcon(adminAsientos.colocarImagen("H17"));
        this.view.getH18().setIcon(adminAsientos.colocarImagen("H18"));
        this.view.getH19().setIcon(adminAsientos.colocarImagen("H19"));
        this.view.getH20().setIcon(adminAsientos.colocarImagen("H20"));
    }

    private void agregandoEventos() {
        //Butacas Fila A
        this.jl = this.view.getA1();
        this.view.getA1().addMouseListener(asientoAdapter(jl, "A1"));
        this.jl = this.view.getA2();
        this.view.getA2().addMouseListener(asientoAdapter(jl, "A2"));
        this.jl = this.view.getA3();
        this.view.getA3().addMouseListener(asientoAdapter(jl, "A3"));
        this.jl = this.view.getA4();
        this.view.getA4().addMouseListener(asientoAdapter(jl, "A4"));
        this.jl = this.view.getA5();
        this.view.getA5().addMouseListener(asientoAdapter(jl, "A5"));
        this.jl = this.view.getA6();
        this.view.getA6().addMouseListener(asientoAdapter(jl, "A6"));
        this.jl = this.view.getA7();
        this.view.getA7().addMouseListener(asientoAdapter(jl, "A7"));
        this.jl = this.view.getA8();
        this.view.getA8().addMouseListener(asientoAdapter(jl, "A8"));
        this.jl = this.view.getA9();
        this.view.getA9().addMouseListener(asientoAdapter(jl, "A9"));
        this.jl = this.view.getA10();
        this.view.getA10().addMouseListener(asientoAdapter(jl, "A10"));
        this.jl = this.view.getA11();
        this.view.getA11().addMouseListener(asientoAdapter(jl, "A11"));
        this.jl = this.view.getA12();
        this.view.getA12().addMouseListener(asientoAdapter(jl, "A12"));
        this.jl = this.view.getA13();
        this.view.getA13().addMouseListener(asientoAdapter(jl, "A13"));
        this.jl = this.view.getA14();
        this.view.getA14().addMouseListener(asientoAdapter(jl, "A14"));
        this.jl = this.view.getA15();
        this.view.getA15().addMouseListener(asientoAdapter(jl, "A15"));
        this.jl = this.view.getA16();
        this.view.getA16().addMouseListener(asientoAdapter(jl, "A16"));
        this.jl = this.view.getA17();
        this.view.getA17().addMouseListener(asientoAdapter(jl, "A17"));
        this.jl = this.view.getA18();
        this.view.getA18().addMouseListener(asientoAdapter(jl, "A18"));
        this.jl = this.view.getA19();
        this.view.getA19().addMouseListener(asientoAdapter(jl, "A19"));
        this.jl = this.view.getA20();
        this.view.getA20().addMouseListener(asientoAdapter(jl, "A20"));

        //Butacas Fila B
        this.jl = this.view.getB1();
        this.view.getB1().addMouseListener(asientoAdapter(jl, "B1"));
        this.jl = this.view.getB2();
        this.view.getB2().addMouseListener(asientoAdapter(jl, "B2"));
        this.jl = this.view.getB3();
        this.view.getB3().addMouseListener(asientoAdapter(jl, "B3"));
        this.jl = this.view.getB4();
        this.view.getB4().addMouseListener(asientoAdapter(jl, "B4"));
        this.jl = this.view.getB5();
        this.view.getB5().addMouseListener(asientoAdapter(jl, "B5"));
        this.jl = this.view.getB6();
        this.view.getB6().addMouseListener(asientoAdapter(jl, "B6"));
        this.jl = this.view.getB7();
        this.view.getB7().addMouseListener(asientoAdapter(jl, "B7"));
        this.jl = this.view.getB8();
        this.view.getB8().addMouseListener(asientoAdapter(jl, "B8"));
        this.jl = this.view.getB9();
        this.view.getB9().addMouseListener(asientoAdapter(jl, "B9"));
        this.jl = this.view.getB10();
        this.view.getB10().addMouseListener(asientoAdapter(jl, "B10"));
        this.jl = this.view.getB11();
        this.view.getB11().addMouseListener(asientoAdapter(jl, "B11"));
        this.jl = this.view.getB12();
        this.view.getB12().addMouseListener(asientoAdapter(jl, "B12"));
        this.jl = this.view.getB13();
        this.view.getB13().addMouseListener(asientoAdapter(jl, "B13"));
        this.jl = this.view.getB14();
        this.view.getB14().addMouseListener(asientoAdapter(jl, "B14"));
        this.jl = this.view.getB15();
        this.view.getB15().addMouseListener(asientoAdapter(jl, "B15"));
        this.jl = this.view.getB16();
        this.view.getB16().addMouseListener(asientoAdapter(jl, "B16"));
        this.jl = this.view.getB17();
        this.view.getB17().addMouseListener(asientoAdapter(jl, "B17"));
        this.jl = this.view.getB18();
        this.view.getB18().addMouseListener(asientoAdapter(jl, "B18"));
        this.jl = this.view.getB19();
        this.view.getB19().addMouseListener(asientoAdapter(jl, "B19"));
        this.jl = this.view.getB20();
        this.view.getB20().addMouseListener(asientoAdapter(jl, "B20"));

        //Butacas Fila C
        this.jl = this.view.getC1();
        this.view.getC1().addMouseListener(asientoAdapter(jl, "C1"));
        this.jl = this.view.getC2();
        this.view.getC2().addMouseListener(asientoAdapter(jl, "C2"));
        this.jl = this.view.getC3();
        this.view.getC3().addMouseListener(asientoAdapter(jl, "C3"));
        this.jl = this.view.getC4();
        this.view.getC4().addMouseListener(asientoAdapter(jl, "C4"));
        this.jl = this.view.getC5();
        this.view.getC5().addMouseListener(asientoAdapter(jl, "C5"));
        this.jl = this.view.getC6();
        this.view.getC6().addMouseListener(asientoAdapter(jl, "C6"));
        this.jl = this.view.getC7();
        this.view.getC7().addMouseListener(asientoAdapter(jl, "C7"));
        this.jl = this.view.getC8();
        this.view.getC8().addMouseListener(asientoAdapter(jl, "C8"));
        this.jl = this.view.getC9();
        this.view.getC9().addMouseListener(asientoAdapter(jl, "C9"));
        this.jl = this.view.getC10();
        this.view.getC10().addMouseListener(asientoAdapter(jl, "C10"));
        this.jl = this.view.getC11();
        this.view.getC11().addMouseListener(asientoAdapter(jl, "C11"));
        this.jl = this.view.getC12();
        this.view.getC12().addMouseListener(asientoAdapter(jl, "C12"));
        this.jl = this.view.getC13();
        this.view.getC13().addMouseListener(asientoAdapter(jl, "C13"));
        this.jl = this.view.getC14();
        this.view.getC14().addMouseListener(asientoAdapter(jl, "C14"));
        this.jl = this.view.getC15();
        this.view.getC15().addMouseListener(asientoAdapter(jl, "C15"));
        this.jl = this.view.getC16();
        this.view.getC16().addMouseListener(asientoAdapter(jl, "C16"));
        this.jl = this.view.getC17();
        this.view.getC17().addMouseListener(asientoAdapter(jl, "C17"));
        this.jl = this.view.getC18();
        this.view.getC18().addMouseListener(asientoAdapter(jl, "C18"));
        this.jl = this.view.getC19();
        this.view.getC19().addMouseListener(asientoAdapter(jl, "C19"));
        this.jl = this.view.getC20();
        this.view.getC20().addMouseListener(asientoAdapter(jl, "C20"));

        //Butacas Fila D
        this.jl = this.view.getD1();
        this.view.getD1().addMouseListener(asientoAdapter(jl, "D1"));
        this.jl = this.view.getD2();
        this.view.getD2().addMouseListener(asientoAdapter(jl, "D2"));
        this.jl = this.view.getD3();
        this.view.getD3().addMouseListener(asientoAdapter(jl, "D3"));
        this.jl = this.view.getD4();
        this.view.getD4().addMouseListener(asientoAdapter(jl, "D4"));
        this.jl = this.view.getD5();
        this.view.getD5().addMouseListener(asientoAdapter(jl, "D5"));
        this.jl = this.view.getD6();
        this.view.getD6().addMouseListener(asientoAdapter(jl, "D6"));
        this.jl = this.view.getD7();
        this.view.getD7().addMouseListener(asientoAdapter(jl, "D7"));
        this.jl = this.view.getD8();
        this.view.getD8().addMouseListener(asientoAdapter(jl, "D8"));
        this.jl = this.view.getD9();
        this.view.getD9().addMouseListener(asientoAdapter(jl, "D9"));
        this.jl = this.view.getD10();
        this.view.getD10().addMouseListener(asientoAdapter(jl, "D10"));
        this.jl = this.view.getD11();
        this.view.getD11().addMouseListener(asientoAdapter(jl, "D11"));
        this.jl = this.view.getD12();
        this.view.getD12().addMouseListener(asientoAdapter(jl, "D12"));
        this.jl = this.view.getD13();
        this.view.getD13().addMouseListener(asientoAdapter(jl, "D13"));
        this.jl = this.view.getD14();
        this.view.getD14().addMouseListener(asientoAdapter(jl, "D14"));
        this.jl = this.view.getD15();
        this.view.getD15().addMouseListener(asientoAdapter(jl, "D15"));
        this.jl = this.view.getD16();
        this.view.getD16().addMouseListener(asientoAdapter(jl, "D16"));
        this.jl = this.view.getD17();
        this.view.getD17().addMouseListener(asientoAdapter(jl, "D17"));
        this.jl = this.view.getD18();
        this.view.getD18().addMouseListener(asientoAdapter(jl, "D18"));
        this.jl = this.view.getD19();
        this.view.getD19().addMouseListener(asientoAdapter(jl, "D19"));
        this.jl = this.view.getD20();
        this.view.getD20().addMouseListener(asientoAdapter(jl, "D20"));

        //Butacas Fila E
        this.jl = this.view.getE1();
        this.view.getE1().addMouseListener(asientoAdapter(jl, "E1"));
        this.jl = this.view.getE2();
        this.view.getE2().addMouseListener(asientoAdapter(jl, "E2"));
        this.jl = this.view.getE3();
        this.view.getE3().addMouseListener(asientoAdapter(jl, "E3"));
        this.jl = this.view.getE4();
        this.view.getE4().addMouseListener(asientoAdapter(jl, "E4"));
        this.jl = this.view.getE5();
        this.view.getE5().addMouseListener(asientoAdapter(jl, "E5"));
        this.jl = this.view.getE6();
        this.view.getE6().addMouseListener(asientoAdapter(jl, "E6"));
        this.jl = this.view.getE7();
        this.view.getE7().addMouseListener(asientoAdapter(jl, "E7"));
        this.jl = this.view.getE8();
        this.view.getE8().addMouseListener(asientoAdapter(jl, "E8"));
        this.jl = this.view.getE9();
        this.view.getE9().addMouseListener(asientoAdapter(jl, "E9"));
        this.jl = this.view.getE10();
        this.view.getE10().addMouseListener(asientoAdapter(jl, "E10"));
        this.jl = this.view.getE11();
        this.view.getE11().addMouseListener(asientoAdapter(jl, "E11"));
        this.jl = this.view.getE12();
        this.view.getE12().addMouseListener(asientoAdapter(jl, "E12"));
        this.jl = this.view.getE13();
        this.view.getE13().addMouseListener(asientoAdapter(jl, "E13"));
        this.jl = this.view.getE14();
        this.view.getE14().addMouseListener(asientoAdapter(jl, "E14"));
        this.jl = this.view.getE15();
        this.view.getE15().addMouseListener(asientoAdapter(jl, "E15"));
        this.jl = this.view.getE16();
        this.view.getE16().addMouseListener(asientoAdapter(jl, "E16"));
        this.jl = this.view.getE17();
        this.view.getE17().addMouseListener(asientoAdapter(jl, "E17"));
        this.jl = this.view.getE18();
        this.view.getE18().addMouseListener(asientoAdapter(jl, "E18"));
        this.jl = this.view.getE19();
        this.view.getE19().addMouseListener(asientoAdapter(jl, "E19"));
        this.jl = this.view.getE20();
        this.view.getE20().addMouseListener(asientoAdapter(jl, "E20"));

        //Butacas Fila F
        this.jl = this.view.getF1();
        this.view.getF1().addMouseListener(asientoAdapter(jl, "F1"));
        this.jl = this.view.getF2();
        this.view.getF2().addMouseListener(asientoAdapter(jl, "F2"));
        this.jl = this.view.getF3();
        this.view.getF3().addMouseListener(asientoAdapter(jl, "F3"));
        this.jl = this.view.getF4();
        this.view.getF4().addMouseListener(asientoAdapter(jl, "F4"));
        this.jl = this.view.getF5();
        this.view.getF5().addMouseListener(asientoAdapter(jl, "F5"));
        this.jl = this.view.getF6();
        this.view.getF6().addMouseListener(asientoAdapter(jl, "F6"));
        this.jl = this.view.getF7();
        this.view.getF7().addMouseListener(asientoAdapter(jl, "F7"));
        this.jl = this.view.getF8();
        this.view.getF8().addMouseListener(asientoAdapter(jl, "F8"));
        this.jl = this.view.getF9();
        this.view.getF9().addMouseListener(asientoAdapter(jl, "F9"));
        this.jl = this.view.getF10();
        this.view.getF10().addMouseListener(asientoAdapter(jl, "F10"));
        this.jl = this.view.getF11();
        this.view.getF11().addMouseListener(asientoAdapter(jl, "F11"));
        this.jl = this.view.getF12();
        this.view.getF12().addMouseListener(asientoAdapter(jl, "F12"));
        this.jl = this.view.getF13();
        this.view.getF13().addMouseListener(asientoAdapter(jl, "F13"));
        this.jl = this.view.getF14();
        this.view.getF14().addMouseListener(asientoAdapter(jl, "F14"));
        this.jl = this.view.getF15();
        this.view.getF15().addMouseListener(asientoAdapter(jl, "F15"));
        this.jl = this.view.getF16();
        this.view.getF16().addMouseListener(asientoAdapter(jl, "F16"));
        this.jl = this.view.getF17();
        this.view.getF17().addMouseListener(asientoAdapter(jl, "F17"));
        this.jl = this.view.getF18();
        this.view.getF18().addMouseListener(asientoAdapter(jl, "F18"));
        this.jl = this.view.getF19();
        this.view.getF19().addMouseListener(asientoAdapter(jl, "F19"));
        this.jl = this.view.getF20();
        this.view.getF20().addMouseListener(asientoAdapter(jl, "F20"));

        //Butacas Fila G
        this.jl = this.view.getG1();
        this.view.getG1().addMouseListener(asientoAdapter(jl, "G1"));
        this.jl = this.view.getG2();
        this.view.getG2().addMouseListener(asientoAdapter(jl, "G2"));
        this.jl = this.view.getG3();
        this.view.getG3().addMouseListener(asientoAdapter(jl, "G3"));
        this.jl = this.view.getG4();
        this.view.getG4().addMouseListener(asientoAdapter(jl, "G4"));
        this.jl = this.view.getG5();
        this.view.getG5().addMouseListener(asientoAdapter(jl, "G5"));
        this.jl = this.view.getG6();
        this.view.getG6().addMouseListener(asientoAdapter(jl, "G6"));
        this.jl = this.view.getG7();
        this.view.getG7().addMouseListener(asientoAdapter(jl, "G7"));
        this.jl = this.view.getG8();
        this.view.getG8().addMouseListener(asientoAdapter(jl, "G8"));
        this.jl = this.view.getG9();
        this.view.getG9().addMouseListener(asientoAdapter(jl, "G9"));
        this.jl = this.view.getG10();
        this.view.getG10().addMouseListener(asientoAdapter(jl, "G10"));
        this.jl = this.view.getG11();
        this.view.getG11().addMouseListener(asientoAdapter(jl, "G11"));
        this.jl = this.view.getG12();
        this.view.getG12().addMouseListener(asientoAdapter(jl, "G12"));
        this.jl = this.view.getG13();
        this.view.getG13().addMouseListener(asientoAdapter(jl, "G13"));
        this.jl = this.view.getG14();
        this.view.getG14().addMouseListener(asientoAdapter(jl, "G14"));
        this.jl = this.view.getG15();
        this.view.getG15().addMouseListener(asientoAdapter(jl, "G15"));
        this.jl = this.view.getG16();
        this.view.getG16().addMouseListener(asientoAdapter(jl, "G16"));
        this.jl = this.view.getG17();
        this.view.getG17().addMouseListener(asientoAdapter(jl, "G17"));
        this.jl = this.view.getG18();
        this.view.getG18().addMouseListener(asientoAdapter(jl, "G18"));
        this.jl = this.view.getG19();
        this.view.getG19().addMouseListener(asientoAdapter(jl, "G19"));
        this.jl = this.view.getG20();
        this.view.getG20().addMouseListener(asientoAdapter(jl, "G20"));

        //Butacas Fila H
        this.jl = this.view.getH1();
        this.view.getH1().addMouseListener(asientoAdapter(jl, "H1"));
        this.jl = this.view.getH2();
        this.view.getH2().addMouseListener(asientoAdapter(jl, "H2"));
        this.jl = this.view.getH3();
        this.view.getH3().addMouseListener(asientoAdapter(jl, "H3"));
        this.jl = this.view.getH4();
        this.view.getH4().addMouseListener(asientoAdapter(jl, "H4"));
        this.jl = this.view.getH5();
        this.view.getH5().addMouseListener(asientoAdapter(jl, "H5"));
        this.jl = this.view.getH6();
        this.view.getH6().addMouseListener(asientoAdapter(jl, "H6"));
        this.jl = this.view.getH7();
        this.view.getH7().addMouseListener(asientoAdapter(jl, "H7"));
        this.jl = this.view.getH8();
        this.view.getH8().addMouseListener(asientoAdapter(jl, "H8"));
        this.jl = this.view.getH9();
        this.view.getH9().addMouseListener(asientoAdapter(jl, "H9"));
        this.jl = this.view.getH10();
        this.view.getH10().addMouseListener(asientoAdapter(jl, "H10"));
        this.jl = this.view.getH11();
        this.view.getH11().addMouseListener(asientoAdapter(jl, "H11"));
        this.jl = this.view.getH12();
        this.view.getH12().addMouseListener(asientoAdapter(jl, "H12"));
        this.jl = this.view.getH13();
        this.view.getH13().addMouseListener(asientoAdapter(jl, "H13"));
        this.jl = this.view.getH14();
        this.view.getH14().addMouseListener(asientoAdapter(jl, "H14"));
        this.jl = this.view.getH15();
        this.view.getH15().addMouseListener(asientoAdapter(jl, "H15"));
        this.jl = this.view.getH16();
        this.view.getH16().addMouseListener(asientoAdapter(jl, "H16"));
        this.jl = this.view.getH17();
        this.view.getH17().addMouseListener(asientoAdapter(jl, "H17"));
        this.jl = this.view.getH18();
        this.view.getH18().addMouseListener(asientoAdapter(jl, "H18"));
        this.jl = this.view.getH19();
        this.view.getH19().addMouseListener(asientoAdapter(jl, "H19"));
        this.jl = this.view.getH20();
        this.view.getH20().addMouseListener(asientoAdapter(jl, "H20"));
    }
}
