/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manipuladores;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import vista.vistaMenuPrincipal;

/**
 *
 * @author b1796
 */
public class ManipuladorJPMenuAsientosDisponibles {

    private vistaMenuPrincipal view;
    private JLabel jl;

    public ManipuladorJPMenuAsientosDisponibles(vistaMenuPrincipal view) {
        this.view = view;
        initComponents();
    }

    private void initComponents() {
        //Butacas Fila A
        this.jl = this.view.getA1();
        this.view.getA1().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA2();
        this.view.getA2().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA3();
        this.view.getA3().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA4();
        this.view.getA4().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA5();
        this.view.getA5().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA6();
        this.view.getA6().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA7();
        this.view.getA7().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA8();
        this.view.getA8().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA9();
        this.view.getA9().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA10();
        this.view.getA10().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA11();
        this.view.getA11().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA12();
        this.view.getA12().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA13();
        this.view.getA13().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA14();
        this.view.getA14().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA15();
        this.view.getA15().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA16();
        this.view.getA16().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA17();
        this.view.getA17().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA18();
        this.view.getA18().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA19();
        this.view.getA19().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getA20();
        this.view.getA20().addMouseListener(this.butacaAdapter(this.jl));
        
        //Butacas Fila B
        this.jl = this.view.getB1();
        this.view.getB1().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB2();
        this.view.getB2().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB3();
        this.view.getB3().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB4();
        this.view.getB4().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB5();
        this.view.getB5().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB6();
        this.view.getB6().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB7();
        this.view.getB7().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB8();
        this.view.getB8().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB9();
        this.view.getB9().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB10();
        this.view.getB10().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB11();
        this.view.getB11().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB12();
        this.view.getB12().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB13();
        this.view.getB13().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB14();
        this.view.getB14().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB15();
        this.view.getB15().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB16();
        this.view.getB16().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB17();
        this.view.getB17().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB18();
        this.view.getB18().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB19();
        this.view.getB19().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getB20();
        this.view.getB20().addMouseListener(this.butacaAdapter(this.jl));
        
        //Butacas Fila C
        this.jl = this.view.getC1();
        this.view.getC1().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC2();
        this.view.getC2().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC3();
        this.view.getC3().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC4();
        this.view.getC4().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC5();
        this.view.getC5().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC6();
        this.view.getC6().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC7();
        this.view.getC7().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC8();
        this.view.getC8().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC9();
        this.view.getC9().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC10();
        this.view.getC10().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC11();
        this.view.getC11().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC12();
        this.view.getC12().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC13();
        this.view.getC13().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC14();
        this.view.getC14().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC15();
        this.view.getC15().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC16();
        this.view.getC16().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC17();
        this.view.getC17().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC18();
        this.view.getC18().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC19();
        this.view.getC19().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getC20();
        this.view.getC20().addMouseListener(this.butacaAdapter(this.jl));
        
        //Butacas Fila D
        this.jl = this.view.getD1();
        this.view.getD1().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD2();
        this.view.getD2().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD3();
        this.view.getD3().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD4();
        this.view.getD4().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD5();
        this.view.getD5().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD6();
        this.view.getD6().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD7();
        this.view.getD7().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD8();
        this.view.getD8().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD9();
        this.view.getD9().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD10();
        this.view.getD10().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD11();
        this.view.getD11().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD12();
        this.view.getD12().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD13();
        this.view.getD13().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD14();
        this.view.getD14().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD15();
        this.view.getD15().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD16();
        this.view.getD16().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD17();
        this.view.getD17().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD18();
        this.view.getD18().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD19();
        this.view.getD19().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getD20();
        this.view.getD20().addMouseListener(this.butacaAdapter(this.jl));
        
        //Butacas Fila E
        this.jl = this.view.getE1();
        this.view.getE1().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE2();
        this.view.getE2().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE3();
        this.view.getE3().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE4();
        this.view.getE4().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE5();
        this.view.getE5().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE6();
        this.view.getE6().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE7();
        this.view.getE7().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE8();
        this.view.getE8().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE9();
        this.view.getE9().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE10();
        this.view.getE10().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE11();
        this.view.getE11().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE12();
        this.view.getE12().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE13();
        this.view.getE13().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE14();
        this.view.getE14().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE15();
        this.view.getE15().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE16();
        this.view.getE16().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE17();
        this.view.getE17().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE18();
        this.view.getE18().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE19();
        this.view.getE19().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getE20();
        this.view.getE20().addMouseListener(this.butacaAdapter(this.jl));
        
        //Butacas Fila F
        this.jl = this.view.getF1();
        this.view.getF1().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF2();
        this.view.getF2().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF3();
        this.view.getF3().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF4();
        this.view.getF4().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF5();
        this.view.getF5().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF6();
        this.view.getF6().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF7();
        this.view.getF7().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF8();
        this.view.getF8().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF9();
        this.view.getF9().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF10();
        this.view.getF10().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF11();
        this.view.getF11().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF12();
        this.view.getF12().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF13();
        this.view.getF13().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF14();
        this.view.getF14().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF15();
        this.view.getF15().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF16();
        this.view.getF16().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF17();
        this.view.getF17().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF18();
        this.view.getF18().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF19();
        this.view.getF19().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getF20();
        this.view.getF20().addMouseListener(this.butacaAdapter(this.jl));
        
        //Butacas Fila G
        this.jl = this.view.getG1();
        this.view.getG1().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG2();
        this.view.getG2().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG3();
        this.view.getG3().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG4();
        this.view.getG4().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG5();
        this.view.getG5().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG6();
        this.view.getG6().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG7();
        this.view.getG7().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG8();
        this.view.getG8().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG9();
        this.view.getG9().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG10();
        this.view.getG10().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG11();
        this.view.getG11().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG12();
        this.view.getG12().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG13();
        this.view.getG13().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG14();
        this.view.getG14().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG15();
        this.view.getG15().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG16();
        this.view.getG16().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG17();
        this.view.getG17().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG18();
        this.view.getG18().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG19();
        this.view.getG19().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getG20();
        this.view.getG20().addMouseListener(this.butacaAdapter(this.jl));
        
        //Butacas Fila H
        this.jl = this.view.getH1();
        this.view.getH1().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH2();
        this.view.getH2().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH3();
        this.view.getH3().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH4();
        this.view.getH4().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH5();
        this.view.getH5().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH6();
        this.view.getH6().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH7();
        this.view.getH7().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH8();
        this.view.getH8().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH9();
        this.view.getH9().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH10();
        this.view.getH10().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH11();
        this.view.getH11().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH12();
        this.view.getH12().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH13();
        this.view.getH13().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH14();
        this.view.getH14().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH15();
        this.view.getH15().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH16();
        this.view.getH16().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH17();
        this.view.getH17().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH18();
        this.view.getH18().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH19();
        this.view.getH19().addMouseListener(this.butacaAdapter(this.jl));
        this.jl = this.view.getH20();
        this.view.getH20().addMouseListener(this.butacaAdapter(this.jl));
    }

