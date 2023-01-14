/*
  this corresponds to the enclosing class where the closure is defined
  owner corresponds to the enclosing object where the closure is defined, which may be either a class or a closure
  delegate corresponds to a third party object where methods calls
  or properties are resolved whenever the receiver of the message is not defined
*/

class ScopeDemo {

    Closure outerClosure = {
        println this.class.name
        println owner.class.name
        println delegate.class.name
        Closure nestedClosure = {
            println this.class.name
            println owner.class.name
            println delegate.class.name
        }
        nestedClosure()
    }

}

ScopeDemo demo = new ScopeDemo()
demo.outerClosure()
