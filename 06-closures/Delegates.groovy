// Delegates.groovy

Closure writer = {
    appends 'Dan'
    appends 'lives in Cleveland'
}

String appends(String s) {
    println "appends() called with argument of $s"
    return "appends() called with argument of $s"
}

StringBuffer sb = new StringBuffer()
writer.resolveStrategy = Closure.DELEGATE_FIRST
writer.delegate = sb
writer()
