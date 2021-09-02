package learn.java.library.demodebug.api;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/reader")

public class RmsAdminController {


    @RequestMapping(value = "/id", method = RequestMethod.GET)
    @ResponseBody
    //localhost:8080/api/reader/id?id=1001
    public int getReader() {

        return 9396;
    }

}
