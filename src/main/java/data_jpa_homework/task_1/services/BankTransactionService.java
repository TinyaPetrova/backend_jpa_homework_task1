package data_jpa_homework.task_1.services;

import data_jpa_homework.task_1.domain.BankTransaction;
import data_jpa_homework.task_1.repositories.BankTransactionRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class BankTransactionService {

  private BankTransactionRepository repository;

  public BankTransactionService(BankTransactionRepository repository) {
    this.repository = repository;
  }

  public List<BankTransaction> getAll() {
    return repository.findAll();
  }
}
