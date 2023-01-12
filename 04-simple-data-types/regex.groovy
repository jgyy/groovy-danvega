// Java Sample Pattern
import java.util.regex.Pattern

Pattern pattern = Pattern.compile('a\\\\b')
println pattern
println pattern.class

// What patterns will look like in Groovy

String slashy = /a\b/
String url = $/http://threaldanvega.com/blog/$

println url
println slashy.class

Pattern patternz = ~/a\b/
println patternz.class

// Find | Match

String texta = 'Being a Cleveland Sports Fan is no way to go through life' // true
Pattern patterna = ~/Cleveland Sports Fan/
String findera = texta =~ patterna
Boolean matchera = texta ==~ patterna
println findera.class

println findera
println findera.size()
println matchera

// ----------------------------------------------------------------------------------

String textb = 'Cleveland Sports Fan'
Pattern patternb = ~/Cleveland Sports Fan/
Boolean matcherb = textb ==~ patternb

println matcherb

if (matcherb) {
    println 'if'
}

// ----------------------------------------------------------------------------------

Pattern patternc = ~/Cleveland/

texta = texta.replaceFirst(patternc, 'Buffalo')
println texta
