/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JLabel;

/**
 *
 * @author b1796
 */
public class Asiento {
    private boolean lock;
    private JLabel jl;
    public Asiento (JLabel jl) {
        this.lock = false;
        this.jl= jl;
    }

    /**
     * @return the lock
     */
    public boolean isLock() {
        return lock;
    }

    /**
     * @param lock the lock to set
     */
    public void setLock(boolean lock) {
        this.lock = lock;
    }

    /**
     * @return the jl
     */
    public JLabel getJl() {
        return jl;
    }

    /**
     * @param jl the jl to set
     */
    public void setJl(JLabel jl) {
        this.jl = jl;
    }
    
}
