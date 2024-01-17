package data_jpa_homework.task_1.repositories;

import data_jpa_homework.task_1.domain.BankTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankTransactionRepository extends JpaRepository<BankTransaction, Integer> {

}
