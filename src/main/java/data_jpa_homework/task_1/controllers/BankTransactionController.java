package data_jpa_homework.task_1.controllers;

import data_jpa_homework.task_1.domain.BankTransaction;
import data_jpa_homework.task_1.services.BankTransactionService;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class BankTransactionController {

  private BankTransactionService service;

  public BankTransactionController(BankTransactionService service) {
    this.service = service;
  }

  public List<BankTransaction> getAll() {
    return service.getAll();
  }
}
