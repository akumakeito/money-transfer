fun main() {
    val percentCommission = 75
    val minCommissionInKopecks = 3500
    val amount = 100000

    var commission = amount * percentCommission / 10000

    if (commission < minCommissionInKopecks) {
        commission = minCommissionInKopecks
    }

    println("Сумма перевода $amount копеек. Сумма комиссии $commission копеек")
}