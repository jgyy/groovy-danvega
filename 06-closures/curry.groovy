
Closure log = { String type, Date createdOn, String msg ->
    println "$createdOn [$type] - $msg"
}

String debug = 'DEBUG'
String error = 'ERROR'

log(debug, new Date(), 'This is my first debug statement...')

Closure debugLog = log.curry(debug)
debugLog(new Date(), 'This is another debug statement...')
debugLog(new Date(), 'This is one more...')

Closure todayDebugLog = log.curry(debug, new Date())
todayDebugLog("This is today's debug msg")

// right curry
Closure crazyPersonLog = log.rcurry('Why am I logging this way')
crazyPersonLog(error, new Date())

// index based currying
Closure typeMsgLog = log.ncurry(1, new Date())
typeMsgLog(error, 'This is using ncurry...')
