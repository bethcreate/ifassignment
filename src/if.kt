fun main(){
odd()
    names("Beth", "Caroline", "annastacia", "Joseph")
    robot(17)
    robot(5)
    robot(60)
    multiples()


}
fun odd(){
    for(numbers in 1..100){
       if(numbers%2!=0){
           println(numbers)
       }
    }
}
fun names(firstName: String, secondName: String,thirdName: String, fourthName: String): Array<String>{
    var names = arrayOf(firstName, secondName, thirdName, fourthName)
    for(b in names)
        if(b.length>5){
            println(b)

        }
    return names
}
fun robot(age: Int){
if(age<6){
    println("milk")
}
    else if(age<15 && age>6){
        println("Fanta orange")
    }
    else{
        println("Cocacola")
    }
}
fun multiples(){
    for(i in 1..100){
        println(i)
    }
    for(i in 1..100){
        if(i%3==0){
            println("Fizz")
        }
        if(i%5==0){
            println("Buzz")
        }
            if(i%3==0 && i%5==0){
                println("FizzBuzz")
            }

        }
    }

