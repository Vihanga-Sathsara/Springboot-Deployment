package lk.ijse.springbootdeployment.Controller;

import lk.ijse.springbootdeployment.Entity.customer;
import lk.ijse.springbootdeployment.Service.customerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final customerService service;

    @GetMapping
    public String getCustomer() {
        return "customer1";
    }

    @PostMapping("/register")
    public ResponseEntity<customer> registerCustomer(@RequestBody customer Customer) {
        return ResponseEntity.ok(service.saveCustomer(Customer));
    }

}
