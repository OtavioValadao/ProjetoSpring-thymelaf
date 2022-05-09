package br.com.MVC.mudi.Controller;

import br.com.MVC.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home (Model model){
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Redmi Note 8");
        pedido.setUrlImgame("https://m.media-amazon.com/images/I/61KO-IzRKYL._AC_SL1280_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/Smartphone-Xiaomi-Redmi-Note-Neptune/dp/B097HRZK9N/ref=sr_1_omk_2?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=2BQ4OX86YLQC4&keywords=redmi+note+8&qid=1652106260&sprefix=redmi+note+%2Caps%2C883&sr=8-2&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
        pedido.setDescricao("Descrição qualquer do produto");

        List<Pedido> pedidos = Arrays.asList(pedido); // variavel para retornar uma lista de pedidos
        model.addAttribute("pedidos", pedidos);

        return "home";
    }
}
