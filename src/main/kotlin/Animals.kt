fun main() {
    val doggo = Dog()
    printXtraLn("Talk To Me: ${doggo.talk()}")
    printXtraLn("Run Doggo Run: ${doggo.move()}")
    printXtraLn("Did You Enjoy Your Steak? ${doggo.eat("steak")}")
    printXtraLn("Did You Enjoy Your Carrot? ${doggo.eat("carrot")}")

    val kitty = Cat()
    printXtraLn("Talk To Me: ${kitty.talk()}")
    printXtraLn("Run Kitty Run: ${kitty.move()}")
    printXtraLn("Did You Enjoy Your Steak? ${kitty.eat("steak")}")
    printXtraLn("Did You Enjoy Your Fish? ${kitty.eat("fish")}")


}

interface Animal {}

typealias Movement = String
typealias Talk = String
typealias Food = String
typealias DidEnjoy = Boolean

interface CanMove {
    fun move(): Movement
}

interface CanTalk {
    fun talk(): Talk
}

interface CanEat {
    fun eat(food: Food): DidEnjoy
}

class FastMover : CanMove {
    override fun move(): Movement {
        return "FAST"
    }
}

class Slither : CanMove {
    override fun move(): Movement {
        return "SLITHER"
    }
}

class Herbivoure : CanEat {
    override fun eat(food: String): DidEnjoy {
        return food == "veggie"
    }

}

class Carnivoure : CanEat {
    override fun eat(food: String): DidEnjoy {
        return food == "fish" || food == "steak"
    }
}

class GardenSnake : CanEat by Herbivoure(), CanMove by Slither()
class Python : CanEat by Carnivoure(), CanMove by Slither()

class Cat : CanMove by FastMover(), CanTalk, CanEat by Carnivoure() {
    override fun talk(): Talk {
        return "MEOW!"
    }
}

class Dog : CanMove by FastMover(), CanTalk, CanEat by Carnivoure() {
    override fun talk(): Talk {
        return "WOOF!"
    }
}