    private MouseAdapter butacaAdapter(JLabel jl) {
        MouseAdapter mouseAdapter = new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                String direccion[] = jl.getIcon().toString().split("classes");
                switch (direccion[1]) {
                    case "/images/asiento_azul_lata.jpg":
                        jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_lata.jpg")));
                        break;
                    case "/images/asiento_azul_bronce.jpg":
                        jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_bronce.jpg")));
                        break;
                    case "/images/asiento_azul_plata.jpg":
                        jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_plata.jpg")));
                        break;
                    case "/images/asiento_azul_oro.jpg":
                        jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_oro.jpg")));
                        break;
                    case "/images/asiento_azul_diamante.jpg":
                        jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_verde_diamante.jpg")));
                        break;
                    case "/images/asiento_rojo_lata.jpg":
                    case "/images/asiento_rojo_bronce.jpg":
                    case "/images/asiento_rojo_plata.jpg":
                    case "/images/asiento_rojo_oro.jpg":
                    case "/images/asiento_rojo_diamante.jpg":
                        break;
                }
            }

            public void mouseExited(MouseEvent evt) {
                String direccion[] = jl.getIcon().toString().split("classes");
                switch (direccion[1]) {
                    case "/images/asiento_verde_lata.jpg":
                        jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_azul_lata.jpg")));
                        break;
                    case "/images/asiento_verde_bronce.jpg":
                        jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_azul_bronce.jpg")));
                        break;
                    case "/images/asiento_verde_plata.jpg":
                        jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_azul_plata.jpg")));
                        break;
                    case "/images/asiento_verde_oro.jpg":
                        jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_azul_oro.jpg")));
                        break;
                    case "/images/asiento_verde_diamante.jpg":
                        jl.setIcon(new ImageIcon(getClass().getResource("/images/asiento_azul_diamante.jpg")));
                        break;
                    case "/images/asiento_rojo_lata.jpg":
                    case "/images/asiento_rojo_bronce.jpg":
                    case "/images/asiento_rojo_plata.jpg":
                    case "/images/asiento_rojo_oro.jpg":
                    case "/images/asiento_rojo_diamante.jpg":
                        break;
                }
            }

            public void mouseClicked(MouseEvent evt) {
                String direccion[] = jl.getIcon().toString().split("classes");
                switch(direccion[1]) {
                    
                }
            }
        };
        return mouseAdapter;
    }
}
