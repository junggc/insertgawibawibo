package Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LController {

        @RequestMapping(value="/jhl")
        public String main(){
            return "gbb";
        }







}



