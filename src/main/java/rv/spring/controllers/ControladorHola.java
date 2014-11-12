/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rv.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author T107
 */

@Controller
@RequestMapping("/")
public class ControladorHola {
    
    @RequestMapping(value = "/hola", method = RequestMethod.GET, headers = {"Accept=text/html"})
    public @ResponseBody String holaConGet() {
        return "Este es mi primer controller con get";
    }
}
