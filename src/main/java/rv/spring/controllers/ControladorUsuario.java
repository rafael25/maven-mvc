/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rv.spring.controllers;

import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import rv.spring.model.DAOUsuariosImpl;

/**
 *
 * @author T107
 */
@Controller
@RequestMapping("/")
public class ControladorUsuario {
    @RequestMapping(value = "/usuarios", method = RequestMethod.GET, headers = {"Accept=Application/json"})
    public @ResponseBody String getUsuarios() throws IOException {
        DAOUsuariosImpl dao = new DAOUsuariosImpl();
        return dao.buscar();
    }
}
