import java.util.*

fun main(args: Array){
    // kotlin program to calculate simple interest 


    val principalAmount = 30000
    val interestRate = 10
    val timePeriod = 4
    val interest = (principalAmount * interestRate * timePeriod)/100

    println("Principal Amount is: $principalAmount")
    println("Rate of interest is: $interestRate")
    println("Time period is: $timePeriod")
    println("Simple interest  is: $interest")


    // Program to ask user compute his or her simple interest

    var input = Scanner(System.`in`)
    println("Enter your principal:")
    var principal = input.nextInt()
    println("Enter your rate:")
    var rate = input.nextInt()
    println("Enter your time:")
    var time = input.nextInt()

    var Sinterest = (principal * rate * time)/100
    println("Your simple interest is Kshs $sInterest")

}