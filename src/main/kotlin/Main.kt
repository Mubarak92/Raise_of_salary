fun main() {

    println("Enter Salary:")
    val salary = readLine()!!.toDouble()
    println("Enter performance:  " +
            " 1. Excellent" +
            " 2. Very good" +
            " 3. not bad")
    val performance = readLine()!!.toDouble()
//var perInc =0

    if (performance == 1.0){
        println("Excellent!")
        val perInc = (salary *0.06)
        println ("amount of raise: " +perInc)
        var new_salary = println("percent of increase " + (perInc + salary) )
        println (new_salary)
    }

    else if (performance == 2.0){
        println("Very Good! you got 4% raise")
        val perInc = (salary *0.04)
        println ("amount of raise: " +perInc)
        var new_salary = println("percent of increase " + (perInc + salary) )
        println (new_salary)
    }
    else if (performance == 3.0){
        println("poor")
        val perInc = (salary *0.015)
        println ("amount of raise: " +perInc)
        var new_salary = println("percent of increase " + (perInc + salary) )
        println (new_salary)
    }
    else {
        println("Error")
    }


}

// ((salary/6)salry)*100