// Venkat Subramaniam
// https://www.youtube.com/watch?v=URkFOLywex4

// Java 8
class Mailer {

    static Closure send(Closure closure) {
        Mailer mailer = new Mailer()
        mailer.with closure
        println('sending...')
        return closure
    }

    String to(String address) {
        println('to')
        return address
    }

    String from(String address) {
        println('from')
        return address
    }

    String subject(String subject) {
        println('subject')
        return subject
    }

    String body(String msg) {
        println('body')
        return msg
    }

}

String email = 'danvega@gmail.com'

Mailer.send {
    to(email)
    from(email)
    subject('Hello Dan')
    body('Message Body')
}
