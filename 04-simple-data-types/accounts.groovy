class Account {

    BigDecimal balance

    Account plus(Account other) {
        return new Account(balance: this.balance + other.balance)
    }

    @Override
    String toString() {
        return "Account Balance: $balance"
    }

}

Account savings = new Account(balance:100.00)
Account checking = new Account(balance:500.00)

println savings
println checking
println savings + checking
