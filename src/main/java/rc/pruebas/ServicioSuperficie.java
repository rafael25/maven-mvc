/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rc.pruebas;

/**
 *
 * @author T107
 */
public class ServicioSuperficie {
    Superficie s;

    public ServicioSuperficie() {
    }

    public ServicioSuperficie(Superficie s) {
        this.s = s;
    }
    
    public String servicioArea() {
        return s.calcularArea();
    }
}
