/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipuladores;

import interaccionesBaseDatos.AdministrarAsientos;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import vista.vistaMenuPrincipal;

/**
 *
 * @author b1796
 */
public class ManipuladorJPMenuAsientosDisponibles {

    private vistaMenuPrincipal view;
    private JLabel jl;
    private int idFuncion;

    public ManipuladorJPMenuAsientosDisponibles(vistaMenuPrincipal view, int idFuncion) {
        this.idFuncion = idFuncion;
        this.view = view;
        colocandoImagenes();
        initComponents();
    }

    private void colocandoImagenes() {
        //Imagenes de la fila A
        this.view.getA1().setIcon(new AdministrarAsientos(this.view.getA1(), "A1", this.idFuncion).colocarImagen());
        this.view.getA2().setIcon(new AdministrarAsientos(this.view.getA2(), "A2", this.idFuncion).colocarImagen());
        this.view.getA3().setIcon(new AdministrarAsientos(this.view.getA3(), "A3", this.idFuncion).colocarImagen());
        this.view.getA4().setIcon(new AdministrarAsientos(this.view.getA4(), "A4", this.idFuncion).colocarImagen());
        this.view.getA5().setIcon(new AdministrarAsientos(this.view.getA5(), "A5", this.idFuncion).colocarImagen());
        this.view.getA6().setIcon(new AdministrarAsientos(this.view.getA6(), "A6", this.idFuncion).colocarImagen());
        this.view.getA7().setIcon(new AdministrarAsientos(this.view.getA7(), "A7", this.idFuncion).colocarImagen());
        this.view.getA8().setIcon(new AdministrarAsientos(this.view.getA8(), "A8", this.idFuncion).colocarImagen());
        this.view.getA9().setIcon(new AdministrarAsientos(this.view.getA9(), "A9", this.idFuncion).colocarImagen());
        this.view.getA10().setIcon(new AdministrarAsientos(this.view.getA10(), "A10", this.idFuncion).colocarImagen());
        this.view.getA11().setIcon(new AdministrarAsientos(this.view.getA11(), "A11", this.idFuncion).colocarImagen());
        this.view.getA12().setIcon(new AdministrarAsientos(this.view.getA12(), "A12", this.idFuncion).colocarImagen());
        this.view.getA13().setIcon(new AdministrarAsientos(this.view.getA13(), "A13", this.idFuncion).colocarImagen());
        this.view.getA14().setIcon(new AdministrarAsientos(this.view.getA14(), "A14", this.idFuncion).colocarImagen());
        this.view.getA15().setIcon(new AdministrarAsientos(this.view.getA15(), "A15", this.idFuncion).colocarImagen());
        this.view.getA16().setIcon(new AdministrarAsientos(this.view.getA16(), "A16", this.idFuncion).colocarImagen());
        this.view.getA17().setIcon(new AdministrarAsientos(this.view.getA17(), "A17", this.idFuncion).colocarImagen());
        this.view.getA18().setIcon(new AdministrarAsientos(this.view.getA18(), "A18", this.idFuncion).colocarImagen());
        this.view.getA19().setIcon(new AdministrarAsientos(this.view.getA19(), "A19", this.idFuncion).colocarImagen());
        this.view.getA20().setIcon(new AdministrarAsientos(this.view.getA20(), "A20", this.idFuncion).colocarImagen());
        
        //Imagenes de la fila B
        this.view.getB1().setIcon(new AdministrarAsientos(this.view.getB1(), "B1", this.idFuncion).colocarImagen());
        this.view.getB2().setIcon(new AdministrarAsientos(this.view.getB2(), "B2", this.idFuncion).colocarImagen());
        this.view.getB3().setIcon(new AdministrarAsientos(this.view.getB3(), "B3", this.idFuncion).colocarImagen());
        this.view.getB4().setIcon(new AdministrarAsientos(this.view.getB4(), "B4", this.idFuncion).colocarImagen());
        this.view.getB5().setIcon(new AdministrarAsientos(this.view.getB5(), "B5", this.idFuncion).colocarImagen());
        this.view.getB6().setIcon(new AdministrarAsientos(this.view.getB6(), "B6", this.idFuncion).colocarImagen());
        this.view.getB7().setIcon(new AdministrarAsientos(this.view.getB7(), "B7", this.idFuncion).colocarImagen());
        this.view.getB8().setIcon(new AdministrarAsientos(this.view.getB8(), "B8", this.idFuncion).colocarImagen());
        this.view.getB9().setIcon(new AdministrarAsientos(this.view.getB9(), "B9", this.idFuncion).colocarImagen());
        this.view.getB10().setIcon(new AdministrarAsientos(this.view.getB10(), "B10", this.idFuncion).colocarImagen());
        this.view.getB11().setIcon(new AdministrarAsientos(this.view.getB11(), "B11", this.idFuncion).colocarImagen());
        this.view.getB12().setIcon(new AdministrarAsientos(this.view.getB12(), "B12", this.idFuncion).colocarImagen());
        this.view.getB13().setIcon(new AdministrarAsientos(this.view.getB13(), "B13", this.idFuncion).colocarImagen());
        this.view.getB14().setIcon(new AdministrarAsientos(this.view.getB14(), "B14", this.idFuncion).colocarImagen());
        this.view.getB15().setIcon(new AdministrarAsientos(this.view.getB15(), "B15", this.idFuncion).colocarImagen());
        this.view.getB16().setIcon(new AdministrarAsientos(this.view.getB16(), "B16", this.idFuncion).colocarImagen());
        this.view.getB17().setIcon(new AdministrarAsientos(this.view.getB17(), "B17", this.idFuncion).colocarImagen());
        this.view.getB18().setIcon(new AdministrarAsientos(this.view.getB18(), "B18", this.idFuncion).colocarImagen());
        this.view.getB19().setIcon(new AdministrarAsientos(this.view.getB19(), "B19", this.idFuncion).colocarImagen());
        this.view.getB20().setIcon(new AdministrarAsientos(this.view.getB20(), "B20", this.idFuncion).colocarImagen());
        
        //Imagenes de la fila C
        this.view.getC1().setIcon(new AdministrarAsientos(this.view.getC1(), "C1", this.idFuncion).colocarImagen());
        this.view.getC2().setIcon(new AdministrarAsientos(this.view.getC2(), "C2", this.idFuncion).colocarImagen());
        this.view.getC3().setIcon(new AdministrarAsientos(this.view.getC3(), "C3", this.idFuncion).colocarImagen());
        this.view.getC4().setIcon(new AdministrarAsientos(this.view.getC4(), "C4", this.idFuncion).colocarImagen());
        this.view.getC5().setIcon(new AdministrarAsientos(this.view.getC5(), "C5", this.idFuncion).colocarImagen());
        this.view.getC6().setIcon(new AdministrarAsientos(this.view.getC6(), "C6", this.idFuncion).colocarImagen());
        this.view.getC7().setIcon(new AdministrarAsientos(this.view.getC7(), "C7", this.idFuncion).colocarImagen());
        this.view.getC8().setIcon(new AdministrarAsientos(this.view.getC8(), "C8", this.idFuncion).colocarImagen());
        this.view.getC9().setIcon(new AdministrarAsientos(this.view.getC9(), "C9", this.idFuncion).colocarImagen());
        this.view.getC10().setIcon(new AdministrarAsientos(this.view.getC10(), "C10", this.idFuncion).colocarImagen());
        this.view.getC11().setIcon(new AdministrarAsientos(this.view.getC11(), "C11", this.idFuncion).colocarImagen());
        this.view.getC12().setIcon(new AdministrarAsientos(this.view.getC12(), "C12", this.idFuncion).colocarImagen());
        this.view.getC13().setIcon(new AdministrarAsientos(this.view.getC13(), "C13", this.idFuncion).colocarImagen());
        this.view.getC14().setIcon(new AdministrarAsientos(this.view.getC14(), "C14", this.idFuncion).colocarImagen());
        this.view.getC15().setIcon(new AdministrarAsientos(this.view.getC15(), "C15", this.idFuncion).colocarImagen());
        this.view.getC16().setIcon(new AdministrarAsientos(this.view.getC16(), "C16", this.idFuncion).colocarImagen());
        this.view.getC17().setIcon(new AdministrarAsientos(this.view.getC17(), "C17", this.idFuncion).colocarImagen());
        this.view.getC18().setIcon(new AdministrarAsientos(this.view.getC18(), "C18", this.idFuncion).colocarImagen());
        this.view.getC19().setIcon(new AdministrarAsientos(this.view.getC19(), "C19", this.idFuncion).colocarImagen());
        this.view.getC20().setIcon(new AdministrarAsientos(this.view.getC20(), "C20", this.idFuncion).colocarImagen());
        
        //Imagenes de la fila D
        this.view.getD1().setIcon(new AdministrarAsientos(this.view.getD1(), "D1", this.idFuncion).colocarImagen());
        this.view.getD2().setIcon(new AdministrarAsientos(this.view.getD2(), "D2", this.idFuncion).colocarImagen());
        this.view.getD3().setIcon(new AdministrarAsientos(this.view.getD3(), "D3", this.idFuncion).colocarImagen());
        this.view.getD4().setIcon(new AdministrarAsientos(this.view.getD4(), "D4", this.idFuncion).colocarImagen());
        this.view.getD5().setIcon(new AdministrarAsientos(this.view.getD5(), "D5", this.idFuncion).colocarImagen());
        this.view.getD6().setIcon(new AdministrarAsientos(this.view.getD6(), "D6", this.idFuncion).colocarImagen());
        this.view.getD7().setIcon(new AdministrarAsientos(this.view.getD7(), "D7", this.idFuncion).colocarImagen());
        this.view.getD8().setIcon(new AdministrarAsientos(this.view.getD8(), "D8", this.idFuncion).colocarImagen());
        this.view.getD9().setIcon(new AdministrarAsientos(this.view.getD9(), "D9", this.idFuncion).colocarImagen());
        this.view.getD10().setIcon(new AdministrarAsientos(this.view.getD10(), "D10", this.idFuncion).colocarImagen());
        this.view.getD11().setIcon(new AdministrarAsientos(this.view.getD11(), "D11", this.idFuncion).colocarImagen());
        this.view.getD12().setIcon(new AdministrarAsientos(this.view.getD12(), "D12", this.idFuncion).colocarImagen());
        this.view.getD13().setIcon(new AdministrarAsientos(this.view.getD13(), "D13", this.idFuncion).colocarImagen());
        this.view.getD14().setIcon(new AdministrarAsientos(this.view.getD14(), "D14", this.idFuncion).colocarImagen());
        this.view.getD15().setIcon(new AdministrarAsientos(this.view.getD15(), "D15", this.idFuncion).colocarImagen());
        this.view.getD16().setIcon(new AdministrarAsientos(this.view.getD16(), "D16", this.idFuncion).colocarImagen());
        this.view.getD17().setIcon(new AdministrarAsientos(this.view.getD17(), "D17", this.idFuncion).colocarImagen());
        this.view.getD18().setIcon(new AdministrarAsientos(this.view.getD18(), "D18", this.idFuncion).colocarImagen());
        this.view.getD19().setIcon(new AdministrarAsientos(this.view.getD19(), "D19", this.idFuncion).colocarImagen());
        this.view.getD20().setIcon(new AdministrarAsientos(this.view.getD20(), "D20", this.idFuncion).colocarImagen());
        
        //Imagenes de la fila E
        this.view.getE1().setIcon(new AdministrarAsientos(this.view.getE1(), "E1", this.idFuncion).colocarImagen());
        this.view.getE2().setIcon(new AdministrarAsientos(this.view.getE2(), "E2", this.idFuncion).colocarImagen());
        this.view.getE3().setIcon(new AdministrarAsientos(this.view.getE3(), "E3", this.idFuncion).colocarImagen());
        this.view.getE4().setIcon(new AdministrarAsientos(this.view.getE4(), "E4", this.idFuncion).colocarImagen());
        this.view.getE5().setIcon(new AdministrarAsientos(this.view.getE5(), "E5", this.idFuncion).colocarImagen());
        this.view.getE6().setIcon(new AdministrarAsientos(this.view.getE6(), "E6", this.idFuncion).colocarImagen());
        this.view.getE7().setIcon(new AdministrarAsientos(this.view.getE7(), "E7", this.idFuncion).colocarImagen());
        this.view.getE8().setIcon(new AdministrarAsientos(this.view.getE8(), "E8", this.idFuncion).colocarImagen());
        this.view.getE9().setIcon(new AdministrarAsientos(this.view.getE9(), "E9", this.idFuncion).colocarImagen());
        this.view.getE10().setIcon(new AdministrarAsientos(this.view.getE10(), "E10", this.idFuncion).colocarImagen());
        this.view.getE11().setIcon(new AdministrarAsientos(this.view.getE11(), "E11", this.idFuncion).colocarImagen());
        this.view.getE12().setIcon(new AdministrarAsientos(this.view.getE12(), "E12", this.idFuncion).colocarImagen());
        this.view.getE13().setIcon(new AdministrarAsientos(this.view.getE13(), "E13", this.idFuncion).colocarImagen());
        this.view.getE14().setIcon(new AdministrarAsientos(this.view.getE14(), "E14", this.idFuncion).colocarImagen());
        this.view.getE15().setIcon(new AdministrarAsientos(this.view.getE15(), "E15", this.idFuncion).colocarImagen());
        this.view.getE16().setIcon(new AdministrarAsientos(this.view.getE16(), "E16", this.idFuncion).colocarImagen());
        this.view.getE17().setIcon(new AdministrarAsientos(this.view.getE17(), "E17", this.idFuncion).colocarImagen());
        this.view.getE18().setIcon(new AdministrarAsientos(this.view.getE18(), "E18", this.idFuncion).colocarImagen());
        this.view.getE19().setIcon(new AdministrarAsientos(this.view.getE19(), "E19", this.idFuncion).colocarImagen());
        this.view.getE20().setIcon(new AdministrarAsientos(this.view.getE20(), "E20", this.idFuncion).colocarImagen());
        
        //Imagenes de la fila F
        this.view.getF1().setIcon(new AdministrarAsientos(this.view.getF1(), "F1", this.idFuncion).colocarImagen());
        this.view.getF2().setIcon(new AdministrarAsientos(this.view.getF2(), "F2", this.idFuncion).colocarImagen());
        this.view.getF3().setIcon(new AdministrarAsientos(this.view.getF3(), "F3", this.idFuncion).colocarImagen());
        this.view.getF4().setIcon(new AdministrarAsientos(this.view.getF4(), "F4", this.idFuncion).colocarImagen());
        this.view.getF5().setIcon(new AdministrarAsientos(this.view.getF5(), "F5", this.idFuncion).colocarImagen());
        this.view.getF6().setIcon(new AdministrarAsientos(this.view.getF6(), "F6", this.idFuncion).colocarImagen());
        this.view.getF7().setIcon(new AdministrarAsientos(this.view.getF7(), "F7", this.idFuncion).colocarImagen());
        this.view.getF8().setIcon(new AdministrarAsientos(this.view.getF8(), "F8", this.idFuncion).colocarImagen());
        this.view.getF9().setIcon(new AdministrarAsientos(this.view.getF9(), "F9", this.idFuncion).colocarImagen());
        this.view.getF10().setIcon(new AdministrarAsientos(this.view.getF10(), "F10", this.idFuncion).colocarImagen());
        this.view.getF11().setIcon(new AdministrarAsientos(this.view.getF11(), "F11", this.idFuncion).colocarImagen());
        this.view.getF12().setIcon(new AdministrarAsientos(this.view.getF12(), "F12", this.idFuncion).colocarImagen());
        this.view.getF13().setIcon(new AdministrarAsientos(this.view.getF13(), "F13", this.idFuncion).colocarImagen());
        this.view.getF14().setIcon(new AdministrarAsientos(this.view.getF14(), "F14", this.idFuncion).colocarImagen());
        this.view.getF15().setIcon(new AdministrarAsientos(this.view.getF15(), "F15", this.idFuncion).colocarImagen());
        this.view.getF16().setIcon(new AdministrarAsientos(this.view.getF16(), "F16", this.idFuncion).colocarImagen());
        this.view.getF17().setIcon(new AdministrarAsientos(this.view.getF17(), "F17", this.idFuncion).colocarImagen());
        this.view.getF18().setIcon(new AdministrarAsientos(this.view.getF18(), "F18", this.idFuncion).colocarImagen());
        this.view.getF19().setIcon(new AdministrarAsientos(this.view.getF19(), "F19", this.idFuncion).colocarImagen());
        this.view.getF20().setIcon(new AdministrarAsientos(this.view.getF20(), "F20", this.idFuncion).colocarImagen());
        
        //Imagenes de la fila G
        this.view.getG1().setIcon(new AdministrarAsientos(this.view.getG1(), "G1", this.idFuncion).colocarImagen());
        this.view.getG2().setIcon(new AdministrarAsientos(this.view.getG2(), "G2", this.idFuncion).colocarImagen());
        this.view.getG3().setIcon(new AdministrarAsientos(this.view.getG3(), "G3", this.idFuncion).colocarImagen());
        this.view.getG4().setIcon(new AdministrarAsientos(this.view.getG4(), "G4", this.idFuncion).colocarImagen());
        this.view.getG5().setIcon(new AdministrarAsientos(this.view.getG5(), "G5", this.idFuncion).colocarImagen());
        this.view.getG6().setIcon(new AdministrarAsientos(this.view.getG6(), "G6", this.idFuncion).colocarImagen());
        this.view.getG7().setIcon(new AdministrarAsientos(this.view.getG7(), "G7", this.idFuncion).colocarImagen());
        this.view.getG8().setIcon(new AdministrarAsientos(this.view.getG8(), "G8", this.idFuncion).colocarImagen());
        this.view.getG9().setIcon(new AdministrarAsientos(this.view.getG9(), "G9", this.idFuncion).colocarImagen());
        this.view.getG10().setIcon(new AdministrarAsientos(this.view.getG10(), "G10", this.idFuncion).colocarImagen());
        this.view.getG11().setIcon(new AdministrarAsientos(this.view.getG11(), "G11", this.idFuncion).colocarImagen());
        this.view.getG12().setIcon(new AdministrarAsientos(this.view.getG12(), "G12", this.idFuncion).colocarImagen());
        this.view.getG13().setIcon(new AdministrarAsientos(this.view.getG13(), "G13", this.idFuncion).colocarImagen());
        this.view.getG14().setIcon(new AdministrarAsientos(this.view.getG14(), "G14", this.idFuncion).colocarImagen());
        this.view.getG15().setIcon(new AdministrarAsientos(this.view.getG15(), "G15", this.idFuncion).colocarImagen());
        this.view.getG16().setIcon(new AdministrarAsientos(this.view.getG16(), "G16", this.idFuncion).colocarImagen());
        this.view.getG17().setIcon(new AdministrarAsientos(this.view.getG17(), "G17", this.idFuncion).colocarImagen());
        this.view.getG18().setIcon(new AdministrarAsientos(this.view.getG18(), "G18", this.idFuncion).colocarImagen());
        this.view.getG19().setIcon(new AdministrarAsientos(this.view.getG19(), "G19", this.idFuncion).colocarImagen());
        this.view.getG20().setIcon(new AdministrarAsientos(this.view.getG20(), "G20", this.idFuncion).colocarImagen());
        
        //Imagenes de la fila H
        this.view.getH1().setIcon(new AdministrarAsientos(this.view.getH1(), "H1", this.idFuncion).colocarImagen());
        this.view.getH2().setIcon(new AdministrarAsientos(this.view.getH2(), "H2", this.idFuncion).colocarImagen());
        this.view.getH3().setIcon(new AdministrarAsientos(this.view.getH3(), "H3", this.idFuncion).colocarImagen());
        this.view.getH4().setIcon(new AdministrarAsientos(this.view.getH4(), "H4", this.idFuncion).colocarImagen());
        this.view.getH5().setIcon(new AdministrarAsientos(this.view.getH5(), "H5", this.idFuncion).colocarImagen());
        this.view.getH6().setIcon(new AdministrarAsientos(this.view.getH6(), "H6", this.idFuncion).colocarImagen());
        this.view.getH7().setIcon(new AdministrarAsientos(this.view.getH7(), "H7", this.idFuncion).colocarImagen());
        this.view.getH8().setIcon(new AdministrarAsientos(this.view.getH8(), "H8", this.idFuncion).colocarImagen());
        this.view.getH9().setIcon(new AdministrarAsientos(this.view.getH9(), "H9", this.idFuncion).colocarImagen());
        this.view.getH10().setIcon(new AdministrarAsientos(this.view.getH10(), "H10", this.idFuncion).colocarImagen());
        this.view.getH11().setIcon(new AdministrarAsientos(this.view.getH11(), "H11", this.idFuncion).colocarImagen());
        this.view.getH12().setIcon(new AdministrarAsientos(this.view.getH12(), "H12", this.idFuncion).colocarImagen());
        this.view.getH13().setIcon(new AdministrarAsientos(this.view.getH13(), "H13", this.idFuncion).colocarImagen());
        this.view.getH14().setIcon(new AdministrarAsientos(this.view.getH14(), "H14", this.idFuncion).colocarImagen());
        this.view.getH15().setIcon(new AdministrarAsientos(this.view.getH15(), "H15", this.idFuncion).colocarImagen());
        this.view.getH16().setIcon(new AdministrarAsientos(this.view.getH16(), "H16", this.idFuncion).colocarImagen());
        this.view.getH17().setIcon(new AdministrarAsientos(this.view.getH17(), "H17", this.idFuncion).colocarImagen());
        this.view.getH18().setIcon(new AdministrarAsientos(this.view.getH18(), "H18", this.idFuncion).colocarImagen());
        this.view.getH19().setIcon(new AdministrarAsientos(this.view.getH19(), "H19", this.idFuncion).colocarImagen());
        this.view.getH20().setIcon(new AdministrarAsientos(this.view.getH20(), "H20", this.idFuncion).colocarImagen());
    }

