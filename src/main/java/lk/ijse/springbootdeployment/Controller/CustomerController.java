package lk.ijse.springbootdeployment.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @GetMapping
    public String getCustomer() {
        return "customer1";
    }
}
