package data_jpa_homework.task_1.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "transaction")
public class BankTransaction {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Id")
  private int id;

  @Column(name = "Transaction Date")
  private String date;

  @Column(name = "Transaction Type")
  private String type;

  @Column(name = "Amount")
  private double amount;

  @Column(name = "Sender's name")
  private String sender;

  @Column(name = "Recipient's name")
  private String recipient;

  public BankTransaction() {
  }

  public int getId() {
    return id;
  }

  public String getDate() {
    return date;
  }

  public String getType() {
    return type;
  }

  public double getAmount() {
    return amount;
  }

  public String getSender() {
    return sender;
  }

  public String getRecipient() {
    return recipient;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public void setSender(String sender) {
    this.sender = sender;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankTransaction that = (BankTransaction) o;
    return id == that.id && Double.compare(that.amount, amount) == 0
        && Objects.equals(date, that.date) && Objects.equals(type, that.type)
        && Objects.equals(sender, that.sender) && Objects.equals(recipient,
        that.recipient);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, type, amount, sender, recipient);
  }

  @Override
  public String toString() {
    return "BankTransaction{" +
        "id=" + id +
        ", date='" + date + '\'' +
        ", type='" + type + '\'' +
        ", amount=" + amount +
        ", sender='" + sender + '\'' +
        ", recipient='" + recipient + '\'' +
        '}';
  }
}
