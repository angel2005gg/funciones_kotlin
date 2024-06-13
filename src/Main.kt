//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.







fun main() {
    println(birthdayGreeting(age = 18))
    println(birthdayGreeting(age = 15))

}

fun birthdayGreeting(name: String = "Miguel!", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}