    private void initComponents() {
        //Butacas Fila A
        this.jl = this.view.getA1();
        this.view.getA1().addMouseListener(butacaAdapter(jl, "A1"));
        this.jl = this.view.getA2();
        this.view.getA2().addMouseListener(butacaAdapter(jl, "A2"));
        this.jl = this.view.getA3();
        this.view.getA3().addMouseListener(butacaAdapter(jl, "A3"));
        this.jl = this.view.getA4();
        this.view.getA4().addMouseListener(butacaAdapter(jl, "A4"));
        this.jl = this.view.getA5();
        this.view.getA5().addMouseListener(butacaAdapter(jl, "A5"));
        this.jl = this.view.getA6();
        this.view.getA6().addMouseListener(butacaAdapter(jl, "A6"));
        this.jl = this.view.getA7();
        this.view.getA7().addMouseListener(butacaAdapter(jl, "A7"));
        this.jl = this.view.getA8();
        this.view.getA8().addMouseListener(butacaAdapter(jl, "A8"));
        this.jl = this.view.getA9();
        this.view.getA9().addMouseListener(butacaAdapter(jl, "A9"));
        this.jl = this.view.getA10();
        this.view.getA10().addMouseListener(butacaAdapter(jl, "A10"));
        this.jl = this.view.getA11();
        this.view.getA11().addMouseListener(butacaAdapter(jl, "A11"));
        this.jl = this.view.getA12();
        this.view.getA12().addMouseListener(butacaAdapter(jl, "A12"));
        this.jl = this.view.getA13();
        this.view.getA13().addMouseListener(butacaAdapter(jl, "A13"));
        this.jl = this.view.getA14();
        this.view.getA14().addMouseListener(butacaAdapter(jl, "A14"));
        this.jl = this.view.getA15();
        this.view.getA15().addMouseListener(butacaAdapter(jl, "A15"));
        this.jl = this.view.getA16();
        this.view.getA16().addMouseListener(butacaAdapter(jl, "A16"));
        this.jl = this.view.getA17();
        this.view.getA17().addMouseListener(butacaAdapter(jl, "A17"));
        this.jl = this.view.getA18();
        this.view.getA18().addMouseListener(butacaAdapter(jl, "A18"));
        this.jl = this.view.getA19();
        this.view.getA19().addMouseListener(butacaAdapter(jl, "A19"));
        this.jl = this.view.getA20();
        this.view.getA20().addMouseListener(butacaAdapter(jl, "A20"));
        
        //Butacas Fila B
        this.jl = this.view.getB1();
        this.view.getB1().addMouseListener(butacaAdapter(jl, "B1"));
        this.jl = this.view.getB2();
        this.view.getB2().addMouseListener(butacaAdapter(jl, "B2"));
        this.jl = this.view.getB3();
        this.view.getB3().addMouseListener(butacaAdapter(jl, "B3"));
        this.jl = this.view.getB4();
        this.view.getB4().addMouseListener(butacaAdapter(jl, "B4"));
        this.jl = this.view.getB5();
        this.view.getB5().addMouseListener(butacaAdapter(jl, "B5"));
        this.jl = this.view.getB6();
        this.view.getB6().addMouseListener(butacaAdapter(jl, "B6"));
        this.jl = this.view.getB7();
        this.view.getB7().addMouseListener(butacaAdapter(jl, "B7"));
        this.jl = this.view.getB8();
        this.view.getB8().addMouseListener(butacaAdapter(jl, "B8"));
        this.jl = this.view.getB9();
        this.view.getB9().addMouseListener(butacaAdapter(jl, "B9"));
        this.jl = this.view.getB10();
        this.view.getB10().addMouseListener(butacaAdapter(jl, "B10"));
        this.jl = this.view.getB11();
        this.view.getB11().addMouseListener(butacaAdapter(jl, "B11"));
        this.jl = this.view.getB12();
        this.view.getB12().addMouseListener(butacaAdapter(jl, "B12"));
        this.jl = this.view.getB13();
        this.view.getB13().addMouseListener(butacaAdapter(jl, "B13"));
        this.jl = this.view.getB14();
        this.view.getB14().addMouseListener(butacaAdapter(jl, "B14"));
        this.jl = this.view.getB15();
        this.view.getB15().addMouseListener(butacaAdapter(jl, "B15"));
        this.jl = this.view.getB16();
        this.view.getB16().addMouseListener(butacaAdapter(jl, "B16"));
        this.jl = this.view.getB17();
        this.view.getB17().addMouseListener(butacaAdapter(jl, "B17"));
        this.jl = this.view.getB18();
        this.view.getB18().addMouseListener(butacaAdapter(jl, "B18"));
        this.jl = this.view.getB19();
        this.view.getB19().addMouseListener(butacaAdapter(jl, "B19"));
        this.jl = this.view.getB20();
        this.view.getB20().addMouseListener(butacaAdapter(jl, "B20"));
        
        //Butacas Fila C
        this.jl = this.view.getC1();
        this.view.getC1().addMouseListener(butacaAdapter(jl, "C1"));
        this.jl = this.view.getC2();
        this.view.getC2().addMouseListener(butacaAdapter(jl, "C2"));
        this.jl = this.view.getC3();
        this.view.getC3().addMouseListener(butacaAdapter(jl, "C3"));
        this.jl = this.view.getC4();
        this.view.getC4().addMouseListener(butacaAdapter(jl, "C4"));
        this.jl = this.view.getC5();
        this.view.getC5().addMouseListener(butacaAdapter(jl, "C5"));
        this.jl = this.view.getC6();
        this.view.getC6().addMouseListener(butacaAdapter(jl, "C6"));
        this.jl = this.view.getC7();
        this.view.getC7().addMouseListener(butacaAdapter(jl, "C7"));
        this.jl = this.view.getC8();
        this.view.getC8().addMouseListener(butacaAdapter(jl, "C8"));
        this.jl = this.view.getC9();
        this.view.getC9().addMouseListener(butacaAdapter(jl, "C9"));
        this.jl = this.view.getC10();
        this.view.getC10().addMouseListener(butacaAdapter(jl, "C10"));
        this.jl = this.view.getC11();
        this.view.getC11().addMouseListener(butacaAdapter(jl, "C11"));
        this.jl = this.view.getC12();
        this.view.getC12().addMouseListener(butacaAdapter(jl, "C12"));
        this.jl = this.view.getC13();
        this.view.getC13().addMouseListener(butacaAdapter(jl, "C13"));
        this.jl = this.view.getC14();
        this.view.getC14().addMouseListener(butacaAdapter(jl, "C14"));
        this.jl = this.view.getC15();
        this.view.getC15().addMouseListener(butacaAdapter(jl, "C15"));
        this.jl = this.view.getC16();
        this.view.getC16().addMouseListener(butacaAdapter(jl, "C16"));
        this.jl = this.view.getC17();
        this.view.getC17().addMouseListener(butacaAdapter(jl, "C17"));
        this.jl = this.view.getC18();
        this.view.getC18().addMouseListener(butacaAdapter(jl, "C18"));
        this.jl = this.view.getC19();
        this.view.getC19().addMouseListener(butacaAdapter(jl, "C19"));
        this.jl = this.view.getC20();
        this.view.getC20().addMouseListener(butacaAdapter(jl, "C20"));
        
        //Butacas Fila D
        this.jl = this.view.getD1();
        this.view.getD1().addMouseListener(butacaAdapter(jl, "D1"));
        this.jl = this.view.getD2();
        this.view.getD2().addMouseListener(butacaAdapter(jl, "D2"));
        this.jl = this.view.getD3();
        this.view.getD3().addMouseListener(butacaAdapter(jl, "D3"));
        this.jl = this.view.getD4();
        this.view.getD4().addMouseListener(butacaAdapter(jl, "D4"));
        this.jl = this.view.getD5();
        this.view.getD5().addMouseListener(butacaAdapter(jl, "D5"));
        this.jl = this.view.getD6();
        this.view.getD6().addMouseListener(butacaAdapter(jl, "D6"));
        this.jl = this.view.getD7();
        this.view.getD7().addMouseListener(butacaAdapter(jl, "D7"));
        this.jl = this.view.getD8();
        this.view.getD8().addMouseListener(butacaAdapter(jl, "D8"));
        this.jl = this.view.getD9();
        this.view.getD9().addMouseListener(butacaAdapter(jl, "D9"));
        this.jl = this.view.getD10();
        this.view.getD10().addMouseListener(butacaAdapter(jl, "D10"));
        this.jl = this.view.getD11();
        this.view.getD11().addMouseListener(butacaAdapter(jl, "D11"));
        this.jl = this.view.getD12();
        this.view.getD12().addMouseListener(butacaAdapter(jl, "D12"));
        this.jl = this.view.getD13();
        this.view.getD13().addMouseListener(butacaAdapter(jl, "D13"));
        this.jl = this.view.getD14();
        this.view.getD14().addMouseListener(butacaAdapter(jl, "D14"));
        this.jl = this.view.getD15();
        this.view.getD15().addMouseListener(butacaAdapter(jl, "D15"));
        this.jl = this.view.getD16();
        this.view.getD16().addMouseListener(butacaAdapter(jl, "D16"));
        this.jl = this.view.getD17();
        this.view.getD17().addMouseListener(butacaAdapter(jl, "D17"));
        this.jl = this.view.getD18();
        this.view.getD18().addMouseListener(butacaAdapter(jl, "D18"));
        this.jl = this.view.getD19();
        this.view.getD19().addMouseListener(butacaAdapter(jl, "D19"));
        this.jl = this.view.getD20();
        this.view.getD20().addMouseListener(butacaAdapter(jl, "D20"));
        
        //Butacas Fila E
        this.jl = this.view.getE1();
        this.view.getE1().addMouseListener(butacaAdapter(jl, "E1"));
        this.jl = this.view.getE2();
        this.view.getE2().addMouseListener(butacaAdapter(jl, "E2"));
        this.jl = this.view.getE3();
        this.view.getE3().addMouseListener(butacaAdapter(jl, "E3"));
        this.jl = this.view.getE4();
        this.view.getE4().addMouseListener(butacaAdapter(jl, "E4"));
        this.jl = this.view.getE5();
        this.view.getE5().addMouseListener(butacaAdapter(jl, "E5"));
        this.jl = this.view.getE6();
        this.view.getE6().addMouseListener(butacaAdapter(jl, "E6"));
        this.jl = this.view.getE7();
        this.view.getE7().addMouseListener(butacaAdapter(jl, "E7"));
        this.jl = this.view.getE8();
        this.view.getE8().addMouseListener(butacaAdapter(jl, "E8"));
        this.jl = this.view.getE9();
        this.view.getE9().addMouseListener(butacaAdapter(jl, "E9"));
        this.jl = this.view.getE10();
        this.view.getE10().addMouseListener(butacaAdapter(jl, "E10"));
        this.jl = this.view.getE11();
        this.view.getE11().addMouseListener(butacaAdapter(jl, "E11"));
        this.jl = this.view.getE12();
        this.view.getE12().addMouseListener(butacaAdapter(jl, "E12"));
        this.jl = this.view.getE13();
        this.view.getE13().addMouseListener(butacaAdapter(jl, "E13"));
        this.jl = this.view.getE14();
        this.view.getE14().addMouseListener(butacaAdapter(jl, "E14"));
        this.jl = this.view.getE15();
        this.view.getE15().addMouseListener(butacaAdapter(jl, "E15"));
        this.jl = this.view.getE16();
        this.view.getE16().addMouseListener(butacaAdapter(jl, "E16"));
        this.jl = this.view.getE17();
        this.view.getE17().addMouseListener(butacaAdapter(jl, "E17"));
        this.jl = this.view.getE18();
        this.view.getE18().addMouseListener(butacaAdapter(jl, "E18"));
        this.jl = this.view.getE19();
        this.view.getE19().addMouseListener(butacaAdapter(jl, "E19"));
        this.jl = this.view.getE20();
        this.view.getE20().addMouseListener(butacaAdapter(jl, "E20"));
        
        //Butacas Fila F
        this.jl = this.view.getF1();
        this.view.getF1().addMouseListener(butacaAdapter(jl, "F1"));
        this.jl = this.view.getF2();
        this.view.getF2().addMouseListener(butacaAdapter(jl, "F2"));
        this.jl = this.view.getF3();
        this.view.getF3().addMouseListener(butacaAdapter(jl, "F3"));
        this.jl = this.view.getF4();
        this.view.getF4().addMouseListener(butacaAdapter(jl, "F4"));
        this.jl = this.view.getF5();
        this.view.getF5().addMouseListener(butacaAdapter(jl, "F5"));
        this.jl = this.view.getF6();
        this.view.getF6().addMouseListener(butacaAdapter(jl, "F6"));
        this.jl = this.view.getF7();
        this.view.getF7().addMouseListener(butacaAdapter(jl, "F7"));
        this.jl = this.view.getF8();
        this.view.getF8().addMouseListener(butacaAdapter(jl, "F8"));
        this.jl = this.view.getF9();
        this.view.getF9().addMouseListener(butacaAdapter(jl, "F9"));
        this.jl = this.view.getF10();
        this.view.getF10().addMouseListener(butacaAdapter(jl, "F10"));
        this.jl = this.view.getF11();
        this.view.getF11().addMouseListener(butacaAdapter(jl, "F11"));
        this.jl = this.view.getF12();
        this.view.getF12().addMouseListener(butacaAdapter(jl, "F12"));
        this.jl = this.view.getF13();
        this.view.getF13().addMouseListener(butacaAdapter(jl, "F13"));
        this.jl = this.view.getF14();
        this.view.getF14().addMouseListener(butacaAdapter(jl, "F14"));
        this.jl = this.view.getF15();
        this.view.getF15().addMouseListener(butacaAdapter(jl, "F15"));
        this.jl = this.view.getF16();
        this.view.getF16().addMouseListener(butacaAdapter(jl, "F16"));
        this.jl = this.view.getF17();
        this.view.getF17().addMouseListener(butacaAdapter(jl, "F17"));
        this.jl = this.view.getF18();
        this.view.getF18().addMouseListener(butacaAdapter(jl, "F18"));
        this.jl = this.view.getF19();
        this.view.getF19().addMouseListener(butacaAdapter(jl, "F19"));
        this.jl = this.view.getF20();
        this.view.getF20().addMouseListener(butacaAdapter(jl, "F20"));
        
        //Butacas Fila G
        this.jl = this.view.getG1();
        this.view.getG1().addMouseListener(butacaAdapter(jl, "G1"));
        this.jl = this.view.getG2();
        this.view.getG2().addMouseListener(butacaAdapter(jl, "G2"));
        this.jl = this.view.getG3();
        this.view.getG3().addMouseListener(butacaAdapter(jl, "G3"));
        this.jl = this.view.getG4();
        this.view.getG4().addMouseListener(butacaAdapter(jl, "G4"));
        this.jl = this.view.getG5();
        this.view.getG5().addMouseListener(butacaAdapter(jl, "G5"));
        this.jl = this.view.getG6();
        this.view.getG6().addMouseListener(butacaAdapter(jl, "G6"));
        this.jl = this.view.getG7();
        this.view.getG7().addMouseListener(butacaAdapter(jl, "G7"));
        this.jl = this.view.getG8();
        this.view.getG8().addMouseListener(butacaAdapter(jl, "G8"));
        this.jl = this.view.getG9();
        this.view.getG9().addMouseListener(butacaAdapter(jl, "G9"));
        this.jl = this.view.getG10();
        this.view.getG10().addMouseListener(butacaAdapter(jl, "G10"));
        this.jl = this.view.getG11();
        this.view.getG11().addMouseListener(butacaAdapter(jl, "G11"));
        this.jl = this.view.getG12();
        this.view.getG12().addMouseListener(butacaAdapter(jl, "G12"));
        this.jl = this.view.getG13();
        this.view.getG13().addMouseListener(butacaAdapter(jl, "G13"));
        this.jl = this.view.getG14();
        this.view.getG14().addMouseListener(butacaAdapter(jl, "G14"));
        this.jl = this.view.getG15();
        this.view.getG15().addMouseListener(butacaAdapter(jl, "G15"));
        this.jl = this.view.getG16();
        this.view.getG16().addMouseListener(butacaAdapter(jl, "G16"));
        this.jl = this.view.getG17();
        this.view.getG17().addMouseListener(butacaAdapter(jl, "G17"));
        this.jl = this.view.getG18();
        this.view.getG18().addMouseListener(butacaAdapter(jl, "G18"));
        this.jl = this.view.getG19();
        this.view.getG19().addMouseListener(butacaAdapter(jl, "G19"));
        this.jl = this.view.getG20();
        this.view.getG20().addMouseListener(butacaAdapter(jl, "G20"));
        
        //Butacas Fila H
        this.jl = this.view.getH1();
        this.view.getH1().addMouseListener(butacaAdapter(jl, "H1"));
        this.jl = this.view.getH2();
        this.view.getH2().addMouseListener(butacaAdapter(jl, "H2"));
        this.jl = this.view.getH3();
        this.view.getH3().addMouseListener(butacaAdapter(jl, "H3"));
        this.jl = this.view.getH4();
        this.view.getH4().addMouseListener(butacaAdapter(jl, "H4"));
        this.jl = this.view.getH5();
        this.view.getH5().addMouseListener(butacaAdapter(jl, "H5"));
        this.jl = this.view.getH6();
        this.view.getH6().addMouseListener(butacaAdapter(jl, "H6"));
        this.jl = this.view.getH7();
        this.view.getH7().addMouseListener(butacaAdapter(jl, "H7"));
        this.jl = this.view.getH8();
        this.view.getH8().addMouseListener(butacaAdapter(jl, "H8"));
        this.jl = this.view.getH9();
        this.view.getH9().addMouseListener(butacaAdapter(jl, "H9"));
        this.jl = this.view.getH10();
        this.view.getH10().addMouseListener(butacaAdapter(jl, "H10"));
        this.jl = this.view.getH11();
        this.view.getH11().addMouseListener(butacaAdapter(jl, "H11"));
        this.jl = this.view.getH12();
        this.view.getH12().addMouseListener(butacaAdapter(jl, "H12"));
        this.jl = this.view.getH13();
        this.view.getH13().addMouseListener(butacaAdapter(jl, "H13"));
        this.jl = this.view.getH14();
        this.view.getH14().addMouseListener(butacaAdapter(jl, "H14"));
        this.jl = this.view.getH15();
        this.view.getH15().addMouseListener(butacaAdapter(jl, "H15"));
        this.jl = this.view.getH16();
        this.view.getH16().addMouseListener(butacaAdapter(jl, "H16"));
        this.jl = this.view.getH17();
        this.view.getH17().addMouseListener(butacaAdapter(jl, "H17"));
        this.jl = this.view.getH18();
        this.view.getH18().addMouseListener(butacaAdapter(jl, "H18"));
        this.jl = this.view.getH19();
        this.view.getH19().addMouseListener(butacaAdapter(jl, "H19"));
        this.jl = this.view.getH20();
        this.view.getH20().addMouseListener(butacaAdapter(jl, "H20"));
    }

    
    private MouseAdapter butacaAdapter(JLabel jl, String s) {
        return new AdministrarAsientos(jl, s);
    }
}
