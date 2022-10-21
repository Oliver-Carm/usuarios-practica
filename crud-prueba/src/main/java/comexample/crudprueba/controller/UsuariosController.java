package comexample.crudprueba.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.crudprueba.model.Usuarios;
import com.example.crudprueba.service.api.UsuariosServiceApi;

@Controller
public class UsuariosController {
	
	@Autowired
	private UsuariosServiceApi usuariosServiceApi;
	
	@RequestMapping("/")
	public String index(Model model ) {
		model.addAttribute("list", usuariosServiceApi.getAll());
		return "index";
	}
	
	@GetMapping("/save/{id_usuario}")
	public String showsave(@PathVariable("id_usuario") Long id_usuario, Model model) {
		if(id_usuario != null && id_usuario != 0 ){
			model.addAttribute("usuarios", usuariosServiceApi.get(id_usuario));
		}
		return "save";
	}
	
	@PostMapping("/save")
	public String save(Usuarios usuarios, Model model) {
		usuariosServiceApi.save(usuarios);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id_usuario}")
	public String delete(@PathVariable Long id_usuario, Model model) {
		usuariosServiceApi.delete(id_usuario);
		
		return "redirect:/";
	}

}
